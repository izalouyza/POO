package Heranca.SistemaDeCursos;

import java.util.Scanner;

public class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected double preco;
    protected String nivel;

    Scanner input = new Scanner(System.in);

    public Curso(String nome, int cargaHoraria, double preco, String nivel){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.preco = preco;
        this.nivel = nivel;
    }

    public Curso(){}

    public void adicionarCurso(){
        System.out.print("Digite o nome do curso: ");
        this.nome = input.nextLine();
        System.out.print("Digite a carga horária: ");
        this.cargaHoraria = input.nextInt();
        System.out.print("Digite o preço: R$ ");
        this.preco = input.nextDouble();
        input.nextLine();
        System.out.print("Digite o nível (Básico, Intermediário, Avançado): ");
        this.nivel = input.nextLine();
    }

    public double calcularDesconto(){
        double desconto = preco * 0.1;
        System.out.printf("Desconto: R$ %.2f\n", desconto);
        return desconto;
    }


    public void exibirInformacoes(){
        System.out.printf("""
                \n======== INFORMAÇÕES DO CURSO ========
                Nome: %s
                Carga Horária: %d
                Preço: R$ %.2f
                Nível: %s\n""", this.nome, this.cargaHoraria, this.preco, this.nivel);
    }
}
