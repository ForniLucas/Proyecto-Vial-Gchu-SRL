/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectovialgchu.Domain;

import java.time.LocalDate;

/**
 *
 * @author Tincho
 */
public class ElementosDeSeguridad {

    Elemento tipo;
    LocalDate fechaEntrega;

    public ElementosDeSeguridad(Elemento tipo, LocalDate fechaEntrega) {
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
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
