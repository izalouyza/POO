package Heranca.SistemaDeCursos;

public class CursoOnline extends Curso {
    private String plataforma;

    //construtor
    public CursoOnline(String nome, int cargaHoraria, double preco, String nivel, String plataforma){
        super(nome, cargaHoraria, preco, nivel);
        this.plataforma = plataforma;
    }

    public CursoOnline(){}

    //setter
    public void setPlataforma(String plat){
        this.plataforma = plat;
    }

    //getter
    public String getPlataforma() {
        return plataforma;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.15;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Plataforma: " + plataforma);
    }
}
