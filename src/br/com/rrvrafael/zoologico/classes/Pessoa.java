package br.com.rrvrafael.zoologico.classes;

public class Pessoa {
    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void showInfo() {
        System.out.println(nome);
        System.out.println(idade);
    }
}
