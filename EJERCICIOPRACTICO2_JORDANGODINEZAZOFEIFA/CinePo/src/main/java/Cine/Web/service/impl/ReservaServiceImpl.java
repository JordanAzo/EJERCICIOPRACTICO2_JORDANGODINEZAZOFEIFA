/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.service.impl;

import Cine.Web.dao.ReservaDao;
import Cine.Web.domain.Reserva;
import Cine.Web.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaServiceImpl implements ReservaService {
    @Autowired
    private ReservaDao reservaDao;

    @Override
    public List<Reserva> findAll() {
        return reservaDao.findAll();
    }

    @Override
    public Reserva findById(Long id) {
        return reservaDao.findById(id).orElse(null);
    }

    @Override
    public Reserva save(Reserva reserva) {
        return reservaDao.save(reserva);
    }

    @Override
    public void delete(Long id) {
        reservaDao.deleteById(id);
    }
}
