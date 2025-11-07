package TesteProva.Q2;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.printf("Salário: R$ %.2f ", salarioBase);
    }

    public abstract void calcularSalarioFinal();
}
