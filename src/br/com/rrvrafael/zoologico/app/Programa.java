package br.com.rrvrafael.zoologico.app;

import br.com.rrvrafael.zoologico.classes.*;

public class Programa {
    public static void main(String[] args) {
        Zoologico z = new Zoologico();
        Animal animal = new Cachorro();
        //Gato gato = new Gato();

        animal.setNome("Tobias");
        animal.setIdade(1);
        z.adicionarAnimal(animal);
        animal = new Cachorro();
        animal.setNome("Caramelo");
        animal.setIdade(2);
        z.adicionarAnimal(animal);
        animal = new Cachorro();
        animal.setNome("Amora");
        animal.setIdade(4);
        z.adicionarAnimal(animal);
        animal = new Cachorro();
        animal.setNome("Rex");
        animal.setIdade(7);
        z.adicionarAnimal(animal);
        z.setNome("Renovação");

        System.out.println("Zoológico " + z.getNome());
        z.listarAnimais();

        Veterinario vet = new Veterinario();
        vet.setNome("Gabriel");

        animal = new Cachorro();
        animal.setNome("Arisco");
        animal.setIdade(2);
        vet.atenderAnimal(animal);
        animal = new Cachorro();
        animal.setNome("Rebelde");
        animal.setIdade(1);
        vet.atenderAnimal(animal);
        animal = new Cachorro();
        animal.setNome("Zac");
        animal.setIdade(4);
        vet.atenderAnimal(animal);
        animal = new Cachorro();
        animal.setNome("Luna");
        animal.setIdade(12);
        vet.atenderAnimal(animal);
        vet.atenderAnimal(animal);

        vet.listarAnimaisAtendidos();

        //gato.setNome("Bixano");
        //gato.setIdade(1);
        //gato.setEspecie("Gato");

        //System.out.println("Olá, seu animal é um " + animal.getEspecie() + ", o nome dele é " + animal.getNome() + " e ele tem " + animal.getIdade() + " anos de idade.");

        //System.out.println("Olá, seu animal é um " + gato.getEspecie() + ", o nome dele é " + gato.getNome() + " e ele tem " + gato.getIdade() + " anos de idade.");

        /*if (animal.animalAdulto()) {
            System.out.println("\nO animal é adulto.");
        } else {
            System.out.println("\nO animal não é adulto.");
        }*/

        /*if (gato.animalAdulto()) {
            System.out.println("\nO gato é adulto.");
        } else {
            System.out.println("\nO gato não é adulto.");
        }*/

        //System.out.println("******************");
        //System.out.println("Som do animal: " + animal.emitirSom());
        //System.out.println("******************");
        //System.out.println("Som do gato: " + gato.emitirSom());
        //animal.morrer();
        //gato.morrer();
        //System.out.println("---------------------------------");
        //System.out.println("******************");
        //System.out.println("Som do animal: " + animal.emitirSom());
        //System.out.println("******************");
        //System.out.println("Som do gato: " + gato.emitirSom());
    }
}
