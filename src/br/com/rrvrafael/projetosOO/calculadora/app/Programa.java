package br.com.rrvrafael.projetosOO.calculadora.app;

import br.com.rrvrafael.projetosOO.calculadora.fabricas.FabricaCalculosMatematicos;
import br.com.rrvrafael.projetosOO.calculadora.interfaces.CalculadorMatematico;

public class Programa {
    public static void main(String[] args) {
        String operador;
        int numero1, numero2;

        numero1 = 2;
        numero2 = 5;
        operador = "^";

        FabricaCalculosMatematicos fabrica = new FabricaCalculosMatematicos();
        CalculadorMatematico calculo = fabrica.criarCalculo(numero1, numero2, operador);

        if (calculo != null) {
            System.out.println("Resultado da operação: " + calculo.calcular());
        } else {
            System.out.println("Não foi possível efetuar o cálculo!");
        }
    }
}
