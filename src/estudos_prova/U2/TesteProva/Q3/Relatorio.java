package TesteProva.Q3;

public class Relatorio extends Documento implements IImprimivel {
    public Relatorio(String titulo){
        super(titulo);
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo relatório: " + titulo);
    }
}
