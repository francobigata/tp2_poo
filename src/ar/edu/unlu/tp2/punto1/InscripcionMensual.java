package ar.edu.unlu.tp2.punto1;

public class InscripcionMensual {
    private int mes;
    private int anio;
    private int cantidadInscriptos;

    public InscripcionMensual(int mes, int anio, int cantidadInscriptos) {
        this.mes = mes;
        this.anio = anio;
        this.cantidadInscriptos = cantidadInscriptos;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public int getCantidadInscriptos() {
        return cantidadInscriptos;
    }
}
