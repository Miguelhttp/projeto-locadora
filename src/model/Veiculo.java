package model;

import interfaces.OperacoesLocacao;

/**
 * JAVA DOCS - PROJETO LOCADORA DE VEÍCULOS
 ** A classe Veiculo representa um veículo genérico, contendo informações comuns
 * a todos os tipos de veículos.
 ** Ela serve como uma classe base para as classes Carro e Moto, que herdam suas
 * propriedades.
 */

public abstract class Veiculo implements OperacoesLocacao {
  private String brand;
  private String model;
  private String color;
  private int year;

  public Veiculo(String brand, String model, String color, int year) {
    this.brand = brand;
    this.model = model;
    this.color = color;
    this.year = year;
  }

  public abstract void exibirDetalhes();
  public abstract void ligar();
  public abstract void desligar();

  public abstract double calcularDiaria();

  public abstract void alugarVeiculo();

  public abstract void devolverVeiculo();

  // Getters e Setters
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}
