package Questao10;

public class Onibus extends Transporte{
    private int numeroEixos;

    //Construtor
    public Onibus(int capacidadePassageiros, int velocidadeMaxima, int consumo, double preco, int numeroEixos){
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.numeroEixos = numeroEixos;
    }

    @Override
    public double calcularCustoViagem(double distancia){
        return super.calcularCustoViagem(distancia) * 0.8;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Número de eixos: " + numeroEixos);
    }
}
