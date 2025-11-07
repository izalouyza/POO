package TesteProva.Q4;

public class Main {
    public static void main(String[] args){
        IVeiculo carro = new Carro("Sport");
        IVeiculo moto = new Moto("Luna");

        carro.abastecer(100);
        moto.abastecer(20);

        ((Carro) carro).status();
        ((Moto) moto).status();

        carro.mover();
        moto.mover();
    }
}
