package br.com.db1.uridb1.estudos.iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1040 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = leitor.nextDouble();
        double N2 = leitor.nextDouble();
        double N3 = leitor.nextDouble();
        double N4 = leitor.nextDouble();

        double MEDIA = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4 * 1)) / 10;

        System.out.println("Media: " + df.format(MEDIA));

        if (MEDIA >= 7) {
            System.out.println("Aluno aprovado.");

        } else if (MEDIA < 7 && MEDIA >= 5) {
            System.out.println("Aluno em exame.");
            double NExame = leitor.nextDouble();

            System.out.println("Nota do exame: " + df.format(NExame));

            MEDIA = (MEDIA + NExame) / 2;

            if (MEDIA >= 5) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.println("Media final: " + df.format(MEDIA));

        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}

