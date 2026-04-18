package model;

/**
 * Classe que representa uma locação de veículo.
 * 
 * Registra e gerencia informações sobre cliente, veículo, duração e cálculos
 * de valores de locação.
 * 
 * NOTA: O atributo valorDiaria é armazenado apenas como referência histórica.
 * O método calcularValorTotal() recalcula usando o veículo para garantir
 * consistência de preços.
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public class Locacao {
	private Cliente cliente;
	private Veiculo veiculo;
	private int diasLocacao;
	private double valorDiaria; // Referência histórica do valor no momento da locação

	/**
	 * Construtor de Locacao com validações.
	 * 
	 * @param cliente      Cliente que realiza a locação
	 * @param veiculo      Veículo sendo alugado
	 * @param diasLocacao  Número de dias de aluguel
	 * @param valorDiaria  Valor da diária no momento da locação
	 * @throws IllegalArgumentException se algum parâmetro for inválido
	 */
	public Locacao(Cliente cliente, Veiculo veiculo, int diasLocacao, double valorDiaria) {
		if (cliente == null) {
			throw new IllegalArgumentException("Cliente não pode ser nulo");
		}
		if (veiculo == null) {
			throw new IllegalArgumentException("Veículo não pode ser nulo");
		}
		if (diasLocacao <= 0) {
			throw new IllegalArgumentException("Dias de locação deve ser maior que zero");
		}
		if (valorDiaria < 0) {
			throw new IllegalArgumentException("Valor da diária não pode ser negativo");
		}
		
		this.cliente = cliente;
		this.veiculo = veiculo;
		this.diasLocacao = diasLocacao;
		this.valorDiaria = valorDiaria;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		if (cliente != null) {
			this.cliente = cliente;
		}
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		if (veiculo != null) {
			this.veiculo = veiculo;
		}
	}

	public int getDiasLocacao() {
		return diasLocacao;
	}

	public void setDiasLocacao(int diasLocacao) {
		if (diasLocacao > 0) {
			this.diasLocacao = diasLocacao;
		}
	}

	public double getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(double valorDiaria) {
		if (valorDiaria >= 0) {
			this.valorDiaria = valorDiaria;
		}
	}

	/**
	 * Calcula o valor total da locação.
	 * Multiplica os dias de locação pelo valor da diária atual do veículo.
	 * 
	 * @return O valor total em R$ (dias × diária do veículo)
	 */
	public double calcularValorTotal() {
		return diasLocacao * veiculo.calcularDiaria();
	}

	/**
	 * Exibe informações detalhadas da locação no console.
	 */
	public void exibirDetalhesLocacao() {
		System.out.println("===== DETALHES DA LOCAÇÃO =====");
		System.out.println("Cliente: " + cliente.getNome());
		System.out.println("Veículo: " + veiculo.getMarca() + " " + veiculo.getModelo());
		System.out.println("Dias de locação: " + diasLocacao);
		System.out.println("Valor da diária: R$ " + String.format("%.2f", veiculo.calcularDiaria()));
		System.out.println("Valor total: R$ " + String.format("%.2f", calcularValorTotal()));
	}
}
