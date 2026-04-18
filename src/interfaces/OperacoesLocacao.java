package interfaces;

/**
 * Interface que define as operações básicas de locação de um veículo.
 * 
 * Qualquer classe que represente um veículo alugável deve implementar esta interface.
 * Esta interface demonstra o uso de Polimorfismo e Contrato entre classes,
 * permitindo que diferentes tipos de veículos implementem as operações de forma específica.
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public interface OperacoesLocacao {
	/**
	 * Calcula o valor diário para aluguel do veículo.
	 * Cada tipo de veículo pode ter um cálculo diferente baseado em suas características.
	 * 
	 * @return O valor da diária em R$ (reais)
	 */
	double calcularDiaria();

	/**
	 * Registra o aluguel do veículo.
	 * Este método é chamado quando um cliente realiza a locação de um veículo.
	 */
	void alugarVeiculo();

	/**
	 * Registra a devolução do veículo.
	 * Este método é chamado quando um cliente devolve o veículo alugado.
	 */
	void devolverVeiculo();
}
