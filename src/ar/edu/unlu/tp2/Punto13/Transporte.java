package ar.edu.unlu.tp2.Punto13;

class Transporte extends Proveedor {
    private double cateringPrice;

    public Transporte(int idProveedor, String nombre, double precioBase, int minClientes, double cateringPrice) {
        super(idProveedor, nombre, "Transporte", precioBase, minClientes);
        this.cateringPrice = cateringPrice;
    }

}