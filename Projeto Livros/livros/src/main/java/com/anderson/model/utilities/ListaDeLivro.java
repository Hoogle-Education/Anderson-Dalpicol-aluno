package com.anderson.model.utilities;

import com.anderson.model.entities.Livro;

public class ListaDeLivro {
  
  private Livro[] livros;
  private int tamanho;
  
  public ListaDeLivro ( ) {
    livros = new Livro[0];
    tamanho = 0;
  }

  public int tamanho() {
    return tamanho;
  }

  public Livro get(int pos){
    // operador ternário
    return (pos < tamanho) ? livros[pos] : null;
  }

  public void incluirNoInicio(Livro livro) {
    Livro[] tmp = livros;
    livros = new Livro[livros.length + 1];

    livros[0] = livro;

    for(int i=1; i < livros.length; i++){
      livros[i] = tmp[i-1];
    }
  }

  public void incluirNoFim(Livro livro) {
    Livro[] tmp = livros;
    livros = new Livro[livros.length + 1];

    for(int i=0; i < tmp.length; i++) {
      livros[i] = tmp[i];
    }

    livros[livros.length - 1] = livro;
  }

  public Livro removerDoFim( ) {

    if(tamanho == 0) return null;

    Livro livro = livros[livros.length - 1];

    Livro[] tmp = livros;
    livros = new Livro[livros.length - 1];

    for(int i=0; i<livros.length; i++){
      livros[i] = tmp[i];
    }

    return livro;
  }

  public void Ordernar( ) {

    for(int i=0; i < tamanho; i++){

      int posMenor = i;

      for(int j = i + 1; j < tamanho; j++) {
        if(livros[j].compareTo(livros[posMenor]) < 0){
          posMenor = j;
        }
      }

      Livro tmp = livros[i];
      livros[i] = livros[posMenor];
      livros[posMenor] = tmp;
    }

  }

  public Livro[] buscaPorAutor(String nome){
    ListaDeLivro selecionados = new ListaDeLivro();

    for(Livro livro : livros) {
      if(livro.getAutor().getNome().equals(nome)){
        selecionados.incluirNoFim(livro);
      }
    }

    return selecionados.livros;
  }
}
