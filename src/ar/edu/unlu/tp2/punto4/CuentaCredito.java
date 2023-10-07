package ar.edu.unlu.tp2.punto4;

public class CuentaCredito extends Cliente {
    private double limiteCompra;
    private double limiteGasto;
    private double recargoFijo;

    public CuentaCredito(String nombre, double saldo, double limiteGiro, double limiteCompra, double recargoFijo) {
        super(nombre, saldo, limiteGiro);
        this.limiteCompra = limiteCompra;
        this.limiteGasto = limiteCompra;
        this.recargoFijo = recargoFijo;
    }

    public void actualizarLimiteCompra(double monto) {
        limiteCompra += monto;
    }

    public void realizarCompra(double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto de compra debe ser mayor que cero.");
            return;
        }

        if (verificarLimiteCompra(monto)) {
            System.out.println("Error: esta compra excede el limite de compra disponible.");
            return;
        }

        double recargo = calcularRecargo(monto);
        limiteGasto -= monto;
        double saldo = getSaldo();
        saldo -= (monto + recargo);
        super.setSaldo(saldo);
        System.out.println("Compra realizada por $" + monto + ". Recargo: $" + recargo);
    }

    public void realizarPago (double monto) {
        if (monto <= 0) {
            System.out.println("Error: el monto de pago debe ser mayor que cero.");
            return;
        }

        double recargo = calcularRecargo(monto);
        limiteGasto -= monto;
        double saldo = getSaldo();
        saldo -= (monto + recargo);
        super.setSaldo(saldo);
        actualizarLimiteCompra(monto);
        System.out.println("Pago realizado por $"+ monto);
    }

    private boolean verificarLimiteCompra(double monto){
        return monto > limiteGasto;
    }

    private double calcularRecargo(double monto){
        return monto * recargoFijo;
    }

}
