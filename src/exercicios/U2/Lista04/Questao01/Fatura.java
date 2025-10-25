package Questao01;

public class Fatura implements IImprimivel {
    @Override
    public void imprimir(int copias) {
        if (copias > 5) {
            System.out.printf("Imprimindo %d cópias em modo rascunho.\n", copias);
        } else {
            System.out.printf("Imprimindo %d cópias em modo alta qualidade.\n", copias);
        }
    }
}