package SistemaDeBanco;

public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA =  1.0;

    public ContaPoupanca(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + TAXA;
        if(saldo>=valor){
            saldo -= total;
            adicionarAoHistorico("Saque: R$ " + valor + " (Taxa: R$1.00)");
            return true;
        }else{
            System.out.println("Saldo insuficiente para saque de R$" + valor + " + taxa R$1.00");
            return false;
        }
    }
}
