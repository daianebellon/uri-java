package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoDaPeca1 = scanner.nextInt();
        int numeroDePecas1 = scanner.nextInt();
        double valorUnitarioDeCadaPeca1 = scanner.nextDouble();

        int codigoDaPeca2 = scanner.nextInt();
        int numeroDePecas2 = scanner.nextInt();
        double valorUnitarioDeCadaPeca2 = scanner.nextDouble();

        double valorTotal = (numeroDePecas1 * valorUnitarioDeCadaPeca1) + (numeroDePecas2 * valorUnitarioDeCadaPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

    }
}
