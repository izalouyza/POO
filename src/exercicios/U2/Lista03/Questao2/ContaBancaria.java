package Questao2;

public class ContaBancaria {
    protected String numeroConta;
    protected double saldo;
    protected String titular;

    //Construtor
    public ContaBancaria(String numeroConta, double saldo, String titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public boolean sacar(double valor){
        if (valor > 0 && saldo>= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public void consultarSaldo(){
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numeroConta);
        System.out.printf("\nSaldo atual: R$ %.2f\n", saldo);
    }
}
