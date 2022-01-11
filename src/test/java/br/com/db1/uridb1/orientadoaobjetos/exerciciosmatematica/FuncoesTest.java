package br.com.db1.uridb1.orientadoaobjetos.exerciciosmatematica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncoesTest {

    @Test
    void verificaSeEntradaDeValoresSaoNull() {
        NullPointerException exception = assertThrows(NullPointerException.class, () -> new Funcoes(null, null));
        Assertions.assertEquals("Coordenada não pode ser nula", exception.getMessage());
    }

    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao() {
        Funcoes funcoes = new Funcoes(2, 100);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Carlos Ganhou", ganhadorDaMaiorFuncao);
    }

    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao2() {
        Funcoes funcoes = new Funcoes(6,6);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Beto Ganhou", ganhadorDaMaiorFuncao);
    }

    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao3() {
        Funcoes funcoes = new Funcoes(5,3);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Beto Ganhou", ganhadorDaMaiorFuncao);
    }

    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao4() {
        Funcoes funcoes = new Funcoes(2,30);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Carlos Ganhou", ganhadorDaMaiorFuncao);
    }

    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao5() {
        Funcoes funcoes = new Funcoes(30,20);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Beto Ganhou", ganhadorDaMaiorFuncao);
    }

    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao6() {
        Funcoes funcoes = new Funcoes(15,5);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Rafael Ganhou", ganhadorDaMaiorFuncao);
    }


    @Test
    void deveriaDevolverOhGanhadorDaMaiorFuncao7() {
        Funcoes funcoes = new Funcoes(30,2);
        String ganhadorDaMaiorFuncao = funcoes.getMaiorFuncao();
        Assertions.assertEquals("Rafael Ganhou", ganhadorDaMaiorFuncao);
    }


}