package br.com.db1.uridb1.orientadoaobjetos.combustivel;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedidorConsumoTest {

    @Test
    void verificaSeValoresSaoNull() {
        try {
            MedidorConsumo medidorConsumo = new MedidorConsumo(null, null);
            int distancia = medidorConsumo.getDistancia();
            fail();
        } catch (NullPointerException e) {
            Assertions.assertEquals("O valor não pode ser null", e.getMessage());
        }
    }

    @Test
    void verificaSeVelocidadeEhNull() {
        try {
            MedidorConsumo medidorConsumo = new MedidorConsumo(5, null);
            int distancia = medidorConsumo.getDistancia();
            fail();
        } catch (NullPointerException e) {
            Assertions.assertEquals("O valor não pode ser null", e.getMessage());
        }
    }

    @Test
    void verificaSeTempoEhNull() {
        try {
            MedidorConsumo medidorConsumo = new MedidorConsumo(null, 8);
            int distancia = medidorConsumo.getDistancia();
            fail();
        } catch (NullPointerException e) {
            Assertions.assertEquals("O valor não pode ser null", e.getMessage());
        }
    }

    @Test
    void deveriaDevolverDistanciaPercorrida() {
        MedidorConsumo medidorConsumo = new MedidorConsumo(5, 80);
        int distancia = medidorConsumo.getDistancia();
        Assertions.assertEquals(400, distancia);
    }

    @Test
    void deveriaDevolverQuantidadeDeLitrosConsumidos() {
        MedidorConsumo medidorConsumo = new MedidorConsumo(2, 50);
        double litrosConsumidos = medidorConsumo.getLitrosConsumidos(10);
        Assertions.assertEquals(10, litrosConsumidos);
    }

}