package com.anderson.model.entities;

public class Livro implements Comparable<Livro> {
  
  private String titulo;
  private int codigo;
  
  private Autor autor;
  private Edicao edicao;
  
  public Livro(int codigo, String titulo, Autor autor, Edicao edicao) {
    this.titulo = titulo;
    this.codigo = codigo;
    this.autor = autor;
    this.edicao = edicao;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public int getCodigo() {
    return codigo;
  }

  public Autor getAutor() {
    return autor;
  }

  public Edicao getEdicao() {
    return edicao;
  }

  @Override
  public int compareTo(Livro other) {
    return this.titulo.compareTo(other.titulo);
  }

  @Override
  public String toString() {
    return "Livro [autor=" + autor + ", codigo=" + codigo + ", edicao=" + edicao + ", titulo=" + titulo + "]";
  }

  

}
