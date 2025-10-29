package SistemaDeBanco;

import java.util.ArrayList;
import java.util.List;

public abstract class ContaBancaria implements Registravel {
    protected int numeroConta;
    protected double saldo;
    protected List<String> historico;

    //construtor
    public ContaBancaria(int numeroConta, double saldoInicial){
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
    }

    @Override
    public void adicionarAoHistorico(String transacao) {
        historico.add(transacao);
    }

    public void depositar(double valor){
        saldo += valor;
        adicionarAoHistorico("Depósito: R$" + valor);
    }

    public abstract boolean sacar(double valor);

    public void exibirHistorico(){
        System.out.println("Histórico da conta " + numeroConta + ":");
        for(String t : historico){
            System.out.println(t);
        }
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("---");
    }
}
