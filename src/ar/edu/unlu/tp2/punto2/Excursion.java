package ar.edu.unlu.tp2.punto2;

public class Excursion {
    private String nombre;
    private String descripcion;
    private int duracion;
    private double costo;

    public Excursion(String nombre, String descripcion, int duracion, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre de la excursion: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Duracion: " + duracion + " horas");
        System.out.println("Costo: $" + costo);
    }
}
