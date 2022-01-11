package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.perdidoemmarte;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class  Leitor {

    public List<String> getMensagem(String[] args) {

        Objects.requireNonNull(args, "Valor não pode ser nulo");

        if (args.length <= 0 ) {
            throw new IllegalArgumentException("Valor inválido");
        }

        String arg = args[0];
        int tamanhoDaMensagem = Integer.parseInt(arg);

        List<String> hexadecimais = new ArrayList<>();

        for (int i = 1; i <= tamanhoDaMensagem; i++) {
            String hexadecimal = args[i];
            hexadecimais.add(hexadecimal);
        }

        return hexadecimais;
    }



}
