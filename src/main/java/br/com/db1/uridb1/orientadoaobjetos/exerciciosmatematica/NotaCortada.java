package br.com.db1.uridb1.orientadoaobjetos.exerciciosmatematica;

public class NotaCortada {

    private Integer base;
    private Integer topo;

    public NotaCortada(Integer base, Integer topo) {
        this.base = base;
        this.topo = topo;
    }

    public Integer getQuemVaiFicarComANota() {
        Integer largura = 160;
        Integer altura = 70;

       if (this.base > (largura - this.topo)) {
           return 1;
       } else if (this.base < (largura - this.topo)) {
           return 2;
       } else {
           return 0;
       }

    }
}
