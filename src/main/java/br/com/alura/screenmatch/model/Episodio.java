package br.com.alura.screenmatch.model;

import java.time.LocalDate;

public class Espisodio {
    private Integer temporada;
    private String titulo;
    private Integer numeroEpisodio;
    private Double aavaliacao;
    private LocalDate dataDeLancamento;

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Double getAavaliacao() {
        return aavaliacao;
    }

    public void setAavaliacao(Double aavaliacao) {
        this.aavaliacao = aavaliacao;
    }

    public LocalDate getDataDeLancamento() {
        return dataDeLancamento;
    }

    public void setDataDeLancamento(LocalDate dataDeLancamento) {
        this.dataDeLancamento = dataDeLancamento;
    }
}
