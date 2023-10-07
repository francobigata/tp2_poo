package ar.edu.unlu.tp2.punto5;

public class Cuenta {
    private double saldo;
    private double limiteGiroDescubierto;

    public Cuenta ( double saldoInicial, double limiteGiroDescubierto){
        this.saldo = saldo;
        this.limiteGiroDescubierto = limiteGiroDescubierto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteGiroDescubierto() {
        return limiteGiroDescubierto;
    }

    public void setLimiteGiroDescubierto(double limiteGiroDescubierto) {
        this.limiteGiroDescubierto = limiteGiroDescubierto;
    }

    public void depositar ( double monto){
        saldo +=monto;
    }

    public void retirar(double monto){
        saldo -= monto;
    }

    public double calcularIntereses(int dias){
        return 0;
    }

    public void invertir ( double monto ){

    }
}
