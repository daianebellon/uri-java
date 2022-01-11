package br.com.db1.uridb1.estudos.iniciante;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer codigoItem = scanner.nextInt();
        Integer quantidadeItem = scanner.nextInt();

        Map<Integer, Double> map = new HashMap<>();
        map.put(1, 4.00);
        map.put(2, 4.50);
        map.put(3, 5.00);
        map.put(4, 2.00);
        map.put(5, 1.50);

        if (map.containsKey(codigoItem)) {
            double valorTotal = quantidadeItem * map.get(codigoItem);
            System.out.printf("Total: R$ %.2f\n" , valorTotal);
        }
    }
}
