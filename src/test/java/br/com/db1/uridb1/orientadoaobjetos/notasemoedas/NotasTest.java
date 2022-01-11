package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class NotasTest {

    @Test
    void getNota() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(100.0);
        List<Notas> nota = contadorDeNotasEhMoedas.getNota();

        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(1 , 100.00),
                new Notas(0 , 50.00),
                new Notas(0 , 20.00),
                new Notas(0 , 10.00),
                new Notas(0 , 5.00),
                new Notas(0 , 2.00)
        );
        Assertions.assertEquals(quantidadeNotas.size(), nota.size());
        Assertions.assertEquals(quantidadeNotas, nota);
    }

    @Test
    void getNotaComDecimal() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(148.90);
        List<Notas> nota = contadorDeNotasEhMoedas.getNota();

        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(1 , 100.00),
                new Notas(0 , 50.00),
                new Notas(2 , 20.00),
                new Notas(0 , 10.00),
                new Notas(1 , 5.00),
                new Notas(1 , 2.00)
        );
        Assertions.assertEquals(quantidadeNotas.size(), nota.size());
        Assertions.assertEquals(quantidadeNotas, nota);
    }

    @Test
    void getQuantidadeDeNotas() {
    }

    @Test
    void getValorDaNota() {
    }

}