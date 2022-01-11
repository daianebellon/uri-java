package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.frequenciadeletras;

import java.util.*;
import java.util.stream.Collectors;

public class FrequenciaDeLetras {

    private String texto;

    public FrequenciaDeLetras(String texto) {
        Objects.requireNonNull(texto, "Texto não pode ser nulo");
        if (texto.trim().isEmpty()) {
            throw new IllegalArgumentException("String não pode ser vazia");
        }
        this.texto = texto;
    }

    public String getLetrasQueMaisSeRepetem() {
        char[] letras = texto.replaceAll("\\s+","").toLowerCase().toCharArray();
        Map<Character, Integer> map = getMapDeLetrasPorQuantidade(letras);
        List<Character> letrasQueMaisSeRepetem = getLetrasQueMaisSeRepetem(map);

        return letrasQueMaisSeRepetem.stream()
                .map(character -> character.toString())
                .sorted()
                .collect(Collectors.joining());
    }

    private List<Character> getLetrasQueMaisSeRepetem(Map<Character, Integer> map) {
        int maiorValor = 0;
        Collection<Integer> values = map.values();

        for (Integer quantidade : values) {
            if (maiorValor <= quantidade) {
                maiorValor = quantidade;
            }
        }
        List<Character> letrasQueMaisSeRepetem = new ArrayList<>();

        for (Character chave : map.keySet()) {
            if (map.get(chave) == maiorValor) {
                letrasQueMaisSeRepetem.add(chave);
            }
        }
        return letrasQueMaisSeRepetem;
    }

    private Map<Character, Integer> getMapDeLetrasPorQuantidade(char[] letras) {
        Map<Character, Integer> map = new HashMap<>();

        for (char letra : letras) {
            int frequencia = map.getOrDefault(letra, 0);

            map.put(letra, frequencia + 1);
        }
        return map;
    }

}
