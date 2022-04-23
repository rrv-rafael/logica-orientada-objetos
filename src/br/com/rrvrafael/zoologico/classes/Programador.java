package br.com.rrvrafael.zoologico.classes;

public class Programador extends Pessoa {
    private final String linguagem;

    public Programador(String nome, int idade) {
        super(nome, idade);
        this.linguagem = "Java";
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println(linguagem);
    }
}
