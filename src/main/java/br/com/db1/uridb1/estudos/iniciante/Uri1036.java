package br.com.db1.uridb1.estudos.iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Uri1036 {

    public static void main(String[] args)  throws IOException {
        Scanner scanner = new Scanner(System.in);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double formula = (valorB * valorB) - (4 * valorA * valorC);
        double raiz = Math.sqrt(formula);

        if (valorA == 0 || Double.isNaN(formula)) {
            System.out.println("Impossivel calcular");
        } else {
            double R2 = (-valorB - raiz)  / (2 * valorA) ;
            double R1 = (-valorB + raiz) / (2 * valorA);

            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));
        }
    }
}
