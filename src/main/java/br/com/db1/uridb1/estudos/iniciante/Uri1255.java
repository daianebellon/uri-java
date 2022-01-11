package br.com.db1.uridb1.estudos.iniciante;

import java.util.*;
import java.util.stream.Collectors;

public class Uri1255 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeLinhas = scanner.nextInt();
        scanner.nextLine();

        List<String> frases = new ArrayList<>();

        for (int i = 0; i < quantidadeLinhas; i++) {
            String linha = scanner.nextLine();
            frases.add(linha);
        }

        for (String frase : frases) {
            mostraLetrasQueMaisSeRepetem(frase);
        }

    }

    private static void mostraLetrasQueMaisSeRepetem(String frase) {
        char[] letras = frase.replaceAll("\\s+", "").toLowerCase().toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (char letra : letras) {

            if (!map.containsKey(letra)) {
                map.put(letra, 1);

            } else {
                Integer quantidadeDeLetras = map.get(letra);
                map.replace(letra, quantidadeDeLetras + 1);
            }
        }

        int maiorValor = 0;

        Collection<Integer> values = map.values();  //retorna apenas o valor da minha chave; map só retorna a collections que é pai da List;

        for (Integer qtde : values) {
            if (maiorValor <= qtde) {
                maiorValor = qtde;
            }
        }

        List<Character> letrasQueMaisSeRepetem = new ArrayList<>();

        for (Character chaveKey : map.keySet()) {   //KeySet() retorna um Set(conjunto que não repete valor) com as chaves
            if (map.get(chaveKey) == maiorValor) {
                letrasQueMaisSeRepetem.add(chaveKey);
            }
        }

        String palavra = letrasQueMaisSeRepetem.stream()
                .sorted() //
                .map(character -> character.toString()) //caracter p/ string
                .collect(Collectors.joining());

        System.out.println(palavra);
    }
}