package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Utiliza",
        schema = "public")
public class Utiliza implements java.io.Serializable{
 //Ver de poner los ids    
    int idProjecto;
    int idMaquinaria;
    LocalDate fechaInicio;
    LocalDate fechaEstFin;
    LocalDate fechaFin;

    public Utiliza(int idP, int idM, LocalDate fechaInicio, LocalDate fechaEstFin, LocalDate fechaFin) {
        this.idProjecto = idP;
        this.idMaquinaria = idM;
        this.fechaInicio = fechaInicio;
        this.fechaEstFin = fechaEstFin;
        this.fechaFin = fechaFin;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaEstFin() {
        return fechaEstFin;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public int getIdProjecto(){
        return idProjecto; 
    }
    
    public int getIdMaquinaria(){
        return idMaquinaria;
    }
    
    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaEstFin(LocalDate fechaEstFin) {
        this.fechaEstFin = fechaEstFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
    
}
