package com.mentoria;

public class Pacote implements ModoDeEnvio {

  @Override
  public String getModoDeEnvio() {
    return ModoDeEnvio.getDestinatario();
  }

}
