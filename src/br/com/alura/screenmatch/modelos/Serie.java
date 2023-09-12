package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;
    private boolean eAtiva;

    public Serie (String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodioPorTemporada() {
        return episodioPorTemporada;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public boolean iseAtiva() {
        return eAtiva;
    }

    public void seteAtiva(boolean eAtiva) {
        this.eAtiva = eAtiva;
    }

    @Override //Sobescrevendo o metodo da classe mae
    public int getDuracaoEmMinutos() {
        return temporadas * episodioPorTemporada * minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + getNome() + " ( " + getAnoDeLacamento() + " )";
    }
}
