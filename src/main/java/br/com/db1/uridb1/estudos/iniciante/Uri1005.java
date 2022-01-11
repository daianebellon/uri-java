package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double notaA = scanner.nextDouble();
        double notaB = scanner.nextDouble();

        double pesoDaNotaA = 3.5;
        double pesoDaNotaB = 7.5;

        double mediaDasNotas = ((notaA * pesoDaNotaA) + (notaB * pesoDaNotaB)) / 11.0;

        System.out.printf("MEDIA = %.5f\n", mediaDasNotas);

    }
}
