package Questao4;

public class Imovel {
    protected String endereco;
    protected int area;
    protected int numeroQuartos;
    protected double preco;

    //Construtor
    public Imovel(String endereco, int area, int numeroQuartos, double preco) {
        this.endereco = endereco;
        this.area = area;
        this.numeroQuartos = numeroQuartos;
        this.preco = preco;
    }

    public double calcularTaxaAdministracao(){
        return preco * 0.08;
    }

    public void exibirCaracteristicas(){
        System.out.printf("\nPreço: R$ %.2f\n", preco);
        System.out.printf("Taxa de Administração: R$ %.2f\n", calcularTaxaAdministracao());
        System.out.println("\nEndereço: " + endereco);
        System.out.println("Area: " + area + "m²");
        System.out.println("Quartos: " + numeroQuartos);
    }


}
