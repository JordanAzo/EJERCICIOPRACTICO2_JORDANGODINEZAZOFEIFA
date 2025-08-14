/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.controller;

import Cine.Web.domain.Funcion;
import Cine.Web.service.FuncionService;
import Cine.Web.domain.Pelicula;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/funciones")
public class FuncionController {
    
    @GetMapping
        public String funciones(Model model, @RequestParam(required = false) Long peliculaId) {
        // Datos de ejemplo - reemplaza con tu lógica de base de datos
        List<Funcion> funciones = obtenerFuncionesEjemplo();
        
        // Si se especifica una película, filtrar funciones
        if (peliculaId != null) {
            funciones = funciones.stream()
                .filter(f -> f.getPelicula().getId().equals(peliculaId))
                .toList();
        }
        
        model.addAttribute("funciones", funciones);
        model.addAttribute("cartCount", 0);
        
        return "funciones/fragmentos"; // Retorna funciones/fragmentos.html
    }
    
    // Método temporal con datos de ejemplo
    private List<Funcion> obtenerFuncionesEjemplo() {
        List<Funcion> funciones = new ArrayList<>();
        
        Pelicula pelicula1 = new Pelicula(1L, "Avatar: El Camino del Agua", "", "");
        Pelicula pelicula2 = new Pelicula(2L, "Top Gun: Maverick", "", "");
        
        // Crear fechas de ejemplo
        LocalDateTime hoy = LocalDateTime.now();
        
        funciones.add(new Funcion(1L, pelicula1, 
            java.sql.Timestamp.valueOf(hoy.plusHours(2)), "Sala 1", 2500.0));
        funciones.add(new Funcion(2L, pelicula1, 
            java.sql.Timestamp.valueOf(hoy.plusHours(5)), "Sala 2", 2500.0));
        funciones.add(new Funcion(3L, pelicula2, 
            java.sql.Timestamp.valueOf(hoy.plusHours(3)), "Sala 3", 3000.0));
        
        return funciones;
    }
}