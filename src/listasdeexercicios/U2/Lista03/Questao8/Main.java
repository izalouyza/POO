package Questao8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------ PRATO COMUM ------\n");
        Prato prato = new Prato("Lasanha à Bolonhesa", 35.90, "50 minutos", Arrays.asList("Massa para lasanha", "Carne moída", "Molho de tomate"));
        prato.exibirCardapio();

        System.out.println("\n------ PRATO VEGANO ------\n");
        PratoVegano pratoVegano = new PratoVegano("Curry de Grão-de-Bico", 29.90, "40 minutos", Arrays.asList("Grão-de-bico", "Leite de coco", "Cebola"), "V-Label");
        pratoVegano.exibirCardapio();

        System.out.println("\n------ PRATO GOURMET ------\n");
        PratoGourmet pratoGourmet = new PratoGourmet("Risoto de Cogumelos Trufados", 72.90, "60 minutos", Arrays.asList("Arroz arbóreo", "Cogumelos frescos", "Manteiga"), "Giovanni Rossi");
        pratoGourmet.exibirCardapio();
    }
}

