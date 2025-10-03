package Questao2;

public class Main {
    public static void main(String[] args){
        System.out.println("\n------- Conta Bancária Comum -------\n");
        ContaBancaria contab = new ContaBancaria("1041572-6", 350, "Luís");
        contab.depositar(5000);
        contab.sacar(250);
        contab.consultarSaldo();

        System.out.println("\n------ Conta Corrente ------\n");
        ContaCorrente contac = new ContaCorrente("235299-0", 2000, "Josefina", 100);
        contac.sacar(1000);
        contac.consultarSaldo();

        System.out.println("\n------ Conta Poupanca ------\n");
        ContaPoupanca contap = new ContaPoupanca("0001234-5", 35200, "Luzia", 3);
        contap.aplicarRendimento();
        contap.consultarSaldo();
    }
}
