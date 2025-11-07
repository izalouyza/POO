package ClassesAbstratasEInterfaces.LogEventos;

public class Main {
    public static void main(String[] args){
        ISalvavelEmArquivo arquivolocal = new Logger();
        ISalvavelEmDB arquivoremoto = new Logger();
        arquivolocal.salvarLocal("302030");
        arquivoremoto.salvarRemoto("11930");
    }
}
