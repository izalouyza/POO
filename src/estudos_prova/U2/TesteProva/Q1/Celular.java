package TesteProva.Q1;

public class Celular implements IRecarregavel {
    int nivelBateria;

    //construtor
    public Celular(int nivelBateria){
        this.nivelBateria = nivelBateria;
    }

    @Override
    public void recarregar(int porcentagem){
        this.nivelBateria += porcentagem;
        if(this.nivelBateria > 100){
            this.nivelBateria = 100;
        }
        System.out.println("Bateria atual: " + this.nivelBateria + "%");
    }

    public int getNivelBateria(){
        return nivelBateria;
    }
}
