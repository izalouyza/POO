package TesteProva.Q4;

public abstract class Transporte {
    protected String modelo;
    protected double combustivel;

    //construtor
    public Transporte(String modelo){
        this.modelo = modelo;
        this.combustivel = 0;
    }

    public void status(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Combustível: " + combustivel + " litros");
    }
}
