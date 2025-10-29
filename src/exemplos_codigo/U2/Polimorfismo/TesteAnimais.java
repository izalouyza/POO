package Polimorfismo;

public class TesteAnimais {
    public static void main(String[] args){
        Animal[] animais = new Animal[10];

        animais[0] = new Cachorro("Rex", 3);
        animais[1] = new Cavalo("Pé de Pano", 5);
        animais[2] = new Preguica("Soninho", 7);
        animais[3] = new Cachorro("Bob", 2);
        animais[4] = new Cavalo("Relâmpago", 4);
        animais[5] = new Preguica("Mimosa", 6);
        animais[6] = new Cachorro("Thor", 1);
        animais[7] = new Cavalo("Raio", 8);
        animais[8] = new Preguica("Dormi", 5);
        animais[9] = new Cachorro("Spike", 4);

        for(Animal a : animais){
            a.emitirSom();
        }
    }
}
