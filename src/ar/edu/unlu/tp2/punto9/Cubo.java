package ar.edu.unlu.tp2.punto9;

class Cubo extends Figura3D{

    private double arista;

    public Cubo(double arista) {
        this.arista = arista;
    }

    @Override
    public double getArea() {
        return 6 * Math.pow(arista, 2);
    }

    @Override
    public double getVolumen() {
        return Math.pow(arista, 3);
    }
}
