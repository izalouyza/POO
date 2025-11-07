package Heranca.SistemaVeiculos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Escolha o tipo de veículo: (1 - Moto, 2 - Caminhão, 3 - Outro, 0 - Sair)\s");
            int opcao = input.nextInt();

            if(opcao == 0){
                System.out.println("Encerrando o Sistema de Veículos...");
                break;
            }

            switch(opcao){
                case 1:
                    Veiculo moto = new Moto();
                    moto.receberDetalhes();
                    moto.calcularIpva();
                    moto.exibirDetalhes();
                    break;
                case 2:
                    Veiculo caminhao = new Caminhao();
                    caminhao.receberDetalhes();
                    caminhao.calcularIpva();
                    caminhao.exibirDetalhes();
                    break;
                case 3:
                    Veiculo outro = new Veiculo();
                    outro.receberDetalhes();
                    outro.calcularIpva();
                    outro.exibirDetalhes();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    continue;
            }
        }
    }
}
