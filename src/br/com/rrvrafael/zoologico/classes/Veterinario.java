package br.com.rrvrafael.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Veterinario {
    private String nome;
    private final List<Animal> animais;

    public Veterinario() {
        animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void atenderAnimal(Animal dadosAnimal) {
        animais.add(dadosAnimal);
    }

    public void cancelarAtendimento(int idAnimal) {
        animais.remove(idAnimal);
    }

    public void listarAnimaisAtendidos() {
        System.out.println("\nAnimais atendidos:");

        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + "\n" + "Espécie: " + animal.getEspecie() + "\n" + "Idade: " + animal.getIdade());
        }
    }
}
