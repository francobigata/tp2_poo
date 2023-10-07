package ar.edu.unlu.tp2.punto3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diagramacion {
    private LocalDate fecha;
    private int horario;
    private Nivel nivel;
    private String nombreProfesor;
    private Disciplina disciplina;
    private Salon salon;
    private List<Alumno> asistentes = new ArrayList<>();

    public Diagramacion(LocalDate fecha, int horario, Nivel nivel, String nombreProfesor, Disciplina disciplina,Salon salon) {
        this.fecha = fecha;
        this.horario = horario;
        this.nivel = nivel;
        this.nombreProfesor = nombreProfesor;
        this.disciplina = disciplina;
        this.salon = salon;
        this.asistentes = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void registrarAsistencia(Alumno alumno) {
        asistentes.add(alumno);
        System.out.println("Asistencia registrada para " + alumno.getNombre());
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public double calcularIngresos() {
        double costoPorClase = 10.0; // Costo por clase para el profesor
        double ingresos = asistentes.size() * costoPorClase;
        System.out.println("Ingresos generados para esta clase: $" + ingresos +" "+disciplina);
        return ingresos;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }

}
