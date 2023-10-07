package ar.edu.unlu.tp2.Punto6;

class Venta {
    private String patente;
    private String tipoCombustible;
    private double monto;
    private Empleado empleado;

    public Venta(String patente, String tipoCombustible, double monto, Empleado empleado) {
        this.patente = patente;
        this.tipoCombustible = tipoCombustible;
        this.monto = monto;
        this.empleado = empleado;
    }

    public double getMonto() {
        return monto;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public Empleado getEmpleado() {
        return empleado;
    }
}

