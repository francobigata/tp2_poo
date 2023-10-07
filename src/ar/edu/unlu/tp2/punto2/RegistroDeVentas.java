package ar.edu.unlu.tp2.punto2;
import java.util.ArrayList;
import java.util.List;
public class RegistroDeVentas {
    private List<Venta> ventas;

    public RegistroDeVentas() {
        ventas = new ArrayList<>();
    }

    public void agregarVenta(Venta venta){
        ventas.add(venta);
    }

    public List<Venta> obtenerVentas(){
        return ventas;
    }



}
