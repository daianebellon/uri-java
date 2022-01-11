package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class ContadorDeNotasEhMoedas {

    private double valorMonetario;
    private static final int[] NOTAS = {100, 50, 20, 10, 5, 2};
    private static final double[] MOEDAS = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

    public ContadorDeNotasEhMoedas(Double valorMonetario) {
        if (valorMonetario < 0) {
            throw new IllegalArgumentException("Valor inválido!");
        }

        BigDecimal valorMonetarioAtualizado = BigDecimal.valueOf(valorMonetario).setScale(2, RoundingMode.HALF_EVEN);
        this.valorMonetario = valorMonetarioAtualizado.doubleValue();
    }

    public List<Notas> getNota() {
        ArrayList<Notas> notasList = new ArrayList<>();

        System.out.println("NOTAS:");

        for (double nota : NOTAS) {
            BigDecimal restoValor = getBigDecimalComDuasCasaDecimais(nota);

            double quantidadeDeNotas = Math.round((valorMonetario - restoValor.doubleValue()) / nota);

            notasList.add(new Notas(quantidadeDeNotas, nota));

            System.out.printf("%d nota(s) de R$ %.2f\n", (int) quantidadeDeNotas, nota);

            this.valorMonetario = restoValor.doubleValue();
        }
        return notasList;
    }

    public List<Moedas> getMoeda() {
        ArrayList<Moedas> moedasList = new ArrayList<>();

        System.out.println("MOEDAS:");

        for (double moeda : MOEDAS) {
            BigDecimal restoValor = getBigDecimalComDuasCasaDecimais(moeda);

            double quantidadeMoedas = Math.round((valorMonetario - restoValor.doubleValue()) / moeda);

            moedasList.add(new Moedas(quantidadeMoedas, moeda));

            System.out.printf("%d moeda(s) de R$ %.2f\n", (int) quantidadeMoedas, moeda);

            this.valorMonetario = restoValor.doubleValue();
        }
        return moedasList;
    }

    private BigDecimal getBigDecimalComDuasCasaDecimais(double notaOuMoeda) {
        return BigDecimal.valueOf(valorMonetario).remainder(BigDecimal.valueOf(notaOuMoeda));
    }

}

