/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.service.impl;


import Cine.Web.dao.FuncionDao;
import Cine.Web.domain.Funcion;
import Cine.Web.service.FuncionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionServiceImpl implements FuncionService {
    @Autowired
    private FuncionDao funcionDao;

    @Override
    public List<Funcion> findAll() {
        return funcionDao.findAll();
    }

    @Override
    public Funcion findById(Long id) {
        return funcionDao.findById(id).orElse(null);
    }

    @Override
    public Funcion save(Funcion funcion) {
        return funcionDao.save(funcion);
    }

    @Override
    public void delete(Long id) {
        funcionDao.deleteById(id);
    }
}

