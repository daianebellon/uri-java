package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1011 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;

        double formulaDoVolumeDeUmaEsfera = (4.0/3) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f\n", formulaDoVolumeDeUmaEsfera);

    }
}
