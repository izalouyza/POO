/*
    Aluna: Izadora Louyza Silva Figueiredo
    Matrícula: 2024010176
    Curso: Bacharelado em Tecnologia da Informação - BTI
    Disciplina: Programação Orientada a Objetos - POO (PEX0130)
    Professor: Bruno Borges da Silva
    
*/

package listasdeexercicios.U1.lista1;

import java.util.Scanner;

public class Lista1java {

    //Nível 1: Entrada, Processamento e Saída

    public static void questao1() {

    Scanner input = new Scanner(System.in);

    int quantidade_minima, quantidademaxima;
    double estoqueMedio;

    System.out.print("Digite a quantidade mínima da peça: ");
    quantidade_minima = input.nextInt();

    System.out.print("Digite a quantidade máxima da peça: ");
    quantidademaxima = input.nextInt();

    estoqueMedio = (quantidade_minima + quantidademaxima) / 2;

    System.out.printf("O estoque médio da peça é: %.1f", estoqueMedio);

}

    public static void questao2(){

        Scanner input = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = input.nextDouble();

        System.out.print("Digite o valor em dólares: ");
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

        Scanner input = new Scanner(System.in);

        int A, B, C, D;
        int soma1, soma2, soma3, soma4, soma5, soma6;
        int mult1, mult2, mult3, mult4, mult5, mult6;

        System.out.print("Digite quatro números inteiros:\n");
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();      
        D = input.nextInt();

        //somas

        soma1 = A + B;
        soma2 = A + C;
        soma3 = A + D;
        soma4 = B + C;
        soma5 = B + D;
        soma6 = C + D;

        //multiplicações

        mult1 = A * B;
        mult2 = A * C;
        mult3 = A * D;
        mult4 = B * C;
        mult5 = B * D;
        mult6 = C * D;

        System.out.printf("""
                A ADIÇÃO ENTRE OS NÚMEROS INFORMADOS É: 
                ----------------------------------------
                A + B = %d
                A + C = %d
                A + D = %d
                B + C = %d
                B + D = %d
                C + D = %d
                ----------------------------------------

                A MULTIPLICAÇÃO ENTRE OS NÚMEROS INFORMADOS É:
                ----------------------------------------------
                A * B = %d
                A * C = %d 
                A * D = %d
                B * C = %d
                B * D = %d
                C * D = %d
                ----------------------------------------------
                """, soma1, soma2, soma3, soma4, soma5, soma6, mult1, mult2, mult3, mult4, mult5, mult6);
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
        } else {
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

        Scanner input = new Scanner(System.in);

        int A, B, temp;

        System.out.print("Digite o valor de A e B\n");
        A = input.nextInt();
        B = input.nextInt();

        System.out.printf("Valores antes da troca:\n A = %d\n B = %d\n", A, B);

        temp = A;
        A = B;
        B = temp;

        System.out.printf("Valores após a troca:\n A = %d\n B = %d\n", A, B);

    }

    public static void Questao2(){

        Scanner input = new Scanner(System.in);

        int x;

        System.out.print("Digite um número inteiro: ");
        x = input.nextInt();

        if(x>=0){
            System.out.printf("O módulo do número é: %d", x);
        }else{
            x = x * (-1);
            System.out.printf("O módulo do número é: %d", x);
        }
    }

    public static void Questao3(){
    
        Scanner input = new Scanner(System.in);

        int n1, n2, n3, n4, n5, temp;

        System.out.println("Digite cinco números inteiros:");
        n1 = input.nextInt();
        n2 = input.nextInt();  
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();

        if (n1 > n2) { 
            temp = n1; n1 = n2; n2 = temp; 
        }
        
        if (n2 > n3) { 
            temp = n2; n2 = n3; n3 = temp; 
        }
        
        if (n3 > n4) {
             temp = n3; n3 = n4; n4 = temp; 
        }
        
        if (n4 > n5) {
            temp = n4; n4 = n5; n5 = temp; 
        }

        if (n1 > n2) {
            temp = n1; n1 = n2; n2 = temp; 
        }
        
        if (n2 > n3) {
            temp = n2; n2 = n3; n3 = temp;
        }
        
        if (n3 > n4) { 
            temp = n3; n3 = n4; n4 = temp; 
        }
        
        if (n4 > n5) { 
            temp = n4; n4 = n5; n5 = temp; 
        }

        if (n1 > n2) { 
            temp = n1; n1 = n2; n2 = temp; 
        }
        
        if (n2 > n3) { 
            temp = n2; n2 = n3; n3 = temp; 
        }
        
        if (n3 > n4) { 
            temp = n3; n3 = n4; n4 = temp; 
        }
        
        if (n4 > n5) { 
            temp = n4; n4 = n5; n5 = temp; 
        }

        if (n1 > n2) {
            temp = n1; n1 = n2; n2 = temp; 
        }
       
        if (n2 > n3) {
            temp = n2; n2 = n3; n3 = temp; 
        }
        
        if (n3 > n4) { 
            temp = n3; n3 = n4; n4 = temp; 
        }
        
        if (n4 > n5) { 
            temp = n4; n4 = n5; n5 = temp; 
        }

        //ordem crescente
        System.out.printf("Ordem crescente: %d %d %d %d %d\n", n1, n2, n3, n4, n5);

        //ordem decrescente
        System.out.printf("Ordem decrescente: %d %d %d %d %d", n5, n4, n3, n2, n1);

    }

    public static void Questao4(){

        Scanner input = new Scanner(System.in);

        int n1, n2, diferenca;

        System.out.println("Digite dois números inteiros:");
        n1 = input.nextInt();
        n2 = input.nextInt();

        if(n1>n2){
            diferenca = n1 - n2;
            System.out.printf("A diferença do maior para o menor é: %d", diferenca);
        }
        else if(n2>n1){
            diferenca = n2 - n1;
            System.out.printf("A diferença do maior para o menor é: %d", diferenca);
        }else{
            System.out.println("Os números são iguais.");
        }
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
        
        Scanner input = new Scanner(System.in);

        int n1, n2, maior, menor;

        System.out.println("Digite dois números inteiros:");
        n1 = input.nextInt();
        n2 = input.nextInt();   

        if(n1>n2){
            maior = n1;
            menor = n2;
            System.out.printf("O maior número é: %d\nO menor número é: %d", maior, menor);
        }else if(n2>n1){
            maior = n2;
            menor = n1;
            System.out.printf("O maior número é: %d\nO menor número é: %d", maior, menor);
        }else{
            System.out.println("Os números são iguais.");
        }
    }

    public static void Questao7(){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Digite um número inteiro: ");
        n = input.nextInt();

        if(n>=0 && n<=9){
            System.out.println("Valor válido.");
        }else if (n<0 || n>9){
            System.out.println("Valor inválido.");
        }else{
            System.out.println("Erro.");
        }
    }

    public static void Questao8(){
        
        Scanner input = new Scanner(System.in);

        int codigo;

        System.out.print("Digite um número inteiro (1, 2 ou 3): ");
        codigo = input.nextInt();

       switch (codigo){
            case 1:
                System.out.println("Um");
                break;
            case 2: 
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Código inválido.");
                break;
       }
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
        
        Scanner input = new Scanner(System.in);

        int a, b, c;

        System.out.print("Digite um valor maior que zero para A: ");
        a = input.nextInt();

        if(a<=0){
            System.out.println("Valor inválido. Digite novamente um valor maior que zero para A.");
            a = input.nextInt();
        }

        System.out.print("Digite um valor maior que zero para B: ");
        b = input.nextInt();

        if(b<=0){
            System.out.println("Valor inválido. Digite novamente um valor maior que zero para B.");
            b = input.nextInt();
        }

        System.out.print("Digite um valor maior que zero para C: ");
        c = input.nextInt();

        if(c<=0){
            System.out.println("Valor inválido. Digite novamente um valor maior que zero para C.");
            c = input.nextInt();
        }

        int maior = a;
        int menor = a;

        if(b>maior){
            maior = b;
        }

        if(c>maior){
            maior = c;
        }

        if(b<menor){
            menor = b;
        }

        if(c<menor){
            menor = c;
        }

        int mult = menor * maior;
        double div = (double) maior / menor;

        System.out.printf("O menor valor lido multiplicado pelo maior é: %d\n", mult);
        System.out.printf("O maior valor lido dividido pelo menor é: %.1f", div);
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

        int n, A = 0, B = 0;

        System.out.print("Digite um número: ");
        n = input.nextInt();

        if(n>=0){
            A = n;
        }else{
            B = n;
        }
        System.out.printf("Valor armazenado em A: %d, Valor armazenado em B: %d%n", A, B);
    }

    public static void main(String[] args) {
        // Questões Nível 1: Entrada, Processamento e Saída

        //questao1();
        //questao2();
        //questao3();
        //questao4();
        //questao5();
        //questao6();
        //questao7();
        //questao8();
        //questao9();
        //questao10();

        //Questões Nível 2: Estruturas Condicionais

        //Questao1();
        //Questao2();
        //Questao3();
        //Questao4();
        //Questao5();
        //Questao6();
        //Questao7();
        //Questao8();
        //Questao9();
        //Questao10();
        //Questao11();
        //Questao12();

    }
}
