/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.controller;

import Cine.Web.domain.Pelicula;
import Cine.Web.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/peliculas")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    @GetMapping
    public String listarPeliculas(Model model) {
        List<Pelicula> peliculas = peliculaService.findAll();
        model.addAttribute("peliculas", peliculas);
        return "peliculas/lista";
    }

    @GetMapping("/nuevo")
    public String crearPeliculaForm(Model model) {
        model.addAttribute("pelicula", new Pelicula());
        return "peliculas/form";
    }

    @PostMapping
    public String guardarPelicula(@ModelAttribute Pelicula pelicula) {
        peliculaService.save(pelicula);
        return "redirect:/peliculas";
    }

    @GetMapping("/editar/{id}")
    public String editarPeliculaForm(@PathVariable Long id, Model model) {
        Pelicula pelicula = peliculaService.findById(id);
        model.addAttribute("pelicula", pelicula);
        return "peliculas/form";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarPelicula(@PathVariable Long id) {
        peliculaService.delete(id);
        return "redirect:/peliculas";
    }
}
