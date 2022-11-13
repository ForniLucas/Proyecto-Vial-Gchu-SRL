/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Enumeraciones.TipoDeProyecto;

/**
 *
 * @author Tincho
 */
public class TipoProyecto {
    
    int id;
    TipoDeProyecto tipo;
    String descripcion;
    String actividades;
    String insumos;

    public TipoProyecto(int id, TipoDeProyecto tipo, String descripcion, String actividades, String insumos) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.actividades = actividades;
        this.insumos = insumos;
    }

    public TipoDeProyecto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeProyecto tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActividades() {
        return actividades;
    }

    public void setActividades(String actividades) {
        this.actividades = actividades;
    }

    public String getInsumos() {
        return insumos;
    }

    public void setInsumos(String insumos) {
        this.insumos = insumos;
    }
    
}
