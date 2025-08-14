/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Cine.Web.domain;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Funcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Pelicula pelicula;

    @Temporal(TemporalType.TIMESTAMP)
    private Date horario;

    private String sala;
    private Double precio;

    // Constructores, getters y setters...


    
    // Constructores
    public Funcion() {}
    
    public Funcion(Long id, Pelicula pelicula, Date horario, String sala, Double precio) {
        this.id = id;
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
        this.precio = precio;
    }
    
    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    
    public Pelicula getPelicula() { return pelicula; }
    public void setPelicula(Pelicula pelicula) { this.pelicula = pelicula; }
    
    public Date getHorario() { return horario; }
    public void setHorario(Date horario) { this.horario = horario; }
    
    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }
    
    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }
}