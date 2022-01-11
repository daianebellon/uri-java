package br.com.db1.uridb1.orientadoaobjetos.combustivel;

public class MedidorConsumo {

    private final int tempo;
    private final int velocidadeMedia;

    public MedidorConsumo(Integer tempo, Integer velocidadeMedia) {
        if (tempo == null || velocidadeMedia == null) {
            throw new NullPointerException("O valor não pode ser null");
        }
        this.tempo = tempo;
        this.velocidadeMedia = velocidadeMedia;
    }

    public int getDistancia() {
        return  velocidadeMedia * tempo ;
    }

    public double getLitrosConsumidos(double mediaFeitaPeloVeiculo) {
        return getDistancia() / mediaFeitaPeloVeiculo;
    }
}
