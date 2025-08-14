/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.controller;

import Cine.Web.domain.Funcion;
import Cine.Web.service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/funciones")
public class FuncionController {
    @Autowired
    private FuncionService funcionService;

    @GetMapping
    public String listarFunciones(Model model) {
        List<Funcion> funciones = funcionService.findAll();
        model.addAttribute("funciones", funciones);
        return "funciones/lista";
    }

    @GetMapping("/nuevo")
    public String crearFuncionForm(Model model) {
        model.addAttribute("funcion", new Funcion());
        return "funciones/form";
    }

    @PostMapping
    public String guardarFuncion(@ModelAttribute Funcion funcion) {
        funcionService.save(funcion);
        return "redirect:/funciones";
    }

    @GetMapping("/editar/{id}")
    public String editarFuncionForm(@PathVariable Long id, Model model) {
        Funcion funcion = funcionService.findById(id);
        model.addAttribute("funcion", funcion);
        return "funciones/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarFuncion(@PathVariable Long id) {
        funcionService.delete(id);
        return "redirect:/funciones";
    }
}
