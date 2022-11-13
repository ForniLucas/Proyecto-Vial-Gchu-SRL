/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;


import Enumeraciones.Profesion;
import Enumeraciones.RolEmpleado;
import java.time.LocalDate;

/**
 *
 * @author Tincho
 */
public class Especializacion {
    
    int id;
    Profesion tipo; 
    LocalDate fechaActualizacion; 
    RolEmpleado rol; 
    LocalDate fechaFin;

    public Especializacion(int id, Profesion tipo, LocalDate fechaActualizacion, RolEmpleado unRol) {
        this.id = id;
        this.tipo = tipo;
        this.fechaActualizacion = fechaActualizacion;
        this.rol = unRol;
    }

    public Profesion getTipo() {
        return tipo;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public int getId(){
        return id;
    }
    
    public RolEmpleado getRol() {
        return rol;
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

    public void setRol(RolEmpleado unRol) {
        this.rol = unRol;
    }
    
    

    
}
