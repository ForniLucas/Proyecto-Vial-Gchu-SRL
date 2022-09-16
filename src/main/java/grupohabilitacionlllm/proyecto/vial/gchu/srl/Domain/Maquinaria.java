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
    //Identificador
    String codigo;
    String descripcion;
    String fabricante;
    String ubicacionAlmacenamiento; 
    boolean dadoDeBaja;
    List<Service> services;

    public Maquinaria(String codigo, String descripcion, String fabricante, String ubicacionAlmacenamiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.ubicacionAlmacenamiento = ubicacionAlmacenamiento;
        this.dadoDeBaja = false;
        
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
        return this.dadoDeBaja;
    }
    
    public void setEstado_baja(){
        if (getEstado()) {
            this.dadoDeBaja = false; // Cambiar nombre
        }
    }
    
    public void setEstado_alta(){
        if (!getEstado()) {
            this.dadoDeBaja = true;
        }
    }    
    
    public void modificarMaquinaria(Maquinaria unaMaquinaria){
        this.codigo = unaMaquinaria.codigo;
        this.descripcion = unaMaquinaria.descripcion;
        this.fabricante = unaMaquinaria.fabricante;
        this.ubicacionAlmacenamiento = unaMaquinaria.ubicacionAlmacenamiento;
        this.dadoDeBaja = unaMaquinaria.dadoDeBaja;
    }
    
    public void asignarService(Service unservice){
        services.add(unservice);
    } 
    
    public List<Service> getServices(){
        return this.services;
    }
}
