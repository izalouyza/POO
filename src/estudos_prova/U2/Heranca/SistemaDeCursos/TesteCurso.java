package Heranca.SistemaDeCursos;

import java.util.Scanner;

public class TesteCurso {
    public static void main(String[] args) {
        Curso curso = null;

        Scanner input = new Scanner(System.in);

        while(true) {
        System.out.print("Digite a modalidade do curso (1 - Presencial, 2 - Online, 0 - Sair): ");
        int modalidade = input.nextInt();
        input.nextLine();

            if(modalidade == 0){
                System.out.println("Encerrando o sistema...");
                break;
            }

            if(modalidade != 1 && modalidade != 2 && modalidade != 0){
                System.out.println("Modalidade inválida. Tente novamente.");
                continue;
            }

            if (modalidade == 1) {
                curso = new CursoPresencial();
                curso.adicionarCurso();
                System.out.println("Informe o local do curso: ");
                String local = input.nextLine();
                ((CursoPresencial) curso).setLocal(local);
                curso.calcularDesconto();
                break;
            } else if (modalidade == 2) {
                curso = new CursoOnline();
                curso.adicionarCurso();
                System.out.print("Informe a plataforma do curso: ");
                String plataforma = input.nextLine();
                ((CursoOnline) curso).setPlataforma(plataforma);
                curso.calcularDesconto();
                break;
            } else {
                System.out.println("Modalidade inválida. Tente novamente.");
                continue;
            }
        }
        double desconto = curso.calcularDesconto();
        System.out.println("-----------------------------------");
        System.out.printf("Preço com desconto: R$ %.2f\n", curso.preco - desconto);

        if(curso!=null) {
            curso.exibirInformacoes();
        }
    }
}