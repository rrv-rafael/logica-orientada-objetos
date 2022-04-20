package br.com.rrvrafael.zoologico.app;

import br.com.rrvrafael.zoologico.classes.Cachorro;

public class Programa {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();

        cachorro.setNome("Tobias");
        cachorro.setIdade(2);
        cachorro.setEspecie("Cachorro");

        System.out.println("Olá, seu animal é um " + cachorro.getEspecie() + ", o nome dele é " + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos de idade.");

        if (cachorro.animalAdulto()) {
            System.out.println("\nO animal é adulto.");
        } else {
            System.out.println("\nO animal não é adulto.");
        }
    }
}
