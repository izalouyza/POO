package Heranca.SistemaVeiculos;

import java.util.Scanner;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(){}

    //construtor
    public Veiculo(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public void receberDetalhes(){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a marca: ");
        this.marca = input.nextLine();

        System.out.print("Digite o modelo: ");
        this.modelo = input.nextLine();

        System.out.print("Digite o ano: ");
        this.ano = input.nextInt();
        input.nextLine();

        System.out.print("Digite o preço: R$ ");
        this.preco = input.nextDouble();
        input.nextLine();
    }

    public double calcularIpva(){
        double ipva = preco * 0.04;
        return ipva;
    }

    public void exibirDetalhes(){
        System.out.println("\nInformações do Veículo: ");
        System.out.println("---------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.printf("IPVA: R$ %.2f\n", calcularIpva());
    }
}

