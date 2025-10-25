package Heranca.SistemaBancario;

import java.util.Scanner;

public class ContaBancaria {
    protected int numeroConta;
    protected double saldo = 0;
    protected String titular;

    Scanner input = new Scanner(System.in);

    public ContaBancaria(){}

    //construtor
    ContaBancaria(int numeroConta, double saldo, String titular){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    //função para inserir cliente
    public void cliente(){
        System.out.println("\n======= ADICIONANDO INFORMAÇÕES DO TITULAR =======");

        System.out.print("Informe o número da conta do titular: ");
        this.numeroConta = input.nextInt();
        input.nextLine();
        System.out.print("Informe o nome do titular: ");
        this.titular = input.nextLine();

        while(true) {
            if (numeroConta <= 0) {
                System.out.println("Número inválido. Tente novamente.");
                continue;
            } else {
                System.out.println("Titular adicionado com sucesso!");
                break;
            }
        }
    }

    //função para depositar dinheiro
    public void depositar() {
            System.out.println("\n======= DEPÓSITO =======");
            System.out.println("Informe o valor que deseja depositar: ");
            double valor = input.nextDouble();

            while (true) {
                if (valor < 0) {
                    System.out.println("Valor inválido.");
                    continue;
                } else {
                    saldo += valor;
                    System.out.println("Valor depositado com sucesso!");
                    break;
                }
            }
        }

    //função para sacar dinheiro
    public void sacar(){
        System.out.println("======= SAQUE =======");
        System.out.print("Quanto deseja sacar? ");
        double valor = input.nextDouble();

        while(true) {
            if (valor < 0 || valor > saldo) {
                System.out.println("Valor inválido.");
                continue;
            } else {
                saldo -= valor;
                System.out.println("Saque feito com sucesso!");
                break;
            }
        }
    }

    //função para consultar saldo
    public void consultarSaldo(){
        System.out.printf("""
        \n------- CONSULTA DE SALDO -------
        \nTitular: %s
        \nSaldo Disponível: R$ %.2f\n""", titular, saldo);
    }
}
