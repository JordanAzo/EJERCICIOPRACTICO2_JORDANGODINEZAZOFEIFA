/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.service.impl;

import Cine.Web.dao.PeliculaDao;
import Cine.Web.domain.Pelicula;
import Cine.Web.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeliculaServiceImpl implements PeliculaService {
    @Autowired
    private PeliculaDao peliculaDao;

    @Override
    public List<Pelicula> findAll() {
        return peliculaDao.findAll();
    }

    @Override
    public Pelicula findById(Long id) {
        return peliculaDao.findById(id).orElse(null);
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return peliculaDao.save(pelicula);
    }

    @Override
    public void delete(Long id) {
        peliculaDao.deleteById(id);
    }
}
