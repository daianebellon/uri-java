package br.com.db1.uridb1.estudos.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
/*
        char[] chars = new char[]{'d', 'a', 'i', 'a', 'n', 'e','b', 'e', 'l', 'l', 'o', 'n', 'l', 'i', 'n', 'd','a'};

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])){
                map.put(chars[i], 1);
            } else {
                Integer integer = map.get(chars[i]);
                map.replace(chars[i], integer + 1);
            }
        }

        System.out.println(map);*/


        List<String> stringsFrutas = Arrays.asList("maça", "banana", "morango", "melancia", "uva", "banana", "morango", "melancia", "uva", "banana", "morango");

        Map<String, Integer> mapFruta = new HashMap<>();

        for (int i = 0; i < stringsFrutas.size(); i++) {
            if (!mapFruta.containsKey(stringsFrutas.get(i))) {
                mapFruta.put(stringsFrutas.get(i), 1);
            } else {
                Integer quantidade = mapFruta.get(stringsFrutas.get(i));
                mapFruta.replace(stringsFrutas.get(i), quantidade + 1);
            }
        }
        System.out.println(mapFruta);
    }
}
