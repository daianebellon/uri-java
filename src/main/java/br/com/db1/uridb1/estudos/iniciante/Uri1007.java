package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1007 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();

        int diferencaEntreProdutos = (valorA * valorB - valorC * valorD);

        System.out.println("DIFERENCA = " + diferencaEntreProdutos);
    }
}
