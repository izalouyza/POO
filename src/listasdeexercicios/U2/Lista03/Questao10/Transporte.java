package Questao10;

public class Transporte {
    protected int capacidadePassageiros;
    protected int velocidadeMaxima;
    protected int consumo;
    protected double preco;

    //Construtor
    public Transporte(int capacidadePassageiros, int velocidadeMaxima, int consumo, double preco) {
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
        this.consumo = consumo;
        this.preco = preco;
    }
    public double calcularCustoViagem(double distancia){
        return (distancia/consumo) * 5.50;
    }

    public void exibirDados(){
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("\nCapacidade de passageiros: " + capacidadePassageiros);
        System.out.println("Velocidade máxima: " + velocidadeMaxima + " km/h");
        System.out.println("Consumo: " + consumo + " km/l");
    }
}
