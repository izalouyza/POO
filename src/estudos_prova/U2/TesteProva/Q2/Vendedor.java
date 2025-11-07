package TesteProva.Q2;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public void calcularSalarioFinal(){
        salarioBase += (salarioBase * 0.1);
        System.out.printf("Salário Final (com comissão): R$ %.2f\n", salarioBase);
    }

    public void exibirDados(){
        super.exibirDados();
        System.out.println("Cargo: Vendedor");
    }
}
