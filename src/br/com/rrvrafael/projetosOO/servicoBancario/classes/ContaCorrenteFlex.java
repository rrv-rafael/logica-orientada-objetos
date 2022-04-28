package br.com.rrvrafael.projetosOO.servicoBancario.classes;

public class ContaCorrenteFlex extends ContaCorrente {
    @Override
    public void depositar(double deposito) {
        saldo += (deposito * 2);
    }
}
