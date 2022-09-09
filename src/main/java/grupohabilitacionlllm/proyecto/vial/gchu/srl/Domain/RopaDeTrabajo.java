/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;


import java.time.LocalDate;

/**
 *
 * @author Tilo
 */
public class RopaDeTrabajo {
    Ropa tipo;
    short talle;
    LocalDate fechaEntrega;
    Empleado Empleado; 

    public RopaDeTrabajo(Ropa tipo, short talle, LocalDate fechaEntrega) {
        this.tipo = tipo;
        this.talle = talle;
        this.fechaEntrega = fechaEntrega;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    
    
    public Ropa getTipo() {
        return tipo;
    }

    public void setTipo(Ropa tipo) {
        this.tipo = tipo;
    }

    public short getTalle() {
        return talle;
    }

    public void setTalle(short talle) {
        this.talle = talle;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
    
    
}
