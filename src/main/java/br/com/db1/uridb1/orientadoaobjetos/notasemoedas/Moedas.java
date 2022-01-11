package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

import java.util.Objects;

public class Moedas {

    private final double quantidadeDeMoedas;
    private final double valorDaMoeda;

    public Moedas(double quantidadeDeMoedas, double valorDaMoeda) {
        this.quantidadeDeMoedas = quantidadeDeMoedas;
        this.valorDaMoeda = valorDaMoeda;
    }

    public double getQuantidadeDeMoedas() {
        return quantidadeDeMoedas;
    }

    public double getValorDaMoeda() {
        return valorDaMoeda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moedas moedas = (Moedas) o;
        return Double.compare(moedas.quantidadeDeMoedas, quantidadeDeMoedas) == 0 && Double.compare(moedas.valorDaMoeda, valorDaMoeda) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantidadeDeMoedas, valorDaMoeda);
    }
}
