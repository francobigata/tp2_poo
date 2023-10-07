package ar.edu.unlu.tp2.Punto7;
import java.util.ArrayList;
import java.util.List;

public class EstacionServicio {
    private List<Empleado> empleados;
    private List<Surtidor> surtidores;
    private List<Venta> ventasCombustible;
    private List<Cliente> clientes;
    private List<PrecioCombustible> preciosCombustible;

    public EstacionServicio() {
        empleados = new ArrayList<>();
        surtidores = new ArrayList<>();
        ventasCombustible = new ArrayList<>();
        clientes = new ArrayList<>();
        preciosCombustible = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarSurtidor(String tipoCombustible) {
        surtidores.add(new Surtidor(tipoCombustible));
    }

    public void agregarPrecioCombustible(PrecioCombustible precioCombustible) {
        preciosCombustible.add(precioCombustible);
    }

    public void realizarVenta(String patente, String tipoProducto, double cantidad, Empleado empleado, double monto, boolean esClienteTop10) {
        Venta venta = new Venta(patente, tipoProducto, cantidad, empleado, monto, esClienteTop10);
        ventasCombustible.add(venta);
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public List<Surtidor> getSurtidores() {
        return surtidores;
    }

    public List<Venta> getVentasCombustible() {
        return ventasCombustible;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<PrecioCombustible> getPreciosCombustible() {
        return preciosCombustible;
    }


}