package br.com.rrvrafael.projetosOO.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nome;
    private final List<Animal> animais;

    public Zoologico() {
        animais = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarAnimal(Animal dadosAnimal) {
        animais.add(dadosAnimal);
    }

    public void removerAnimal(int idAnimal) {
        animais.remove(idAnimal);
    }

    public void listarAnimais() {
        System.out.println("\nAnimais do Zoológico:");
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + "\n" + "Espécie: " + animal.getEspecie() + "\n" + "Idade: " + animal.getIdade());
        }
    }
}
