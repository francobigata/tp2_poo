package ar.edu.unlu.tp2.Punto12;

public abstract class Cuenta {
    private double saldo;
    private Cliente cliente;

    public Cuenta(Cliente cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
        actualizarSaldo();
    }

    public void retirar(double monto) {
        saldo -= monto;
        actualizarSaldo();
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public abstract void actualizarSaldo();

    public static class CuentaNormal {
    }
}