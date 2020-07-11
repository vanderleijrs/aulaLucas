package com.mentoria;

public class PessoaFisica extends Pessoa {

  String cpf;
  String dataNascimento;
  String rg;
  String endereco;
  String cidade;

  public PessoaFisica(String nome) {
    super(nome);
  }

  public PessoaFisica(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return "PessoaFisica{" +
        "cpf='" + cpf + '\'' +
        ", nome='" + nome + '\'' +
        '}';
  }

  public static PessoaFisicaBuilder builder() {
    return new PessoaFisicaBuilder();
  }

  static class PessoaFisicaBuilder {
    private static PessoaFisicaBuilder builder;
    private String nome;
    public PessoaFisicaBuilder nome(String nome) throws Exception {
      if(nome.isEmpty()) {
        throw new Exception("Nome não pode ser em branco");
      }
      this.nome = nome;
      return this;
    }

    private String cpf;
    public PessoaFisicaBuilder cpf(String cpf) {
      this.cpf = cpf;
      return this;
    }

    public static Pessoa build(){
      PessoaFisica pessoa = new PessoaFisica(builder.nome);
      pessoa.setCpf(builder.cpf);
      return pessoa;
    }
  }

}
