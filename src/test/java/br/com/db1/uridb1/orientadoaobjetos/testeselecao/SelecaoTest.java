package br.com.db1.uridb1.orientadoaobjetos.testeselecao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelecaoTest {

    @Test
    void verficaSeValoresPassadosSaoNull() {
        try {
            TesteSelecao testeSelecao = new TesteSelecao(null, null, null, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valor não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void verficaSeValoresPassadosSaoNull2() {
        try {
            TesteSelecao testeSelecao = new TesteSelecao(null, null, 6, 856);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valor não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void verficaSeValoresPassadosSaoNull3() {
        try {
            TesteSelecao testeSelecao = new TesteSelecao(670, null, null, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valor não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void verficaSeValoresPassadosSaoNull4() {
        try {
            TesteSelecao testeSelecao = new TesteSelecao(987, 213, 2434, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valor não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void getValorBEhMaiorQueValorC() {
        TesteSelecao testeSelecao = new TesteSelecao(5,2,3,1);
        assertFalse(testeSelecao.getValorBEhMaiorQueValorC());
    }

    @Test
    void getValorBEhMaiorQueValorC2() {
        TesteSelecao testeSelecao = new TesteSelecao(5,5,3,1);
        assertTrue(testeSelecao.getValorBEhMaiorQueValorC());
    }

    @Test
    void getValorBEhMaiorQueValorC3() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,0,1);
        assertFalse(testeSelecao.getValorBEhMaiorQueValorC());
    }

    @Test
    void getValorDEhMaiorQueValorA() {
        TesteSelecao testeSelecao = new TesteSelecao(5,2,3,1);
        assertFalse(testeSelecao.getValorDEhMaiorQueValorA());
    }
    @Test
    void getValorDEhMaiorQueValorA2() {
        TesteSelecao testeSelecao = new TesteSelecao(6,5,3,10);
        assertTrue(testeSelecao.getValorDEhMaiorQueValorA());
    }

    @Test
    void getValorDEhMaiorQueValorA3() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,0,5);
        assertFalse(testeSelecao.getValorDEhMaiorQueValorA());
    }

    @Test
    void getSomaValorCValorDEhMaiorQueSomaValorAValorB() {
        TesteSelecao testeSelecao = new TesteSelecao(5,2,3,1);
        assertFalse(testeSelecao.getSomaValorCValorDEhMaiorQueSomaValorAValorB());
    }
    @Test
    void getSomaValorCValorDEhMaiorQueSomaValorAValorB2() {
        TesteSelecao testeSelecao = new TesteSelecao(6,5,3,10);
        assertTrue(testeSelecao.getSomaValorCValorDEhMaiorQueSomaValorAValorB());
    }

    @Test
    void getSomaValorCValorDEhMaiorQueSomaValorAValorB3() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,0,5);
        assertFalse(testeSelecao.getSomaValorCValorDEhMaiorQueSomaValorAValorB());
    }

    @Test
    void isValorCEhPositivo() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,0,5);
        assertTrue(testeSelecao.isValorCEhPositivo());
    }

    @Test
    void isValorCEhPositivo1() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,-5,5);
        assertFalse(testeSelecao.isValorCEhPositivo());
    }

    @Test
    void isValorCEhPositivo2() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,9,5);
        assertTrue(testeSelecao.isValorCEhPositivo());
    }

    @Test
    void isValorDEhPositivo() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,0,5);
        assertTrue(testeSelecao.isValorCEhPositivo());
    }

    @Test
    void isValorDEhPositivo1() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,-5,-5);
        assertFalse(testeSelecao.isValorCEhPositivo());
    }

    @Test
    void isValorDEhPositivo2() {
        TesteSelecao testeSelecao = new TesteSelecao(5,0,9,0);
        assertTrue(testeSelecao.isValorCEhPositivo());
    }

    @Test
    void isValorAEhPar() {
        TesteSelecao testeSelecao = new TesteSelecao(1,2,3,5);
        assertFalse(testeSelecao.isValorAEhPar());
    }

    @Test
    void isValorAEhPar2() {
        TesteSelecao testeSelecao = new TesteSelecao(2,2,3,5);
        assertTrue(testeSelecao.isValorAEhPar());
    }

    @Test
    void isValorAEhPar3() {
        TesteSelecao testeSelecao = new TesteSelecao(0,2,3,5);
        assertTrue(testeSelecao.isValorAEhPar());
    }

    @Test
    void isValorAEhPar4() {
        TesteSelecao testeSelecao = new TesteSelecao(-2,2,3,5);
        assertTrue(testeSelecao.isValorAEhPar());
    }

    @Test
    void isValorEhAceito() {
        TesteSelecao testeSelecao = new TesteSelecao(-2,2,3,2);
        assertFalse(testeSelecao.isValorEhAceito());
    }

    @Test
    void isValorEhAceito2() {
        TesteSelecao testeSelecao = new TesteSelecao(2,5,1,10);
        assertTrue(testeSelecao.isValorEhAceito());
    }

    @Test
    void isValorEhAceito3() {
        TesteSelecao testeSelecao = new TesteSelecao(1,1,1,2);
        assertFalse(testeSelecao.isValorEhAceito());
    }

}