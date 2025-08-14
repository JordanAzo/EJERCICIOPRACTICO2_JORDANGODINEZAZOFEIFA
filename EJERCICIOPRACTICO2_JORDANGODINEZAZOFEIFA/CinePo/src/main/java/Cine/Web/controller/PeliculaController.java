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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cartelera")
public class PeliculaController {
    
    // Si tienes un servicio de películas, inyéctalo aquí
    // @Autowired
    // private PeliculaService peliculaService;
    
    @GetMapping("/fragmentos")
    public String cartelera(Model model) {
        // Datos de ejemplo - reemplaza con tu lógica de base de datos
        List<Pelicula> peliculas = obtenerPeliculasEjemplo();
        
        model.addAttribute("peliculas", peliculas);
        model.addAttribute("cartCount", 0);
        
        return "cartelera/fragmentos"; // Retorna cartelera/fragmentos.html
    }
    
    // Método temporal con datos de ejemplo
    private List<Pelicula> obtenerPeliculasEjemplo() {
        List<Pelicula> peliculas = new ArrayList<>();
        
        peliculas.add(new Pelicula(1L, "Avatar: El Camino del Agua", 
            "Jake Sully vive con su nueva familia formada en el planeta de Pandora...", 
            "https://via.placeholder.com/300x400/2A5298/FFFFFF?text=Avatar"));
            
        peliculas.add(new Pelicula(2L, "Top Gun: Maverick", 
            "Después de más de 30 años de servicio como uno de los mejores aviadores de la Armada...", 
            "https://via.placeholder.com/300x400/2A5298/FFFFFF?text=Top+Gun"));
            
        peliculas.add(new Pelicula(3L, "Black Panther: Wakanda Forever", 
            "La reina Ramonda, Shuri, M'Baku, Okoye y las Dora Milaje luchan para proteger su nación...", 
            "https://via.placeholder.com/300x400/2A5298/FFFFFF?text=Black+Panther"));
        
        return peliculas;
    }
}