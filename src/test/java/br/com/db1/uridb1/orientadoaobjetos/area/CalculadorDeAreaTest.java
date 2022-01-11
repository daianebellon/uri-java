package br.com.db1.uridb1.orientadoaobjetos.area;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadorDeAreaTest {

    @Test
    void verificaSeTodosOsValoresPassadosSaoNull() {
        try {
            new CalculadorDeArea(null, null, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valores não devem ser nulos", e.getMessage());
        }
    }

    @Test
    void verificaSeDoisValoresPassadosSaoNull() {
        try {
            new CalculadorDeArea(6D, null, null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valores não devem ser nulos", e.getMessage());
        }
    }

    @Test
    void verificaSeValorPassadoEhNull() {
        try {
            new CalculadorDeArea(6D, null, 8D);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valores não devem ser nulos", e.getMessage());
        }
    }

    @Test
    void deveriaCalculaAreaDoQuadrado() {
        CalculadorDeArea calculadorDeArea = new CalculadorDeArea(2D,3D,1D);
        double areaQuadrado = calculadorDeArea.getAreaQuadrado();
        assertEquals(9, areaQuadrado);
    }

    @Test
    void deveriaCalculaAreaDoTriangulo() {
        CalculadorDeArea calculadorDeArea = new CalculadorDeArea(1D, 5D, 2D);
        double areaTriangulo = calculadorDeArea.getAreaTriangulo();
        assertEquals(1, areaTriangulo);
    }

    @Test
    void deveriaCalcularAreaDoTrapezio() {
        CalculadorDeArea calculadorDeArea = new CalculadorDeArea(20D, 10D, 40D);
        double areaTrapezio = calculadorDeArea.getAreaTrapezio();
        assertEquals(600, areaTrapezio);
    }

    @Test
    void deveriaCalcularAreaDoRetangulo() {
        CalculadorDeArea calculadorDeArea = new CalculadorDeArea(20D, 10D, 40D);
        double areaRetangulo = calculadorDeArea.getAreaRetangulo();
        assertEquals(200, areaRetangulo);
    }

    @Test
    void deveriaCalcularAreaDoCirculo() {
        CalculadorDeArea calculadorDeArea = new CalculadorDeArea(2D, 2D, 2D);
        double areaCirculo = calculadorDeArea.getAreaCirculo();
        assertEquals(13, areaCirculo);
    }
}
