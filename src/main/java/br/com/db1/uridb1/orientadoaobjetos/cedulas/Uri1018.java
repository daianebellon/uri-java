package br.com.db1.uridb1.orientadoaobjetos.cedulas;

import java.text.NumberFormat;
import java.util.List;

public class Uri1018 {

    public static void main(String[] args) {
        int arg = Integer.parseInt(args[0]);

        DecompositorDeCedulas decompositorDeCedulas = new DecompositorDeCedulas();
        List<Troco> trocoList = decompositorDeCedulas.decompositarCedulas(arg);

        for (Troco troco : trocoList) {
            String cedula = NumberFormat.getCurrencyInstance().format(troco.getCedula());
            System.out.println(troco.getQuantidadeDeCedulas() + " nota(s) de " + cedula );
        }
    }
}
