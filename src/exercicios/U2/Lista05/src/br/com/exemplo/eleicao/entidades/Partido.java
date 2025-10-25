package br.com.exemplo.eleicao.entidades;

public class Partido {
    private String nome;
    private String sigla;

    //construtor
    public Partido(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }

    //getters
    public String getNome(){
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
