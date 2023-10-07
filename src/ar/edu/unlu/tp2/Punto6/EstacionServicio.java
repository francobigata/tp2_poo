package ar.edu.unlu.tp2.Punto6;

import java.util.*;

public class EstacionServicio {
    private List<Empleado> empleados;
    private List<Surtidor> surtidores;
    private List<Venta> ventas;

    public EstacionServicio() {
        empleados = new ArrayList<>();
        surtidores = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void contratarEmpleado(String nombre) {
        empleados.add(new Empleado(nombre));
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Surtidor> getSurtidores() {
        return surtidores;
    }

    public void setSurtidores(List<Surtidor> surtidores) {
        this.surtidores = surtidores;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public void agregarSurtidor(String tipoCombustible) {
        surtidores.add(new Surtidor(tipoCombustible));
    }

    public void realizarVenta(String patente, String tipoCombustible, double monto, Empleado empleado, double litros) {
        ventas.add(new Venta(patente, tipoCombustible, monto, empleado));
        for (Surtidor surtidor : surtidores) {
            if (surtidor.getTipoCombustible().equals(tipoCombustible)) {
                surtidor.registrarVenta(monto, litros);
                break;
            }
        }
    }


}