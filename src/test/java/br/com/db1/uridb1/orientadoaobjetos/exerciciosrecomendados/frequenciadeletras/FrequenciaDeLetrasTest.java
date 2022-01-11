package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.frequenciadeletras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequenciaDeLetrasTest {

    @Test
    void verificaSeStringPassadaEhNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new FrequenciaDeLetras(null));

        assertEquals("Texto não pode ser nulo", exception.getMessage());
    }

    @Test
    void verificaSeStringPassadaIsEmpty() {
        assertThrows(IllegalArgumentException.class,
                () -> new FrequenciaDeLetras(""));
    }

    @Test
    void verificaSeStringPassadaIsBlanck1() {
        try {
            FrequenciaDeLetras frequenciaDeLetras = new FrequenciaDeLetras("           ");
            fail("Não deu a exception");
        } catch (IllegalArgumentException e) {
            assertEquals("String não pode ser vazia", e.getMessage());
        }
    }

    @Test
    void getLetrasQueMaisSeRepetem() {
        String letrasQueMaisSeRepetem = new FrequenciaDeLetras("Oi, meu nome é Daiane!").getLetrasQueMaisSeRepetem();
        assertEquals("e", letrasQueMaisSeRepetem);
    }

    @Test
    void getLetrasQueMaisSeRepetem2() {
        FrequenciaDeLetras frequenciaDeLetras = new FrequenciaDeLetras("Oi");
        assertEquals("io", frequenciaDeLetras.getLetrasQueMaisSeRepetem());
    }

    @Test
    void getLetrasQueMaisSeRepetem3() {
        FrequenciaDeLetras frequenciaDeNumeros = new FrequenciaDeLetras("11111111111111222");
        assertEquals("1", frequenciaDeNumeros.getLetrasQueMaisSeRepetem());
    }

    @Test
    void getLetrasQueMaisSeRepetem4() {
        FrequenciaDeLetras frequenciaDeNumeros = new FrequenciaDeLetras("InPuT");
        assertEquals("inptu", frequenciaDeNumeros.getLetrasQueMaisSeRepetem());
    }
}