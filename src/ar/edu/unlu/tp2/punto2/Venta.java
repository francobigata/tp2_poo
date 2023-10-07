package ar.edu.unlu.tp2.punto2;
import java.util.Date;
public class Venta {
    private Cliente cliente;
    private PaqueteDeTurismo paquete;
    private Date fecha;

    public Venta(Cliente cliente, PaqueteDeTurismo paquete, Date fecha) {
        this.cliente = cliente;
        this.paquete = paquete;
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteDeTurismo getPaquete() {
        return paquete;
    }

    public void setPaquete(PaqueteDeTurismo paquete) {
        this.paquete = paquete;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
