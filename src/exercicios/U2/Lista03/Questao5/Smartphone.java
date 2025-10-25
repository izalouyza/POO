package Questao5;

public class Smartphone extends ProdutoEletronico{
    private double tamanhoTela;
    private double capacidadeBateria;

    //Construtor
    public Smartphone(String marca, String modelo, double preco, String voltagem, double tamanhoTela, double capacidadeBateria){
        super(marca, modelo, preco, voltagem);
        this.tamanhoTela = tamanhoTela;
        this.capacidadeBateria = capacidadeBateria;
    }

    @Override
    public double calcularGarantiaEstendida(){
        return preco * 0.2;
    }

    @Override
    public void exibirEspecificacoes(){
        super.exibirEspecificacoes();
        System.out.println("Tamanho da tela: " + tamanhoTela + " polegadas");
        System.out.println("Capacidade da bateria: " + capacidadeBateria + " mAh");
    }
}
