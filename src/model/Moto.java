package model;

/**
 * JAVA DOCS - PROJETO LOCADORA DE VEÍCULOS
 ** A classe Moto representa uma motocicleta, que é um tipo específico de
 * veículo.
 ** Ela herda as propriedades da classe Veiculo e implementa os métodos abstratos
 * definidos na classe base.
 */

public class Moto extends Veiculo  {
  public Moto(String brand, String model, String color, int year) {
    super(brand, model, color, year);
  }

  @Override
  public void exibirDetalhes() {
    System.out.println("Marca: " + getBrand());
    System.out.println("Modelo: " + getModel());
    System.out.println("Cor: " + getColor());
    System.out.println("Ano: " + getYear());
  }

  @Override
  public void ligar() {
    System.out.println("A moto está ligada.");
  }

  @Override
  public void desligar() {
    System.out.println("A moto está desligada.");
  }

  @Override
  public double calcularDiaria() {
    // Exemplo de cálculo de valor de locação para uma moto
    return 50.0; // Valor fixo para simplificação
  }

  @Override
  public void alugarVeiculo() {
    System.out.println("A moto foi alugada.");
  }

  @Override
  public void devolverVeiculo() {
    System.out.println("A moto foi devolvida.");
  }
}
