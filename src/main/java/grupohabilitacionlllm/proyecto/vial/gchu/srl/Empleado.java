/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  grupohabilitacionlllm.proyecto.vial.gchu.srl;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Tincho
 */
public class Empleado {
    private String Nombre;
    private String Apellido;
    private int dni;
    private int Telefono;
    private String direccion;
    private LocalDate FechaNac; 

    public Empleado(String Nombre, String Apellido, int dni, int Telefono, String direccion, LocalDate FechaNac) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.FechaNac = FechaNac;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNac() {
        return FechaNac;
    }
    
    public int getEdad() {
        return Period.between(FechaNac, LocalDate.now()).getYears(); 
    // Utilizamos la libreria Period de JAVA, que maneja tipos Date y obtubimos 
    // el tiempo entre la fechad de nacimiento y la actual para luego calcular la cantida de aÃ±os.
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }

    
    
    
}


