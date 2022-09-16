/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;


import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tincho
 */
public class Proyecto {
    int id;
    LocalDate fechaInicio;
    LocalDate fechaEstmiadaFin;
    LocalDate fechaFin;
    String estado;
    String nombre;
    TipoProyecto tipodeProyecto; 
    List<Empleado> empleados;
    List<Maquinaria> maquinas;

    public Proyecto(int id ,LocalDate fechaInicio, LocalDate fechaEstmiadaFin, LocalDate fechaFin, String estado, String nombre) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaEstmiadaFin = fechaEstmiadaFin;
        this.fechaFin = fechaFin;
        this.estado = estado;
        this.nombre = nombre;
        
        empleados = new LinkedList<>();
        maquinas = new LinkedList<>();
    }

    
    public int getId(){
        return id;
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
    
    public TipoProyecto getTipoProyecto(){
        return this.tipodeProyecto;
    }
    
    public void asignarTipoProyecto (TipoProyecto unTipoProyecto){
         
         this.tipodeProyecto = unTipoProyecto;
    }
    
    
    public void asignarEmpleado(Empleado unEmpleado){
        empleados.add(unEmpleado);
    }

    public List<Empleado> getEmpleados(){
        return empleados;
    }
    
    
    public void asignar(Maquinaria unaMaquinaria){
        maquinas.add(unaMaquinaria);
    }
    
    public List<Maquinaria> getMaquinas() {
        return maquinas;
    }
    
    
}
