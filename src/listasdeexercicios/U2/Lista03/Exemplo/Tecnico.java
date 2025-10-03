package Exemplo;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    //Construtor
    public Tecnico(String nome, double salario, int numeroMatricula, double bonusSalarial) {
        super(nome, salario, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }

    @Override
    public double ganhoAnual(){
        return (salario + bonusSalarial) * 13;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.printf("Bônus Salarial: R$ %.2f\n", bonusSalarial);
        System.out.printf("Ganho anual do funcionário (com bônus): R$ %.2f\n", ganhoAnual());
    }
}
