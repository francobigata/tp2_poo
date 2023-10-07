package ar.edu.unlu.tp2.Punto7;
class Venta {
    private String patente;
    private String tipoProducto;
    private double cantidad;
    private Empleado empleado;
    private double monto;
    private boolean esClienteTop10;  // Cambio de nombre

    public Venta(String patente, String tipoProducto, double cantidad, Empleado empleado, double monto, boolean esClienteTop10) {
        this.patente = patente;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.empleado = empleado;
        this.monto = monto;
        this.esClienteTop10 = esClienteTop10;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public boolean isEsClienteTop10() {  // Cambio de nombre
        return esClienteTop10;
    }

    public void setEsClienteTop10(boolean esClienteTop10) {  // Cambio de nombre
        this.esClienteTop10 = esClienteTop10;
    }
}