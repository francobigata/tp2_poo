package ar.edu.unlu.tp2.Punto7;

import java.time.LocalDate;

public class PrecioCombustible {
    private String tipoCombustible;
    private double precio;
    private LocalDate fecha;

    public PrecioCombustible(String tipoCombustible, double precio, LocalDate fecha) {
        this.tipoCombustible = tipoCombustible;
        this.precio = precio;
        this.fecha = fecha;
    }

}
