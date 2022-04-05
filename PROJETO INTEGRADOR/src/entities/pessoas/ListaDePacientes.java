package entities.pessoas;

public class ListaDePacientes {
    
  private Paciente[] listaDePacientes;

  public ListaDePacientes(){
    listaDePacientes = new Paciente[0];
  }

  public void incluirNoFim(Paciente paciente){
    int novoTamanho = tamanho()+1;

    Paciente[] aux = new Paciente[novoTamanho];

    for(int i=0; i<novoTamanho-1; i++) aux[i] = listaDePacientes[i];
    aux[novoTamanho-1] = paciente;

    listaDePacientes = new Paciente[novoTamanho];
    listaDePacientes = aux;
  }

  public int tamanho(){
    return listaDePacientes.length;
  }

public int buscaPaciente(Paciente paciente){
  int t = tamanho();
  for(int i=0; i<t; i++){
    if( listaDePacientes[i] == paciente ){
      System.out.println("Paciente encontrado no Sistema!");
      return i;
    } 
  }

  incluirNoFim(paciente);
  System.out.println("Novo paciente cadastrado!");
  return t;
}

  public Paciente get(int index){
    return listaDePacientes[index];
  }

}
