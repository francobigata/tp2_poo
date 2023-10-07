package ar.edu.unlu.tp2.punto2;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
public class Cliente {
    private String nombre;
    private String direccion;
    private String numeroTelefono;
    private List<PaqueteDeTurismo> compras;

    public Cliente(String nombre, String direccion, String numeroTelefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
        this.compras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public List<PaqueteDeTurismo> getCompras() {
        return compras;
    }

    public void setCompras(List<PaqueteDeTurismo> compras) {
        this.compras = compras;
    }

    public void comprarPaquete(PaqueteDeTurismo paquete){
        compras.add(paquete);
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Numero de telefono: " + numeroTelefono);
        System.out.println("Compras realizadas");
        for (PaqueteDeTurismo paquete : compras){
            System.out.println("- Paquete a " + paquete.getDestino().getNombre());
        }
    }
}
