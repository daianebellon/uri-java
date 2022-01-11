package br.com.db1.uridb1.orientadoaobjetos.idade;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversorIdadeTest {

    @Test
    void verificaSeValorPassadoEhNull() {
        try {
            ConversorIdade conversorIdade = new ConversorIdade(null);
            fail();
        } catch (NullPointerException e) {
            Assertions.assertEquals(  "Valor informado não pode ser nulo!",e.getMessage());
        }
    }

    @Test
    void deveriaConverteIdadeEmDiasParaIdadeEmAnos() {
        ConversorIdade conversorIdade = new ConversorIdade(33);
        Tempo tempo = conversorIdade.converterIdadeEmAnoMesDia();
        assertEquals(0, tempo.getAno());
        assertEquals(1, tempo.getMes());
        assertEquals(3, tempo.getDia());
    }

    @Test
    void deveriaConverteIdadeEmDiasParaIdadeEmAnosIgualAZero() {
        ConversorIdade conversorIdade = new ConversorIdade(0);
        Tempo tempo = conversorIdade.converterIdadeEmAnoMesDia();
        assertEquals(0, tempo.getAno());
        assertEquals(0, tempo.getMes());
        assertEquals(0, tempo.getDia());
    }
}