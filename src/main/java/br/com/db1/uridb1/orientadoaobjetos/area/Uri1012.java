package br.com.db1.uridb1.orientadoaobjetos.area;

public class Uri1012 {

    public static void main(String[] args) {
        CalculadorDeArea calculadorDeArea = new CalculadorDeArea(3.0,4.0, 5.2);

        System.out.printf("TRIANGULO: %.2f\n", calculadorDeArea.getAreaTriangulo());
        System.out.printf("CIRCULO: %.2f\n", calculadorDeArea.getAreaCirculo());
        System.out.printf("TRAPEZIO: %.2f\n", calculadorDeArea.getAreaTrapezio());
        System.out.printf("QUADRADO: %.2f\n", calculadorDeArea.getAreaQuadrado());
        System.out.printf("RETANGULO: %.2f\n", calculadorDeArea.getAreaRetangulo());
    }
}
