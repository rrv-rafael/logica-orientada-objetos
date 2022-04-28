package br.com.rrvrafael.projetosOO.servicoBancario.classes;

public class ContaCorrenteGold extends ContaCorrente {
    @Override
    public void depositar(double deposito) {
        saldo += (deposito * 3);
    }
}
