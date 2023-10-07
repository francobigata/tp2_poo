package ar.edu.unlu.tp2.punto1;

public class Main2 {
    public static void main(String[] args) {
        Club club = new Club();

        // Agregar socios de prueba
        club.agregarSocio("Miguel", "Dirección1", "123456789", "socio1@email.com", TipoSuscripcion.DESTACADA);
        club.agregarSocio("Juan", "Dirección2", "987654321", "socio2@email.com", TipoSuscripcion.INTERMEDIA);
        club.agregarSocio("Jose", "Dirección3", "456789123", "socio3@email.com", TipoSuscripcion.BASICA);

        // Mostrar listado de actividades
        club.generarReporteMensual();
        club.MostrarListadoActividades();








    }
}

