package com.mentoria.domain.exceptions;

public class OpcaoInvalidaException extends Exception {

  private String prefixo;

  public OpcaoInvalidaException(String message, String prefixo) {
    super(message);
    this.prefixo = prefixo;
  }

  public String getPrefixo() {
    return prefixo;
  }

  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  public String getFormattedMessage() {
    return getPrefixo() + " <> " +  getMessage();
  }
}
