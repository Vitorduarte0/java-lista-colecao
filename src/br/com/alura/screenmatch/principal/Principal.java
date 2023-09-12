package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculadora.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculadora.FiltroDeRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        Filme meuPrimeiroFilme = new Filme("oppenheimer", 2023);
        meuPrimeiroFilme.setIncluindoNoPlano(true);
        meuPrimeiroFilme.setDuracaoEmMinutos(180);

        meuPrimeiroFilme.avalia(8);
        meuPrimeiroFilme.avalia(5);
        meuPrimeiroFilme.avalia(7);
        meuPrimeiroFilme.exibeFichaTecnica();
        System.out.println("total de avaliacao: " + meuPrimeiroFilme.getTotalDeAvaliacao());
//        System.out.println("a soma de avaliaçoes: " + meuPrimeiroFilme.getS);
        System.out.println(meuPrimeiroFilme.pegaMedia());

        Serie lost = new Serie("lost", 2015);
        lost.setTemporadas(3);
        lost.seteAtiva(true);
        lost.setEpisodioPorTemporada(10);
        lost.setAnoDeLacamento(2016);
        lost.setMinutosPorEpisodio(20);
        lost.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost você irá precisar de: " + lost.getDuracaoEmMinutos() + "min") ;

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(lost);
        calculadoraDeTempo.inclui(meuPrimeiroFilme);

        FiltroDeRecomendacao filtroDeRecomendacao = new FiltroDeRecomendacao();
        System.out.println("------------------------------------------") ;
        filtroDeRecomendacao.filtra(meuPrimeiroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);

        filtroDeRecomendacao.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Digville", 2018);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLacamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuPrimeiroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());

        listaDeFilmes.size();

        System.out.println("Imprimir o toString do Object" + listaDeFilmes.toString());


    }
}
