package model;

/**
 * JAVA DOCS - PROJETO LOCADORA DE VEÍCULOS
 ** A classe Cliente representa um cliente da locadora de veículos, contendo
 * informações pessoais como nome, idade, CPF e telefone.
 ** Ela é utilizada para armazenar os dados dos clientes que alugam os veículos.
 */

public class Cliente {
  private String nome;
  private int idade;
  private String cpf;
  private String telefone;

  public Cliente(String nome, int idade, String cpf, String telefone) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.telefone = telefone;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  // Método para exibir os detalhes do cliente
  public void exibirDetalhes() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("CPF: " + cpf);
    System.out.println("Telefone: " + telefone);
  }

  // Método para verificar se o cliente é maior de idade
  public boolean isMaiorIdade() {
    return idade >= 18;
  }
}
