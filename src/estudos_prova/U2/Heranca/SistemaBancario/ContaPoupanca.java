package Heranca.SistemaBancario;

public class ContaPoupanca extends ContaBancaria{
    private double taxaRendimento;

    public ContaPoupanca(){}

    //construtor
    ContaPoupanca(int numeroConta, double saldo, String titular, double taxaRendimento){
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        System.out.print("Digite a taxa de rendimento: ");
        taxaRendimento = input.nextDouble();

        while(true) {
            if (taxaRendimento <= 0) {
                System.out.println("Valor inválido. Tente novamente.");
                continue;
            } else {
                double rendimento = saldo * taxaRendimento;
                saldo += rendimento;
                System.out.printf("Novo saldo com taxa de rendimento: R$ %.2f", saldo);
                break;
            }
        }
    }
}
