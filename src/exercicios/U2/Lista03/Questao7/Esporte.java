package Questao7;

public class Esporte {
    protected String nome;
    protected int numeroJogadores;
    protected String duracaoPartida;
    protected String popularidade;

    //Construtor
    public Esporte(String nome, int numeroJogadores, String duracaoPartida, String popularidade) {
        this.nome = nome;
        this.numeroJogadores = numeroJogadores;
        this.duracaoPartida = duracaoPartida;
        this.popularidade = popularidade;
    }

    public double calcularCustoEquipamento(){
        return 500.00;
    }

    public void exibirRegras(){
        System.out.println("Nome: " + nome);
        System.out.println("Número de jogadores: " + numeroJogadores);
        System.out.println("Duração da partida: " + duracaoPartida);
        System.out.println("Popularidade: " + popularidade);
    }
}
