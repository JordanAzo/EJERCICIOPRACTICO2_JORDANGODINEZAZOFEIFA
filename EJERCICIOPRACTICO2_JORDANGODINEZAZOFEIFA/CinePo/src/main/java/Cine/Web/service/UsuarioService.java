/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package Cine.Web.service;

import Cine.Web.domain.Usuario;

public interface UsuarioService {
    Usuario findById(Long id);
    Usuario save(Usuario usuario);
    Usuario findByEmail(String email);
}
