package br.com.db1.uridb1.orientadoaobjetos.cedulas;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class DecompositorDeCedulasTest {


    @Test
    void verificaSeValorPassadoEhNull() {
        try {
            DecompositorDeCedulas decompositorDeCedulas = new DecompositorDeCedulas();
            List<Troco> trocoList = decompositorDeCedulas.decompositarCedulas(null);
            fail();
        } catch (NullPointerException e) {
            assertEquals("Valor não pode ser nulo", e.getMessage());
        }
    }

     @Test
     void deveriaDevolverListaDeCedulasComQuantidadeDeCedula() {
         DecompositorDeCedulas decompositorDeCedulas = new DecompositorDeCedulas();
         List<Troco> trocoList = decompositorDeCedulas.decompositarCedulas(80);
         List<Troco> trocoEsperadoList = Arrays.asList(
                 new Troco(0, 100),
                 new Troco(1, 50),
                 new Troco(1, 20),
                 new Troco(1, 10),
                 new Troco(0, 5),
                 new Troco(0, 2),
                 new Troco(0, 1));

         assertEquals(trocoEsperadoList, trocoList);
     }

}