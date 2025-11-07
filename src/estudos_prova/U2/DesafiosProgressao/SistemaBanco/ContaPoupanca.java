package DesafiosProgressao.SistemaBanco;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca (int numeroConta, double saldo){
        super(numeroConta, saldo);
    }

    public boolean sacar(double valor){
        if(saldo >= valor + 1.0){
            saldo -= (valor + 1.0);
            adicionarAoHistorico("Saque: R$" + valor + " (Taxa: R$ 1.00)");
            return true;
        }else{
            adicionarAoHistorico("Não foi possível sacar: saldo insuficiente.");
            return false;
        }
    }
}
