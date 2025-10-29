package AnimaisEHabilidades;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Rex"));
        animais.add(new Pomba("Pombinha"));
        animais.add(new Pato("Donald"));

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
