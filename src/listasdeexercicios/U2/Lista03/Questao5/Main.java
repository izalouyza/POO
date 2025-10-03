package Questao5;

public class Main {
    public static void main(String[] args){
        System.out.println("\nPRODUTO ELETRÔNICO\n-------------------");
        ProdutoEletronico prodEletro = new ProdutoEletronico("JBL", "Flip 6", 749.99, "Bivolt");
        prodEletro.calcularGarantiaEstendida();
        prodEletro.exibirEspecificacoes();

        System.out.println("\nSMARTPHONE\n--------------------");
        Smartphone smartphone = new Smartphone("Samsung", "S23 Ultra", 6499, "Bivolt", 6.8, 5000);
        smartphone.calcularGarantiaEstendida();
        smartphone.exibirEspecificacoes();

        System.out.println("\nNOTEBOOK \n----------------------");
        Notebook not = new Notebook("Dell", "XPS 13 Plus", 8999, "Bivolt automático", "Intel Core i7-1360P", 16);
        not.calcularGarantiaEstendida();
        not.exibirEspecificacoes();

    }
}

