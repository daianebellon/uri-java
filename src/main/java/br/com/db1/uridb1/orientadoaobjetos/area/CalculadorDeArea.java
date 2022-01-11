package br.com.db1.uridb1.orientadoaobjetos.area;

public class CalculadorDeArea {

    private final double valorA;
    private  final double valorB;
    private  final double valorC;

    public CalculadorDeArea(Double valorA, Double valorB, Double valorC) {
        if (valorA == null || valorB == null || valorC == null) {
            throw new NullPointerException("Valores não devem ser nulos");
        }

        this.valorA = valorA;
        this.valorB = valorB;
        this.valorC = valorC;
    }

    public double getAreaQuadrado() {
        return valorB * valorB;
    }

    public double getAreaTriangulo() {
        return (valorA * valorC) / 2.0;
    }

    public double getAreaRetangulo() {
        return valorA * valorB;
    }

     public double getAreaTrapezio() {
         return ((valorA + valorB) * valorC) / 2.0;
     }

     public double getAreaCirculo() {
         return Math.round(Math.PI * valorC * valorC);
     }

}
