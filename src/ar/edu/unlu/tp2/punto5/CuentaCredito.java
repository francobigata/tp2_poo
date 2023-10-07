package ar.edu.unlu.tp2.punto5;

public class CuentaCredito {
    private double limiteCompra;
    private double interesesPendientes;

    public CuentaCredito(double saldoInicial, double limiteGiroDescubierto) {
        // Llamamos al constructor con todos los argumentos
        this(saldoInicial, limiteGiroDescubierto, 0, 0);
    }

    // Constructor que toma todos los argumentos
    public CuentaCredito(double saldoInicial, double limiteGiroDescubierto, double limiteCompra, double interesesPendientes) {
        this.limiteCompra = limiteCompra;
        this.interesesPendientes = interesesPendientes;
        // Inicializamos otros atributos según sea necesario
    }

    // Resto de tu código aquí...

    public void realizarAccionEspecifica() {
        // Lógica específica de la cuenta de crédito
    }

    public void realizarCompra(double monto) {
        // Lógica para realizar una compra a crédito
    }

    public void realizarPago(double monto) {
        // Lógica para realizar un pago de deuda
    }
}




