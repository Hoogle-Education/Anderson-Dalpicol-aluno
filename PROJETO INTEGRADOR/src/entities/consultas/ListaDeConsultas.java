package entities.consultas;

public class ListaDeConsultas {
    
  private Consulta[] listaDeConsultas;

  public ListaDeConsultas(){
    listaDeConsultas = new Consulta[0];
  }

  public void incluirNoInicio(Consulta consulta){
    int novoTamanho = tamanho()+1;

    Consulta[] aux = new Consulta[novoTamanho];

    aux[0] = consulta;
    for(int i=1; i<novoTamanho; i++) aux[i] = listaDeConsultas[i-1];

    listaDeConsultas = new Consulta[novoTamanho];
    listaDeConsultas = aux;
  }

  public void incluirNoFim(Consulta consulta){
    int novoTamanho = tamanho()+1;

    Consulta[] aux = new Consulta[novoTamanho];

    for(int i=0; i<novoTamanho-1; i++) aux[i] = listaDeConsultas[i];
    aux[novoTamanho-1] = consulta;

    listaDeConsultas = new Consulta[novoTamanho];
    listaDeConsultas = aux;
  }

  public void removerDoFim(){
    int novoTamanho = tamanho()-1;

    Consulta[] aux = new Consulta[novoTamanho];

    for(int i=0; i<novoTamanho; i++) aux[i] = listaDeConsultas[i];

    listaDeConsultas = new Consulta[novoTamanho];
    listaDeConsultas = aux;
  }

  public int tamanho(){
    return listaDeConsultas.length;
  }

  public Consulta get(int indice){
    return listaDeConsultas[indice];
  }

  public Consulta[] getListaDeConsultas() {
    return listaDeConsultas;
  }

  public void setListaDeConsultas(Consulta[] listaDeConsultas) {
    this.listaDeConsultas = listaDeConsultas;
  }

}
