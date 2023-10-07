package ar.edu.unlu.tp2.punto3;
import java.util.List;
public class Alumno {
    private String nombre;
    private int numerotel;

    private String direccion;
    private List<String> disciplinas;

    public Alumno (String nombre, int numerotel, String direccion, List disciplinas){
        this.nombre = nombre;
        this.numerotel = numerotel;
        this.direccion = direccion;
        this.disciplinas = disciplinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumerotel() {
        return numerotel;
    }

    public void setNumerotel(int numerotel) {
        this.numerotel = numerotel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<String> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
