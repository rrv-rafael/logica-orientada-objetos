package br.com.rrvrafael.zoologico.exercicios.ex01.classes;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public static void marcarConsulta() {
        System.out.println("\nConsulta marcada com sucesso!\n");
    }

    public static void remarcarConsulta() {
        System.out.println("\nConsulta remarcada com sucesso!\n");
    }

    public static void cancelarConsulta() {
        System.out.println("\nConsulta cancelada com sucesso!\n");
    }
}
