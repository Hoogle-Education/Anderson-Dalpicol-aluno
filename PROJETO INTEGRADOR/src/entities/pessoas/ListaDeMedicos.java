package entities.pessoas;

public class ListaDeMedicos {
    
  private Medico[] listaDeMedicos;

  public ListaDeMedicos(){
    listaDeMedicos = new Medico[0];
  }

  public void incluirNoFim(Medico medico){
    int novoTamanho = tamanho()+1;

    Medico[] aux = new Medico[novoTamanho];

    for(int i=0; i<novoTamanho-1; i++) aux[i] = listaDeMedicos[i];
    aux[novoTamanho-1] = medico;

    listaDeMedicos = new Medico[novoTamanho];
    listaDeMedicos = aux;
  }

  public int tamanho(){
    return listaDeMedicos.length;
  }

  public Medico[] buscaEspecialidade(String especialidade){

    int total = 0;
    for(Medico medico : listaDeMedicos){
      if( medico.getEspecicialidade().equals(especialidade) ){
        total++;
      }
    }

    Medico[] aux = new Medico[total];
    int i = 0;

    for(Medico medico : listaDeMedicos){
      if( medico.getEspecicialidade().equals(especialidade) ){
        aux[i] = medico;
        i++;
      }
    }

    return aux;
  }

  public Medico get(int index){
    return listaDeMedicos[index];
  }

}
