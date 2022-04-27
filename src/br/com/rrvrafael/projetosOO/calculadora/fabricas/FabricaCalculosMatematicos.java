package br.com.rrvrafael.projetosOO.calculadora.fabricas;

import br.com.rrvrafael.projetosOO.calculadora.classes.*;
import br.com.rrvrafael.projetosOO.calculadora.interfaces.CalculadorMatematico;

public class FabricaCalculosMatematicos {
    public CalculadorMatematico criarCalculo(int numero1, int numero2, String operador) {
        return switch (operador) {
            case "+" -> new Adicao(numero1, numero2);
            case "-" -> new Subtracao(numero1, numero2);
            case "*" -> new Multiplicacao(numero1, numero2);
            case "/" -> new Divisao(numero1, numero2);
            case "^" -> new Potenciacao(numero1, numero2);
            default -> null;
        };
    }
}
