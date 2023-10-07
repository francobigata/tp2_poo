package ar.edu.unlu.tp2.punto11;

public class CamionFlete extends Vehiculo{
    private double pesoAutorizadoTotal;

    public CamionFlete(String patente, double pesoAutorizadoTotal) {
        super(patente, "Camión de carga", 0, 0);

        this.pesoAutorizadoTotal = pesoAutorizadoTotal;
    }

    // Método específico para obtener el peso autorizado total
    public double getPesoAutorizadoTotal() {
        return pesoAutorizadoTotal;
    }
}
