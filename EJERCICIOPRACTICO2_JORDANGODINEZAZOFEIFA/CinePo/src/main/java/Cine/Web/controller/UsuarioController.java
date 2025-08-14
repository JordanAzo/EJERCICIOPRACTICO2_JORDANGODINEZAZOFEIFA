/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.controller;

import Cine.Web.domain.Usuario;
import Cine.Web.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    
    @GetMapping("/fragmentos")
    public String usuarios(Model model) {
        // Datos de ejemplo - reemplaza con tu lógica de base de datos
        List<Usuario> usuarios = obtenerUsuariosEjemplo();
        
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("cartCount", 0);
        
        return "usuarios/fragmentos"; // Retorna usuarios/fragmentos.html
    }
    
    @GetMapping("/nuevo")
    public String nuevoUsuario(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "usuarios/nuevo"; // Necesitarás crear este template
    }
    
    @GetMapping("/editar")
    public String editarUsuario(@RequestParam Long id, Model model) {
        // Buscar usuario por ID - ejemplo
        Usuario usuario = obtenerUsuarioPorId(id);
        model.addAttribute("usuario", usuario);
        return "usuarios/editar"; // Necesitarás crear este template
    }
    
    @GetMapping("/eliminar")
    public String eliminarUsuario(@RequestParam Long id) {
        // Lógica para eliminar usuario
        // usuarioService.eliminar(id);
        return "redirect:/usuarios/fragmentos";
    }
    
    // Métodos temporales con datos de ejemplo
    private List<Usuario> obtenerUsuariosEjemplo() {
        List<Usuario> usuarios = new ArrayList<>();
        
        usuarios.add(new Usuario(1L, "Juan Pérez", "juan@email.com", LocalDate.now().minusDays(30)));
        usuarios.add(new Usuario(2L, "María González", "maria@email.com", LocalDate.now().minusDays(15)));
        usuarios.add(new Usuario(3L, "Carlos Rodríguez", "carlos@email.com", LocalDate.now().minusDays(7)));
        
        return usuarios;
    }
    
    private Usuario obtenerUsuarioPorId(Long id) {
        // Simulación - reemplaza con tu lógica de base de datos
        return new Usuario(id, "Usuario " + id, "usuario" + id + "@email.com", LocalDate.now());
    }
}