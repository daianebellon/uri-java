package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1019 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoTotal = scanner.nextInt();

        int horas = tempoTotal / 3600;
        tempoTotal = tempoTotal % 3600;

        int minutos = tempoTotal / 60;
        tempoTotal = tempoTotal % 60;

        int segundos = tempoTotal;

        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);

    }
}
