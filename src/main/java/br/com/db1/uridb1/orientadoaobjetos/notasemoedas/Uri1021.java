package br.com.db1.uridb1.orientadoaobjetos.notasemoedas;

public class Uri1021 {

    public static void main(String[] args) {

        double valorMonetario = Double.parseDouble(args[0]);

        ContadorDeNotasEhMoedas contadorDeNotasEhMoedas = new ContadorDeNotasEhMoedas(valorMonetario);
        contadorDeNotasEhMoedas.getNota();
        contadorDeNotasEhMoedas.getMoeda();

    }
}
