package br.com.db1.uridb1.orientadoaobjetos.media;

public class Uri1005 {

    public static void main(String[] args) {
        CalculadoraDeMedia calculadoraDeMedia = new CalculadoraDeMedia(1D,4D, 6D,  6D);

        System.out.printf("MEDIA = %.1f\n", calculadoraDeMedia.getMediaDasNotas());
        System.out.println(calculadoraDeMedia.isAprovado() ? "Aprovado!" : "Reprovado!");
    }

}
