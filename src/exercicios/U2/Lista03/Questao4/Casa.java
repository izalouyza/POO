package Questao4;

import java.util.Scanner;

public class Casa extends Imovel{
    private int areaQuintal;
    private boolean temPiscina;

    public Casa(String endereco, int area, int numeroQuartos, double preco, int areaQuintal, boolean temPiscina) {
        super(endereco, area, numeroQuartos, preco);
        this.areaQuintal = areaQuintal;
        this.temPiscina = temPiscina;
    }

    @Override
    public double calcularTaxaAdministracao(){
        return preco * 0.10;
    }

    public void exibirCaracteristicas(){
        super.exibirCaracteristicas();
        System.out.println("Área do quintal: " + areaQuintal + " m²");

        if (temPiscina) {
            System.out.println("Tem piscina: Sim");
        } else {
            System.out.println("Tem piscina: Não");
        }
    }
}
