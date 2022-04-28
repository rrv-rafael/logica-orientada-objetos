package br.com.rrvrafael.projetosOO.computador.app;

import br.com.rrvrafael.projetosOO.computador.classes.Computador;
import br.com.rrvrafael.projetosOO.computador.classes.ComputadorGamer;
import br.com.rrvrafael.projetosOO.computador.classes.ComputadorParrudo;
import br.com.rrvrafael.projetosOO.computador.classes.ComputadorSimples;

public class Programa {
    public static void main(String[] args) {
        ComputadorSimples pcSimples = new ComputadorSimples();
        ComputadorParrudo pcParrudo = new ComputadorParrudo();
        ComputadorGamer pcGamer = new ComputadorGamer();

        String opcaoLigaDesliga = "Ligar", ativarInternet = "Ativar";

        pcSimples.acessarInternet(ativarInternet);
        pcParrudo.acessarInternet(ativarInternet);
        pcGamer.acessarInternet(ativarInternet);

        if (pcSimples.ligarDesligar(opcaoLigaDesliga)) {
            pcSimples.jogarPaciencia();
        } else {
            System.out.println("Pc simples desligado!");
        }


        if (pcParrudo.ligarDesligar(opcaoLigaDesliga)) {
            pcParrudo.jogarCS();
        } else {
            System.out.println("Pc parrudo desligado!");
        }

        opcaoLigaDesliga = "desliga";

        if (pcGamer.ligarDesligar(opcaoLigaDesliga)) {
            pcGamer.jogarNeedForSpeed();
        } else {
            System.out.println("Pc gamer desligado!");
        }

    }
}
