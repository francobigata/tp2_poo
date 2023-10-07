package ar.edu.unlu.tp2.Punto7;

public class Empleado {
    private String nombre;
    private boolean esTop10VentasMesAnterior;

    public Empleado(String nombre) {
        this.nombre = nombre;
        this.esTop10VentasMesAnterior = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsTop10VentasMesAnterior() {
        return esTop10VentasMesAnterior;
    }

    public void setEsTop10VentasMesAnterior(boolean esTop10VentasMesAnterior) {
        this.esTop10VentasMesAnterior = esTop10VentasMesAnterior;
    }
}