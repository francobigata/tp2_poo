package ar.edu.unlu.tp2.punto2;

public class Proveedor {
    private String nombre;
    private int clasificacion;

    public Proveedor(String nombre, int clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(int clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void mostrarInformacionOfertas() {
        System.out.println("Ofertas del proveedor " + nombre + ":");
        // Aquí podrías mostrar la información de las ofertas que ofrece este proveedor.
    }
}
