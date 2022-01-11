package br.com.db1.uridb1.orientadoaobjetos.media;

public class CalculadoraDeMedia {

    private static final int NOTA_APROVACAO = 6;
    private final double notaA;
    private final double pesoNotaA;
    private final double notaB;
    private final double pesoNotaB;

    public CalculadoraDeMedia(Double notaA, Double pesoNotaA, Double notaB, Double pesoNotaB) {
        if (notaA == null || notaB == null || pesoNotaA == null || pesoNotaB == null) {
            throw new NullPointerException("Valor não pode ser nullo");
        }
        if (notaA < 0 || notaB < 0 || pesoNotaA < 0 || pesoNotaB <0) {
            throw new NullPointerException("Valor não pode ser negativo");
        }
        this.notaA = notaA;
        this.pesoNotaA = pesoNotaA;
        this.notaB = notaB;
        this.pesoNotaB = pesoNotaB;
    }

    public Double getMediaDasNotas() {
        return ((notaA * pesoNotaA) + (notaB * pesoNotaB)) / (pesoNotaA + pesoNotaB);
    }

    public Boolean isAprovado() {
      return getMediaDasNotas() >= NOTA_APROVACAO;
    }

}
