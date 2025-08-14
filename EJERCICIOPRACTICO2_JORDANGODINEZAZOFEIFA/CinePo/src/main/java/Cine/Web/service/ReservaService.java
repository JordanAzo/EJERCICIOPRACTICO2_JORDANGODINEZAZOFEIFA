/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Cine.Web.service;

import Cine.Web.domain.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> findAll();
    Reserva findById(Long id);
    Reserva save(Reserva reserva);
    void delete(Long id);
}
