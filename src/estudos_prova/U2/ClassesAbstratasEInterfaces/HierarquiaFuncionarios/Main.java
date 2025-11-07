package ClassesAbstratasEInterfaces.HierarquiaFuncionarios;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        while(true) {
            System.out.print("""
                    \nHIERARQUIA DE FUNCIONÁRIOS
                    ==========================
                    1 - Cadastrar Funcionários
                    2 - Calcular Bonificação
                    3 - Exibir Hierarquia
                    4 - Sair
                    ==========================
                    Escolha a opção: \s""");
            int opcao = input.nextInt();

            input.nextLine();

            if(opcao == 4){
                System.out.print("Encerrando o sistema...");
                break;
            }

            switch(opcao){
                case 1:
                        System.out.print("Digite o nome do funcionário: ");
                        String nome = input.nextLine();

                        System.out.print("""
                        \nCARGO DO FUNCIONÁRIO
                        ----------------------
                        1 - Dev. Júnior
                        2 - Dev. Pleno
                        3 - Dev. Sênior
                        4 - Outro
                        ---------------------
                        Selecione o cargo: \s""");
                        int codigoCargo = input.nextInt();

                        System.out.print("Digite o salário base: ");
                        double salarioBase = input.nextDouble();
                        input.nextLine();

                        Desenvolvedor dev = new Desenvolvedor(nome, codigoCargo, salarioBase, salarioBase);
                        funcionarios.add(dev);
                        System.out.println("Funcionário cadastrado com sucesso!");
                        break;
                case 2:
                    if(funcionarios.isEmpty()){
                        System.out.println("Nenhum funcionário cadastrado.");
                    }else{
                        for(Funcionario f : funcionarios){
                            System.out.println("Calculando bonificação de: " + f.getNome());
                            f.calcularBonificacao();
                        }
                    }
                    break;
                case 3:
                    if(funcionarios.isEmpty()) {
                        System.out.println("Não há funcionários cadastrados.");
                    }else{
                            System.out.println("\n======= FUNCIONÁRIOS CADASTRADOS =======");
                            for (Funcionario f : funcionarios) {
                                System.out.println("Nome: " + f.getNome() + " | Código do Cargo: " + f.getCodigo());
                            }
                        }
                    break;
                default:
                    System.out.print("Opção inválida. Tente novamente.");
                    continue;
            }
        }
    }
}
