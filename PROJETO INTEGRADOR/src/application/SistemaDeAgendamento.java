package application;

import java.util.Scanner;

import entities.consultas.Consulta;
import entities.consultas.ListaDeConsultas;
import entities.pessoas.ListaDeMedicos;
import entities.pessoas.ListaDePacientes;
import entities.pessoas.Medico;
import entities.pessoas.Paciente;

public class SistemaDeAgendamento {

  static void menu(){
    System.out.println(
                      "1 - Para cadastrar um médico\n" +
                      "2 - Para cadastrar um paciente\n" +
                      "3 - Para ver as opcções de agendamento de consulta\n"+
                      "4 - Buscar consultas de um paciente\n"+
                      "5 - Buscar consultas de um médico\n"+
                      "6 - Listar todos os médicos\n" +
                      "7 - Listar todos os pacientes\n" +
                      "8 - Listar todas as consultas agendadas\n" +
                      "0 - Para sair do programa" );
  }

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    int option;

    ListaDeMedicos hospital = new ListaDeMedicos();
    ListaDePacientes pacientes = new ListaDePacientes();
    ListaDeConsultas consultas = new ListaDeConsultas();

    do{
      menu();
      System.out.print("Digite uma opção: ");
      option = in.nextInt();
      in.nextLine();

      switch(option){
        case 1:

          System.out.print("Digite o nome do médico:");
          String nome = in.nextLine();
          System.out.print("Digite o cpf do médico:");
          String cpf = in.nextLine();
          System.out.print("Digite a especialidade do médico:");
          String especialidade = in.nextLine();

          hospital.incluirNoFim(new Medico(nome, cpf, especialidade));
          System.out.println("Médico cadastrado com sucesso!");

          break;
        case 2:

          System.out.print("Digite o nome do paciente:");
          String nomePaciente = in.nextLine();
          System.out.print("Digite o cpf do paciente:");
          String cpfPaciente = in.nextLine();
          System.out.print("Digite o endereço do paciente:");
          String enderecoPaciente = in.nextLine();
        
          pacientes.incluirNoFim(new Paciente(nomePaciente, cpfPaciente, enderecoPaciente));

          System.out.println("Paciente cadastrado com sucesso!");
          break;
        case 3:
          
          System.out.print("Digite o nome do paciente:");
          String nomeP = in.nextLine();
          System.out.print("Digite o cpf do paciente:");
          String cpfP = in.nextLine();
          System.out.print("Digite o endereço do paciente:");
          String enderecoP = in.nextLine();
        
          pacientes.buscaPaciente(new Paciente(nomeP, cpfP, enderecoP));

          System.out.print("Digite a especialidade desejada:");
          String especialidadeP = in.nextLine();

          Medico[] encontrados = hospital.buscaEspecialidade(especialidadeP);
          if(encontrados == null) {
            System.out.println("Não foram encontrados médicos para esta especialidade");
            break;
          }

          int id = 1;
          System.out.println("Médicos encontrados:");
          for(Medico med : encontrados){
            System.out.println("#" + id + " " + med);
            id++;
          }
          
          System.out.print("Digite o ID do medico desejado:");
          int inputId = in.nextInt();
          inputId--; // corrigindo indexcação em 1
          in.nextLine();

          System.out.print("Digite o dia da consulta:");
          int dia = in.nextInt();
          System.out.print("Digite o mês da consulta :");
          int mes = in.nextInt();
          System.out.print("Digite o ano da consulta :");
          int ano = in.nextInt();
          System.out.print("Digite a hora da consulta :");
          int hora = in.nextInt();
                    

          consultas.incluirNoFim( 
                  new Consulta(dia,
                               mes,
                               ano,
                               hora,
                               new Paciente(nomeP, cpfP, enderecoP),
                               new Medico(
                                  encontrados[inputId].getNome(),
                                  encontrados[inputId].getCpf(),
                                  encontrados[inputId].getEspecicialidade()
                                )
                              ));

          System.out.println("Consulta Cadastrada com sucesso!");
          break;
        case 4:

          System.out.print("Digite o nome do paciente:");
          String nomePBuscar = in.nextLine();
          System.out.print("Digite o cpf do paciente:");
          String cpfPBuscar = in.nextLine();
          System.out.print("Digite o endereço do paciente:");
          String enderecoPBuscar = in.nextLine();

          Paciente current = new Paciente(nomePBuscar, cpfPBuscar, enderecoPBuscar);

          boolean findsome1 = false;
          for(int i=0; i<consultas.tamanho(); i++){
            if(consultas.get(i).getPaciente().equals(current) ){
              System.out.println(consultas.get(i));
              findsome1 = true;
            }
          }

          if(!findsome1) System.out.println("Nenhum paciente foi encontrado com estes dados!");
          break;

        case 5:

          System.out.print("Digite o nome do medico:");
          String nomeMBuscar = in.nextLine();
          System.out.print("Digite o cpf do médico:");
          String cpfMBuscar = in.nextLine();
          System.out.print("Digite o endereço do médico:");
          String especialidadeMBuscar = in.nextLine();

          Medico current2 = new Medico(nomeMBuscar, cpfMBuscar, especialidadeMBuscar);

          boolean findsome2 = false;
          for(int i=0; i<consultas.tamanho(); i++){
            if(consultas.get(i).getMedico().equals(current2) ){
              System.out.println(consultas.get(i));
              findsome2 = true;
            }
          }

          if(!findsome2) System.out.println("Nenhum paciente foi encontrado com estes dados!");
          break;
        case 6:
          for(int i=0; i<hospital.tamanho(); i++)
            System.out.println(hospital.get(i));
          break;
        case 7:
          for(int i=0; i<pacientes.tamanho(); i++)
            System.out.println(pacientes.get(i));
          break;
        case 8:
          for(int i=0; i<consultas.tamanho(); i++)
            System.out.println(consultas.get(i));
          break;
        default:
          System.out.println("Digite uma opção válida!");
          break;
      }

    }while(option != 0);

    in.close();
  }
}
