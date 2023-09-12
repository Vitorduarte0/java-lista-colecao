package br.com.alura.screenmatch.modelos;

import org.jetbrains.annotations.NotNull;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoDeLacamento;
    private boolean incluindoNoPlano;
    private double somaAvaliacao;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLacamento) {
        this.nome = nome;
        this.anoDeLacamento = anoDeLacamento;
    }

    //método pode ser lido assim: "Maneira de..."
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLacamento() {
        return anoDeLacamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setAnoDeLacamento(int anoDeLacamento) {
        this.anoDeLacamento = anoDeLacamento;
    }

    public void setIncluindoNoPlano(boolean incluindoNoPlano) {
        this.incluindoNoPlano = incluindoNoPlano;
    }



    public int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    public void avalia(double nota) {
        somaAvaliacao += nota;
        totalDeAvaliacao++;
    }

    public void exibeFichaTecnica() {
        System.out.println("Exibindo ficha técnica do filme... ");

        System.out.println("Nome: " + nome +
                "\nAno de lançamento: " + anoDeLacamento +
                "\nEstá incluindo no catálago: " + incluindoNoPlano +
                "\nDuração: " + duracaoEmMinutos +
                "\nAvaliação: " + this.totalDeAvaliacao
        );
    }

    public double pegaMedia() {
        return somaAvaliacao / totalDeAvaliacao;
    }

    @Override
    public int compareTo(@NotNull Titulo o) {
        return this.nome.compareTo(o.getNome());
    }
}
