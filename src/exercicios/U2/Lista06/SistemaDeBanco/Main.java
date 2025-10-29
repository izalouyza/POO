package SistemaDeBanco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaBancaria corrente = new ContaCorrente(1001,0);
        ContaBancaria poupanca = new ContaPoupanca(2001,0);

        List<ContaBancaria> contas = new ArrayList<>();
        contas.add(corrente);
        contas.add(poupanca);

        for(ContaBancaria conta : contas){
            System.out.println("Conta " + conta.numeroConta);
            conta.depositar(1000);
            conta.sacar(300);
            conta.sacar(900);
            conta.exibirHistorico();
        }
    }
}
