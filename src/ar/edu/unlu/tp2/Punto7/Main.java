package ar.edu.unlu.tp2.Punto7;

import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        // Crear una instancia de EstacionServicio
        EstacionServicio estacionServicio = new EstacionServicio();

        // Contratar empleados
        Empleado empleado1 = new Empleado("Empleado1");
        Empleado empleado2 = new Empleado("Empleado2");

        // Agregar surtidores
        estacionServicio.agregarSurtidor("Nafta");
        estacionServicio.agregarSurtidor("Gasoil");
        estacionServicio.agregarSurtidor("Kerosene");

        // Agregar precios de combustibles históricos
        estacionServicio.agregarPrecioCombustible(new PrecioCombustible("Nafta", 2.0, LocalDate.of(2023, 1, 1)));
        estacionServicio.agregarPrecioCombustible(new PrecioCombustible("Gasoil", 1.5, LocalDate.of(2023, 1, 1)));
        estacionServicio.agregarPrecioCombustible(new PrecioCombustible("Kerosene", 2.5, LocalDate.of(2023, 1, 1)));

        // Realizar ventas de combustible con descuento para clientes Top 10 del mes anterior
        estacionServicio.realizarVenta("ABC123", "Nafta", 50.0, empleado1, 40.0, false);
        estacionServicio.realizarVenta("XYZ789", "Gasoil", 75.0, empleado2, 60.0, false);
        estacionServicio.realizarVenta("DEF456", "Nafta", 60.0, empleado1, 45.0, false);

        // Agregar clientes a la lista de clientes
        Cliente cliente1 = new Cliente("ABC123");
        Cliente cliente2 = new Cliente("XYZ789");
        estacionServicio.getClientes().add(cliente1);
        estacionServicio.getClientes().add(cliente2);

        // Luego, configurar las propiedades de los clientes
        cliente1.setEsClienteTop10MesAnterior(true);
        cliente2.setEsClienteTop10MesAnterior(true);

        // Crear un generador de informes y generar informes
        GeneradorInformes generadorInformes = new GeneradorInformes(estacionServicio);

        generadorInformes.generarInformeProporcionVentas();
        generadorInformes.generarInformeSurtidoresPorMonto();
        generadorInformes.generarInformeSurtidoresPorLitros();
        generadorInformes.generarInformeEmpleadosPorMonto();
        generadorInformes.generarInformeTop10Clientes();
    }
}