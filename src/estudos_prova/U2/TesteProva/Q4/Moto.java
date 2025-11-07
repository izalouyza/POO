package TesteProva.Q4;

public class Moto extends Transporte implements IVeiculo {
    public Moto (String modelo){
        super(modelo);
    }

    @Override
    public void mover(){
        System.out.print("Movendo a moto...");
    }

    @Override
    public void abastecer(double litros){
        combustivel += litros;
        System.out.printf("Abastecendo a moto com %.1f litros...\n", litros);
    }
}
