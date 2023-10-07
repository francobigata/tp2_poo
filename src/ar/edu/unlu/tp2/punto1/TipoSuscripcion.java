package ar.edu.unlu.tp2.punto1;

import java.util.ArrayList;
import java.util.List;

public enum TipoSuscripcion {
    BASICA,
    INTERMEDIA,
    DESTACADA;

    public List<String> getActividadesDisponibles() {
        List<String> actividades = new ArrayList<>();
        switch (this) {
            case BASICA:
                actividades.add("Futbol");
                break;
            case INTERMEDIA:
                actividades.add("Futbol");
                actividades.add("Tenis");
                break;
            case DESTACADA:
                actividades.add("Futbol");
                actividades.add("Tenis");
                actividades.add("Voley");
                actividades.add("Basquet");
                break;
        }
        return actividades;
    }
}