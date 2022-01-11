package br.com.db1.uridb1.orientadoaobjetos.media;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

class CalculadoraDeMediaTest {

    @Test
    void verificaSeEntraValoresNegativosParaCalcularMediaDasNotas() {
        try {
            CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia(-5D,5D,5D, -5D);
            fail();
        }catch (NullPointerException e) {
            assertEquals("Valor não pode ser negativo", e.getMessage());
        }
    }

    @Test
    void verificaSevalorPassadoEhNull() {
        try {
            CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia(null,null,null, null);
            fail();
        }catch (NullPointerException e) {
            assertEquals("Valor não pode ser nullo", e.getMessage());
        }
    }

    @Test
    void verificaSeValorePassadosSaoNullEhNegativos() {
        try {
            CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia(-8D,0D,null,  5D);
            fail();
        }catch (NullPointerException e) {
            assertEquals("Valor não pode ser nullo", e.getMessage());
        }
    }

    @Test
    void deveriaCalcularMediaDasNotsa() {
        CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia(10D, 5D, 9D, 5D);
        Double mediaDasNotas = calculadoraDeMedia.getMediaDasNotas();
        Assertions.assertEquals(9.5D, mediaDasNotas);
    }




}