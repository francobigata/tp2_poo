package ar.edu.unlu.tp2.punto4;

public class Main {
    public static void main(String[] args) {
        Cliente clienteNormal = new Cliente("ClienteNormal", 1000, 500);
        clienteNormal.realizarInversion(500, 30);
        Cliente clienteCredito = new Cliente("ClienteCredito", 2000, 1000);

        clienteCredito.realizarCompra(1000);
        clienteCredito.realizarCompra(500);

        clienteCredito.realizarPago(1000);


        System.out.println("Estado de la cuenta normal:");
        System.out.println("Nombre: " + clienteNormal.getNombre());
        System.out.println("Saldo: $" + clienteNormal.getSaldo());
        System.out.println("Saldo deudor: $" + clienteNormal.getSaldoDeudor());
        System.out.println("Monto invertido: $" + clienteNormal.getMontoInvertido());


        System.out.println("\nEstado de la cuenta de crédito:");
        System.out.println("Nombre: " + clienteCredito.getNombre());
        System.out.println("Saldo: $" + clienteCredito.getSaldo());
        System.out.println("Saldo deudor: $" + clienteCredito.getSaldoDeudor());
    }
}

