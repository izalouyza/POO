package DesafiosProgressao.AnimaisHabilidades;

public class Cachorro extends Animal {

    //construtor
    public Cachorro(String nome){
        super(nome);
    }

    @Override
    public void fazerSom(){
        System.out.println("Au au!");
    }
}
