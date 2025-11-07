package ProcessoEleitoral.src.br.com.exemplo.eleicao;
import ProcessoEleitoral.src.br.com.exemplo.eleicao.interfaces.Candidato;
import ProcessoEleitoral.src.br.com.exemplo.eleicao.sistema.UrnaEletronica;
import ProcessoEleitoral.src.br.com.exemplo.eleicao.entidades.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        UrnaEletronica urna = null;
        List<Partido> partidos = new ArrayList<>();
        List<Eleitor> eleitores = new ArrayList<>();

        while (true) {
            System.out.println("""
                    URNA ELETRÔNICA
                    ==============================================
                    1 - Criar a Urna
                    2 - Criar os Partidos
                    3 - Criar os Candidatos (Prefeitos e Vereadores)
                    4 - Registrar os Candidatos na Urna
                    5 - Criar os Eleitores
                    6 - Simular a Votação
                    7 - Apurar e Exibir os Resultados
                    8 - Sair
                    ===============================================
                    Escolha uma opção: \s""");
            int opcao = input.nextInt();
            input.nextLine();

            if(opcao == 8){
                System.out.println("Encerrando a Urna...");
                break;
            }

            switch(opcao){
                case 1:
                    if(urna == null) {
                        urna = new UrnaEletronica();
                        System.out.println("Urna criada com sucesso!");
                    }else{
                        System.out.println("Urna já criada.");
                    }
                    break;
                case 2:
                    if(urna == null){
                        System.out.println("Crie a urna primeiro.");
                        break;
                    }
                    System.out.print("Nome do partido: ");
                    String nomePartido = input.nextLine();
                    System.out.print("Sigla do partido: ");
                    String siglaPartido = input.nextLine();
                    partidos.add(new Partido(nomePartido, siglaPartido));
                    System.out.println("Partido criado!");
                    break;
                case 3:
                    if(urna == null || partidos.isEmpty()){
                        System.out.println("Crie a urna e partidos primeiro.");
                        break;
                    }
                    System.out.print("Nome do candidato: ");
                    String nomeCand = input.nextLine();
                    System.out.print("Número do candidato: ");
                    int numCand = input.nextInt();
                    input.nextLine();
                    System.out.print("Cargo (Prefeito/Vereador): ");
                    String cargo = input.nextLine();
                    System.out.print("Índice do partido (0 a " + (partidos.size() - 1) + "): ");
                    int idxPartido = input.nextInt();
                    input.nextLine();

                    Candidato cand;
                    if(cargo.equalsIgnoreCase("Prefeito")){
                        cand = new Prefeito(nomeCand, partidos.get(idxPartido), numCand);
                    } else if(cargo.equalsIgnoreCase("Vereador")){
                        cand = new Vereador(nomeCand, partidos.get(idxPartido), numCand);
                    }else{
                        System.out.println("Cargo inválido.");
                        break;
                    }
                    urna.registrarCandidato(cand);
                    break;
                case 4:
                    System.out.println("Candidatos já registrados ao criar.");
                    break;
                case 5:
                    System.out.print("Nome do eleitor: ");
                    String nomeEleitor = input.nextLine();
                    eleitores.add(new Eleitor(nomeEleitor));
                    System.out.println("Eleitor criado!");
                    break;
                case 6:
                    if (urna == null || eleitores.isEmpty()) {
                        System.out.println("Crie urna e eleitores primeiro.");
                        break;
                    }
                    System.out.print("Índice do eleitor (0 a " + (eleitores.size() - 1) + "): ");
                    int idxEleitor = input.nextInt();
                    System.out.print("Número do candidato a votar: ");
                    int numVoto = input.nextInt();
                    input.nextLine();
                    if (idxEleitor < 0 || idxEleitor >= eleitores.size()) {
                        System.out.println("Eleitor inválido.");
                        break;
                    }
                    Voto voto = new Voto(eleitores.get(idxEleitor), numVoto);
                    urna.receberVoto(voto);
                    break;
                case 7:
                    if (urna == null) {
                        System.out.println("Crie a urna primeiro.");
                        break;
                    }
                    urna.exibirResultados();
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }
        }
    }
}
