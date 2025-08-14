/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Cine.Web.service;

import Cine.Web.domain.Pelicula;
import java.util.List;

public interface PeliculaService {
    List<Pelicula> findAll();
    Pelicula findById(Long id);
    Pelicula save(Pelicula pelicula);
    void delete(Long id);
}
