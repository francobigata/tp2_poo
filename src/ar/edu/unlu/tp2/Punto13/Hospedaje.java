package ar.edu.unlu.tp2.Punto13;

class Hospedaje extends Proveedor {
    private int maxClientes;

    public Hospedaje(int idProveedor, String nombre, double precioBase, int minClientes, int maxClientes) {
        super(idProveedor, nombre, "Hospedaje", precioBase, minClientes);
        this.maxClientes = maxClientes;
    }

}