package br.com.rrvrafael.projetosOO.servicoBancario.app;

import br.com.rrvrafael.projetosOO.servicoBancario.classes.*;

public class Programa {
    public static void main(String[] args) {
        Correntista titular = new Correntista();
        ContaCorrente conta = new ContaCorrenteGold();
        float saque = 50, deposito = 200;

        conta.setAgencia("0102");
        conta.setNumeroConta("12111992");

        titular.setNome("Rafael");
        titular.setSobrenome("Rodrigues");
        titular.setCpf("409.051.458-44");
        titular.setIdade(29);
        titular.setConta(conta);
        titular.getConta().depositar(deposito);

        System.out.println("Informações do titular da conta:\n");
        System.out.println(titular);

        System.out.println("Informações do titular da conta após saque:\n");
        titular.getConta().sacar(saque);
        System.out.println(titular);
    }
}
