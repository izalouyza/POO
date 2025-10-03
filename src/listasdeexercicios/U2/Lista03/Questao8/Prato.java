package Questao8;

import java.util.List;

public class Prato {
    protected String nome;
    protected double preco;
    protected String tempoPreparo; // em minutos
    protected List<String> ingredientes;

    // Construtor
    public Prato(String nome, double preco, String tempoPreparo, List<String> ingredientes) {
        this.nome = nome;
        this.preco = preco;
        this.tempoPreparo = tempoPreparo;
        this.ingredientes = ingredientes;
    }

    public double calcularTaxaServico() {
        return preco * 0.10;
    }

    public void exibirCardapio() {
        System.out.printf("Preço: R$ %.2f\n",preco);
        System.out.printf("Taxa de serviço: R$ %.2f\n", calcularTaxaServico());
        System.out.println("\nPrato: " + nome);
        System.out.println("Tempo de preparo: " + tempoPreparo);
        System.out.println("Ingredientes: " + String.join(", ", ingredientes));
    }
}
