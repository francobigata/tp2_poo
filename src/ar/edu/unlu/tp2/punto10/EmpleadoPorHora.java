package ar.edu.unlu.tp2.punto10;

public class EmpleadoPorHora extends Empleado {
    private int horasTrabajadas;
    private double salarioPorHora;

    public EmpleadoPorHora(String nombre, String apellido, String telefono, String cuit, double salarioPorHora, int horasTrabajadas){
        super(nombre,apellido,telefono,cuit);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        double sueldo = salarioPorHora * horasTrabajadas;
        if (horasTrabajadas > 40) {
            sueldo *= 1.20; // Aplicar el 20% de bono
        }
        return sueldo;
    }
}
