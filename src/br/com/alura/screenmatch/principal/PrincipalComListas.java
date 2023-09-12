package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Barr", 2004);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Array2", 2002);
        outroFilme.avalia(8);
        Filme filmeDaEllen = new Filme("Array3", 2016);
        filmeDaEllen.avalia(10);
        Serie lost = new Serie("Gosip Girl", 2015);
        lost.avalia(8);
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDaEllen);
        lista.add(lost);

        for (Titulo item : lista) {
            if (item instanceof Filme) {
                System.out.println(((Filme) item).getClassificacao());
            }
        }

        List<String> listaDeNome = new ArrayList<>();
        listaDeNome.add("Ellen");
        listaDeNome.add("Giovana");
        listaDeNome.add("Bete");
        listaDeNome.add("Jessica");
        listaDeNome.add("Paloma");
        System.out.println(lista);
        System.out.println(listaDeNome);
        Collections.sort(lista);

        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLacamento));

        System.out.println("Lista ordenada por ano de lancamento: " + lista);

        lista.sort(Comparator.comparing(Titulo::getDuracaoEmMinutos));

        System.out.println("Lista ordenado por maior duração: " + lista);

    }


}
