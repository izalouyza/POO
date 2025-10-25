package Heranca.SistemaDeVeiculos;

import java.util.Scanner;

public class Veiculo {
    Scanner input = new Scanner(System.in);

    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public Veiculo(String marca, String modelo, int ano, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public Veiculo(){}

    public void tipoDeVeiculo(){
        System.out.print("Informe a marca: ");
        this.marca = input.nextLine();

        System.out.print("Informe o modelo: ");
        this.modelo = input.nextLine();

        System.out.print("Informe o ano: ");
        this.ano = input.nextInt();

        System.out.print("Informe o preço: ");
        this.preco = input.nextDouble();
    }

    public double calcularIpva(){
        return preco * 0.04;
    }

    public void exibirDetalhes(){
        System.out.println("======== DETALHES DO VEÍCULO ========");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.printf("Preço: R$ \n", this.preco);
        System.out.printf("Valor do IPVA: R$ %.2f", calcularIpva());

    }
}
