package br.com.rrvrafael.zoologico.exercicios.ex01.app;

import br.com.rrvrafael.zoologico.exercicios.ex01.classes.Dentista;
import br.com.rrvrafael.zoologico.exercicios.ex01.classes.Paciente;
import br.com.rrvrafael.zoologico.exercicios.ex01.classes.Pessoa;

import java.util.Scanner;

public class TesteConsultorio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dentista dentista = new Dentista();
        Paciente paciente = new Paciente();

        int option, status, consulta;

        do {
            System.out.println("********Programa para agendamento de consultas odontológicas********");
            System.out.println("De acordo com as opçoes abaixo:\n1 - Dentista\n2 - Paciente\n0 - Sair da aplicação\nInforme a opção que se enquadra:");
            option = scan.nextInt();

            if (option == 1) {
                System.out.println("Informe o seu nome:");
                dentista.setNome(scan.next());
                System.out.println("Informe o seu sobrenome:");
                dentista.setSobrenome(scan.next());
                System.out.println("Informe sua especialidade:");
                dentista.setEspecilidade(scan.next());
                System.out.println("Informe o status do seu registro. Caso ativo, digite 1 e digite 0 caso esteja inativo:");
                status = scan.nextInt();

                dentista.setStatusRegistroConselhoRegional(status == 1);

                if (dentista.isStatusRegistroConselhoRegional()) {
                    dentista.setRegistroConselhoRegiginal("Ativo");
                } else {
                    dentista.setRegistroConselhoRegiginal("Inativo");
                }

                System.out.println("\nConfira abaixo se os dados estão corretos:");
                System.out.println("Nome: " + dentista.getNome());
                System.out.println("Sobrenome: " + dentista.getSobrenome());
                System.out.println("Especialidade: " + dentista.getEspecilidade());
                System.out.println("Situação do registro do conselho regional: " + dentista.getRegistroConselhoRegiginal());

                System.out.println("\n1 - Marcar consulta\n2 - Remarcar consulta\n3 - Cancelar consulta\n4 - Atender Paciente\n5 - Indicar indísponibilidade\nInforme a opção desejada:");
                consulta = scan.nextInt();

                if (consulta == 4) {
                    dentista.antenderPaciente();
                } else if (consulta == 5) {
                    dentista.indicarIndisponibilidade();
                } else {
                    retornarMetodosAgendamentos(consulta);
                }
            } else if (option == 2) {
                System.out.println("Informe o seu código:");
                paciente.setCodigo(scan.nextInt());
                System.out.println("Informe o seu nome:");
                paciente.setNome(scan.next());
                System.out.println("Informe o seu sobrenome:");
                paciente.setSobrenome(scan.next());
                System.out.println("Informe sua idade:");
                paciente.setIdade(scan.nextInt());
                System.out.println("Informe seu sexo:");
                paciente.setSexo(scan.next());
                System.out.println("Informe o seu telefone:");
                paciente.setTelefone(scan.next());
                System.out.println("Informe o seu endereço:");
                paciente.setEndereco(scan.next());

                System.out.println("\nConfira abaixo se os dados estão corretos:");
                System.out.println("Código: " + paciente.getCodigo());
                System.out.println("Nome: " + paciente.getNome());
                System.out.println("Sobrenome: " + paciente.getSobrenome());
                System.out.println("Idade: " + paciente.getIdade());
                System.out.println("Sexo: " + paciente.getSexo());
                System.out.println("Telefone: " + paciente.getTelefone());
                System.out.println("Endereço: " + paciente.getEndereco());

                System.out.println("\n1 - Marcar consulta\n2 - Remarcar consulta\n3 - Cancelar consulta\n4 - Verificar consulta\nInforme a opção desejada:");
                consulta = scan.nextInt();

                if (consulta == 4) {
                    paciente.consultarConsulta();
                } else {
                    retornarMetodosAgendamentos(consulta);
                }
            }
        } while (option != 0);
    }

    public static void retornarMetodosAgendamentos(int consulta) {
        if (consulta == 1) {
            Pessoa.marcarConsulta();
        } else if (consulta == 2) {
            Pessoa.remarcarConsulta();
        } else if (consulta == 3) {
            Pessoa.cancelarConsulta();
        }
    }
}
