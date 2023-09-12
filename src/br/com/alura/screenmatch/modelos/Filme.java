package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculadora.Classificavel;

//Todo filme é um titulo
public class Filme extends Titulo implements Classificavel {

    private String diretor;
    public String getDiretor() {
        return diretor;
    }

    public Filme (String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " ( " + getAnoDeLacamento() + " )";
    }
}
