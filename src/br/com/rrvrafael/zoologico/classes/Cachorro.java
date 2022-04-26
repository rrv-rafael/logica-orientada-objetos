package br.com.rrvrafael.zoologico.classes;

public class Cachorro extends Animal {
    public Cachorro() {
        super();
        especie = "Cachorro";
    }

    @Override
    public String emitirSom() {
        if (estaVivo) {
            return "Latido";
        }

        return "O doguinho morreu =(";
    }

    @Override
    public boolean animalAdulto() {
        if (estaVivo) {
            return idade >= 2;
        }

        return false;
    }
}
