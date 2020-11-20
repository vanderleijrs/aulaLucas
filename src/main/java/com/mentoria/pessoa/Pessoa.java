package com.mentoria.pessoa;

import com.mentoria.domain.Enderecavel;

public class Pessoa implements Enderecavel {

  String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String getEndereco() {
    return "EnderecoPessoa";
  }
}
