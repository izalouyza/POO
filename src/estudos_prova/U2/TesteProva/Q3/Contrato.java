package TesteProva.Q3;

public class Contrato extends Documento implements IImprimivel {
    public Contrato(String titulo){
        super(titulo);
    }

    @Override
    public void imprimir(){
        System.out.println("Imprimindo contrato: " + titulo);
    }
}
