package N4_EstruturasdeRepeticao;

import java.util.Scanner;

public class Questao8 {
    public static void mediaAlunos(){
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos deseja cadastrar? ");
        int totalAlunos = input.nextInt();

        double somaNotas = 0;
        double nota;

        for (int i = 1; i <= totalAlunos; i++) {
            System.out.printf("Nota do aluno %d: ", i);
            nota = input.nextDouble();
            somaNotas += nota;
        }

        double mediaNotas = somaNotas / totalAlunos;
        System.out.printf("A média da nota dos alunos da turma é: %.2f%n", mediaNotas);
    }
}
