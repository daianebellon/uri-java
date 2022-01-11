package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distanciaPercorrida = scanner.nextInt();
        int tempoPorKM = 2;

        int tempoTotal = distanciaPercorrida * tempoPorKM;

        System.out.println(tempoTotal + " minutos");
    }
}
