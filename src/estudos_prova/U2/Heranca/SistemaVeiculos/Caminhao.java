package Heranca.SistemaVeiculos;

import java.util.Scanner;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(){}

    public Caminhao (String marca, String modelo, int ano, double preco, double capacidadeCarga){
        super(marca, modelo, ano, preco);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void receberDetalhes(){
        Scanner input = new Scanner(System.in);

        super.receberDetalhes();
        System.out.print("Digite a capacidade de carga: ");
        this.capacidadeCarga = input.nextDouble();
    }

    @Override
    public double calcularIpva(){
        double ipva = preco * 0.015;
        return ipva;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade de Carga: " + capacidadeCarga);
        System.out.println("========================================");
    }
}
