/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Tincho
 */
public class Maquinaria {
    int id;
    String codigo;
    String descripcion;
    String fabricante;
    String ubicacionAlmacenamiento; 
    boolean estado;
    List<Service> services;

    public Maquinaria(int idMaquinaria, String codigo, String descripcion, String fabricante, String ubicacionAlmacenamiento) {
        this.id=idMaquinaria;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.ubicacionAlmacenamiento = ubicacionAlmacenamiento;
        this.estado = true;
        
        services = new LinkedList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    public int getId(){
        return id;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getUbicacionAlmacenamiento() {
        return ubicacionAlmacenamiento;
    }

    public void setUbicacionAlmacenamiento(String ubicacionAlmacenamiento) {
        this.ubicacionAlmacenamiento = ubicacionAlmacenamiento;
    }
    
    public boolean getEstado(){
        return this.estado;
    }
    
    public void setEstadoBaja(){
        if (getEstado()) {
            this.estado = false; // Cambiar nombre
        }
    }
    
    public void setEstadoAlta(){
        if (!getEstado()) {
            this.estado = true;
        }
    }    
    
    public void modificarMaquinaria(Maquinaria unaMaquinaria){
        this.codigo = unaMaquinaria.codigo;
        this.descripcion = unaMaquinaria.descripcion;
        this.fabricante = unaMaquinaria.fabricante;
        this.ubicacionAlmacenamiento = unaMaquinaria.ubicacionAlmacenamiento;
        this.estado = unaMaquinaria.estado;
    }
    
    public void asignarService(Service unservice){
        services.add(unservice);
    } 
    
    public List<Service> getServices(){
        return this.services;
    }
}
