package br.com.db1.uridb1.estudos.matematica;

import java.util.Scanner;

public class Main3049 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int base = scanner.nextInt();
        int topo = scanner.nextInt();

        if (base > (160 - topo)) {
            System.out.println(1);
        } else if (base < (160 - topo)) {
            System.out.println(2);
        } else {
            System.out.println(0);
        }
    }
}
