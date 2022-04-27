package br.com.rrvrafael.projetosOO.zoologico.classes;

public class Gato extends Animal {
    public Gato() {
        super();
        especie = "Gato";
    }

    @Override
    public String emitirSom() {
        if (estaVivo) {
            return "Miado";
        }

        return "O gatinho morreu =(";
    }
}
