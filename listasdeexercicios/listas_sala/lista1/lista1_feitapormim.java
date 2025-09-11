package listasdeexercicios.listas_sala.lista1;

import java.util.Scanner;

public class lista1_feitapormim {
    public static void questao1() {
        /*Faça  um  algoritmo que  leia  a  idade  de  uma pessoa  expressa  em  anos,  meses  e dias  e 
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

        Scanner input = new Scanner(System.in);

        int anos, meses, dias, diasTotais;

        System.out.print("Digite sua idade em anos: ");
        anos = input.nextInt();

        System.out.print("Digite sua idade em meses: ");
        meses = input.nextInt();

        System.out.print("Digite sua idade em dias: ");
        dias = input.nextInt();

        diasTotais = (anos * 365) + (meses * 30) + dias;

        System.out.printf("Você tem %d dias de vida.", diasTotais);
    }

    public static void questao2() {
        /*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
        números 4, 5 e 6. A soma das duas médias. A média das médias.*/

        Scanner input = new Scanner (System.in);

        double media1 = (8+9+7)/3.0;
        double media2 = (4+5+6)/3.0;
        double somaMedias = media1 + media2;
        double mediadasMedias = somaMedias / 2;

        System.out.printf("""
                DADOS 
                ----------------
                Média de 8, 9 e 7: %.1f
                Média de 4, 5 e 6: %.1f
                Soma das médias: %.1f 
                Média das médias: %.1f""", media1, media2, somaMedias, mediadasMedias);
    }

    public static void questao3() {
        //Informar um saldo e imprimir o saldo com reajuste de 1%.

        Scanner input = new Scanner(System.in);

        double saldo, reajuste;

        System.out.print("Insira um saldo: ");
        saldo = input.nextDouble();

        reajuste = saldo + (saldo * 0.01);

        System.out.printf("""
                INFORMAÇÕES
                ----------------
                Saldo informado: %.1f
                Saldo com reajuste de 1%% : %.1f
                ------------------
                """, saldo, reajuste);
        
    }

     public static void questao4() {
        /*Escrever um algoritmo que lê: 
        - a porcentagem do IPI a ser acrescido no valor das peças  
        - o código da peça 1, valor unitário da peça 1, quantidade de peças 1  
        - o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
        O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
        Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1) */

        Scanner input = new Scanner(System.in);

        int porcentagem, codPeca1, valorUnit1, qtdPeca1;
        int codPeca2, valorUnit2, qtdPeca2;

        System.out.print("Digite a porcentagem do IPI: ");
        porcentagem = input.nextInt();

        System.out.print("Digite o código da peça 1: ");
        codPeca1 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 1: ");
        valorUnit1 = input.nextInt();

        System.out.print("Digite a quantidade de peças 2: ");
        qtdPeca1 = input.nextInt();

        System.out.print("Digite o código da peça 2: ");
        codPeca2 = input.nextInt();

        System.out.print("Digite o valor unitário da peça 2: ");
        valorUnit2 = input.nextInt();

        System.out.print("");

     }

    public static void main(String[] args) {
        questao3();
    }
}