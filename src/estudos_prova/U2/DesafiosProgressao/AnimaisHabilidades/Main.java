package DesafiosProgressao.AnimaisHabilidades;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Thor"));
        animais.add(new Pomba("Fedora"));
        animais.add(new Pato("Lula"));

        for(Animal animal : animais){
            animal.comer();
            animal.fazerSom();

            if(animal instanceof Voador){
                ((Voador) animal).voar();
            }

            if(animal instanceof Nadador){
                ((Nadador) animal).nadar();
            }
            System.out.println("---");
        }
    }
}
