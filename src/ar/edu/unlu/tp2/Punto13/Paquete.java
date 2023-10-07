package ar.edu.unlu.tp2.Punto13;
import java.util.ArrayList;
import java.util.List;
class Paquete {
    private int idPaquete;
    private List<Proveedor> proveedores;
    private Destino destino;

    public Paquete(int idPaquete, List<Proveedor> proveedores, Destino destino) {
        this.idPaquete = idPaquete;
        this.proveedores = proveedores;
        this.destino = destino;
    }

    public int getIdPaquete() {
        return idPaquete;
    }



    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public List<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(List<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}