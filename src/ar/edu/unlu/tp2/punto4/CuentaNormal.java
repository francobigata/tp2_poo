package ar.edu.unlu.tp2.punto4;

public class CuentaNormal extends Cliente {
    private int diasInteres;
    private double tasaInteres;

    public CuentaNormal(String nombre, double saldo, double limiteGiro, int diasInteres, double tasaInteres) {
        super(nombre, saldo, limiteGiro); // Llamamos al constructor de la clase base Cliente primero
        this.diasInteres = diasInteres;
        this.tasaInteres = tasaInteres;
    }

    public double calcularInteres() {
        double montoInvertido = super.montoInvertido;
        if (montoInvertido > 0) {
            double interes = (montoInvertido * tasaInteres * diasInteres) / 365;
            return interes;
        } else {
            return 0.0;
        }
    }
}
