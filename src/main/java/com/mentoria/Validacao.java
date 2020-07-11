package com.mentoria;

public class Validacao {

  public boolean nomeValido(String nome) throws DadoInvalidoException {
    return stringValida("nome", nome, 10);
  }

  public boolean logradouroValido(String logradouro) throws DadoInvalidoException {
    return stringValida("logradouro", logradouro, 20);
  }

  public boolean cpfValido(String cpf) throws DadoInvalidoException {
    return stringValida("cpf", cpf, 20) && Integer.parseInt(cpf) > 0;
  }

  private boolean stringValida(String campo, String str, int size) throws DadoInvalidoException {
    if(str == null || str.isEmpty() || str.length() > size) {
      throw new DadoInvalidoException(campo, " inválido");
    }
    return true;
  }

  public boolean pessoaFisicaValida(PessoaFisica pessoa) throws DadoInvalidoException {
    return nomeValido(pessoa.getNome()) && logradouroValido(pessoa.getEndereco()) && cpfValido(pessoa.getCpf());
  }

  public boolean pessoaValida(Pessoa pessoa) throws DadoInvalidoException {
    return nomeValido(pessoa.getNome()) && logradouroValido(pessoa.getEndereco());
  }

}
