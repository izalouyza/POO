package Heranca.SistemaDeImoveis;

import java.util.Scanner;

public class Imovel {
    protected String endereco;
    protected String area;
    protected int numeroQuartos;
    protected double preco;

    Scanner input = new Scanner(System.in);

    //construtor
    public Imovel(String endereco, String area, int numeroQuartos, double preco){
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
    }

    public Imovel(){}

    public void adicionarImovel(){
        System.out.print("Informe o endereço: ");
        this.endereco = input.nextLine();
        System.out.print("Informe a área: ");
        this.area = input.nextLine();
        System.out.print("Informe o número de quartos: ");
        this.numeroQuartos = input.nextInt();
        System.out.print("Informe o preço: R$ ");
        this.preco = input.nextDouble();
    }
    public double calcularTaxaAdministracao(){
        return preco * 0.8;
    }

    public void exibirCaracteristicas(){
        System.out.printf("""
                \n-------------- IMÓVEL --------------
                Endereço: %s
                Área: %s
                Número de quartos: %d
                Preço: R$ %.2f\n""", this.endereco, this.area, this.numeroQuartos, this.preco);
    }
}
