package ClassesAbstratasEInterfaces.ValidacaoCredenciais;

public abstract class ValidadorBase {
    public String validarFormato(String s){
        return "true";
    }

    public abstract void validarAcesso(String senha);
}
