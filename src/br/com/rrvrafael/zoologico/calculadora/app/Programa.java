package br.com.rrvrafael.zoologico.calculadora.app;

import br.com.rrvrafael.zoologico.calculadora.classes.Adicao;
import br.com.rrvrafael.zoologico.calculadora.classes.CalculoMatematico;
import br.com.rrvrafael.zoologico.calculadora.classes.Divisao;

public class Programa {
    public static void main(String[] args) {
        CalculoMatematico adicao = new Divisao(50, 2);

        int resultado = adicao.calcular();

        System.out.println("Resultado da soma: " + resultado);
    }
}
