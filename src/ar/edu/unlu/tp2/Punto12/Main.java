package ar.edu.unlu.tp2.Punto12;

public class Main {
    public static void main(String[] args) {
        // Crear clientes
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        // Crear cuentas
        Cuenta cuenta1 = new CuentaNormal(cliente1, 1000.0);
        Cuenta cuenta2 = new CajaDeAhorro(cliente2, 500.0);

        // Realizar operaciones en las cuentas
        cuenta1.depositar(500.0);
        cuenta2.retirar(200.0);

        // Mostrar información de las cuentas
        mostrarInformacionCuenta(cuenta1);
        mostrarInformacionCuenta(cuenta2);
    }

    public static void mostrarInformacionCuenta(Cuenta cuenta) {
        System.out.println("Cliente: " + cuenta.getCliente().getNombre());
        System.out.println("Saldo: $" + cuenta.getSaldo());
        System.out.println("Tipo de cuenta: " + cuenta.getClass().getSimpleName());
        System.out.println();
    }
}