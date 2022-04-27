package br.com.rrvrafael.projetosOO.calculadora.classes;

import br.com.rrvrafael.projetosOO.calculadora.interfaces.CalculadorMatematico;

public abstract class CalculoMatematico implements CalculadorMatematico {
    protected final int numero1;
    protected final int numero2;

    public CalculoMatematico(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public boolean validar() {
        return numero1 >= 0 && numero2 >= 0;
    }

    @Override
    public final int calcular() {
        if (validar()) {
            return doCalcular();
        }

        return -1;
    }

    protected abstract int doCalcular();
}
