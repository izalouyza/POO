package Exemplo;

import java.util.Scanner;

public class Funcionario {
    Scanner input = new Scanner(System.in);

    protected String nome;
    protected double salario;

    //Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        this.salario += valor;
    }

    public double ganhoAnual(){
        return salario * 13;
    }

    public void exibeDados(){
        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Salário do funcionário: R$ %.2f\n", salario);
        System.out.printf("Ganho anual do funcionário: R$ %.2f\n", ganhoAnual());
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

}
