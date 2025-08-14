/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Cine.Web.service;

import Cine.Web.domain.Funcion;
import java.util.List;

public interface FuncionService {
    List<Funcion> findAll();
    Funcion findById(Long id);
    Funcion save(Funcion funcion);
    void delete(Long id);
}
