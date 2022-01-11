package br.com.db1.uridb1.estudos.lambda;

import java.util.Arrays;
import java.util.List;

public class teste {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Daiane", 22);
        Usuario usuario2 = new Usuario("Felix", 21);
        Usuario usuario3 = new Usuario("Fernanda", 17);
        Usuario usuario4 = new Usuario("Felipe", 29);
        Usuario usuario5 = new Usuario("Luana", 15);
        Usuario usuario6 = new Usuario("maria", 16);

        List<Usuario> usuarios = Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6);

        usuarios.stream()
                .filter(usuario -> usuario.getIdade() > 18)
                .map(usuario -> usuario.getNome())
                .forEach(nome -> System.out.println(nome));

        System.out.println("----------------");

        usuarios.stream()
                .map(usuario ->  usuario.getNome())
                .filter(nome -> nome.startsWith("F"))
                .forEach(nome -> System.out.println(nome));

        System.out.println("----------------");

        usuarios.stream()
                .map(usuario ->  usuario.getNome())
                .forEach(nome -> System.out.println(nome));


        System.out.println("----------------");


        usuarios.stream()
                .forEach(usuario -> System.out.println("Nome: " + usuario.getNome() + ", idade: " + usuario.getIdade()));

    }

}
