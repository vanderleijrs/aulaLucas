package com.mentoria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GerenciarPessoa {

  List<Pessoa> pessoas;

  public GerenciarPessoa() {
    this.pessoas = new ArrayList<>();
  }

  public void inserir(Pessoa pessoa) {
    pessoas.add(pessoa);
  }

  public static void main(String[] args) throws Exception {

    GerenciarPessoa gerente = new GerenciarPessoa();

    PessoaFactory.setTipoPessoa("nova");
    gerente.inserir(PessoaFactory.getInstance("Lucas"));
    gerente.inserir(PessoaFactory.getInstance("Vanderlei"));


    PessoaFisica.builder().cpf("001").nome("Fernanda").build();


    PessoaFisica.builder().nome("Fernanda").cpf("001").build();

    gerente.listar();

  }

  public void listar(){
    System.out.println("Listar Pessoas: ");
    pessoas.stream().forEach(System.out::println);
  }

  public Pessoa consultarPrimeiro(String cpf) {

    for(int i = 0; i < pessoas.size(); i++) {
      if(cpf.equals(((PessoaFisica)pessoas.get(i)).getCpf())){
        return pessoas.get(i);
      }
    }

    System.out.println("Pessoa não encontrada");
    return null;
  }

  public Pessoa consultarPrimeiroLambda(String cpf) {

    return pessoas.stream()
        .filter(p -> cpf.equals(((PessoaFisica)p).getCpf())).collect(Collectors.toList()).get(0);
  }

//  public List<Pessoa> consultar(String cpf) {
//    Object[] arrayPessoas = pessoas.toArray();
//
//    List<Pessoa> retornoPessoas = new ArrayList<>();
//    for(int i = 0; i < arrayPessoas.length; i++) {
//      if(cpf.equals(((Pessoa) arrayPessoas[i]).getCpf())){
//        retornoPessoas.add((Pessoa) arrayPessoas[i]);
//      }
//    }
//
//    return retornoPessoas;
//  }
//
//  public List<Pessoa> consultarLista(String cpf) {
//
//    List<Pessoa> retornoPessoas = new ArrayList<>();
//    for(int i = 0; i < pessoas.size(); i++) {
//      if(cpf.equals(pessoas.get(i).getCpf())){
//        retornoPessoas.add(pessoas.get(i));
//      }
//    }
//
//    return retornoPessoas;
//  }
//
//  public List<Pessoa> consultar2(String cpf) {
//    List<Pessoa> retornoPessoas = new ArrayList<>();
//
//    Iterator it = pessoas.iterator();
//    while(it.hasNext()) {
//      Pessoa pessoaConsultada = (Pessoa) it.next();
//      if(cpf.equals(pessoaConsultada.getCpf())){
//        retornoPessoas.add(pessoaConsultada);
//      }
//    }
//    return retornoPessoas;
//  }

//  public List<Pessoa> consultar3(String cpf) {
//    return pessoas.stream().filter(p -> cpf.equals(p.getCpf())).collect(Collectors.toList());
//  }
}
