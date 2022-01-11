package br.com.db1.uridb1.orientadoaobjetos.combustivel;

public class Uri101716 {

    public static void main(String[] args) {
        MedidorConsumo medidorConsumo = new MedidorConsumo(10, 85);

        double distanciaPercorrida = medidorConsumo.getDistancia();
        double litrosConsumidos = medidorConsumo.getLitrosConsumidos(12);

        System.out.println("A distância percorrida foi de " + distanciaPercorrida +" Km");
        System.out.printf("O consumo em litros foi de %.2f L \n", litrosConsumidos);

    }
}
