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
public class Proyecto {
    LocalDate fechaInicio;
    LocalDate fechaEstmiadaFin;
    LocalDate fechaFin;
    String estado;
    String nombre;

    public Proyecto(LocalDate fechaInicio, LocalDate fechaEstmiadaFin, LocalDate fechaFin, String estado, String nombre) {
        this.fechaInicio = fechaInicio;
        this.fechaEstmiadaFin = fechaEstmiadaFin;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.nombre = nombre;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaEstmiadaFin() {
        return fechaEstmiadaFin;
    }

    public void setFechaEstmiadaFin(LocalDate fechaEstmiadaFin) {
        this.fechaEstmiadaFin = fechaEstmiadaFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
