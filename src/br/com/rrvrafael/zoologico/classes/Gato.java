package br.com.rrvrafael.zoologico.classes;

public class Gato extends Animal {
    public Gato() {
        super();
    }

    @Override
    public String emitirSom() {
        if (estaVivo) {
            return "Miado";
        }

        return "O gatinho morreu =(";
    }
}