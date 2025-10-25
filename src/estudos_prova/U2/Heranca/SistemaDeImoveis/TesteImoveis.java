package Heranca.SistemaDeImoveis;

import java.util.Scanner;

public class TesteImoveis {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Imovel imovel = null;

        while(true) {
            System.out.print("Informe o tipo de imóvel: (1 - Apartamento, 2 - Casa, 0 - Sair): ");
            int tipo = input.nextInt();

            if (tipo == 0) {
                System.out.print("Encerrando o sistema...");
                break;
            }

            if(tipo != 1 && tipo != 2 && tipo != 0){
                System.out.println("Tipo inválido. Tente novamente.");
                continue;
            }

            if(tipo == 1){
                imovel = new Apartamento();
                imovel.adicionarImovel();

                System.out.print("Informe o andar do condomínio: ");
                ((Apartamento) imovel).setAndar(input.nextInt());

                System.out.print("Informe o valor do condomínio: R$ ");
                ((Apartamento) imovel).setValorCondominio(input.nextDouble());
                input.nextLine();
            }else if(tipo == 2){
                imovel = new Casa();
                imovel.adicionarImovel();

                input.nextLine();
                System.out.print("Informe a área do quintal: ");
                ((Casa) imovel).setAreaQuintal(input.nextLine());

                System.out.print("Tem piscina? (true/false): ");
                ((Casa) imovel).setTemPiscina(input.nextBoolean());
                input.nextLine();
            }else{
                System.out.println("Opção inválida. Tente novamente.");
                continue;
            }
            imovel.exibirCaracteristicas();
            System.out.printf("Taxa de administração: R$ %.2f\n", imovel.calcularTaxaAdministracao());
            System.out.println("----------------------------------------\n");
        }
    }
}
