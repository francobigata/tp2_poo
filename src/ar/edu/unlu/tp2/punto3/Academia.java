package ar.edu.unlu.tp2.punto3;
import java.util.ArrayList;
import java.util.List;
public class Academia {
    private String nombre;
    private String direccion;
    private List<Diagramacion> diagramaciones;

    public Academia() {
        this.diagramaciones = new ArrayList<>(); // Inicializar la lista en el constructor
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

    public List<Diagramacion> getDiagramaciones() {
        return diagramaciones;
    }

    // Método para agregar diagramaciones a la lista
    public void agregarDiagramacion(Diagramacion diagramacion) {
        diagramaciones.add(diagramacion);
    }
}
