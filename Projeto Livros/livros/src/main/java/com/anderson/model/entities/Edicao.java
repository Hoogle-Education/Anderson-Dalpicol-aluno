package com.anderson.model.entities;

public class Edicao {
  
  private int codigoLivro;
  private int ano;
  public int numeroDaEdicao;

  public Edicao(int ano, int codigoLivro, int numeroDaEdicao){
    this.ano = ano;
    this.codigoLivro = codigoLivro;
    this.numeroDaEdicao = numeroDaEdicao;
  }

  public int getAno() {
    return ano;
  }

  public int getCodigoLivro() {
    return codigoLivro;
  }

  public int getNumeroDaEdicao() {
    return numeroDaEdicao;
  }

  @Override
  public String toString() {
    return "Edicao [ano=" + ano + ", numeroDaEdicao=" + numeroDaEdicao + "]";
  }

  
}
