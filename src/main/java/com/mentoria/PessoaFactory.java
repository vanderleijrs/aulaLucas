package com.mentoria;

public class PessoaFactory {

  private static String tipoPessoa;

  public static void setTipoPessoa(String tipo){
    tipoPessoa = tipo;
  }

  public static Pessoa getInstance(String nome) {
    Pessoa pessoa = null;
    switch (tipoPessoa) {
      case "fisica":
        pessoa = new PessoaFisica(nome);
        break;
      case "juridica":
        pessoa = new PessoaJuridica(nome);
        break;
      case "nova":
        pessoa = new PessoaNova(nome);
        break;
    }
    return pessoa;
  }

//
//  List<Enderecavel> contemEndereco;
//
//  public List<Enderecavel> getEnderecaveis(){
//
//    contemEndereco = new ArrayList<>();
//    contemEndereco.add(new Pessoa());
//    contemEndereco.add(new Carta());
//    return contemEndereco;
//  }
//
//  List<ModoDeEnvio> contemModoDeEnvio;
//
//  public List<ModoDeEnvio> getEnviaveis(){
//
//    contemModoDeEnvio = new ArrayList<>();
////    contemModoDeEnvio.add(new Pessoa());
//    contemModoDeEnvio.add(new Carta());
//
//    ConnectionPool connection = ConnectionPool.getConnection();
//
//    return contemModoDeEnvio;
//  }
//

}
