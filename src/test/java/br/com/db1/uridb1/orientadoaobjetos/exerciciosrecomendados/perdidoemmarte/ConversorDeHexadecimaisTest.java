package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.perdidoemmarte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ConversorDeHexadecimaisTest {

    @Test
    void deveriaaConverterListaDeHexadecimaisEmMensagem() {
        ConversorDeHexadecimais conversorDeHexadecimais = new ConversorDeHexadecimais(Arrays.asList("64", "61", "69", "61", "6e", "65"));
        String converte = conversorDeHexadecimais.converte();
        Assertions.assertEquals("daiane",converte);
    }

    @Test
    void deveriaaConverterListaDeHexadecimaisEmMensagem2() {
        ConversorDeHexadecimais conversorDeHexadecimais = new ConversorDeHexadecimais(Arrays.asList(
                "4f", "69", "2c", "20", "74", "75", "64", "6f", "20", "62", "65", "6d", "3f"));

        String converte = conversorDeHexadecimais.converte();
        Assertions.assertEquals("Oi, tudo bem?",converte);
    }

}