package br.com.exemplo.eleicao;

import br.com.exemplo.eleicao.entidades.*;
import br.com.exemplo.eleicao.interfaces.Candidato;
import br.com.exemplo.eleicao.sistema.UrnaEletronica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        UrnaEletronica urna = null;
        Partido[] partidos = null;
        Candidato[] candidatos = null;
        Eleitor[] eleitores = null;

        boolean sair = false;

       while(!sair) {
           System.out.print("""
                   \n======== URNA ELETRÔNICA ========
                   1. Criar a Urna
                   2. Criar os Partidos
                   3. Criar os Candidatos (Prefeitos e Vereadores)
                   4. Registrar os Candidatos na Urna
                   5. Criar os Eleitores
                   6. Simular a votação
                   7. Apurar e exibir os resultados
                   0. Sair
                   Selecione a opção: \s
                   """);
           int opcao = input.nextInt();
           input.nextLine();

           switch(opcao){
               case 1: //criar a urna
                   urna = new UrnaEletronica();
                   System.out.println("Urna criada com sucesso!");
                   break;
               case 2: //criar os partidos
                   System.out.print("Quantos partidos deseja cadastrar? ");
                   int qtdPartidos = input.nextInt();
                   input.nextLine();

                   if (qtdPartidos <= 0){
                       System.out.println("Quantidade inválida. Tente novamente.");
                       continue;
                   }

                   partidos = new Partido[qtdPartidos];

                   for(int i = 0; i<qtdPartidos; i++){
                       System.out.print("Nome do partido: ");
                       String nome = input.nextLine();
                       System.out.print("Sigla do partido: ");
                       String sigla = input.nextLine();

                       partidos[i] = new Partido(nome, sigla);

                       System.out.println("Partido cadastrado: " + partidos[i].getNome());
                   }
                   break;
               case 3: //criar candidatos

                   if(partidos == null || partidos.length == 0){
                       System.out.println("Cadastre os partidos primeiro!");
                       break;
                   }

                   System.out.print("Quantos candidatos deseja cadastrar? ");
                   int qtdCandidatos = input.nextInt();
                   input.nextLine();

                   if(qtdCandidatos <= 0){
                       System.out.println("Quantidade inválida. Tente novamente.");
                       continue;
                   }

                   candidatos = new Candidato[qtdCandidatos];

                   for(int i = 0; i < qtdCandidatos; i++){
                       System.out.print("Nome do candidato: ");
                       String nome = input.nextLine();
                       System.out.print("Número do candidato: ");
                       int numero = input.nextInt();
                       input.nextLine();

                       if(numero < 0){
                           System.out.println("Número inválido. Tente novamente.");
                           continue;
                       }

                       System.out.print("Escolha o cargo (1 - Prefeito, 2 - Vereador): ");
                       int cargo = input.nextInt();
                       input.nextLine();

                       if(cargo != 1 && cargo != 2){
                           System.out.println("Cargo inválido. Tente novamente.");
                           continue;
                       }
                       System.out.println("Escolha o partido do candidato (número) ");
                       for(int j= 0; j < partidos.length; j++){
                           System.out.println((j+1) + " - " + partidos[j].getNome() + " (" + partidos[j].getSigla() + ")");
                       }

                       int escolhaPartido = input.nextInt() - 1;
                       input.nextLine();

                       if (escolhaPartido < 0 || escolhaPartido >= partidos.length) {
                           System.out.println("Partido inválido. Tente novamente.");
                           i--;
                           continue;
                       }

                       if(cargo == 1){
                           candidatos[i] = new Prefeito(nome, partidos[escolhaPartido], numero);
                       } else {
                           candidatos[i] = new Vereador(nome, partidos[escolhaPartido], numero);
                       }
                       System.out.println("Candidato criado: " + nome + " - " + candidatos[i].getNumeroCandidato());
                   }
                   break;
               case 4: //registrar candidatos na urna

                   if(urna == null){
                       System.out.println("Crie a urna primeiro!");
                       break;
                   }

                   if(candidatos == null || candidatos.length == 0){
                       System.out.println("Crie os candidatos primeiro!");
                       break;
                   }

                   for (Candidato c : candidatos){
                       urna.registrarCandidato(c);
                   }

                   System.out.println("Todos os candidatos foram registrados na urna.");
                   break;
               case 5: //criar eleitores
                   System.out.print("Quantos eleitores deseja cadastrar? ");
                   int qtdEleitores = input.nextInt();
                   input.nextLine();

                   if(qtdEleitores <= 0){
                       System.out.println("Quantidade inválida. Tente novamente.");
                       continue;
                   }

                   eleitores = new Eleitor[qtdEleitores];

                   for(int i = 0; i < qtdEleitores; i++){
                       System.out.print("Nome do eleitor: ");
                       String nomeEleitor = input.nextLine();
                       eleitores[i] = new Eleitor(nomeEleitor);
                   }

                   System.out.println("Eleitores cadastrados com sucesso!");
                   break;
               case 6: //simular votação

                   if(urna == null || candidatos == null || candidatos.length == 0 || eleitores == null || eleitores.length == 0){
                       System.out.println("Registre uma urna, candidatos e eleitores primeiro!");
                       break;
                   }

                   for(Eleitor e : eleitores){
                       System.out.print("Eleitor " + e.getNome() + ", digite o número do candidato para votar: ");
                       int numeroVoto = input.nextInt();

                       if(numeroVoto < 0){
                           System.out.println("Número inválido. Tente novamente.");
                           continue;
                       }

                       input.nextLine();

                       boolean candidatoExiste = false;
                       for (Candidato c : candidatos) {
                           if (c.getNumeroCandidato() == numeroVoto) {
                               candidatoExiste = true;
                               break;
                           }
                       }

                       if (!candidatoExiste) {
                           System.out.println("Candidato inexistente! Voto nulo.");
                           continue;
                       }

                       Voto voto = new Voto(e, numeroVoto);
                       urna.receberVoto(voto);
                   }

                   break;
               case 7: //apurar e exibir os resultados
                   if(urna == null){
                       System.out.println("Crie a urna primeiro!");
                       break;
                   }

                   System.out.println("===== RESULTADOS DA ELEIÇÃO =====");
                   urna.exibirResultados();
                   break;
               case 0: //sair
                   System.out.println("Encerrando o sistema...");
                   sair = true;
                   break;
               default:
                   System.out.println("Opção inválida. Tente novamente.");
                   break;
           }
       }
    }
}
