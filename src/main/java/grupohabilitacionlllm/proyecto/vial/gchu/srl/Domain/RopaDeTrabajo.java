/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Enumeraciones.Ropa;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Tilo
 */
@Entity
@Table(name = "RopaDeTrabajo",
        schema = "public")
public class RopaDeTrabajo implements java.io.Serializable{

    @Id
    int id;
    @Column(name = "Empleado")
    Empleado Empleado;
    Ropa tipo;
    
    short talle;
    @Column(name = "Entrega")
    LocalDate fechaEntrega;

    public RopaDeTrabajo(int id, Ropa tipo, short talle, LocalDate fechaEntrega) {
        this.id = id;
        this.tipo = tipo;
        this.talle = talle;
        this.fechaEntrega = fechaEntrega;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    public Ropa getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }

    public void setTipo(Ropa tipo) {
        this.tipo = tipo;
    }

    public short getTalle() {
        return talle;
    }

    public void setTalle(short talle) {
        this.talle = talle;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
