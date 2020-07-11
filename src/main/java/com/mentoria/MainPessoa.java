package com.mentoria;

import java.util.Scanner;

public class MainPessoa {

  public static void main(String[] args) {

    PessoaFactory.setTipoPessoa(args[0]);
    Pessoa pessoa = PessoaFactory.getInstance(args[1]);

    System.out.println(pessoa.toString());
//    novoMetodo();


    try {
      Validacao validador = new Validacao();
      validador.pessoaFisicaValida((PessoaFisica) pessoa);
    } catch (DadoInvalidoException e) {
      e.printStackTrace();
      System.out.println(e.getMessage());
    }

  }

  public static void novoMetodo() {
    inserirOpcao();
    try {
      validarOpcao(10, "novoMetodo");
    } catch (OpcaoInvalidaException e) {
      System.out.println(e.getFormattedMessage());
      System.out.println("Opcão inválida digite 1, 2 ou 0");
    }
  }

  public static void inserirOpcao() {
    Scanner console = new Scanner(System.in);

    try {
      System.out.println("Insira a opcao desejada:");
      int opcao = Integer.valueOf(console.nextLine());

      validarOpcao(opcao, "inserirOpcao");

      switch (opcao) {
        case 1: System.out.println(" Inserir Pessoa");
          break;
        case 2:System.out.println(" Pesquisar Pessoa");
          break;
        case 0:System.exit(0);
        default:System.out.println("Opção Inválida!");
          break;
      }
    } catch (OpcaoInvalidaException e) {
      System.out.println("Opcão inválida digite 1, 2 ou 0");
      //System.out.println(e.getFormattedMessage()); -> (errors.log)

    } catch (NumberFormatException e) {
      System.out.println("Opcão inválida digite um número");
    } catch (Exception e) {
      System.out.println("Opcão inválida digite um número");
    } finally {
      inserirOpcao();
    }

  }

  private static void validarOpcao(int opcao, String nomeMetodo) throws OpcaoInvalidaException {
    if (opcao != 0 && opcao != 1 && opcao != 2) {
      throw new OpcaoInvalidaException("Opcao Invalida", nomeMetodo);
    }
  }

}
