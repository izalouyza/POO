package DesafiosProgressao.AnimaisHabilidades;

public class Pomba extends Animal implements Voador {
    //construtor
    public Pomba(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("Pruu pruu!");
    }

    @Override
    public void voar(){
        System.out.println(nome + (" está voando alto!"));
    }
}
