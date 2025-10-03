package Questao3;

public class Main {
    public static void main(String[] args){
        System.out.println("\n-------------- CURSO COMUM -------------\n");
        Curso curso = new Curso("POO", 60, 4700, "Avançado");
        curso.calcularDesconto();
        curso.exibirInformacoes();

        System.out.println("\n-------------- CURSO PRESENCIAL -------------\n");
        CursoPresencial cursop = new CursoPresencial("Algoritmos", 60, 1750, "Básico", "UFERSA");
        cursop.calcularDesconto();
        cursop.exibirInformacoes();

        System.out.println("\n-------------- CURSO ONLINE -------------\n");
        CursoOnline cursoon = new CursoOnline("Estruturas de Dados 1", 60, 2500, "Intermediário", "Estuda+");
        cursoon.calcularDesconto();
        cursoon.exibirInformacoes();
    }
}
