package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

import java.util.Objects;

public class Notas {

    private final double quantidadeDeNotas;
    private final double valorDaNota;

    public Notas(double quantidadeDeNotas, double valorDaNota) {
        this.quantidadeDeNotas = quantidadeDeNotas;
        this.valorDaNota = valorDaNota;
    }

    public double getQuantidadeDeNotas() {
        return quantidadeDeNotas;
    }

    public double getValorDaNota() {
        return valorDaNota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notas notas = (Notas) o;
        return Double.compare(notas.quantidadeDeNotas, quantidadeDeNotas) == 0 && Double.compare(notas.valorDaNota, valorDaNota) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidadeDeNotas, valorDaNota);
    }
}
