package ar.edu.unlu.tp2.punto9;

public class Main {
    public static void main(String[] args) {
        Figura2D circulo = new Circulo(5);
        Figura2D cuadrado = new Cuadrado(4);
        Figura2D triangulo = new Triangulo(3, 4); // Corrección en la creación

        Figura3D cubo = new Cubo(2);
        Figura3D esfera = new Esfera(3);
        Figura3D paralelepipedo = new Paralelepipedo(2, 3, 4);
        Figura3D tetraedro = new Tetraedro(5);

        // Área de figuras 2D
        System.out.printf("Área del círculo: %.2f%n", circulo.getArea());
        System.out.printf("Área del cuadrado: %.2f%n", cuadrado.getArea());
        System.out.printf("Área del triángulo: %.2f%n", triangulo.getArea());

        // Área y volumen de figuras 3D
        System.out.printf("Área del cubo: %.2f%n", cubo.getArea());
        System.out.printf("Volumen del cubo: %.2f%n", cubo.getVolumen());
        System.out.printf("Área de la esfera: %.2f%n", esfera.getArea());
        System.out.printf("Volumen de la esfera: %.2f%n", esfera.getVolumen());
        System.out.printf("Área del paralelepípedo: %.2f%n", paralelepipedo.getArea());
        System.out.printf("Volumen del paralelepípedo: %.2f%n", paralelepipedo.getVolumen());
        System.out.printf("Área del tetraedro: %.2f%n", tetraedro.getArea());
        System.out.printf("Volumen del tetraedro: %.2f%n", tetraedro.getVolumen());
    }
}
