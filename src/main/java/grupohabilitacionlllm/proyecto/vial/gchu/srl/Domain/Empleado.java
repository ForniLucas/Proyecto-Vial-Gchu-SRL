/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Tincho
 */
public class Empleado {
    private int IdEmpleado;
    private String Nombre;
    private String Apellido;
    private int dni;
    private int Telefono;
    private String direccion;
    private LocalDate FechaNac; 
    private Especializacion Especializacion;
    private boolean DadoDeBaja;

    public Empleado(int idEmpleado, String Nombre, String Apellido, int dni, int Telefono, String direccion, LocalDate FechaNac) {
        this.IdEmpleado= idEmpleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.Telefono = Telefono;
        this.direccion = direccion;
        this.FechaNac = FechaNac;
        this.DadoDeBaja=false;
    }

    public int getidEmpleado(){
        return this.IdEmpleado;
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
    // el tiempo entre la fechad de nacimiento y la actual para luego calcular la cantida de años.
    }

    public void setFechaNac(LocalDate FechaNac) {
        this.FechaNac = FechaNac;
    }
    
    public void setDadoDeBaja(boolean unValor) {
        this.DadoDeBaja = unValor;
    }

    public boolean getDadoDeBaja() {
        return this.DadoDeBaja;
    }

    
    public boolean verificarEmpleadoDNI(int unDNI) {
        return (unDNI == this.dni);
    }
            
    public boolean verificarEmpleadoNombreyApellido(String unNombre, String unApellido){
        return ((unNombre.equals(this.Nombre)) && (unApellido.equals(this.Apellido)));
       
    }
    
    public void setEspecializacion (Especializacion unaEspecializacion){
       
        if (this.Especializacion== null) {
              // block of code to be executed if the condition is true
             this.Especializacion= unaEspecializacion;
}
        else {
            // block of code to be executed if the condition is false
            this.finalizarEspecializacion(LocalDate.now());
            this.Especializacion=unaEspecializacion;
}

    }
    
    
    public void finalizarEspecializacion(LocalDate unDia){
        this.Especializacion.fechaFin=unDia;
    }
    
    public void modificarEmpleado(Empleado unEmpleado){
        this.Apellido= unEmpleado.Apellido;
        this.Nombre= unEmpleado.Nombre;
        this.dni= unEmpleado.dni;
        this.direccion= unEmpleado.direccion;
        this.FechaNac=unEmpleado.FechaNac;
        this.Telefono= unEmpleado.Telefono;
        
        
}
    }
    
    public void }
}




