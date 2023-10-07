package ar.edu.unlu.tp2.punto10;

public class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String apellido, String telefono, String cuit, double salarioMensual) {
        super(nombre, apellido, telefono, cuit);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSueldo() {
        return salarioMensual;
    }

    @Override
    public double calcularBonoCumpleaños() {
        return super.calcularBonoCumpleaños() + 1000.0;
    }
}