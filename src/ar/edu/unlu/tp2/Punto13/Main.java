package ar.edu.unlu.tp2.Punto13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear proveedores
        Proveedor transporte = new Transporte(1, "Transporte XYZ", 100.0, 50, 20.0);
        Proveedor guia = new GuiaTuristico(2, "Guía Juan", 50.0, 10);
        Proveedor hospedaje = new Hospedaje(3, "Hotel ABC", 200.0, 30, 100);

        // Crear paquete con proveedores y destino
        List<Proveedor> proveedoresPaquete = new ArrayList<>();
        proveedoresPaquete.add(transporte);
        proveedoresPaquete.add(guia);
        proveedoresPaquete.add(hospedaje);
        Destino destinoPaquete = new Destino(1, "Playa Paradise");
        Paquete paquete = new Paquete(1, proveedoresPaquete, destinoPaquete);

        // Crear cliente
        Cliente cliente = new Cliente(1, "Juan", "Pérez", "Calle Principal 123");

        // Calcular precio total del paquete para la venta
        double precioTotal = calcularPrecioTotal(paquete, cliente);

        // Registrar venta
        Venta venta = new Venta(1, cliente, paquete, precioTotal);

        // Crear una lista de ventas
        List<Venta> ventas = new ArrayList<>();
        ventas.add(venta);

        // Generar informes
        Informe.generarInformeVentas(ventas);
        Destino destinoFav = Informe.destinoFavorito(ventas);
    }

    private static double calcularPrecioTotal(Paquete paquete, Cliente cliente) {
        double precioTotal = 0.0;
        for (Proveedor proveedor : paquete.getProveedores()) {
            precioTotal += proveedor.getPrecioBase();
            precioTotal += proveedor.calcularPrecioExtra(paquete.getProveedores().size());
        }
        return precioTotal;
    }
}