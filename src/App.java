import model.Cliente;
import model.Moto;
import interfaces.OperacoesLocacao;
import model.Carro;
import model.Locacao;

/**
 * Classe principal da aplicação - Locadora de Veículos.
 * 
 * Demonstra na prática os principais conceitos de Programação Orientada a Objetos:
 * - Criação e manipulação de objetos
 * - Herança (Carro e Moto herdam de Veiculo)
 * - Implementação de interface (OperacoesLocacao)
 * - Polimorfismo (mesma interface, comportamentos diferentes)
 * - Associação entre classes (Locacao contém Cliente e Veiculo)
 * - Encapsulamento (uso de getters/setters com validações)
 * 
 * @author Projeto Locadora POO
 * @version 1.0
 */
public class App {
	public static void main(String[] args) {
		// === PASSO 1: CRIAR OBJETOS E INICIALIZAR DADOS ===
		
		// Instanciação da classe Cliente
		// Demonstra: Criação de objeto, construtor parametrizado, encapsulamento
		Cliente cliente = new Cliente("Diego", 23, "123.456.789-00", "(11) 98765-4321");

		// Instanciação da classe Carro (subclasse de Veiculo)
		// Demonstra: Herança, construtores com parâmetros específicos
		Carro carro = new Carro("Toyota", "Corolla", "Prata", 2020, 4);

		// Instanciação da classe Moto (subclasse de Veiculo)
		// Demonstra: Herança, comportamento diferente de Carro
		Moto moto = new Moto("Honda", "CB500", "Preta", 2019);

		// === PASSO 2: EXIBIR INFORMAÇÕES DO CLIENTE ===
		System.out.println("===== CLIENTE =====");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Telefone: " + cliente.getTelefone());
		
		// Validação educacional: demonstra uso do método validarParaAluguel()
		if (cliente.validarParaAluguel()) {
			System.out.println("✓ Cliente aprovado para aluguel de veículos");
		} else {
			System.out.println("✗ Cliente NÃO aprovado para aluguel (menor de idade)");
		}
		System.out.println();

		// === PASSO 3: EXIBIR VEÍCULOS DISPONÍVEIS ===
		System.out.println("===== VEÍCULOS DISPONÍVEIS =====");
		carro.exibirDetalhes();
		System.out.println();

		moto.exibirDetalhes();
		System.out.println();

		// === PASSO 4: REALIZAR LOCAÇÃO DO CARRO ===
		System.out.println("===== LOCAÇÃO DO CARRO =====");

		// Polimorfismo: Carro é tratado como OperacoesLocacao (interface)
		// A mesma interface funciona para diferentes tipos de veículos
		OperacoesLocacao aluguelCarro = carro;
		aluguelCarro.alugarVeiculo();

		// Criar um registro de locação com associação entre Cliente, Veiculo e Locacao
		Locacao locacaoCarro = new Locacao(
				cliente,
				carro,
				4,
				carro.calcularDiaria());

		// Exibir detalhes completos da locação
		locacaoCarro.exibirDetalhesLocacao();
		System.out.println();

		// === PASSO 5: REALIZAR LOCAÇÃO DA MOTO ===
		System.out.println("===== LOCAÇÃO DA MOTO =====");

		// Polimorfismo: Moto é tratada como OperacoesLocacao
		// Mesmo método, comportamento diferente (alugarVeiculo é implementado diferente)
		OperacoesLocacao aluguelMoto = moto;
		aluguelMoto.alugarVeiculo();

		// Criar outro registro de locação com a moto
		Locacao locacaoMoto = new Locacao(
				cliente,
				moto,
				3,
				moto.calcularDiaria());

		// Exibir detalhes completos da locação
		locacaoMoto.exibirDetalhesLocacao();
		System.out.println();

		// === RESUMO EDUCACIONAL ===
		System.out.println("===== RESUMO DO SISTEMA =====");
		System.out.println("Total de locações realizadas: 2");
		System.out.println("Valor total (carro + moto): R$ " + 
			String.format("%.2f", locacaoCarro.calcularValorTotal() + locacaoMoto.calcularValorTotal()));
	}
}
