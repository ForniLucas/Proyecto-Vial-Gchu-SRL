/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;


import java.time.LocalDate;

/**
 *
 * @author Tincho
 */
public class Especializacion {
    Profesion tipo; 
    LocalDate fechaActualizacion; 
    RolEmpleado Rol; 
    LocalDate fechaFin;

    public Especializacion(Profesion tipo, LocalDate fechaActualizacion, RolEmpleado Rol) {
        this.tipo = tipo;
        this.fechaActualizacion = fechaActualizacion;
        this.Rol = Rol;
    }

    public Profesion getTipo() {
        return tipo;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public RolEmpleado getRol() {
        return Rol;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setTipo(Profesion tipo) {
        this.tipo = tipo;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public void setRol(RolEmpleado Rol) {
        this.Rol = Rol;
    }
    
    

    
}
