package ar.edu.unlu.tp2.punto11;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private List<Vehiculo> vehiculos;
    private List<Cliente> clientes;
    private List<Alquiler> alquileres;

    private List<Presupuesto> presupuestos;

    public Agencia() {
        vehiculos = new ArrayList<>();
        clientes = new ArrayList<>();
        alquileres = new ArrayList<>();
        presupuestos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo) {
        // Verificar si ya existe un vehículo con la misma patente
        boolean existe = vehiculos.stream().anyMatch(v -> v.getPatente().equals(vehiculo.getPatente()));

        if (!existe) {
            vehiculos.add(vehiculo);
            System.out.println("Vehículo registrado con éxito.");
        } else {
            System.out.println("Ya existe un vehículo con la misma patente.");
        }
    }

    public Presupuesto emitirPresupuesto(Vehiculo vehiculo, int cantidadDias) {
        Presupuesto presupuesto = new Presupuesto(vehiculo, cantidadDias);
        presupuestos.add(presupuesto);
        return presupuesto;
    }

    public Alquiler generarAlquiler(Presupuesto presupuesto, Cliente cliente) {
        Alquiler alquiler = new Alquiler(presupuesto, cliente);
        alquileres.add(alquiler);
        return alquiler;
    }

    public double montoTotalAlquileresCliente(Cliente cliente) {
        double montoTotal = 0.0;
        for (Alquiler alquiler : alquileres) {
            if (alquiler.getCliente() == cliente) {
                montoTotal += alquiler.getPresupuesto().getMontoTotal();
            }
        }
        return montoTotal;
    }

    public double montoTotalAlquileres() {
        double montoTotal = 0.0;
        for (Alquiler alquiler : alquileres) {
            montoTotal += alquiler.getPresupuesto().getMontoTotal();
        }
        return montoTotal;
    }
}
