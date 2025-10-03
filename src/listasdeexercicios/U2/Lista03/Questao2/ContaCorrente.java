package Questao2;

public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    //Construtor
    public ContaCorrente(String numeroConta, double saldo, String titular, double limiteChequeEspecial) {
        super(numeroConta, saldo, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public boolean sacar(double valor){
        if (valor > 0 && saldo + limiteChequeEspecial >= valor){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public void consultarSaldo(){
        super.consultarSaldo();
        System.out.printf("Limite do Cheque Especial: R$ %.2f\n", limiteChequeEspecial);
    }
}
