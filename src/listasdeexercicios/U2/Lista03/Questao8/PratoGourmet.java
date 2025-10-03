package Questao8;

import java.util.List;

public class PratoGourmet extends Prato{
    private String chefResponsavel;

    // Construtor
    public PratoGourmet(String nome, double preco, String tempoPreparo, List<String> ingredientes, String chefResponsavel) {
        super(nome, preco, tempoPreparo, ingredientes);
        this.chefResponsavel = chefResponsavel;
    }

    @Override
    public double calcularTaxaServico() {
        return preco * 0.15;
    }

    @Override
    public void exibirCardapio() {
        super.exibirCardapio();
        System.out.println("Chef responsável: " + chefResponsavel);
    }
}
