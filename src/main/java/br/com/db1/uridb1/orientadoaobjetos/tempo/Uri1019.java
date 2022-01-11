package br.com.db1.uridb1.orientadoaobjetos.tempo;

public class Uri1019 {

    public static void main(String[] args) {
        int tempoPassadoEmSegundos = Integer.parseInt(args[0]);

        ConversaoTempo conversaoTempo = new ConversaoTempo(tempoPassadoEmSegundos);
        Horario converte = conversaoTempo.converte();

        System.out.printf("%d:%d:%d\n", converte.getHora(), converte.getMinuto(), converte.getSegundo());
    }

}
