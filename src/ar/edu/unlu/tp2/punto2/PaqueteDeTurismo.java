package ar.edu.unlu.tp2.punto2;
import java.util.ArrayList;
import java.util.List;
public class PaqueteDeTurismo {
    private Destino destino;
    private MedioDeTransporte transporte;
    private Hospedaje hospedaje;
    private List<Excursion> excursiones;
    private double costoTotal;

    public PaqueteDeTurismo(Destino destino, MedioDeTransporte transporte, Hospedaje hospedaje) {
        this.destino = destino;
        this.transporte = transporte;
        this.hospedaje = hospedaje;
        this.excursiones = new ArrayList<>();
        calcularCostoTotal();
    }

    public void agregarExcursion(Excursion excursion){
        excursiones.add(excursion);
        calcularCostoTotal();
    }

    private void calcularCostoTotal(){
        double costoExcursiones = 0;
        for (Excursion excursion : excursiones) {
            costoExcursiones += excursion.getCosto();
        }
        costoTotal = destino.getCosto() + transporte.getCosto() + hospedaje.getCostoPorNoche() + costoExcursiones;
    }

    public void mostrarInformacion() {
        System.out.println("Destino: " + destino.getNombre());
        System.out.println("Medio de transporte: " + transporte.getNombre());
        System.out.println("Hospedaje: " + hospedaje.getNombre());
        System.out.println("Excursiones : ");
        for (Excursion excursion : excursiones) {
            System.out.println("- " + excursion.getNombre());
        }
        System.out.println("Costo Total: $" +costoTotal);
    }

    public Destino getDestino() {
        return destino;
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
    }

    public List<Excursion> getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(List<Excursion> excursiones) {
        this.excursiones = excursiones;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }
}
