package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();

        boolean valorBEhMaiorQueValorC = valorB > valorC;
        boolean valorDEhMaiorQueValorA = valorD > valorA;
        boolean somaValorCValorDEhMaiorQueSomaValorAValorB = (valorC + valorD) > (valorA + valorB);
        boolean valorCEhPositivo = valorC >= 0;
        boolean valorDEhPositivo = valorD >= 0;
        boolean valorAEhPar = valorA % 2 == 0;

        if (valorBEhMaiorQueValorC && valorDEhMaiorQueValorA && somaValorCValorDEhMaiorQueSomaValorAValorB
                && valorCEhPositivo && valorDEhPositivo && valorAEhPar) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}
