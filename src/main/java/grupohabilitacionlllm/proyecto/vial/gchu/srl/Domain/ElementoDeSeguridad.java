/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Enumeraciones.Elemento;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author lucas
 */
@Entity
@Table(name = "Elemento de Seguridad",
        schema = "public")
public class ElementoDeSeguridad implements java.io.Serializable {

    @Id
    int iD;

    Elemento tipo;
    @Column(name = "Entrega")
    LocalDate fechaEntrega;
    Empleado Empleado;

    public ElementoDeSeguridad(int iD, Elemento tipo, LocalDate fechaEntrega, Empleado Empleado) {
        this.iD = iD;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.Empleado = Empleado;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    public int getiD() {
        return iD;
    }

    public Elemento getTipo() {
        return tipo;
    }

    public void setTipo(Elemento tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

}
