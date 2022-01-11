package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.perdidoemmarte;

import java.util.List;
import java.util.stream.Collectors;

public class ConversorDeHexadecimais {

    private final List<String> hexadecimais;

    public ConversorDeHexadecimais(List<String> hexadecimais) {
        this.hexadecimais = hexadecimais;
    }

    public String converte() {

        return hexadecimais.stream()
                .map(valorHexadecimal -> Character.toString((char) Integer.parseInt(valorHexadecimal, 16)))
                .collect(Collectors.joining());
    }
}
