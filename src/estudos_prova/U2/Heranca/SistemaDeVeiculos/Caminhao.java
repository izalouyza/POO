package Heranca.SistemaDeVeiculos;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double preco, double capacidadeCarga){
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    public Caminhao(){}

    public void capacidade(){
        System.out.print("\nQual a capacidade de carga? ");
        this.capacidadeCarga = input.nextDouble();
    }

    @Override
    public double calcularIpva(){
        return preco * 0.015;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + "kg");
    }
}
