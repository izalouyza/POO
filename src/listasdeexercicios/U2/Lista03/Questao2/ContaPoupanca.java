package Questao2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    //Construtor
    public ContaPoupanca(String numeroConta, double saldo, String titular, double taxaRendimento){
        super(numeroConta, saldo, titular);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento(){
        saldo += (saldo * taxaRendimento)/100;
    }

    @Override
    public void consultarSaldo(){
        super.consultarSaldo();
        System.out.println("Taxa de rendimento: " + taxaRendimento + "%");
    }
}
