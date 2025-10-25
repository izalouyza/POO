package Questao10;

public class Metro extends Transporte{
    private String eletrico;

    //Construtor
    public Metro(int capacidadePassageiros, int velocidadeMaxima, int consumo, double preco, String eletrico){
        super(capacidadePassageiros, velocidadeMaxima, consumo, preco);
        this.eletrico = eletrico;
    }

    @Override
    public double calcularCustoViagem(double distancia){
        return super.calcularCustoViagem(distancia) * 0.7;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Elétrico? " + eletrico);
    }
}
