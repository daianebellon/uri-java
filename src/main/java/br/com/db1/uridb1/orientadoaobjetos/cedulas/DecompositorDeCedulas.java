package br.com.db1.uridb1.orientadoaobjetos.cedulas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class DecompositorDeCedulas {

    private static final List<Integer> CEDULAS = Arrays.asList(100, 50 , 20 ,10, 5, 2, 1);

    public List<Troco> decompositarCedulas(Integer valor) {
        if (valor == null) {
            throw new NullPointerException("Valor não pode ser nulo");
        }
        List<Troco> trocoList = new ArrayList<>();

        AtomicInteger tempValor = new AtomicInteger(valor);

        CEDULAS.forEach(cedula -> {
            int quantidadeDeCedulas = tempValor.intValue() / cedula;
            trocoList.add(new Troco(quantidadeDeCedulas, cedula));
            tempValor.set(tempValor.intValue() % cedula);
        });
        return trocoList;
    }

}
