package br.com.rrvrafael.projetosOO.computador.classes;

import br.com.rrvrafael.projetosOO.computador.interfaces.AcoesPC;

public class Computador implements AcoesPC {
    private String nome;
    private double preco;
    private String dataFabricacao;

    @Override
    public boolean ligarDesligar(String opcao) {
        return opcao.equalsIgnoreCase("ligar");
    }

    @Override
    public boolean acessarInternet(String ativarInternet) {
        return ativarInternet.equalsIgnoreCase("ativar");
    }
}
