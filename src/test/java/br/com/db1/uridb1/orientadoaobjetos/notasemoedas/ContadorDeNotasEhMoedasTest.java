package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContadorDeNotasEhMoedasTest {

    @Test
    void verificaSeValorPassadoEhNegativo() {
        try {
            ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(-5.9);
            fail();
        }catch (IllegalArgumentException e) {
            Assertions.assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    void verificaSeValorComDecimalEhNegativo() {
        try {
            ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(-5.98);
            fail();
        }catch (IllegalArgumentException e) {
            Assertions.assertEquals("Valor inválido!", e.getMessage());
        }
    }

    @Test
    void getNotaComMoedaPassandoZero() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.000000245678987654);

        List<Notas> nota = contadorDeNotasEhMoedas.getNota();
        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(0 , 100.00),
                new Notas(0 , 50.00),
                new Notas(0 , 20.00),
                new Notas(0 , 10.00),
                new Notas(0 , 5.00),
                new Notas(0 , 2.00)
        );

        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();
        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas(0 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(0 , 0.01)
        );

        Assertions.assertEquals(quantidadeNotas, nota);
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getNotaComMoedaPassandoZeroComMuitasCasasDecimais() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.03837552372737734838383);

        List<Notas> nota = contadorDeNotasEhMoedas.getNota();
        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(0 , 100.00),
                new Notas(0 , 50.00),
                new Notas(0 , 20.00),
                new Notas(0 , 10.00),
                new Notas(0 , 5.00),
                new Notas(0 , 2.00)
        );

        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();
        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas(0 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(4 , 0.01)
        );

        Assertions.assertEquals(quantidadeNotas, nota);
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }


    @Test
    void getNotaComMoedaPassandoZeros() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.0);

        List<Notas> nota = contadorDeNotasEhMoedas.getNota();
        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(0 , 100.00),
                new Notas(0 , 50.00),
                new Notas(0 , 20.00),
                new Notas(0 , 10.00),
                new Notas(0 , 5.00),
                new Notas(0 , 2.00)
        );

        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();
        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas(0 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(0 , 0.01)
        );

        Assertions.assertEquals(quantidadeNotas, nota);
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getNotaComMoeda() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(50.65);

        List<Notas> nota = contadorDeNotasEhMoedas.getNota();
        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(0 , 100.00),
                new Notas(1 , 50.00),
                new Notas(0 , 20.00),
                new Notas(0 , 10.00),
                new Notas(0 , 5.00),
                new Notas(0 , 2.00)
        );

        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();
        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(1 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas(1 , 0.10),
                new Moedas(1 , 0.05),
                new Moedas(0 , 0.01)
        );

        Assertions.assertEquals(quantidadeNotas, nota);
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getNotaComMoeda2() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(1352.94);

        List<Notas> nota = contadorDeNotasEhMoedas.getNota();
        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(13 , 100.00),
                new Notas(1 , 50.00),
                new Notas(0 , 20.00),
                new Notas(0 , 10.00),
                new Notas(0 , 5.00),
                new Notas(1 , 2.00)
        );

        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();
        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(1 , 0.50),
                new Moedas(1 , 0.25),
                new Moedas(1 , 0.10),
                new Moedas(1 , 0.05),
                new Moedas(4 , 0.01)
        );

        Assertions.assertEquals(quantidadeNotas, nota);
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getNotaComMoeda3() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(75.346783847568458948494948978478447);

        List<Notas> nota = contadorDeNotasEhMoedas.getNota();
        List<Notas> quantidadeNotas = Arrays.asList(
                new Notas(0 , 100.00),
                new Notas(1 , 50.00),
                new Notas(1 , 20.00),
                new Notas(0 , 10.00),
                new Notas(1 , 5.00),
                new Notas(0 , 2.00)
        );

        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();
        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(1 , 0.25),
                new Moedas(1 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(0 , 0.01)
        );

        Assertions.assertEquals(quantidadeNotas, nota);
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

}