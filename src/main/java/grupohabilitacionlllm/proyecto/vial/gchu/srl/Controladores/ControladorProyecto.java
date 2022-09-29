/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Controladores;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain.Proyecto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tincho
 */
public class ControladorProyecto {
    int id = 1;
    
    List<Proyecto> proyectos = new ArrayList<>(); 
    
    public void alta (LocalDate fechaInicio, LocalDate fechaEstFin, LocalDate fechaFin, boolean estado, String nombre){
        
        Proyecto proyecto = new Proyecto(id, fechaInicio, fechaEstFin, fechaFin, estado, nombre);
    
        proyectos.add(proyecto);
        
        id++;
    }
    
    public Proyecto buscarId(int id){
        Proyecto encontro = null; 
        
        try {
            for(Proyecto pro_temp : proyectos){
                if (pro_temp.getId() == id){
                    encontro = pro_temp;
                }
            }
        } catch (Exception e) {
        }
        return encontro;
    }
    
    public void bajaLogica(Proyecto unProyecto){
        try {
            for(Proyecto pro_temp : proyectos){
                if (pro_temp.equals(unProyecto)){
                    pro_temp.setEstado(false);
                }
            }
        } catch (Exception e) {
        }
    }
    
    
    public void baja(Proyecto unprProyecto){
        try {
            proyectos.remove(unprProyecto);
        } catch (Exception e) {
        }
    }
    
    public void modificar(Proyecto p) {
        try {
            int index = proyectos.indexOf(this.buscarId(p.getId()));
            proyectos.set(index, p);
        } catch (Exception e) {
        }
    }
    
    public List<Proyecto> buscarEntreFechas(LocalDate f1, LocalDate f2){
        List<Proyecto> lista = new ArrayList<>();
        
        try {
            for(Proyecto p : proyectos){
                if (p.getFechaInicio().isBefore(f1) && p.getFechaInicio().isAfter(f2) ) {
                    lista.add(p);
                }
            }
        } catch (Exception e) {
        }
        return lista; 
    }
    
    
    
    
}
