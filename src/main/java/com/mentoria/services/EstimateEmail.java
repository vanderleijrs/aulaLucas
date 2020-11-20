package com.mentoria.services;

import com.mentoria.services.entities.Estimate;

import java.util.ArrayList;
import java.util.List;

public class EstimateEmail {

  public static String estimateEmailBody(Estimate savedEstimate) {
    List<String> emailLines = new ArrayList();
    emailLines.add("Olá 5 Marias ");
    emailLines.add("");
    emailLines.add("Dados do novo Orçamento:");
    emailLines.add("Requisitante: " + savedEstimate.getName());
    emailLines.add("CEP: " + savedEstimate.getAddress());
    return String.join("<br>", emailLines);
  }

}
