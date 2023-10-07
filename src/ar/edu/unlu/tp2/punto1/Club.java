package ar.edu.unlu.tp2.punto1;

import java.util.ArrayList;
import java.util.List;

public class Club {

    private List<Socio> sociosBasicos;
    private List<Socio> sociosIntermedios;
    private List<Socio> sociosDestacados;
    private List<InscripcionMensual> inscripcionesMensuales; // Lista para registrar las inscripciones mensuales

    public Club() {
        this.sociosBasicos = new ArrayList<>();
        this.sociosIntermedios = new ArrayList<>();
        this.sociosDestacados = new ArrayList<>();
        this.inscripcionesMensuales = new ArrayList<>(); // Inicializa la lista de inscripciones mensuales
    }

    public void MostrarListadoActividades() {
        System.out.println("ACTIVIDADES ACCESIBLES PARA SUSCRIPTORES BÁSICOS:");
        for (Socio socio : sociosBasicos) {
            socio.mostrarActividades();
        }
        System.out.println("ACTIVIDADES ACCESIBLES PARA SUSCRIPTORES INTERMEDIOS:");
        for (Socio socio : sociosIntermedios) {
            socio.mostrarActividades();
        }
        System.out.println("ACTIVIDADES ACCESIBLES PARA SUSCRIPTORES DESTACADOS:");
        for (Socio socio : sociosDestacados) {
            socio.mostrarActividades();
        }
    }

    public void agregarSocio(String nombre, String direccion, String telefono, String email, TipoSuscripcion suscripcion) {
        Socio socio = new Socio(nombre, direccion, telefono, email, suscripcion);

        // Registra la inscripción mensual
        inscripcionesMensuales.add(new InscripcionMensual(
                java.time.MonthDay.now().getMonthValue(),
                java.time.Year.now().getValue(),
                1 // Cada vez que se agrega un socio, se registra como 1 inscripción
        ));

        switch (suscripcion) {
            case DESTACADA:
                sociosDestacados.add(socio);
                break;
            case INTERMEDIA:
                sociosIntermedios.add(socio);
                break;
            case BASICA:
                sociosBasicos.add(socio);
                break;
        }
    }

    public void mostrarInscriptosPorSuscripcion() {
        System.out.println("SOCIOS DESTACADOS:");
        for (Socio socio : sociosDestacados) {
            System.out.println("Socio: " + socio.getNombre() + " - Email: " + socio.getEmail());
        }

        System.out.println("--------------------------");
        System.out.println("SOCIOS INTERMEDIOS:");
        for (Socio socio : sociosIntermedios) {
            System.out.println("Socio: " + socio.getNombre() + " - Email: " + socio.getEmail());
        }

        System.out.println("--------------------------");
        System.out.println("SOCIOS BASICOS:");
        for (Socio socio : sociosBasicos) {
            System.out.println("Socio: " + socio.getNombre() + " - Email: " + socio.getEmail());
        }
    }

    public void generarReporteMensual() {
        int mesActual = java.time.MonthDay.now().getMonthValue();
        int anioActual = java.time.Year.now().getValue();

        int inscripcionesMensualesTotal = 0;

        for (InscripcionMensual inscripcion : inscripcionesMensuales) {
            if (inscripcion.getMes() == mesActual && inscripcion.getAnio() == anioActual) {
                inscripcionesMensualesTotal += inscripcion.getCantidadInscriptos();
            }
        }

        System.out.println("Reporte mensual de nuevos socios inscriptos:");
        System.out.println("Mes: " + mesActual);
        System.out.println("Año: " + anioActual);
        System.out.println("Cantidad de nuevos socios inscriptos: " + inscripcionesMensualesTotal);
    }


    public void MostrarListadoActividadesPorSuscripcion() {
        System.out.println("Listado de actividades clasificadas por suscripción:");

        // Actividades para suscriptores básicos
        System.out.println("Suscripción Básica:");
        for (Socio socio : sociosBasicos) {
            System.out.println("Actividades para " + socio.getNombre() + ":");
            socio.mostrarActividades();
        }

        // Actividades para suscriptores intermedios
        System.out.println("Suscripción Intermedia:");
        for (Socio socio : sociosIntermedios) {
            System.out.println("Actividades para " + socio.getNombre() + ":");
            socio.mostrarActividades();
        }

        // Actividades para suscriptores destacados
        System.out.println("Suscripción Destacada:");
        for (Socio socio : sociosDestacados) {
            System.out.println("Actividades para " + socio.getNombre() + ":");
            socio.mostrarActividades();
        }
    }
}
