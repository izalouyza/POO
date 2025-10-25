package Questao07;

class Carro extends Veiculo {

    // Construtor
    public Carro(String cor) {
        super(cor);
        /* A chamada da super() é obrigatória para inicializar corretamente
         o campo "cor" definido na classe abstrata Veiculo.
         Sem essa chamada, o campo da superclasse não seria inicializado,
         e o contrato de que "todo veículo deve ter uma cor" seria quebrado. */
    }
}