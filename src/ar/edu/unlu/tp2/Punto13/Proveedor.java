package ar.edu.unlu.tp2.Punto13;

import java.util.ArrayList;
import java.util.List;

class Proveedor {
    private int idProveedor;
    private String nombre;
    private String tipo;
    private double precioBase;
    private int minClientes;

    public Proveedor(int idProveedor, String nombre, String tipo, double precioBase, int minClientes) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioBase = precioBase;
        this.minClientes = minClientes;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public int getMinClientes() {
        return minClientes;
    }

    public void setMinClientes(int minClientes) {
        this.minClientes = minClientes;
    }

    public double calcularPrecioExtra(int numClientes) {
        double precioExtra = 0.0;
        if (numClientes > minClientes) {
            if (tipo.equals("Transporte")) {
                precioExtra = 0.003 * precioBase * (numClientes - minClientes);
            } else if (tipo.equals("Hospedaje")) {
                precioExtra = 0.005 * precioBase * (numClientes - minClientes);
            }
        }
        return precioExtra;
    }
}

