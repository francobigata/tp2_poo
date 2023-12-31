package ar.edu.unlu.tp2.punto9;

class Triangulo extends Figura2D {
    private double base;
    private double altura;


    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea(){
        return (base * altura) / 2;
    }

}
