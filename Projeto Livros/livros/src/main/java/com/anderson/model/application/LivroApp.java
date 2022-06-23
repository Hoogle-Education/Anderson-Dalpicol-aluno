package com.anderson.model.application;

import com.anderson.model.entities.Autor;
import com.anderson.model.entities.Edicao;
import com.anderson.model.entities.Livro;
import com.anderson.model.utilities.ListaDeLivro;

public class LivroApp {
  
  public static void main(String[] args) {
    
    ListaDeLivro acervo = new ListaDeLivro();

    Autor autor = new Autor("Jonathan Swift", 1);
    Edicao edicao = new Edicao(2002, 1, 1);
    acervo.incluirNoFim(new Livro(1, "Viagens de Gulliver", autor, edicao));


    autor = new Autor("Jonathan A", 1);
    edicao = new Edicao(2002, 1, 1);
    acervo.incluirNoFim(new Livro(1, "Viagens de Gulliver", autor, edicao));

    autor = new Autor("Jonathan A", 1); 
    edicao = new Edicao(2002, 1, 1);
    acervo.incluirNoFim(new Livro(1, "Viagens de Gulliver", autor, edicao));

    autor = new Autor("Jonathan B", 1);
    edicao = new Edicao(2002, 1, 1);
    acervo.incluirNoFim(new Livro(1, "Viagens de Gulliver", autor, edicao));

    autor = new Autor("Jonathan Cwift", 1);
    edicao = new Edicao(2002, 1, 1);
    acervo.incluirNoFim(new Livro(1, "Viagens de Gulliver", autor, edicao));

    for(Livro livro : acervo.buscaPorAutor("Jonathan A")){
      System.out.println(livro);
    }

  }

}
