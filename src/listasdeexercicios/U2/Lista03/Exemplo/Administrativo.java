package Exemplo;

public class Administrativo extends Assistente{
    private String turno;
    private double adicionalNoturno;

    //Construtor
    public Administrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioBase = salario;

        if (turno.equalsIgnoreCase("noite")) {
            salarioBase += adicionalNoturno; }
        return salarioBase * 13;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Turno: " + turno);

        if (turno.equalsIgnoreCase("noite")) {
            System.out.printf("Adicional Noturno: R$ %.2f\n", adicionalNoturno);
        }

        System.out.printf("Ganho Anual: R$ %.2f\n", ganhoAnual()); }
}
