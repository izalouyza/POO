package DesafiosProgressao.SistemaBanco;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ContaBancaria corrente = new ContaCorrente(323902, 0);
        ContaBancaria poupanca = new ContaPoupanca(2032030, 0);

        List<ContaBancaria> contas = new ArrayList<>();

        contas.add(corrente);
        contas.add(poupanca);

        corrente.depositar(1000);
        corrente.sacar(300);
        corrente.sacar(900);

        System.out.println("======= Conta Corrente =======");
        for(String h : corrente.historico){
            System.out.println(h);
        }

        poupanca.depositar(1000);
        poupanca.sacar(300);
        poupanca.sacar(900);

        System.out.println("======= Conta Poupança =======");
        for (String h : poupanca.historico){
            System.out.println(h);
        }

    }
}
