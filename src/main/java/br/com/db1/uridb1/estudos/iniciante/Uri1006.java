package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();
        double notaC = scanner.nextDouble();

        int pesoNotaA = 2;
        int pesoNotaB = 3;
        int pesoNotaC = 5;

        double mediaDoAluno = ((notaA * pesoNotaA) + (notaB * pesoNotaB) + (notaC * pesoNotaC)) / 10.0;

        System.out.printf("MEDIA = %.1f\n", mediaDoAluno);
    }
}
