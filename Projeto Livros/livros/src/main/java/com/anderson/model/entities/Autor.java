package com.anderson.model.entities;

import com.anderson.model.utilities.ListaDeLivro;

public class Autor {
  
  private String nome;
  private int codigo;

  public Autor(String nome, int codigo) {
    this.nome = nome;
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCodigo() {
    return codigo;
  }

  @Override
  public String toString() {
    return "Autor [nome=" + nome + "]";
  }

}
