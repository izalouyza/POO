package Heranca.SistemaBancario;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ContaBancaria conta = null;
        int opcao;

        while(true) {
            System.out.println("""
                    \n========== BANCO ==========
                    1 - Escolher tipo de conta
                    2 - Depositar
                    3 - Sacar
                    4 - Consultar saldo
                    5 - Sair
                    
                    ===========================
                    Informe a opção: \s""");
            opcao = input.nextInt();
            input.nextLine();

            if(opcao == 5){
                System.out.println("Encerrando o sistema...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Selecione o tipo de conta (1 para Conta Corrente / 2 para Conta Poupança): ");
                    int tipo = input.nextInt();

                    if (tipo == 1) {
                        conta = new ContaCorrente();
                    } else if (tipo == 2) {
                        conta = new ContaPoupanca();
                    }else{
                        System.out.println("Tipo inválido. Tente novamente.");
                        continue;
                    }
                    conta.cliente();
                    break;
                case 2:
                    if(conta!=null){
                        conta.depositar();
                    }else{
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;
                case 3:
                    if(conta!=null){
                        conta.sacar();
                    }else{
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;
                case 4:
                    if(conta!=null){
                        conta.consultarSaldo();
                    }else{
                        System.out.println("Crie uma conta primeiro.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
        }
    }
}
