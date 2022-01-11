package br.com.db1.uridb1.estudos.iniciante;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Uri1986 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<String> stringHexadecimalList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String hexadecimal = scanner.next();
            stringHexadecimalList.add(hexadecimal);
        }

        String palavra = stringHexadecimalList.stream()
                    .map(valorHexadecimal -> Character.toString((char) Integer.parseInt(valorHexadecimal, 16)))
                    .collect(Collectors.joining());

        System.out.println(palavra);

    }

}
