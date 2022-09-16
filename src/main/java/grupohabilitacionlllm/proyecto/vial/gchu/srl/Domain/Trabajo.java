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
public class Trabajo {
    
    int id;
    int horasDeTrabajo;
    LocalDate fechaInicio; 
    LocalDate fechaEstFin;
    LocalDate fechaFin;
    

    public Trabajo(int id, int horasDeTrabajo, LocalDate fechaInicio, LocalDate fechaEstFin, LocalDate fechaFin) {
        this.id = id;
        this.horasDeTrabajo = horasDeTrabajo;
        this.fechaInicio = fechaInicio;
        this.fechaEstFin = fechaEstFin;
        this.fechaFin = fechaFin;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaEstFin() {
        return fechaEstFin;
    }
    
    public int getId(){
        return id;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaEstFin(LocalDate fechaEstFin) {
        this.fechaEstFin = fechaEstFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
