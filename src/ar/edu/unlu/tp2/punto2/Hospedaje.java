package ar.edu.unlu.tp2.punto2;

public class Hospedaje {
    private String nombre;
    private String tipo;
    private String ubicacion;
    private double costoPorNoche;


    public Hospedaje(String nombre, String tipo, String ubicacion, double costoPorNoche) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.costoPorNoche = costoPorNoche;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getCostoPorNoche() {
        return costoPorNoche;
    }

    public void setCostoPorNoche(double costoPorNoche) {
        this.costoPorNoche = costoPorNoche;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del hospedaje: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("Costo por noche: $ " + costoPorNoche);
    }
}
