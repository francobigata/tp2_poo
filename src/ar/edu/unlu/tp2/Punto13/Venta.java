package ar.edu.unlu.tp2.Punto13;

class Venta {
    private int idVenta;
    private Cliente cliente;
    private Paquete paquete;
    private double precioTotal;

    public Venta(int idVenta, Cliente cliente, Paquete paquete, double precioTotal) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.paquete = paquete;
        this.precioTotal = precioTotal;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
}
