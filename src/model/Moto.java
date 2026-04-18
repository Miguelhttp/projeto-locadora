package model;

/**
 * Classe que representa uma motocicleta, tipo específico de veículo.
 * 
 * Herda propriedades de Veiculo e implementa comportamentos específicos para motos,
 * como cálculo de diária reduzida em relação aos carros.
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public class Moto extends Veiculo {
	/**
	 * Construtor de Moto.
	 * 
	 * @param marca  Marca da motocicleta
	 * @param modelo Modelo da motocicleta
	 * @param cor    Cor da motocicleta
	 * @param ano    Ano de fabricação
	 */
	public Moto(String marca, String modelo, String cor, int ano) {
		super(marca, modelo, cor, ano);
	}

	@Override
	public void exibirDetalhes() {
		System.out.println("Marca: " + getMarca());
		System.out.println("Modelo: " + getModelo());
		System.out.println("Cor: " + getCor());
		System.out.println("Ano: " + getAno());
	}

	@Override
	public void ligar() {
		System.out.println("A moto está ligada.");
	}

	@Override
	public void desligar() {
		System.out.println("A moto está desligada.");
	}

	/**
	 * Calcula a diária para aluguel de moto.
	 * Valores: R$ 50.00 por dia (padrão educacional)
	 */
	@Override
	public double calcularDiaria() {
		return 50.0;
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
