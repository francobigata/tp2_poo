package ar.edu.unlu.tp2.Punto12;

import ar.edu.unlu.tp2.punto11.Alquiler;

import java.util.List;

public class Cliente {
    private String nombre;
    private List<Alquiler> alquileres;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(List<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }
}
