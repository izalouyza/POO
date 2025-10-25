package Questao07;

abstract class Veiculo {
    protected String cor;

    //Construtor
    public Veiculo(String cor) {
        this.cor = cor;
    }

    public void exibirInfo() {
        System.out.println("Cor do veículo: " + cor);
    }
}