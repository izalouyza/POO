package Heranca.SistemaBancario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        ContaBancaria contaAtiva = null;

        while(true) {
            System.out.print("""
                    \nSISTEMA BANCÁRIO
                    ======================
                    1 - Criar Conta
                    2 - Depositar
                    3 - Sacar 
                    4 - Consultar Saldo
                    5 - Aplicar Rendimento (Poupança)
                    6 - Sair
                    Informe a opção: \s""");

            int opcao = input.nextInt();
            input.nextLine();

            switch(opcao){
                case 1:
                    System.out.print("Informe o tipo de conta (corrente/poupança): ");
                    String tipoConta = input.nextLine();

                    System.out.print("Número da conta: ");
                    int numeroConta = input.nextInt();
                    input.nextLine();

                    System.out.print("Titular: ");
                    String titular = input.nextLine();

                    System.out.print("Saldo inicial: ");
                    double saldo = input.nextDouble();
                    input.nextLine();

                    if(tipoConta.equalsIgnoreCase("corrente")){
                        System.out.print("Limite do cheque especial: ");
                        double limite = input.nextDouble();
                        input.nextLine();
                        contaAtiva = new ContaCorrente(numeroConta, saldo, titular, limite);
                    } else if(tipoConta.equalsIgnoreCase("poupança")){
                        System.out.print("Taxa de rendimento (%): ");
                        double taxa = input.nextDouble();
                        input.nextLine();
                        contaAtiva = new ContaPoupanca(numeroConta, saldo, titular, taxa);
                    } else {
                        System.out.println("Tipo de conta inválido.");
                    }
                    break;

                case 2:
                    if(contaAtiva != null){
                        System.out.print("Informe o valor para depósito: ");
                        double valor = input.nextDouble();
                        input.nextLine();
                        contaAtiva.depositar(valor);
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 3:
                    if(contaAtiva != null){
                        System.out.print("Informe o valor para saque: ");
                        double valor = input.nextDouble();
                        input.nextLine();
                        contaAtiva.sacar(valor);
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 4:
                    if(contaAtiva != null){
                        contaAtiva.consultarSaldo();
                    } else {
                        System.out.println("Nenhuma conta selecionada.");
                    }
                    break;

                case 5:
                    if(contaAtiva != null && contaAtiva instanceof ContaPoupanca){
                        ((ContaPoupanca) contaAtiva).aplicarRendimento();
                    } else {
                        System.out.println("Aplicável apenas para contas poupança.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o sistema...");
                    input.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
