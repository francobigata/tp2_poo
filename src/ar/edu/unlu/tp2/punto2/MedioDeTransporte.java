package ar.edu.unlu.tp2.punto2;

public class MedioDeTransporte {

    private String nombre;
    private String tipo;
    private int capacidad;
    private double costo;

    public MedioDeTransporte(String nombre, String tipo, int capacidad, double costo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del medio de transporte: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Capacidad: " + capacidad + " personas");
        System.out.println("Costo: $" + costo);
    }
}
