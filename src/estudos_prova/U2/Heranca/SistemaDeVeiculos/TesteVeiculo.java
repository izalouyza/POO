package Heranca.SistemaDeVeiculos;

import java.util.Scanner;
public class TesteVeiculo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Veiculo transp = null;
        Moto transpmoto = null;
        Caminhao transpcaminhao = null;

        System.out.print("Qual seu veículo? ");
        String veiculo = input.nextLine();

        veiculo.toUpperCase();

        if(veiculo.equals("Moto")){

            transp = new Moto(); //criando uma moto
            transpmoto.tipoDeVeiculo();
            transpmoto.isMoto();
            transpmoto.calcularIpva();
            transpmoto.exibirDetalhes();

        }else if(veiculo.equals("Caminhão")){

            transp = new Caminhao(); //criando um caminhao
            transpcaminhao.tipoDeVeiculo();
            transpcaminhao.capacidade();
            transpcaminhao.calcularIpva();
            transpcaminhao.exibirDetalhes();

        }else{

            transp = new Veiculo(); //criando um veiculo qualquer
            transp.tipoDeVeiculo();
            transp.calcularIpva();
            transp.exibirDetalhes();

        }
    }
}
