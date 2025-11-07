package ClassesAbstratasEInterfaces.ControleEstoque;

public class ProdutoAlimenticio extends Produto {
    public ProdutoAlimenticio(int quantidadeEstoque){
        super(quantidadeEstoque);
    }
    public void verificarDisponibilidade(int quantidadeSolicitada){
        if(quantidadeSolicitada > quantidadeEstoque){
            System.out.println("Estoque insuficiente!");
        }else if(quantidadeSolicitada == quantidadeEstoque){
            System.out.println("Últimas unidades!");
        }else{
            System.out.println("Disponibilidade OK.");
        }
    }
}
