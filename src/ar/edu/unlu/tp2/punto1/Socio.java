package ar.edu.unlu.tp2.punto1;

import java.util.List;
import java.util.Random;


public class Socio {
    private String numCredencial;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private TipoSuscripcion suscripcion;
    private List<String> actividadesDisponibles;
    public Socio(String nombre, String direccion, String telefono, String email, TipoSuscripcion suscripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.suscripcion = suscripcion;
        this.actividadesDisponibles = suscripcion.getActividadesDisponibles(); // Obtener las actividades asociadas a la suscripción
        generarNumeroCredencial();
    }

    private void generarNumeroCredencial() {
        String num = "1234567890";
        Random r = new Random();
        StringBuilder numCredencialBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            numCredencialBuilder.append(num.charAt(r.nextInt(num.length())));
        }
        numCredencial = numCredencialBuilder.toString();
    }

    public void mostrarActividades() {
        System.out.println("Actividades disponibles para el socio " + nombre + ":");
        for (String actividad : actividadesDisponibles) {
            System.out.println("- " + actividad);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public TipoSuscripcion getSuscripcion() {
        return suscripcion;
    }
}
