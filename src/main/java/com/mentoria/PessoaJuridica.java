package com.mentoria;

public class PessoaJuridica extends Pessoa  {

  private String cnpj;

  public PessoaJuridica(String nome) {
    super(nome);
  }

  public PessoaJuridica(String nome, String cpf){
    super(nome);
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }
}
