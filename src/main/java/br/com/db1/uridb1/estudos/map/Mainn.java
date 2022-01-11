package br.com.db1.uridb1.estudos.map;

import java.util.Arrays;
import java.util.List;

public class Mainn {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 2, 1, 5, 2, 3, 6, 6, 3, 2, 7, 16, 90, 2);

        int maiorValor = 0;
        for (Integer numero : numeros) {
            if (maiorValor <= numero) {
                maiorValor = numero;
            }
        }
        System.out.println(maiorValor);

    }
}
