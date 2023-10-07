package ar.edu.unlu.tp2.punto11;

import java.time.LocalDate;

public class Alquiler {
    private Presupuesto presupuesto;
    private Cliente cliente;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double saldoAPagar;

    public Alquiler(Presupuesto presupuesto, Cliente cliente) {
        this.presupuesto = presupuesto;
        this.cliente = cliente;
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Presupuesto presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getSaldoAPagar() {
        return saldoAPagar;
    }

    public void setSaldoAPagar(double saldoAPagar) {
        this.saldoAPagar = saldoAPagar;
    }
}
