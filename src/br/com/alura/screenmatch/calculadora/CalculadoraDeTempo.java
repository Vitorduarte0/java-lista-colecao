package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

//    public void inclui(Filme filme) {
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie serie) {
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

    //usando prática de polimorfismo

    public void inclui(Titulo t) {
        t.exibeFichaTecnica();
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
