package ar.edu.unlu.tp2.Punto13;

class Destino {
    private int idDestino;
    private String nombre;

    public Destino(int idDestino, String nombre) {
        this.idDestino = idDestino;
        this.nombre = nombre;
    }

    public int getIdDestino() {
        return idDestino;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}