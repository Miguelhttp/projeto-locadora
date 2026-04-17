package model;

/**
 * JAVA DOCS - PROJETO LOCADORA DE VEÍCULOS
 ** A classe Locadora representa a locadora de veículos, contendo informações sobre
 * o cliente, o veículo alugado, a duração da locação e o valor da diária.
 ** Ela é utilizada para gerenciar as locações realizadas pela locadora.
 */

public class Locacao {
  private Cliente cliente;
  private Veiculo veiculo;
  private int diasLocacao;
  private double valorDiaria;

  public Locacao(Cliente cliente, Veiculo veiculo, int diasLocacao, double valorDiaria) {
    this.cliente = cliente;
    this.veiculo = veiculo;
    this.diasLocacao = diasLocacao;
    this.valorDiaria = valorDiaria;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public Veiculo getVeiculo() {
    return veiculo;
  }

  public void setVeiculo(Veiculo veiculo) {
    this.veiculo = veiculo;
  }

  public int getDiasLocacao() {
    return diasLocacao;
  }

  public void setDiasLocacao(int diasLocacao) {
    this.diasLocacao = diasLocacao;
  }

  public double getValorDiaria() {
    return valorDiaria;
  }

  public void setValorDiaria(double valorDiaria) {
    this.valorDiaria = valorDiaria;
  }

  public double calcularValorTotal() {
    return diasLocacao * veiculo.calcularDiaria();
  }
}
