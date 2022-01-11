package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1009 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.next();
        double salarioFixoDoVendedor = scanner.nextDouble();
        double vendasEfetuadas = scanner.nextDouble();

        double comissaoTotal = vendasEfetuadas * 0.15;

        double salarioTotal = comissaoTotal + salarioFixoDoVendedor;

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

    }
}
