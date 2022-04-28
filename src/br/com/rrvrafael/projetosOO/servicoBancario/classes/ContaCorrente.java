package br.com.rrvrafael.projetosOO.servicoBancario.classes;

import br.com.rrvrafael.projetosOO.servicoBancario.interfaces.OperacoesBancarias;

public abstract class ContaCorrente implements OperacoesBancarias {
    private String agencia;
    private String numeroConta;
    protected double saldo;

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    @Override
    public void sacar(double saque) {
        if (saldo >= saque) {
            saldo -= saque;
        }
    }

    public abstract void depositar(double deposito);

    @Override
    public String toString() {
        return "Agência: " + agencia + "\n" +
                "Número da Conta: " + numeroConta + "\n" +
                "Saldo: " + saldo + "\n";
    }
}
