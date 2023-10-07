package ar.edu.unlu.tp2.Punto7;

public class Cliente {
    private String patente; // Asumiendo que el cliente tiene una patente u otro identificador único
    private boolean esClienteTop10MesAnterior;

    public Cliente(String patente) {
        this.patente = patente;
        this.esClienteTop10MesAnterior = false; // Por defecto, no es cliente Top 10
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public boolean isEsClienteTop10MesAnterior() {
        return esClienteTop10MesAnterior;
    }

    public void setEsClienteTop10MesAnterior(boolean esClienteTop10MesAnterior) {
        this.esClienteTop10MesAnterior = esClienteTop10MesAnterior;
    }
}
