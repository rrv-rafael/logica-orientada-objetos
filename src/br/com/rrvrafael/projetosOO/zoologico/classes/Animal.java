package br.com.rrvrafael.projetosOO.zoologico.classes;

public abstract class Animal implements Animavel {
    private String nome;
    protected String especie;
    protected int idade;
    protected boolean estaVivo;

    public Animal() {
        this.estaVivo = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public boolean animalAdulto() {
        if (estaVivo) {
            return idade >= 1;
        }

        return false;
    }

    public abstract String emitirSom();

    @Override
    public final void morrer() {
        this.estaVivo = false;
    }
}
