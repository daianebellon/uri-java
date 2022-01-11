package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1018 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        System.out.println(valor);

        int[] notas = {100, 50, 20, 10, 5, 2, 1};

        for (int nota : notas) {
            int restoDoValor = valor % nota;
            int quantidadeDeNotas = (valor - restoDoValor) / nota;

            System.out.printf("%d nota(s) de R$ %d,00\n", quantidadeDeNotas, nota);

            valor = restoDoValor;
        }
    }
}
