package Heranca.SistemaVeiculos;

import java.util.Scanner;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto() {}

    public Moto(String marca, String modelo, int ano, double preco, int cilindrada){
        super(marca, modelo, ano, preco);
        this.cilindrada = cilindrada;
    }

    @Override
    public void receberDetalhes(){
        Scanner input = new Scanner(System.in);
        super.receberDetalhes();

        System.out.print("Digite a quantidade de cilindradas: ");
        this.cilindrada = input.nextInt();
        input.nextLine();
    }

    @Override
    public double calcularIpva(){
        double ipva = preco * 0.02;
        return ipva;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + cilindrada);
        System.out.println("============================");
    }
}
