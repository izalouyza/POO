package Questao6;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n--------------- FILMES ---------------\n");
        Filme filme = new Filme("Sombras do Amanhã", 2022, "02:18:00", 39.90, "Christopher Nolan", "Ficção Científica / Suspense");
        filme.exibirInfo();

        System.out.println("\n--------------- SÉRIES ---------------\n");
        Serie serie = new Serie("Horizonte Perdido", 2021, "00:50:00", 129.90, 3, 10);
        serie.exibirInfo();
    }
}

