package listasdeexercicios.lista1; 

import java.util.Scanner;

public class Lista1java {

    //Nível 1: Entrada, Processamento e Saída

    public static void questao1() {

    Scanner input = new Scanner(System.in);

    System.out.print("Digite a quantidade mínima: ");
    int quantidade_minima = input.nextInt();

    System.out.print("Digite a quantidade máxima: ");
    int quantidademaxima = input.nextInt();

    double estoqueMedio = (quantidade_minima + quantidademaxima) / 2;

    System.out.printf("O estoque médio da peça é: %.2f%n", estoqueMedio);

}

    public static void questao2(){

        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a cotação do dólar: ");
        double cotacaoDolar = input.nextDouble();

        System.out.printf("Digite o valor em dólares: ");
        double valorDolar = input.nextDouble();

        double valorReal = cotacaoDolar * valorDolar;

        System.out.printf("O valor em real é: R$ %.2f", valorReal);

    }

    public static void questao3(){

        Scanner input = new Scanner(System.in);

        int identificacaoVendedor, codPeca, qtdVendida;
        double precoUnit, totalVenda, comissao;

        System.out.print("Digite a identificação do vendedor: ");
        identificacaoVendedor = input.nextInt();

        System.out.print("Digite o código da peça: ");
        codPeca = input.nextInt();

        System.out.print("Digite o preço unitário da peça: ");
        precoUnit = input.nextDouble();

        System.out.print("Digite a quantidade vendida: ");
        qtdVendida = input.nextInt();

        totalVenda = precoUnit * qtdVendida;

        comissao = totalVenda * 0.05;

        System.out.printf("O total da venda é: R$ %.2f e sua comissão é: R$ %.2f", totalVenda, comissao);
    }

    public static void questao4(){
        // Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
        // valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
        // A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B com D e
        // por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo, devem ser
        // realizadas doze operações de processamento, sendo seis para as adições e seis para as multiplicações.


    }

    public static void questao5(){

        Scanner input = new Scanner(System.in);

        int tempoGasto;
        double velocidadeMedia, distancia, litros_usados;

        System.out.print("Digite o tempo gasto na viagem: ");
        tempoGasto = input.nextInt();

        System.out.print("Digite a velocidade média: ");
        velocidadeMedia = input.nextDouble();

        distancia = tempoGasto * velocidadeMedia;

        litros_usados = distancia / 12;

        System.out.printf("""
                
        DADOS DA VIAGEM
        ----------------------
        Velocidade média: %.1f km/h
        Tempo gasto: %d horas
        Distância percorrida: %.1f km
        Quantidade de litros utilizados: %.1f litros
        ----------------------
                """, velocidadeMedia, tempoGasto, distancia, litros_usados);

    }

    public static void questao6(){

        Scanner input = new Scanner(System.in);

        double F, C;

        System.out.print("Digite a temperatura em graus Celsius: ");
        C = input.nextDouble();

        F = (9 * C + 160) / 5;

        System.out.printf("A temperatura em graus Fahrenheit é: %.1f", F);
    }

    public static void questao7(){
       
        Scanner input = new Scanner(System.in);

        double F, C;

        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        F = input.nextDouble();
    
        C = (F-32)*5/9;

        System.out.printf("A temperatura em graus Celsius é: %.1f", C);
    }

    public static void questao8(){

        Scanner input = new Scanner(System.in);

        double V, R, A;

        System.out.print("Digite o valor do raio da lata de óleo: ");
        R = input.nextDouble();

        System.out.print("Digite a altura da lata de óleo: ");
        A = input.nextDouble();

        V = 3.14159 * R * R * A;

        System.out.printf("O volume da lata de óleo é: %.1f", V);
    
    }

    public static void questao9(){
    
        Scanner input = new Scanner(System.in);

        int idadeAnos, idadeMeses, idadeDias, totalDias;

        System.out.print("Digite a sua idade em:\n");

        System.out.print("Anos: ");
        idadeAnos = input.nextInt();
        
        System.out.print("Meses: ");
        idadeMeses = input.nextInt();

        System.out.print("Dias: ");
        idadeDias = input.nextInt();

        totalDias = (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;

        System.out.printf("Sua idade em dias é: %d dias", totalDias);

    }

    public static void questao10(){
       
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.print("Digite um número inteiro: ");
        n1 = input.nextInt();

        System.out.print("Digite outro número inteiro: ");
        n2 = input.nextInt();

        if (n1 == n2) {
            System.out.println("Os números são iguais.");
        }
        if (n1 != n2) {
            System.out.println("Os números não são iguais.");
        }
        if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo.");
        }
        if (n1 < n2) {
            System.out.println("O primeiro número é menor que o segundo.");
        }
        if (n1 >= n2) {
            System.out.println("O primeiro número é maior ou igual ao segundo.");
        }
        if (n1 <= n2) {
            System.out.println("O primeiro número é menor ou igual ao segundo.");
        }

    }

    //Nível 2: Estruturas Condicionais

    public static void Questao1(){
        // Ler dois valores inteiros para as variáveis A e B, efetuar a troca dos valores de modo que a variável 
        //A passe a possuir o valor da variável B, e a variável B passe a possuir o valor da variável A. Apresentar 
        //os valores antes e depois da troca.

    }

    public static void Questao2(){

        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Digite um número inteiro: ");
        x = input.nextInt();

        if(x>=0){
            System.out.printf("O módulo do número é: %d", x);
        }else if(x<0){
            x = x * (-1);
            System.out.printf("O módulo do número é: %d", x);
        }
    }

    public static void Questao3(){
        // Escreva um programa que leia 5 números inteiros e imprima na tela os valores em ordem crescente e decrescente.
    }

    public static void Questao4(){
        // Escreva um programa que leia dois números e apresente a diferença do maior para o menor.
    }

    public static void Questao5(){

        Scanner input = new Scanner(System.in);

        double n1, n2, n3, n4, notaRec, novaMedia = 0;
        double mediaEscolar = 0;

        System.out.print("Digite as quatro notas do aluno:\n");
        n1 = input.nextDouble();
        n2 = input.nextDouble();
        n3 = input.nextDouble();
        n4 = input.nextDouble();

        mediaEscolar = (n1 + n2 + n3 + n4) / 4;

        if(mediaEscolar >= 7){
            System.out.printf("Aluno aprovado com média: %.1f", mediaEscolar);
        }else if (mediaEscolar < 7) {
            System.out.printf("Média do aluno: %.1f. Digite a nota da recuperação: ", mediaEscolar);

            notaRec = input.nextDouble();
            novaMedia = (mediaEscolar + notaRec) / 2;
             
            if(novaMedia>=7){
                System.out.printf("Aluno aprovado na recuperação com média: %.1f", novaMedia);
            }else{
                System.out.printf("Aluno reprovado com média: %.1f", novaMedia);
             }
        }
    }

    public static void Questao6(){
        // Escreva um programa que leia dois números e exiba mensagem informando 
        //o valor do maior número e o valor do menor número. Se os dois números forem iguais, o programa deve exibir mensagem informando este fato.
    }

    public static void Questao7(){
        // Escreva um programa que leia um número inteiro. Verificar por meio de condição se o valor fornecido está na faixa entre 0 (zero) e 9 (nove). 
        //Caso o valor fornecido esteja dentro da faixa, apresentar a mensagem “valor válido”. Caso contrário, apresentar a mensagem “valor inválido”, 
        //em qualquer outro caso, informe "erro".


    }

    public static void Questao8(){
        // Escreva um programa que leia um número inteiro (variável CÓDIGO). Verificar se o código é igual a 1, igual a 2 ou igual a 3. 
        //Caso não seja, apresentar a mensagem “Código inválido”. Ao ser verificado o código e constatado que é um valor válido, o programa deve verificar 
        //cada código em separado para determinar seu valor por extenso, ou seja, apresentar a mensagem “um”, ”dois” ou “três”. (Utilizar o comando Switch).
    }

    public static void Questao9(){

        Scanner input = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite o valor do lado A: ");
        A = input.nextInt();
        System.out.print("Digite o valor do lado B: ");
        B = input.nextInt();
        System.out.print("Digite o valor do lado C: ");
        C = input.nextInt();

        if (A < B + C && B < A + C && C < A + B) {
            if (A==B && B==C){
                System.out.println("O triângulo é equilátero.");
            }else if(A==B || A==C || B==C){
                System.out.println("O triângulo é isósceles.");
            }else{
                System.out.println("O triângulo é escaleno.");
            }
        }else{
            System.out.println("Os lados fornecidos não caracterizam um triângulo.");
        }
    }

    public static void Questao10(){
        // Escrever um programa declarando três variáveis do tipo inteiro (a, b e c). 
        //Ler um valor maior que zero para cada variável (se o valor digitado não é válido, mostrar mensagem e ler novamente).
        // Exibe o menor valor lido multiplicado pelo maior e o maior valor dividido pelo menor.



    }

    public static void Questao11(){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Digite um número inteiro: ");
        n = input.nextInt();

        if(n>=0){
            System.out.println("O número é positivo.");
        }else{
            System.out.println("O número é negativo.");
        }
    }

    public static void Questao12(){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Digite um número: ");
        n = input.nextInt();

        if(n>=0){
            int A = n;
            System.out.printf("O número %d foi armazenado em A.", A);
        }else{
            int B = n;
            System.out.printf("O número %d foi armazenado em B.", B);
        }
    }

    public static void main(String[] args) {
        Questao12();
    }
}
