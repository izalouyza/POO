package codigos.U1.aula5;

import java.util.Scanner;

public class SistemaRPGSala {
    public static int menu(){
        Scanner input = new Scanner(System.in);

        int opcao;
        System.out.println("""
                Sistema RPG Sala:
                
                1 - Listar Personagens
                2 - Atribuir XP
                3 - Evoluir Personagens
                4 - Adicionar Personagens            
                5 - Remover Personagens
                0 - Sair
                
                Opção:\t""");

        opcao = input.nextInt();
        return opcao;
    }

    public static void main(String[] args) {
        int opcao = menu();
    }
}
