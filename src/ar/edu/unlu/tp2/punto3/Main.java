package ar.edu.unlu.tp2.punto3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Crear disciplinas
        Disciplina tango = Disciplina.TANGO;
        Disciplina salsa = Disciplina.SALSA;

        // Crear salones
        Salon salon1 = new Salon("Salón 1", 50);
        Salon salon2 = new Salon("Salón 2", 30);

        // Crear diagramaciones
        Diagramacion claseTango1 = new Diagramacion(
                LocalDate.now(),
                1,  // Horario
                Nivel.INICIAL,
                "Profesor Tango 1",
                tango,
                salon1
        );

        Diagramacion claseSalsa1 = new Diagramacion(
                LocalDate.now(),
                2,  // Horario
                Nivel.INTERMEDIO,
                "Profesor Salsa 1",
                salsa,
                salon2
        );

        // Crear academia
        Academia academia = new Academia();
        academia.setNombre("Academia XYZ");
        academia.setDireccion("Calle ABC, Ciudad");

        // Inscribir alumnos
        Alumno alumno1 = new Alumno("Alumno 1", 123456789, "Dirección 1", new ArrayList<>());
        alumno1.getDisciplinas().add(tango.toString()); // Inscribir en Tango
        academia.agregarDiagramacion(claseTango1); // Agregar clase a academia

        Alumno alumno2 = new Alumno("Alumno 2", 987654321, "Dirección 2", new ArrayList<>());
        alumno2.getDisciplinas().add(salsa.toString()); // Inscribir en Salsa
        academia.agregarDiagramacion(claseSalsa1); // Agregar clase a academia



        // Generar credenciales para los alumnos
        Credencial credencial1 = new Credencial(alumno1.getNombre());
        Credencial credencial2 = new Credencial(alumno2.getNombre());

        // Registra asistencia (solo como ejemplo)
        claseTango1.registrarAsistencia(alumno1);
        claseSalsa1.registrarAsistencia(alumno2);

        // Generar informe de ingresos por disciplina (solo como ejemplo)
        List<Diagramacion> diagramaciones = academia.getDiagramaciones();
        double ingresosMaximos = 0;
        Disciplina disciplinaMasRentable = null;

        for (Diagramacion diagramacion : diagramaciones) {
            double ingresos = diagramacion.calcularIngresos();
            if (ingresos > ingresosMaximos) {
                ingresosMaximos = ingresos;
                disciplinaMasRentable = diagramacion.getDisciplina();
            }
        }

        if (disciplinaMasRentable != null) {
            System.out.println("La disciplina más rentable es: " + disciplinaMasRentable);
            System.out.println("Ingresos máximos: $" + ingresosMaximos);
        } else {
            System.out.println("No hay diagramaciones registradas en la academia.");
        }

        double ingresosTotales = 0;

        for (Diagramacion diagramacion : academia.getDiagramaciones()) {
            ingresosTotales += diagramacion.calcularIngresos();
        }

        System.out.println("Ingresos totales de la academia: $" + ingresosTotales);
    }



}
