package br.com.rrvrafael.projetosOO.servicoBancario.classes;

public class Correntista {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private ContaCorrente conta;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" +
                "Sobrenome: " + sobrenome + "\n" +
                "Idade: " + idade + "\n" +
                "CPF: " + cpf + "\n" +
                "\nDados da conta bancária:\n" + conta;
    }
}
