package br.com.db1.uridb1.estudos.iniciante;

import java.util.Scanner;

public class Uri1014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanciaPercorridaEmKM = scanner.nextDouble();
        double totaldecombustivelGastoEmLitros = scanner.nextDouble();

        double consumoMedioDoAutomavel = distanciaPercorridaEmKM/totaldecombustivelGastoEmLitros;

        System.out.printf("%.3f", consumoMedioDoAutomavel);
        System.out.println(" km/l");
    }
}
