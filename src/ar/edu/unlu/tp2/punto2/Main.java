package ar.edu.unlu.tp2.punto2;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {

        Destino destino1 = new Destino("Playa del Carmen", "Hermosas playas en México", 1000.0);
        Destino destino2 = new Destino("Bali", "Paraíso en el sudeste asiático", 1500.0);


        MedioDeTransporte transporte1 = new MedioDeTransporte("Avión", "Aéreo", 200, 500.0);
        MedioDeTransporte transporte2 = new MedioDeTransporte("Barco", "Marítimo", 300, 800.0);


        Hospedaje hospedaje1 = new Hospedaje("Resort XYZ", "Hotel", "Frente a la playa", 150.0);
        Hospedaje hospedaje2 = new Hospedaje("Villa ABC", "Búngalo", "En la selva", 200.0);


        Excursion excursion1 = new Excursion("Tour en Kayak", "Explora la costa en kayak", 3, 50.0);
        Excursion excursion2 = new Excursion("Senderismo en la selva", "Descubre la selva tropical", 5, 80.0);


        Cliente cliente1 = new Cliente("Juan Pérez", "Calle 123", "555-1234");
        Cliente cliente2 = new Cliente("Ana López", "Avenida 456", "555-5678");


        PaqueteDeTurismo paquete1 = new PaqueteDeTurismo(destino1, transporte1, hospedaje1);
        paquete1.agregarExcursion(excursion1);
        paquete1.agregarExcursion(excursion2);

        PaqueteDeTurismo paquete2 = new PaqueteDeTurismo(destino2, transporte2, hospedaje2);
        paquete2.agregarExcursion(excursion1);


        Venta venta1 = new Venta(cliente1, paquete1, new Date());
        Venta venta2 = new Venta(cliente2, paquete2, new Date());
        Venta venta3 = new Venta(cliente1, paquete2, new Date());


        RegistroDeVentas registroDeVentas = new RegistroDeVentas();
        registroDeVentas.agregarVenta(venta1);
        registroDeVentas.agregarVenta(venta2);
        registroDeVentas.agregarVenta(venta3);


        System.out.println("Registro de Ventas:");
        for (Venta venta : registroDeVentas.obtenerVentas()) {
            System.out.println("Cliente: " + venta.getCliente().getNombre());
            System.out.println("Paquete: " + venta.getPaquete().getDestino().getNombre());
            System.out.println("Fecha: " + venta.getFecha());
            System.out.println("Costo: $" + venta.getPaquete().getCostoTotal());
            System.out.println("-----------------------------");
        }


        Map<Destino, Integer> destinosVendidos = new HashMap<>();
        List<Venta> ventas = registroDeVentas.obtenerVentas();

        for (Venta venta : ventas) {
            Destino destinoVenta = venta.getPaquete().getDestino();
            destinosVendidos.put(destinoVenta, destinosVendidos.getOrDefault(destinoVenta, 0) + 1);
        }


        Destino destinoFavorito = null;
        int maxVentas = 0;

        for (Entry<Destino, Integer> entry : destinosVendidos.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                destinoFavorito = entry.getKey();
            }
        }


        if (destinoFavorito != null) {
            System.out.println("El destino favorito de los clientes es: " + destinoFavorito.getNombre());
            System.out.println("Número de ventas: " + maxVentas);
        } else {
            System.out.println("No se encontraron ventas de destinos.");
        }
    }
}