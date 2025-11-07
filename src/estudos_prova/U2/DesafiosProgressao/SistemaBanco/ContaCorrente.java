package DesafiosProgressao.SistemaBanco;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente (int numeroConta, double saldo){
        super(numeroConta, saldo);
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor;
            adicionarAoHistorico("Saque: R$" + valor);
            return true;
        }else{
            adicionarAoHistorico("Não foi possível sacar: saldo insuficiente.");
            return false;
        }
    }
}
