package Exemplo;

public class Assistente extends Funcionario {
    private int numeroMatricula;

    //Construtor
    public Assistente(String nome, double salario, int numeroMatricula){
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Número de matrícula do funcionário: " + numeroMatricula);
        System.out.println("Cargo: Assistente");
    }

    public int getNumeroMatricula(){
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }
}