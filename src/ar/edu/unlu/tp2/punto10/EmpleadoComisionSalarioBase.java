package ar.edu.unlu.tp2.punto10;

public class EmpleadoComisionSalarioBase extends EmpleadoComision{
    private double porcentajeComision;

    public EmpleadoComisionSalarioBase(String nombre, String apellido, String telefono, String cuit, double porcentajeComision, double ventasRealizadas, double salarioBase){
        super(nombre, apellido, telefono, cuit, porcentajeComision, ventasRealizadas);
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + salarioBase;
    }

    @Override
    public double calcularBonoCumpleaños() {
        return super.calcularBonoCumpleaños() + 1000.0;
    }
}
