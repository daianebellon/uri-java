package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.perdidoemmarte;

import java.util.List;

public class Uri1986 {

    public static void main(String[] args) {

        Leitor leitor = new Leitor();
        List<String> leitorMensagem = leitor.getMensagem(args);

        ConversorDeHexadecimais conversorDeHexadecimais = new ConversorDeHexadecimais(leitorMensagem);
        String mensagemConvertida = conversorDeHexadecimais.converte();

        System.out.println(mensagemConvertida);
    }
}
