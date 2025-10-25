package br.com.exemplo.eleicao.entidades;

public class Eleitor {
    private String nome;

    //construtor
    public Eleitor(String nome){
        this.nome = nome;
    }

    //getter
    public String getNome(){
        return nome;
    }
}
