package model;

import interfaces.OperacoesLocacao;

/**
 * Classe abstrata que representa um veículo genérico da locadora.
 * 
 * Define os atributos e métodos comuns a todos os tipos de veículos (Carro, Moto).
 * Implementa OperacoesLocacao, garantindo que todas as subclasses tenham as operações
 * necessárias para locação.
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public abstract class Veiculo implements OperacoesLocacao {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;

	/**
	 * Construtor de Veiculo com validações básicas.
	 * 
	 * @param marca  Marca do veículo (ex: Toyota, Honda)
	 * @param modelo Modelo do veículo (ex: Corolla, CB500)
	 * @param cor    Cor do veículo (ex: Preto, Prata)
	 * @param ano    Ano de fabricação do veículo
	 * @throws IllegalArgumentException se algum parâmetro for inválido
	 */
	public Veiculo(String marca, String modelo, String cor, int ano) {
		if (marca == null || marca.isBlank()) {
			throw new IllegalArgumentException("Marca não pode ser vazia");
		}
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo não pode ser vazio");
		}
		if (ano < 1886 || ano > 2026) {
			throw new IllegalArgumentException("Ano inválido: " + ano);
		}
		
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}

	/**
	 * Exibe os detalhes do veículo.
	 * Implementação varia de acordo com o tipo específico de veículo.
	 */
	public abstract void exibirDetalhes();

	/**
	 * Retorna uma representação textual com os detalhes do veículo.
	 * 
	 * @return String com informações do veículo
	 */
	public String obterDetalhes() {
		return String.format("Marca: %s, Modelo: %s, Cor: %s, Ano: %d", 
			marca, modelo, cor, ano);
	}

	/**
	 * Simula o acionamento do motor do veículo.
	 */
	public abstract void ligar();

	/**
	 * Simula o desligamento do motor do veículo.
	 */
	public abstract void desligar();

	/**
	 * Calcula o valor da diária de aluguel do veículo.
	 * 
	 * @return O valor da diária em R$ (reais)
	 */
	@Override
	public abstract double calcularDiaria();

	/**
	 * Registra o aluguel do veículo.
	 */
	@Override
	public abstract void alugarVeiculo();

	/**
	 * Registra a devolução do veículo.
	 */
	@Override
	public abstract void devolverVeiculo();

	// ===== GETTERS E SETTERS =====

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if (ano >= 1886 && ano <= 2026) {
			this.ano = ano;
		}
	}
}
