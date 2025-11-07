package TesteProva.Q4;

public class Carro extends Transporte implements IVeiculo {

    public Carro (String modelo){
        super(modelo);
    }

        @Override
    public void mover() {
        System.out.println("Movendo o carro...");
    }

    @Override
    public void abastecer(double litros) {
        combustivel += litros;
        System.out.printf("Abastecendo o carro com %.1f litros...\n", litros);
    }
}
