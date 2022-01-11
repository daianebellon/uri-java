package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Uri1013 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();

        int formulamaiorAB = (valorA + valorB + abs(valorA - valorB)) / 2;

        int formulaABC = (formulamaiorAB + valorC + abs(formulamaiorAB - valorC)) / 2;

        System.out.println(formulaABC + " eh o maior");

    }
}
