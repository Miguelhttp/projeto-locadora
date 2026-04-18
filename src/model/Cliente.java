package model;

/**
 * Classe que representa um cliente da locadora de veículos.
 * 
 * Armazena dados pessoais do cliente e validações para elegibilidade de aluguel.
 * O CPF é um dado sensível e histórico - não deve ser alterado após criação.
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public class Cliente {
	private String nome;
	private int idade;
	private final String cpf; // Imutável - dado histórico
	private String telefone;

	/**
	 * Construtor de Cliente com validações básicas.
	 * 
	 * @param nome      Nome do cliente
	 * @param idade     Idade do cliente
	 * @param cpf       CPF do cliente (imutável após criação)
	 * @param telefone  Telefone do cliente
	 * @throws IllegalArgumentException se algum parâmetro for inválido
	 */
	public Cliente(String nome, int idade, String cpf, String telefone) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome não pode ser vazio");
		}
		if (idade < 0 || idade > 150) {
			throw new IllegalArgumentException("Idade inválida: " + idade);
		}
		if (cpf == null || cpf.isBlank()) {
			throw new IllegalArgumentException("CPF não pode ser vazio");
		}
		
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Obtém o CPF do cliente.
	 * Nota: CPF é imutável - não possui setter.
	 * 
	 * @return CPF do cliente
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Exibe os detalhes do cliente no console.
	 */
	public void exibirDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + telefone);
	}

	/**
	 * Verifica se o cliente é maior de idade (>= 18 anos).
	 * Requisito mínimo para aluguel de veículos.
	 * 
	 * @return true se cliente tem 18 anos ou mais, false caso contrário
	 */
	public boolean isMaiorIdade() {
		return idade >= 18;
	}

	/**
	 * Valida se o cliente pode realizar uma locação.
	 * Verifica se atende aos requisitos exigidos pela locadora.
	 * 
	 * @return true se cliente pode alugar, false caso contrário
	 */
	public boolean validarParaAluguel() {
		return isMaiorIdade();
	}

	/**
	 * Obtém a idade do cliente.
	 * 
	 * @return Idade em anos
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Altera a idade do cliente.
	 * 
	 * @param idade Nova idade do cliente
	 */
	public void setIdade(int idade) {
		if (idade >= 0 && idade <= 150) {
			this.idade = idade;
		}
	}

	/**
	 * Obtém o nome do cliente.
	 * 
	 * @return Nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do cliente.
	 * 
	 * @param nome Novo nome do cliente
	 */
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
}
