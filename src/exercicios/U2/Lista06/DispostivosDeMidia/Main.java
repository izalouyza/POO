package DispostivosDeMidia;

public class Main {
    public static void main(String[] args){
        CaixaDeSom caixa = new CaixaDeSom();
        Projetor projetor = new Projetor();
        SmartTV smart = new SmartTV();
        SalaDeMidia sala = new SalaDeMidia();

        sala.iniciarSessaoDeMusica(caixa, "Imagine - John Lennon");
        sala.iniciarSessaoDeFilme(projetor, "Interestelar");
        sala.iniciarSessaoDeMusica(smart, "Bohemian Rhapsody - Queen");
        sala.iniciarSessaoDeFilme(smart,"Matrix");
    }
}
