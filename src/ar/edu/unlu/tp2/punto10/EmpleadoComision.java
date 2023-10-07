package ar.edu.unlu.tp2.punto10;

public class EmpleadoComision extends Empleado{
    private double porcentajeComision;

    public EmpleadoComision(String nombre, String apellido, String telefono, String cuit, double porcentajeComision, double ventasRealizadas) {
        super(nombre, apellido, telefono, cuit);
        this.porcentajeComision = porcentajeComision;
        this.ventasRealizadas = ventasRealizadas;
    }

    @Override
    public double calcularSueldo() {
        return porcentajeComision * ventasRealizadas;
    }

    @Override
    public double calcularBonoCumpleaños() {
        return 0.005 * ventasRealizadas;
    }
}
