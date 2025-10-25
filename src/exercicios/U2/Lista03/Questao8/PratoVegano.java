package Questao8;

import java.util.List;

public class PratoVegano extends Prato {
    private String certificacaoVegan;

    // Construtor
    public PratoVegano(String nome, double preco, String tempoPreparo, List<String> ingredientes, String certificacaoVegan) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.certificacaoVegan = certificacaoVegan;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.05;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Certificação vegana: " + certificacaoVegan);
    }
}
