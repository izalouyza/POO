package codigos.U1.aula3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploUso {
    public static void exemploArray(){

        String[] cores = new String[5];

        cores[0] = "Amarelo";
        cores[1] = "Azul";
        cores[2] = "Roxo";
        cores[3] = "Vermelho";
        cores[4] = "Laranja"; 

        //For convencional
        for (int i = 0; i< cores.length; i++){
            System.out.println(cores[i]);
        }

        //Foreach  
        for (String cor : cores){
            System.out.println(cor);
        }

        String[] nomes = new String[]{
            "Bruno",
            "Manoel",
            "Joana",
        };
    }

    public static void exemploLista(){
        List<String> cores = new ArrayList<>();

        cores.add("Amarelo");
        cores.add("Preto");
        cores.add("Azul");
        cores.add("Violeta");
        cores.add("Cinza");

        cores.remove("Amarelo");
        cores.removeFirst();
        cores.removeLast();

        System.out.println("Exibindo cores: ");
        for (String cor : cores){
            System.out.println(cor);
        }
    }

    public static void exemplowhile(){
        int contador = 11;

        System.out.println("(While) Exibindo");

        while(contador<=10){
            System.out.println(contador);
            contador++;
        }

        System.out.println("(Do While) Exibindo");

        int outroContador = 11;

        do{ 
            System.out.println(contador);
            outroContador++;
        } while (outroContador <= 10);
    }

    public static void exemploCalculadora(){

        int opcao;
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("""
                    
                    CALCULADORA
                    ------------------
                    1 - Soma
                    2 - Substração
                    3 - Multiplicação
                    4 - Divisão
                    0 - Sair
                    -----------------
                    
                    Opção:\t""");

                opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        System.out.println("Soma: ");

                        break;
                    case 2:
                        System.out.println("Subtração: ");
                        break;
                    case 3:
                        System.out.println("Multiplicação: ");
                        break;
                    case 4:
                        System.out.println("Divisão: ");
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }

        }while (true);

    }

   public static void main(String[] args) {
       exemploCalculadora();
    }
}
