package TesteProva.Q3;

public class Main {
    public static void main(String[] args){
        IImprimivel relat = new Relatorio("Vendas do Mês");
        IImprimivel contr = new Contrato("Parceria Anual");

        relat.imprimir();
        contr.imprimir();
    }
}
