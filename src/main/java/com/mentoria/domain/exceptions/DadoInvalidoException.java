package com.mentoria.domain.exceptions;

public class DadoInvalidoException extends Exception {

  private String campo;

  public DadoInvalidoException(String campo, String mensagem) {
    super(mensagem);
    this.campo = campo;
  }

  @Override
  public String getMessage() {
    return this.campo + "" + super.getMessage();
  }
}
