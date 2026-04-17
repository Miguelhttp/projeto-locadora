package model;

/**
 * JAVA DOCS - PROJETO LOCADORA DE VEÍCULOS
 ** A classe Carro representa um carro, que é um tipo específico de veículo.
 ** Ela herda as propriedades da classe Veiculo e implementa os métodos abstratos
 * definidos na classe base, além de implementar a interface OperacoesLocacao para
 * definir as operações de locação específicas para carros.
 */

public class Carro extends Veiculo {
  private int numberOfDoors;

  public Carro(String brand, String model, String color, int year, int numberOfDoors) {
    super(brand, model, color, year);
    this.numberOfDoors = numberOfDoors;
  }

  @Override
  public void exibirDetalhes() {
    System.out.println("Marca: " + getBrand());
    System.out.println("Modelo: " + getModel());
    System.out.println("Cor: " + getColor());
    System.out.println("Ano: " + getYear());
    System.out.println("Número de Portas: " + numberOfDoors);
  }

  @Override
  public void ligar() {
    System.out.println("O carro está ligado.");
  }

  @Override
  public void desligar() {
    System.out.println("O carro está desligado.");
  }

  @Override
  public double calcularDiaria() {
    // Exemplo de cálculo de valor de locação para um carro
    return 100.0; // Valor fixo para simplificação
  }

  @Override
  public void alugarVeiculo() {
    System.out.println("O carro foi alugado.");
  }

  @Override
  public void devolverVeiculo() {
    System.out.println("O carro foi devolvido.");
  }
}
