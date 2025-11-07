package DesafiosProgressao.DispositivosMidia;

public class Main {
    public static void main(String[] args){
        ReprodutorAudio caixa = new CaixaDeSom();
        ReprodutorVideo projetor = new Projetor();
        SmartTV smart = new SmartTV();

        SalaDeMidia sala = new SalaDeMidia();

        sala.iniciarSessaoDeMusica(caixa, "JB");
        sala.iniciarSessaoDeFilme(projetor, "A morte dos que não foram");
        sala.iniciarSessaoDeMusica(smart, "Loveble");
        sala.iniciarSessaoDeFilme(smart, "Jude");
    }
}
