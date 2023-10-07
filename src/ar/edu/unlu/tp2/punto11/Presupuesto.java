package ar.edu.unlu.tp2.punto11;

public class Presupuesto {
    private Vehiculo vehiculo;
    private int cantidadDias;
    private double montoTotal;

    public Presupuesto(Vehiculo vehiculo, int cantidadDias) {
        this.vehiculo = vehiculo;
        this.cantidadDias = cantidadDias;
        calcularMontoTotal();
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    private void calcularMontoTotal() {
        double precioBase = vehiculo.getPrecioBase();
        double costoAdicional = 0.0;

        // Aplicar reglas según el tipo de vehículo
        if (vehiculo.getTipo().equals("Auto de pasajeros")) {
            costoAdicional = 300 * vehiculo.getAsientos() * cantidadDias;
        } else if (vehiculo.getTipo().equals("Auto VIP")) {
            costoAdicional = 500 * cantidadDias;
        } else if (vehiculo.getTipo().equals("Combi")) {
            precioBase = 4500;
        } else if (vehiculo instanceof CamionFlete) {
            // Comprobar si es una instancia de CamionFlete
            CamionFlete camionFlete = (CamionFlete) vehiculo; // Realizar un casting
            costoAdicional = 600 * camionFlete.getPesoAutorizadoTotal() * cantidadDias;
        } else if (vehiculo.getTipo().equals("Camión de carga")) {
            if (cantidadDias > 30) {
                precioBase = 75000;
            } else {
                precioBase = 100000;
            }
        }

        montoTotal = precioBase + costoAdicional;
    }

    @Override
    public String toString() {
        return "Presupuesto para " + vehiculo.getTipo() + " (Patente: " + vehiculo.getPatente() + ")\n" +
                "Cantidad de días: " + cantidadDias + "\n" +
                "Monto total: $" + montoTotal;
    }
}
