package ar.edu.unlu.tp2.punto2;

public class Destino {
    private String nombre;
    private String descripcion;
    private double costo;


    public Destino(String nombre, String descripcion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void mostrarinfo (){
        System.out.println("Nombre del destino: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Costo: $" + costo);
    }
}
