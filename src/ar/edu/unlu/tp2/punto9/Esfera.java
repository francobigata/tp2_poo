package ar.edu.unlu.tp2.punto9;

class Esfera extends Figura3D {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double getVolumen() {
        return (4.0/3.0) * Math.PI * Math.pow(radio, 3);
    }
}
