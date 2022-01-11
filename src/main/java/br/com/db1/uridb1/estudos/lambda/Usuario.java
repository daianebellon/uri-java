package br.com.db1.uridb1.estudos.lambda;

public class Usuario {
    private String nome;
    private  int idade;

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
