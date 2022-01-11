package br.com.db1.uridb1.orientadoaobjetos.idade;

public class Uri1020 {

    public static void main(String[] args) {
        ConversorIdade conversorDeIdade = new ConversorIdade(30);
        Tempo tempo = conversorDeIdade.converterIdadeEmAnoMesDia();
        int ano = tempo.getAno();
        int mes = tempo.getMes();
        int dia = tempo.getDia();

        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dia);

    }
}
