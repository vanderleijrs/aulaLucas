package com.mentoria.domain;

public interface ModoDeEnvio {

  String getModoDeEnvio();

  static String getDestinatario(){
    return "dest";
  }

}
