package Questao10;

public class Main {
    public static void main(String[] args){
        System.out.println("\n------ Transporte Comum ------\n");
        Transporte transp = new Transporte(5, 180, 12, 85000);
        transp.exibirDados();

        System.out.println("\n------ Ônibus ------\n");
        Onibus onibus = new Onibus(50, 100, 3, 450000, 2);
        onibus.exibirDados();

        System.out.println("\n------ Metrô ------\n");
        Metro metro = new Metro(200, 80, 6, 8000000, "Sim");
        metro.exibirDados();
    }
}

