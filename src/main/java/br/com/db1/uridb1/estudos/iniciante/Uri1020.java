package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idadeEmDias = scanner.nextInt();
        int quantidadeDiasEmUmAno = 365;
        int quantidadeDiasEmUmMes = 30;

        int ano = idadeEmDias / quantidadeDiasEmUmAno;
        idadeEmDias %= quantidadeDiasEmUmAno;

        int mes = idadeEmDias / quantidadeDiasEmUmMes;
        idadeEmDias %= quantidadeDiasEmUmMes;

        int dia = idadeEmDias;

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);
    }
}
