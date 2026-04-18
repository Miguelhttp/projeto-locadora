package model;

/**
 * Classe que representa um carro, tipo específico de veículo.
 * 
 * Herda propriedades de Veiculo e implementa comportamentos específicos para carros,
 * como cálculo de diária baseado no tipo de veículo.
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public class Carro extends Veiculo {
	private int numeroPortas;

	/**
	 * Construtor de Carro.
	 * 
	 * @param marca        Marca do carro
	 * @param modelo       Modelo do carro
	 * @param cor          Cor do carro
	 * @param ano          Ano de fabricação
	 * @param numeroPortas Número de portas do carro
	 */
	public Carro(String marca, String modelo, String cor, int ano, int numeroPortas) {
		super(marca, modelo, cor, ano);
		if (numeroPortas < 2 || numeroPortas > 5) {
			throw new IllegalArgumentException("Número de portas inválido: " + numeroPortas);
		}
		this.numeroPortas = numeroPortas;
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cor: " + getCor());
		System.out.println("Ano: " + getAno());
		System.out.println("Número de Portas: " + numeroPortas);
	}

	@Override
	public void ligar() {
		System.out.println("O carro está ligado.");
	}

	@Override
	public void desligar() {
		System.out.println("O carro está desligado.");
	}

	/**
	 * Calcula a diária para aluguel de carro.
	 * Valores: R$ 100.00 por dia (padrão educacional)
	 */
	@Override
	public double calcularDiaria() {
		return 100.0;
	}

	@Override
	public void alugarVeiculo() {
		System.out.println("O carro foi alugado.");
	}

	@Override
	public void devolverVeiculo() {
		System.out.println("O carro foi devolvido.");
	}

	/**
	 * Obtém o número de portas do carro.
	 * 
	 * @return Número de portas
	 */
	public int getNumeroPortas() {
		return numeroPortas;
	}
}
