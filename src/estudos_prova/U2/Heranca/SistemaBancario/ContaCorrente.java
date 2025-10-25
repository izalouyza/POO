package Heranca.SistemaBancario;

public class ContaCorrente extends ContaBancaria{
    private double limiteChequeEspecial;

    public ContaCorrente() {}

    //construtor
    ContaCorrente(int numeroConta, double saldo, String titular, double limiteChequeEspecial){
        super(numeroConta, saldo, titular);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    //sobrescrevendo função sacar
    @Override
    public void sacar(){
        System.out.print("Digite o valor que deseja sacar: ");
        double valor = input.nextDouble();

        if(valor <= saldo + limiteChequeEspecial){
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso!");
        }else{
            System.out.println("Limite insuficiente para saque.");
        }
    }

}
