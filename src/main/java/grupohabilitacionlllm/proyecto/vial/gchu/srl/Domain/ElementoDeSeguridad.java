/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class ElementoDeSeguridad {

    Elemento tipo;
    LocalDate fechaEntrega;
    Empleado Empleado;

    public ElementoDeSeguridad(Elemento tipo, LocalDate fechaEntrega,Empleado unEmpleado) {
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.Empleado= unEmpleado;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    
    
    public Elemento getTipo() {
        return tipo;
    }

    public void setTipo(Elemento tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    
}
