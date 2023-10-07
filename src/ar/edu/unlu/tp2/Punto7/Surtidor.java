package ar.edu.unlu.tp2.Punto7;


class Surtidor {
    private String tipoCombustible;
    private double montoTotalVentas;
    private double litrosExpendidos;

    public Surtidor(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
        this.montoTotalVentas = 0.0;
        this.litrosExpendidos = 0.0;
    }

    public void registrarVenta(double monto, double litros) {
        montoTotalVentas += monto;
        litrosExpendidos += litros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public double getMontoTotalVentas() {
        return montoTotalVentas;
    }

    public double getLitrosExpendidos() {
        return litrosExpendidos;
    }


}