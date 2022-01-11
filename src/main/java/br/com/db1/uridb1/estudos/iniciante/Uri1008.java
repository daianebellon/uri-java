package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idDoFuncionario = scanner.nextInt();
        int numeroDeHorasTrabalhadas = scanner.nextInt();
        double valorQueRecebePorHora = scanner.nextDouble();

        double salarioTotal = numeroDeHorasTrabalhadas * valorQueRecebePorHora;

        System.out.println("NUMBER = " + idDoFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salarioTotal);

    }
}
