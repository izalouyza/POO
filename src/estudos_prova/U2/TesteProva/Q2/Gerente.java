package TesteProva.Q2;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalarioFinal(){
        salarioBase += (salarioBase * 0.2);
        System.out.printf("Salário Final (com bônus): R$ %.2f\n", salarioBase);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cargo: Gerente");
    }
}
