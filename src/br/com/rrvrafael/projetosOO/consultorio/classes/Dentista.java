package br.com.rrvrafael.projetosOO.consultorio.classes;

public class Dentista extends Pessoa {
    private String especilidade;
    private String registroConselhoRegiginal;
    private boolean statusRegistroConselhoRegional;

    public String getEspecilidade() {
        return especilidade;
    }

    public void setEspecilidade(String especilidade) {
        this.especilidade = especilidade;
    }

    public String getRegistroConselhoRegiginal() {
        return registroConselhoRegiginal;
    }

    public void setRegistroConselhoRegiginal(String registroConselhoRegiginal) {
        this.registroConselhoRegiginal = registroConselhoRegiginal;
    }

    public boolean isStatusRegistroConselhoRegional() {
        return statusRegistroConselhoRegional;
    }

    public void setStatusRegistroConselhoRegional(boolean statusRegistroConselhoRegional) {
        this.statusRegistroConselhoRegional = statusRegistroConselhoRegional;
    }

    public void antenderPaciente() {
        System.out.println("\nAtendendo paciente no momento!\n");
    }

    public void indicarIndisponibilidade() {
        System.out.println("\nIndisponível, pois, viajou para um congresso!\n");
    }
}
