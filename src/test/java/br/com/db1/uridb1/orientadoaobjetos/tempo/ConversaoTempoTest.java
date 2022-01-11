package br.com.db1.uridb1.orientadoaobjetos.tempo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class ConversaoTempoTest {

    @Test
    void verificaSeValorPassadoEhNull() {
        try {
            ConversaoTempo conversaoTempo = new ConversaoTempo(null);
            fail();
        } catch (NullPointerException e) {
            Assertions.assertEquals("Valor não pode ser nulo", e.getMessage());
        }
    }

    @Test
    void verificaSeValorPassadoEhMenorQueZero() {
        try {
            ConversaoTempo conversaoTempo = new ConversaoTempo(-100);
            fail();
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("Valor inválido", e.getMessage());
        }
    }

    @Test
    void deveriaConverterTempoEmSegundosParaHorasMinutosSegundos() {
        ConversaoTempo conversaoTempo = new ConversaoTempo(63);
        Horario converteTempoDeSegundosParaTempoHoraMinutosSegundo = conversaoTempo.converte();
        Horario horario = new Horario(0,1,3);
        Assertions.assertEquals(horario, converteTempoDeSegundosParaTempoHoraMinutosSegundo);
    }

    @Test
    void deveriaConverterTempoEmSegundosParaHorasMinutosSegundos2() {
        ConversaoTempo conversaoTempo = new ConversaoTempo(3600);
        Horario converteTempoDeSegundosParaTempoHoraMinutosSegundo = conversaoTempo.converte();
        Horario horario = new Horario(1,0,0);
        Assertions.assertEquals(horario, converteTempoDeSegundosParaTempoHoraMinutosSegundo);
    }


}