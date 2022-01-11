package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1017 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoGastoNaViagem = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        double distanciaTotal = velocidadeMedia * tempoGastoNaViagem;

        double quantidadeDeLitrosNecessaciosParaViajar = distanciaTotal / 12;

        System.out.printf("%.3f\n", quantidadeDeLitrosNecessaciosParaViajar);

    }
}
