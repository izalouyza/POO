package Questao02;

public class Desenvolvedor extends Funcionario {
    private double salarioBase;

    //Construtor
    public Desenvolvedor(String nome, int codigoCargo, double salarioBase) {
        super(nome, codigoCargo);
        this.salarioBase = salarioBase;
    }
    @Override
    public double calcularBonificacao() {
        double bonus;

        switch (this.codigoCargo) {
            case 1: // Desenvolvedor Júnior
                bonus = this.salarioBase * 0.10;
                break;
            case 2: // Desenvolvedor Pleno
                bonus = this.salarioBase * 0.15;
                break;
            case 3: // Desenvolvedor Sênior
                bonus = this.salarioBase * 0.20;
                break;
            default: // Outros
                bonus = this.salarioBase * 0.05; // 5%
                break;
        }
        return bonus;
    }
}
