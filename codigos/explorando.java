import java.util.Scanner;

public class explorando {
    public static void print(String str){
        System.out.print(str);
    }

    public static void println(String str){
        System.out.println(str);
    }

    public static void dadosExibeTeclado(){
        println("Hello World!");

        Scanner input = new Scanner(System.in);

        print("Digite seu nome: ");
        String nome = input.nextLine();
        print("Digite sua idade: ");
        int idade = Integer.parseInt(input.nextLine());

        System.out.println("Seu nome " + nome + " e sua idade " + idade);
        System.out.printf("Seu nome %s e sua idade %d.\n", nome, idade);
        System.out.printf("""
                DADOS DIGITADOS:
                ----------------
                Seu nome %s.
                Sua idade %d.
                """, nome, idade);
    }

    public void runSwitch1(){
        Scanner input = new Scanner(System.in);
    }
    public static void main(String[] args){

        println("\nEstruturas condicionais".toUpperCase());

        Scanner input = new Scanner(System.in);

        print("Digite um número: ");
        int n1 = input.nextInt();

        print("Digite outro número: ");
        int n2 = input.nextInt();

        if (n1 == n2){
            println("São iguais.");
        }else if (n1 > n2){
            println("N1 é maior que N2.");
        }else {
            println("N2 é maior que N1.");
        }

    }



}