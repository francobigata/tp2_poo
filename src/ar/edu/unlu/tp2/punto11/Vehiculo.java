package ar.edu.unlu.tp2.punto11;

public class Vehiculo {
    private String patente;
    private String tipo;
    private double precioBase;
    private int asientos;


    public Vehiculo(String patente, String tipo, double precioBase, int asientos) {
        this.patente = patente;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.asientos = asientos;
    }

    public int getAsientos() {
        return asientos;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public static class Presupuesto {
    }
}
