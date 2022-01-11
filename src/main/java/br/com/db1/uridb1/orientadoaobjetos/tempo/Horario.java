package br.com.db1.uridb1.orientadoaobjetos.tempo;

import java.util.Objects;

public class Horario {
    private final int hora;
    private final int minuto;
    private final int segundo;

    public Horario(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return hora == horario.hora && minuto == horario.minuto && segundo == horario.segundo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hora, minuto, segundo);
    }
}
