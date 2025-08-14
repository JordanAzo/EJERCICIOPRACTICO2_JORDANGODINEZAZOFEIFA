/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Cine.Web.dao;

import Cine.Web.domain.Funcion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionDao extends JpaRepository<Funcion, Long> {
}

