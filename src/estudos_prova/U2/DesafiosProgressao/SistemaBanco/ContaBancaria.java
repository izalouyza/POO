package DesafiosProgressao.SistemaBanco;

import java.util.ArrayList;

public abstract class ContaBancaria implements Registravel {
    protected int numeroConta;
    protected double saldo;
    ArrayList<String> historico;

    //construtor
    public ContaBancaria(int numeroConta, double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }

    @Override
    public void adicionarAoHistorico(String transacao){
        historico.add(transacao);
    }

    public void depositar(double valor){
        this.saldo += valor;
        adicionarAoHistorico("Depósito: R$" + valor);
    }

    public abstract boolean sacar(double valor);
}
