package br.com.rrvrafael.projetosOO.servicoBancario.classes;

public class ContaCorrenteSimples extends ContaCorrente {
    @Override
    public void depositar(double deposito) {
        saldo += deposito;
    }
}
