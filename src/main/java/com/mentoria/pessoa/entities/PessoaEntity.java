package com.mentoria.pessoa.entities;

import com.mentoria.pessoa.Pessoa;
import com.mentoria.pessoa.PessoaFactory;
import com.mentoria.pessoa.PessoaFisica;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PessoaEntity {

  List<Pessoa> pessoas;

  public PessoaEntity() {
    this.pessoas = new ArrayList<>();
  }

  public void inserir(Pessoa pessoa) {
    pessoas.add(pessoa);
  }

  public static void main(String[] args) throws Exception {

    PessoaEntity gerente = new PessoaEntity();

    PessoaFactory.setTipoPessoa("nova");
    gerente.inserir(PessoaFactory.getInstance("Lucas"));
    gerente.inserir(PessoaFactory.getInstance("Vanderlei"));

//    PessoaFisica.builder().cpf("001").nome("Fernanda").build();
//
//    PessoaFisica.builder().nome("Fernanda").cpf("001").build();

    gerente.listar();

    //var nomeDaMinhaFuncao = function() {}
    //nomeDaMinhaFuncao()

    //outraFuncao(nomeDaMinhaFuncao);
//    Function() {
//      public Argumento run(Object parametro) {
//
//      };
//    }
//
//    if(obj instanceof Function)
//      ((Function) obj).run();
//
  }

//  public boolean verifyIfFlightIsFromSameCarrier(Flight flight, Carrier carrier){
//    List<Flight> flights = new ArrayList<>();
//    List<Carrier> carriers = new ArrayList<>();
//
//    flights.stream().filter(PorNome).collect(Collectors.toList());
//
//    return flights.stream().filter(x -> x.flightName.equals(y.carrierName)).findAny().isPresent();
//  }

  public List<Pessoa> filtrarPessoasDeMesmoNome(String nomeProcurado) {
//    pessoas.stream().filter(Pessoa::ome).collect(Collectors.toList());

    return filtrarPorPredicado(x -> nomeProcurado.equals(x.getNome()));
//    return pessoas.stream().filter(x -> nomeProcurado.equals(x.getNome())).collect(Collectors.toList());
  }

  public List<Pessoa> filtrarPessoasDeMesmoEndereco(String endereco) {
    return filtrarPorPredicado(x -> endereco.equals(x.getEndereco()));
//    return pessoas.stream().filter(x -> endereco.equals(x.getEndereco())).collect(Collectors.toList());
  }

  private List<Pessoa> filtrarPorPredicado(Predicate<Pessoa> predicado) {
    return pessoas.stream().filter(predicado).collect(Collectors.toList());
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
