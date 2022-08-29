/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectovialgchu.Domain;

/**
 *
 * @author Tincho
 */
public class Maquinaria {
    String codigo;
    String descripcion;
    String fabricante;
    String ubicacionAlmacenamiento; 

    public Maquinaria(String codigo, String descripcion, String fabricante, String ubicacionAlmacenamiento) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.ubicacionAlmacenamiento = ubicacionAlmacenamiento;
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
    
    
    
}
