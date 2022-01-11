package br.com.db1.uridb1.orientadoaobjetos.exerciciosmatematica;

import java.util.Objects;

public class AsMeiasDeRangel {

    private final Integer quantidadeMeiasNaGaveta;

    public AsMeiasDeRangel(Integer quantidadeMeiasNaGaveta) {
        Objects.requireNonNull(quantidadeMeiasNaGaveta, "Valor não pode ser null");

        if (quantidadeMeiasNaGaveta <= 0) {
            throw new IllegalArgumentException("Valor invalido");
        }

        this.quantidadeMeiasNaGaveta = quantidadeMeiasNaGaveta;
    }

    public Integer getQuantidadeDeMeiasNecessarias() {
        return this.quantidadeMeiasNaGaveta + 1;
    }
}
