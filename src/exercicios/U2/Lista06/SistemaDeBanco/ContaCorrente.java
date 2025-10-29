package SistemaDeBanco;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(int numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            adicionarAoHistorico("Saque: R$" + valor);
            return true;
        }else{
            System.out.println("Saldo insuficiente para saque de R$" + valor);
            return false;
        }
    }
}
