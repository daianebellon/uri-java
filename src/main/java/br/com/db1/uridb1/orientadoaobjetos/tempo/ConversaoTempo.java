package br.com.db1.uridb1.orientadoaobjetos.tempo;

import java.util.Objects;

public class ConversaoTempo {

    private int tempo;

    public ConversaoTempo(Integer tempo) {
        Objects.requireNonNull(tempo, "Valor não pode ser nulo");

        if (tempo < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        this.tempo = tempo;
    }

    public Horario converte() {
        int horas = tempo / 3600;
        tempo %= 3600;

        int minutos = tempo / 60;
        tempo %= 60;

        int segundos = tempo;

        return new Horario(horas, minutos, segundos);
    }

}
