package br.com.db1.uridb1.orientadoaobjetos.exerciciosmatematica;

import java.util.Objects;

public class Funcoes {
    private Integer X;
    private Integer Y;

    public Funcoes(Integer coordenadaX, Integer coordenadaY) {
        this.X = Objects.requireNonNull(coordenadaX, "Coordenada não pode ser nula");
        this.Y = Objects.requireNonNull(coordenadaY, "Coordenada não pode ser nula");
    }

    public String getMaiorFuncao() {
        double valorRafael = calcularFuncaoDoRapael();
        double valorBeto = calcularFuncaoDoBeto();
        double valorCarlos = calcularFuncaoDoCarlos();

        if (valorBeto > valorCarlos &&
                valorBeto > valorRafael) {
            return "Beto Ganhou";
        }else if (valorCarlos > valorBeto
                && valorCarlos > valorRafael) {
            return "Carlos Ganhou";
        }else {
            return "Rafael Ganhou";
        }
    }

    private double calcularFuncaoDoRapael() {
        return Math.pow((3 * this.X), 2) + (Math.pow(this.Y, 2));
    }

    private double calcularFuncaoDoBeto() {
        return (2 * (Math.pow(this.X, 2))) + (Math.pow((5 * this.Y), 2));
    }

    private double calcularFuncaoDoCarlos() {
        return (-100 * this.X) + Math.pow(this.Y, 3);
    }




}
