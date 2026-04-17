package interfaces;

/**
 ** Interface para operações de locação de veículos.
 ** Esta interface define os métodos que devem ser implementados por qualquer classe
 ** que represente um veículo que possa ser alugado, como Carro e Moto.
 */

public interface OperacoesLocacao {
  double calcularDiaria();

  void alugarVeiculo();

  void devolverVeiculo();
}
