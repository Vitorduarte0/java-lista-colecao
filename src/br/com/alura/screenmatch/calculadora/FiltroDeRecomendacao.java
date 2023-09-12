package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Titulo;

public class FiltroDeRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está entre os médios");
        } else {
            System.out.println("Está entre os regulares");
        }
    }
}
