package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class MoedasTest {

    @Test
    void getMoeda() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.60);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(1 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas(1 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(0 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getMoeda2() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.90);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(1 , 0.50),
                new Moedas(1 , 0.25),
                new Moedas(1 , 0.10),
                new Moedas(1 , 0.05),
                new Moedas(0 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getMoeda3() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.45);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(1 , 0.25),
                new Moedas(2 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(0 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getMoeda4() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.99);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(1 , 0.50),
                new Moedas(1 , 0.25),
                new Moedas(2 , 0.10),
                new Moedas(0 , 0.05),
                new Moedas(4 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getMoeda5() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.18);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas(1 , 0.10),
                new Moedas(1 , 0.05),
                new Moedas(3 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getMoeda6() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(8.48);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(8 , 1.00),
                new Moedas(0 , 0.50),
                new Moedas(1 , 0.25),
                new Moedas( 2, 0.10),
                new Moedas(0 , 0.05),
                new Moedas(3 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }


    @Test
    void getMoeda7() {
        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(0.11111111);
        List<Moedas> moeda = contadorDeNotasEhMoedas.getMoeda();

        List<Moedas> quantidadeMoedas = Arrays.asList(
                new Moedas(0, 1.00),
                new Moedas(0 , 0.50),
                new Moedas(0 , 0.25),
                new Moedas( 1, 0.10),
                new Moedas(0 , 0.05),
                new Moedas(1 , 0.01)
        );
        Assertions.assertEquals(quantidadeMoedas, moeda);
    }

    @Test
    void getQuantidadeDeMoedas() {
    }

    @Test
    void getValorDaMoeda() {
    }

}