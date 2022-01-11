package br.com.db1.uridb1.orientadoaobjetos.exerciciosmatematica;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AsMeiasDeRangelTest {

    @Test
    void verificaSeValorPassadoEhNull() {
        assertThrows(NullPointerException.class, () -> new AsMeiasDeRangel(null));
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> new AsMeiasDeRangel(null));
        assertEquals("Valor não pode ser null", exception.getMessage());
    }

    @Test
    void verificaSePodePegarValorZero() {
        assertThrows(IllegalArgumentException.class, () -> new AsMeiasDeRangel(0));
    }


    @Test
    void deveriaPegarQuantidadeMinimaDeMeiasNecessariasParaTerUmParDaMesmaCor() {
        AsMeiasDeRangel asMeiasDeRangel = new AsMeiasDeRangel(1);
        Integer quantidadeDeMeiasNecessarias = asMeiasDeRangel.getQuantidadeDeMeiasNecessarias();
        Assertions.assertEquals(2, quantidadeDeMeiasNecessarias);
    }

    @Test
    void deveriaPegarQuantidadeMinimaDeMeiasNecessariasParaTerUmParDaMesmaCor2() {
        AsMeiasDeRangel asMeiasDeRangel = new AsMeiasDeRangel(10);
        Integer quantidadeDeMeiasNecessarias = asMeiasDeRangel.getQuantidadeDeMeiasNecessarias();
        Assertions.assertEquals(11, quantidadeDeMeiasNecessarias);
    }


}