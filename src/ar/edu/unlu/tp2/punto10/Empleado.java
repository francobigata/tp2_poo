package ar.edu.unlu.tp2.punto10;

public abstract class Empleado {
    private String nombre;
    private String apellido;
    private String telefono;
    private String cuit;
    private int horasTrabajadas;
    protected double ventasRealizadas;
    protected double salarioBase;

    public Empleado(String nombre, String apellido, String telefono, String cuit) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cuit = cuit;
    }

    public double calcularBonoCumpleaños() {
        return 2000.0;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(double ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
}