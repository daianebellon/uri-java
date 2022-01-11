package br.com.db1.uridb1.orientadoaobjetos.idade;

public class Tempo {

    private final int ano;
    private final int mes;
    private final int dia;

    public Tempo(int ano, int mes, int dia) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }
}
