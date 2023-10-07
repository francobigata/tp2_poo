package ar.edu.unlu.tp2.Punto13;

import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Informe {
    public static void generarInformeVentas(List<Venta> ventas) {
        System.out.println("Informe de Ventas:");
        Map<Destino, Double> ventasPorDestino = new HashMap<>();

        for (Venta venta : ventas) {
            Destino destino = venta.getPaquete().getDestino();
            double precioVenta = venta.getPrecioTotal();

            if (ventasPorDestino.containsKey(destino)) {
                double totalVentas = ventasPorDestino.get(destino);
                totalVentas += precioVenta;
                ventasPorDestino.put(destino, totalVentas);
            } else {
                ventasPorDestino.put(destino, precioVenta);
            }
        }

        for (Map.Entry<Destino, Double> entry : ventasPorDestino.entrySet()) {
            Destino destino = entry.getKey();
            double totalVentas = entry.getValue();
            System.out.println("Destino: " + destino.getNombre() + " - Total de Ventas: $" + totalVentas);
        }
    }

    public static Destino destinoFavorito(List<Venta> ventas) {
        System.out.println("\nDestino Favorito:");

        Map<Destino, Integer> destinosContador = new HashMap<>();

        for (Venta venta : ventas) {
            Destino destino = venta.getPaquete().getDestino();

            if (destinosContador.containsKey(destino)) {
                int contador = destinosContador.get(destino);
                contador++;
                destinosContador.put(destino, contador);
            } else {
                destinosContador.put(destino, 1);
            }
        }

        Destino destinoFavorito = null;
        int maxContador = 0;

        for (Map.Entry<Destino, Integer> entry : destinosContador.entrySet()) {
            if (entry.getValue() > maxContador) {
                destinoFavorito = entry.getKey();
                maxContador = entry.getValue();
            }
        }

        if (destinoFavorito != null) {
            System.out.println("El destino favorito es: " + destinoFavorito.getNombre() + " con " + maxContador + " ventas.");
        } else {
            System.out.println("No hay suficientes ventas para determinar un destino favorito.");
        }

        return destinoFavorito;
    }
}