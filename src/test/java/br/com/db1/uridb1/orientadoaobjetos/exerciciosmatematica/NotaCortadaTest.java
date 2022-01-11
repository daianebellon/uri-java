package br.com.db1.uridb1.orientadoaobjetos.exerciciosmatematica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NotaCortadaTest {

    @Test
    void deveriaDevolverQuemVaiFicarComANotaOuSeANotaSePerdeu() {
        NotaCortada notaCortada = new NotaCortada(50, 86);
        Integer numero =  notaCortada.getQuemVaiFicarComANota();
        Assertions.assertEquals(2, numero);
    }

    @Test
    void deveriaDevolverQuemVaiFicarComANotaOuSeANotaSePerdeu2() {
        NotaCortada notaCortada = new NotaCortada(70, 90);
        Integer numero =  notaCortada.getQuemVaiFicarComANota();
        Assertions.assertEquals(0, numero);
    }

    @Test
    void deveriaDevolverQuemVaiFicarComANotaOuSeANotaSePerdeu3() {
        NotaCortada notaCortada = new NotaCortada(130, 138);
        Integer numero =  notaCortada.getQuemVaiFicarComANota();
        Assertions.assertEquals(1, numero);
    }
}