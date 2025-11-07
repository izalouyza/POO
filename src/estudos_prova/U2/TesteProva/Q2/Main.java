package TesteProva.Q2;

public class Main {
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Carla", 5000);
        Funcionario vendedor = new Vendedor("Rafa", 3000);

        gerente.exibirDados();
        gerente.calcularSalarioFinal();

        System.out.println();

        vendedor.exibirDados();
        vendedor.calcularSalarioFinal();
    }
}
