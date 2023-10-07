package ar.edu.unlu.tp2.punto11;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la Agencia
        Agencia agencia = new Agencia();

        // Registrar vehículos
        Vehiculo auto1 = new Vehiculo("ABC123", "Auto de pasajeros", 3000.0, 4);
        Vehiculo combi1 = new Vehiculo("XYZ789", "Combi", 4500.0, 0);
        Vehiculo camion1 = new Vehiculo("DEF456", "Camión de carga", 100000.0, 0);

        agencia.registrarVehiculo(auto1);
        agencia.registrarVehiculo(combi1);
        agencia.registrarVehiculo(camion1);
        // Crear clientes
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");

        // Emitir presupuestos
        Presupuesto presupuesto1 = agencia.emitirPresupuesto(auto1, 5);
        Presupuesto presupuesto2 = agencia.emitirPresupuesto(combi1, 7);
        Presupuesto presupuesto3 = agencia.emitirPresupuesto(camion1, 10);

        // Generar alquileres
        Alquiler alquiler1 = agencia.generarAlquiler(presupuesto1, cliente1);
        Alquiler alquiler2 = agencia.generarAlquiler(presupuesto2, cliente2);
        Alquiler alquiler3 = agencia.generarAlquiler(presupuesto3, cliente1);

        // Mostrar monto total de alquileres por cliente
        double montoCliente1 = agencia.montoTotalAlquileresCliente(cliente1);
        double montoCliente2 = agencia.montoTotalAlquileresCliente(cliente2);

        System.out.println("Monto total de alquileres para " + cliente1.getNombre() + ": $" + montoCliente1);
        System.out.println("Monto total de alquileres para " + cliente2.getNombre() + ": $" + montoCliente2);

        // Mostrar monto total de alquileres en la agencia
        double montoTotal = agencia.montoTotalAlquileres();
        System.out.println("Monto total de alquileres en la agencia: $" + montoTotal);
    }
}