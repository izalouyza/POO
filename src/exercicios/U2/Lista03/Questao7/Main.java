package Questao7;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------------- ESPORTE --------------\n");
        Esporte esporte = new Esporte("Vôlei", 6, "60 minutos", "Alta");
        esporte.exibirRegras();

        System.out.println("\n-------------- FUTEBOL --------------\n");
        Futebol fut = new Futebol("Futebol", 11, "90 minutos", "Muito alta", "105 x 68");
        fut.exibirRegras();

        System.out.println("\n-------------- BASQUETE --------------\n");
        Basquete basq = new Basquete("Basquete", 5, "48 minutos", "Alta",  3.05);
        basq.exibirRegras();
    }
}


