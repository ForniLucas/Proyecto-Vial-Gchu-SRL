package grupohabilitacionlllm.proyecto.vial.gchu.srl.Domain;

import java.time.LocalDate;


public class Utiliza {
    LocalDate fechaInicio;
    LocalDate fechaEstFin;
    LocalDate fechaFin;

    public Utiliza(LocalDate fechaInicio, LocalDate fechaEstFin, LocalDate fechaFin) {
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
