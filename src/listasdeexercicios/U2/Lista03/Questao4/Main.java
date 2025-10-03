package Questao4;

public class Main {
    public static void main(String[] args){
        System.out.println("\n--------- IMÓVEL COMUM ---------\n");
        Imovel imovel = new Imovel("Rua das Flores, 123 – Bairro Central, Cidade Nova", 85, 3, 280000);
        imovel.calcularTaxaAdministracao();
        imovel.exibirCaracteristicas();

        System.out.println("\n--------- CASA ---------\n");
        Casa casa = new Casa("Avenida dos Ipês, 987 – Jardim Primavera, São Lucas", 120, 2, 450000, 40, true);
        casa.calcularTaxaAdministracao();
        casa.exibirCaracteristicas();

        System.out.println("\n--------- APARTAMENTO ---------\n");
        Apartamento ap = new Apartamento("Rua do Sol, 45 – Residencial Panorama, Bela Vista", 65, 4, 210000, 2, 280);
        ap.calcularTaxaAdministracao();
        ap.exibirCaracteristicas();
    }
}
