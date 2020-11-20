package com.mentoria.domain;

public class Carta implements Enderecavel, ModoDeEnvio {

  @Override
  public String getEndereco() {
    return "Endereco Carta";
  }

  @Override
  public String getModoDeEnvio() {
    return "COMUM";
  }
}
