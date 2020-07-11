package com.mentoria;

public class PessoaNova extends Pessoa {

  public PessoaNova(String nome) {
    super(nome);
  }

  @Override
  public String toString() {
    return "PessoaNova{" +
        "nome='" + nome + '\'' +
        '}';
  }
}
