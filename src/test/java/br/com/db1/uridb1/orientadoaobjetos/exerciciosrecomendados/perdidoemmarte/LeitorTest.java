package br.com.db1.uridb1.orientadoaobjetos.exerciciosrecomendados.perdidoemmarte;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LeitorTest {

    @Test
    void verificaSeStringEhNull() {
        assertThrows(NullPointerException.class, () -> new Leitor().getMensagem(null));
    }

    @Test
    void verificaSeStringPossuiValorValido() {
        assertThrows(IllegalArgumentException.class, () -> new Leitor().getMensagem(new String[]{"     "}));
    }

    @Test
    void verificaSeStringPossuiValorValido2() {
        assertThrows(IllegalArgumentException.class, () -> new Leitor().getMensagem(new String[]{""}));
    }

    @Test
    void verificaSeStringPossuiValorValido3() {
        assertThrows(IllegalArgumentException.class, () -> new Leitor().getMensagem(new String[]{}));
    }


    @Test
    void verificaMensagemQuandoStringEhNull() {
        NullPointerException e = assertThrows(NullPointerException.class, () -> new Leitor().getMensagem(null));
        Assertions.assertEquals("Valor não pode ser nulo", e.getMessage());
    }

    @Test
    void deveriaLerMensagemEmHexadecimalEConverterParaUmaListaDeString() {
        Leitor leitor = new Leitor();
        List<String> mensagem = leitor.getMensagem(new String[]{"13",  "4f", "69", "2c", "20", "74", "75", "64", "6f", "20", "62", "65", "6d", "3f"});
        List<String> hexadecimais = Arrays.asList("4f", "69", "2c", "20", "74", "75", "64", "6f", "20", "62", "65", "6d", "3f");
        Assertions.assertEquals(hexadecimais, mensagem);
    }


}