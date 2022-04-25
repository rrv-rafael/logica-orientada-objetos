package br.com.rrvrafael.zoologico.app;

import br.com.rrvrafael.zoologico.classes.Cachorro;
import br.com.rrvrafael.zoologico.classes.Gato;
import br.com.rrvrafael.zoologico.classes.Pessoa;
import br.com.rrvrafael.zoologico.classes.Programador;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        Programador programador = new Programador(scann.nextLine(), scann.nextInt());

        programador.showInfo();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        cachorro.setNome("Tobias");
        cachorro.setIdade(1);
        cachorro.setEspecie("Cachorro");

        gato.setNome("Bixano");
        gato.setIdade(1);
        gato.setEspecie("Gato");

        System.out.println("Olá, seu animal é um " + cachorro.getEspecie() + ", o nome dele é " + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos de idade.");

        System.out.println("Olá, seu animal é um " + gato.getEspecie() + ", o nome dele é " + gato.getNome() + " e ele tem " + gato.getIdade() + " anos de idade.");

        if (cachorro.animalAdulto()) {
            System.out.println("\nO cachorro é adulto.");
        } else {
            System.out.println("\nO cachorro não é adulto.");
        }

        if (gato.animalAdulto()) {
            System.out.println("\nO gato é adulto.");
        } else {
            System.out.println("\nO gato não é adulto.");
        }

        System.out.println("******************");
        System.out.println("Som do cachorro: " + cachorro.emitirSom());
        System.out.println("******************");
        System.out.println("Som do gato: " + gato.emitirSom());
        cachorro.morrer();
        gato.morrer();
        System.out.println("---------------------------------");
        System.out.println("******************");
        System.out.println("Som do cachorro: " + cachorro.emitirSom());
        System.out.println("******************");
        System.out.println("Som do gato: " + gato.emitirSom());
    }
}
