package Exemplo;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n------------ FUNCIONÁRIO COMUM ------------\n");
        Funcionario func = new Funcionario("João Silva", 2500);
        func.addAumento(500);
        func.exibeDados();

        System.out.println("\n------------ ASSISTENTE ------------\n");
        Assistente assis = new Assistente("Mariana Costa", 3200, 10234);
        assis.exibeDados();

        System.out.println("\n------------ TÉCNICO ------------\n");
        Tecnico tec = new Tecnico("Carlos Pereira", 4100, 20456, 500);
        tec.addAumento(500);
        tec.exibeDados();
        System.out.printf("Novo salário do técnico: R$ %.2f\n", tec.getSalario());

        System.out.println("\n------------ ADMINISTRATIVO - DIA ------------\n");
        Administrativo adminDia = new Administrativo("Fernanda Oliveira", 3800, 30567, "Dia", 350);
        adminDia.exibeDados();

        System.out.println("\n------------ ADMINISTRATIVO - NOITE ------------\n");
        Administrativo adminNoite = new Administrativo("Rafael Mendes", 4200, 40678, "Noite", 300);
        adminNoite.exibeDados();
    }
}

