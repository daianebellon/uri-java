package br.com.db1.uridb1.estudos.matematica;

import java.util.Scanner;

public class Main1555 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();

        for (int i = 0; i < quantidade; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            double valorRafael = Math.pow((3 * X), 2) + (Math.pow(Y, 2));
            double valorBeto = (2 * (Math.pow(X, 2))) + (Math.pow((5 * Y), 2));
            double valorCarlos = (-100 * X) + Math.pow(Y, 3);

            if (valorBeto > valorCarlos &&
                    valorBeto > valorRafael) {
                System.out.println("Beto ganhou");
            } else if (valorCarlos > valorBeto
                    && valorCarlos > valorRafael) {
                System.out.println("Carlos ganhou");
            } else {
                System.out.println("Rafael ganhou");
            }
        }
    }

}

