/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Tincho
 */
@Entity
@Table(name = "Trabajo",
        schema = "public")
public class Trabajo implements java.io.Serializable{
//Ver de poner los ids 
    int idProyecto;
    int idEmpleado;
    int horasDeTrabajo;
    LocalDate fechaInicio; 
    LocalDate fechaEstFin;
    LocalDate fechaFin;
    

    public Trabajo(int idP, int idE, int horasDeTrabajo, LocalDate fechaInicio, LocalDate fechaEstFin, LocalDate fechaFin) {
        this.idProyecto = idP;
        this.idEmpleado = idE;
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
    
    public int getIdEmpleado(){
        return idEmpleado;
    }
    
    public int getIdProjecto(){
        return idProyecto;
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
