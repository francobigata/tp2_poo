package ar.edu.unlu.tp2.Punto6;

import java.util.*;
import java.util.stream.Collectors;

public class GeneradorInformes {
    private EstacionServicio estacionServicio;

    public GeneradorInformes(EstacionServicio estacionServicio) {
        this.estacionServicio = estacionServicio;
    }

    public void generarInformeProporcionVentas() {
        Map<String, Long> ventasPorTipoCombustible = estacionServicio.getVentas().stream()
                .collect(Collectors.groupingBy(Venta::getTipoCombustible, Collectors.counting()));

        System.out.println("Proporción de ventas efectuadas para cada tipo de combustible:");
        for (Map.Entry<String, Long> entry : ventasPorTipoCombustible.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " ventas");
        }
    }

    public void generarInformeSurtidoresPorMonto() {
        List<Surtidor> surtidoresOrdenadosPorMonto = new ArrayList<>(estacionServicio.getSurtidores());
        surtidoresOrdenadosPorMonto.sort(Comparator.comparing(Surtidor::getMontoTotalVentas).reversed());

        System.out.println("Listado de surtidores ordenados por monto total de ventas:");
        for (Surtidor surtidor : surtidoresOrdenadosPorMonto) {
            System.out.println(surtidor.getTipoCombustible() + ": $" + surtidor.getMontoTotalVentas());
        }
    }

    public void generarInformeSurtidoresPorLitros() {
        List<Surtidor> surtidoresOrdenadosPorLitros = new ArrayList<>(estacionServicio.getSurtidores());
        surtidoresOrdenadosPorLitros.sort(Comparator.comparing(Surtidor::getLitrosExpendidos).reversed());

        System.out.println("Listado de surtidores ordenados por cantidad de litros expendidos:");
        for (Surtidor surtidor : surtidoresOrdenadosPorLitros) {
            System.out.println(surtidor.getTipoCombustible() + ": " + surtidor.getLitrosExpendidos() + " litros");
        }
    }

    public void generarInformeEmpleadosPorMonto() {
        Map<Empleado, Double> ventasPorEmpleado = new HashMap<>();
        for (Venta venta : estacionServicio.getVentas()) {
            Empleado empleado = venta.getEmpleado();
            double montoVenta = venta.getMonto();
            ventasPorEmpleado.put(empleado, ventasPorEmpleado.getOrDefault(empleado, 0.0) + montoVenta);
        }

        List<Map.Entry<Empleado, Double>> listaVentasPorEmpleado = new ArrayList<>(ventasPorEmpleado.entrySet());
        listaVentasPorEmpleado.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        System.out.println("Listado de empleados ordenado por monto total de ventas:");
        for (Map.Entry<Empleado, Double> entry : listaVentasPorEmpleado) {
            System.out.println(entry.getKey().getNombre() + ": $" + entry.getValue());
        }
    }

    public void generarInformeTop10Clientes() {
        Map<String, Double> montoTotalComprasPorCliente = new HashMap<>();
        for (Venta venta : estacionServicio.getVentas()) {
            String patente = venta.getPatente();
            double montoVenta = venta.getMonto();
            montoTotalComprasPorCliente.put(patente, montoTotalComprasPorCliente.getOrDefault(patente, 0.0) + montoVenta);
        }

        List<Map.Entry<String, Double>> listaTop10Clientes = new ArrayList<>(montoTotalComprasPorCliente.entrySet());
        listaTop10Clientes.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));
        listaTop10Clientes = listaTop10Clientes.subList(0, Math.min(10, listaTop10Clientes.size()));

        System.out.println("Top 10 de clientes según monto total de compras:");
        for (Map.Entry<String, Double> entry : listaTop10Clientes) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}
