/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import grupohabilitacionlllm.proyecto.vial.gchu.srl.Enumeraciones.Profesion;
import grupohabilitacionlllm.proyecto.vial.gchu.srl.Enumeraciones.RolEmpleado;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Tincho
 */
@Entity
@Table(name = "Especialización",
        schema = "public")
public class Especializacion implements java.io.Serializable {

    @Id
    int id;
    Profesion tipo;

    @Column(name = "Actualización")
    LocalDate fechaActualizacion;

    @Column(name = "Rol")
    RolEmpleado rol;

    @Column(name = "Fin")
    LocalDate fechaFin;

    public Especializacion(int id, Profesion tipo, LocalDate fechaActualizacion, RolEmpleado unRol) {
        this.id = id;
        this.tipo = tipo;
        this.fechaActualizacion = fechaActualizacion;
        this.rol = unRol;
    }

    public Profesion getTipo() {
        return tipo;
    }

    public LocalDate getFechaActualizacion() {
        return fechaActualizacion;
    }

    public int getId() {
        return id;
    }

    public RolEmpleado getRol() {
        return rol;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setTipo(Profesion tipo) {
        this.tipo = tipo;
    }

    public void setFechaActualizacion(LocalDate fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public void setRol(RolEmpleado unRol) {
        this.rol = unRol;
    }

}
