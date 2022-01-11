package br.com.db1.uridb1.orientadoaobjetos.cedulas;

import java.util.Objects;

public class Troco {

    private final int quantidadeDeCedulas;
    private final int cedula;

    public Troco(int quantidadeDeCedulas, int valor) {
        this.quantidadeDeCedulas = quantidadeDeCedulas;
        this.cedula = valor;
    }

    public int getQuantidadeDeCedulas() {
        return quantidadeDeCedulas;
    }

    public int getCedula() {
        return cedula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Troco troco = (Troco) o;
        return quantidadeDeCedulas == troco.quantidadeDeCedulas && cedula == troco.cedula;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidadeDeCedulas, cedula);
    }
}
