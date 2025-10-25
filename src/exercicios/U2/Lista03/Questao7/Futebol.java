package Questao7;

public class Futebol extends Esporte {
    private String tamanhoCampo;

    public Futebol(String nome, int numeroJogadores, String duracaoPartida, String popularidade, String tamanhoCampo) {
        super(nome, numeroJogadores, duracaoPartida, popularidade);
        this.tamanhoCampo = tamanhoCampo;
    }

    @Override
    public double calcularCustoEquipamento(){
        return 300.00;
    }

    @Override
    public void exibirRegras(){
        super.exibirRegras();
        System.out.println("Tamanho do campo: " + tamanhoCampo + " metros");
    }
}
