package ar.edu.unlu.tp2.Punto6;

public class Main {
    public static void main(String[] args) {

        EstacionServicio estacionServicio = new EstacionServicio();


        estacionServicio.contratarEmpleado("Empleado1");
        estacionServicio.contratarEmpleado("Empleado2");


        estacionServicio.agregarSurtidor("Nafta");
        estacionServicio.agregarSurtidor("Gasoil");
        estacionServicio.agregarSurtidor("Kerosene");


        Empleado empleado1 = estacionServicio.getEmpleados().get(0);
        Empleado empleado2 = estacionServicio.getEmpleados().get(1);

        estacionServicio.realizarVenta("ABC123", "Nafta", 50.0, empleado1, 40.0);
        estacionServicio.realizarVenta("XYZ789", "Gasoil", 75.0, empleado2, 60.0);
        estacionServicio.realizarVenta("DEF456", "Nafta", 60.0, empleado1, 45.0);


        GeneradorInformes generadorInformes = new GeneradorInformes(estacionServicio);

        generadorInformes.generarInformeProporcionVentas();
        generadorInformes.generarInformeSurtidoresPorMonto();
        generadorInformes.generarInformeSurtidoresPorLitros();
        generadorInformes.generarInformeEmpleadosPorMonto();
        generadorInformes.generarInformeTop10Clientes();
    }
}
