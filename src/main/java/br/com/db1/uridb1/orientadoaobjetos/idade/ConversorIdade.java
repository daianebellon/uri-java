package br.com.db1.uridb1.orientadoaobjetos.idade;

public class ConversorIdade {

    private int idadeEmDias;
    private static final int DIAS_NO_ANO = 365;
    private static final int DIAS_NO_MES = 30;

    public ConversorIdade(Integer idadeEmDias) {
        if (idadeEmDias == null) {
            throw new NullPointerException("Valor informado não pode ser nulo!");
        }
        this.idadeEmDias = idadeEmDias;
    }

    public Tempo converterIdadeEmAnoMesDia() {

        int ano = idadeEmDias / DIAS_NO_ANO;
        idadeEmDias %= DIAS_NO_ANO;

        int mes = idadeEmDias / DIAS_NO_MES;
        idadeEmDias %= DIAS_NO_MES;

        int dia = idadeEmDias;

        return new Tempo(ano, mes, dia);

    }
}
