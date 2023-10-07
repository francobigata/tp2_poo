package ar.edu.unlu.tp2.punto5;

public class Main {
    public static void main(String[] args) {
        Cliente clienteNormal = new Cliente("ClienteNormal", 1000, 500);

        clienteNormal.realizarInversion(500, 30);

        clienteNormal.cancelarInversion();

        Cliente clienteCredito = new Cliente("ClienteCredito", 2000, 1000);

        clienteCredito.realizarCompra(2500);

        System.out.println("Estado de la cuenta de crédito después de compras:");
        System.out.println("Nombre: " + clienteCredito.getNombre());
        System.out.println("Saldo: $" + clienteCredito.getSaldo());
        System.out.println("Saldo deudor: $" + clienteCredito.getSaldoDeudor());
        System.out.println("Monto invertido: $" + clienteCredito.getMontoInvertido());

        clienteCredito.realizarInversion(1000, 10);

        clienteCredito.realizarCompra(3000);

        System.out.println("\nEstado de la cuenta de crédito después de la compra con precancelación:");
        System.out.println("Nombre: " + clienteCredito.getNombre());
        System.out.println("Saldo: $" + clienteCredito.getSaldo());
        System.out.println("Saldo deudor: $" + clienteCredito.getSaldoDeudor());
        System.out.println("Monto invertido: $" + clienteCredito.getMontoInvertido());


    }
}
