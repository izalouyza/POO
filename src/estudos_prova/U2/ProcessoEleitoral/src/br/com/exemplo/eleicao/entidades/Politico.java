package ProcessoEleitoral.src.br.com.exemplo.eleicao.entidades;

import ProcessoEleitoral.src.br.com.exemplo.eleicao.interfaces.Candidato;

public abstract class Politico implements Candidato {
    protected String nome;
    protected Partido partido;
    protected int numeroCandidato;
    protected int totalVotos = 0;

    //construtor
    public Politico(String nome, Partido partido, int numeroCandidato){
        this.nome = nome;
        this.partido = partido;
        this.numeroCandidato = numeroCandidato;
    }

    @Override
    public int getNumeroCandidato(){
        return numeroCandidato;
    }

    @Override
    public void receberVoto(){
        totalVotos++;
    }

    public int getTotalVotos(){
        return totalVotos;
    }

    @Override
    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Partido: " + this.partido.getNome() + " (" + this.partido.getSigla() + ")");
        System.out.println("Número: " + this.numeroCandidato);
        System.out.println("Cargo: " + getCargo());
    }

    public abstract String getCargo();
}
