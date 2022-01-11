package br.com.db1.uridb1.orientadoaobjetos.testeselecao;

import java.util.Objects;

public class TesteSelecao {

    private final Integer valorA;
    private final Integer valorB;
    private final Integer valorC;
    private final Integer valorD;

    public TesteSelecao(Integer valorA, Integer valorB, Integer valorC, Integer valorD) {
        this.valorA = Objects.requireNonNull(valorA, "Valor não pode ser nulo");
        this.valorB = Objects.requireNonNull(valorB, "Valor não pode ser nulo");
        this.valorC = Objects.requireNonNull(valorC, "Valor não pode ser nulo");
        this.valorD =   Objects.requireNonNull(valorD, "Valor não pode ser nulo");
    }

    public boolean getValorBEhMaiorQueValorC() {
        return this.valorB > this.valorC;
    }

    public boolean getValorDEhMaiorQueValorA() {
        return this.valorD > this.valorA;
    }

    public boolean getSomaValorCValorDEhMaiorQueSomaValorAValorB() {
        return (this.valorC + this.valorD) > (this.valorA + this.valorB);
    }

    public  boolean isValorCEhPositivo() {
        return this.valorC >= 0;
    }

    public  boolean isValorDEhPositivo() {
        return this.valorD >= 0;
    }

    public  boolean isValorAEhPar() {
        return this.valorA % 2 == 0;
    }

    public boolean isValorEhAceito() {

        if (getValorBEhMaiorQueValorC() && getValorDEhMaiorQueValorA() && getSomaValorCValorDEhMaiorQueSomaValorAValorB()
                 && isValorCEhPositivo() && isValorDEhPositivo() && isValorAEhPar()) {
            System.out.println("Valores aceitos");
            return true;
        } else {
            System.out.println("Valores nao aceitos");
            return false;
        }
    }


}