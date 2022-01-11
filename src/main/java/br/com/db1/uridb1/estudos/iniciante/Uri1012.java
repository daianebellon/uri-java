package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1012 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double areaDoTrianguloRetangulo = (valorA * valorC) / 2.0;
        double areaDoCirculo = 3.14159 * valorC * valorC;
        double areaDoTrapezio = ((valorA + valorB) * valorC) / 2.0;
        double areaDoQuadrado = valorB * valorB;
        double areaDoRetangulo = valorA * valorB;

        System.out.printf("TRIANGULO: %.3f\n", areaDoTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f\n", areaDoCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaDoTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaDoQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaDoRetangulo);

    }
}
