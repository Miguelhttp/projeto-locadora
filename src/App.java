import model.Cliente;
import model.Moto;
import interfaces.OperacoesLocacao;
import model.Carro;
import model.Locacao;

/**
 ** Este é o arquivo principal do projeto, onde a execução do programa começa.
 * Ele contém a classe App com o método main, que é o ponto de entrada da
 * aplicação.
 * O método main é onde você pode adicionar o código para iniciar a aplicação,
 * criar objetos, chamar métodos e realizar as operações necessárias para o
 * funcionamento do programa.
 */

public class App {
    public static void main(String[] args) {
        // 1. Criar um objeto da classe Cliente
        Cliente cliente = new Cliente("Diego", 23, "123.456.789-00", "(11) 98765-4321");

        // 2. Criar veículos
        Carro carro = new Carro("Toyota", "Corolla", "Prata", 2020, 4);

        // 3. Criando um objeto Moto
        Moto moto = new Moto("Honda", "CB500", "Preta", 2019);

        System.out.println("===== CLIENTE =====");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println();

        System.out.println("===== VEÍCULOS DISPONÍVEIS =====");
        carro.exibirDetalhes();
        System.out.println();

        moto.exibirDetalhes();
        System.out.println();

        // LOCAÇÃO DO CARRO
        System.out.println("===== LOCAÇÃO DO CARRO =====");

        OperacoesLocacao aluguelCarro = carro;
        aluguelCarro.alugarVeiculo();

        Locacao locacaoCarro = new Locacao(
                cliente,
                carro,
                4,
                carro.calcularDiaria());

        System.out.println("Valor total: R$ " +
                locacaoCarro.calcularValorTotal());

        System.out.println();

        // LOCAÇÃO DA MOTO
        System.out.println("===== LOCAÇÃO DA MOTO =====");

        OperacoesLocacao aluguelMoto = moto;
        aluguelMoto.alugarVeiculo();

        Locacao locacaoMoto = new Locacao(
                cliente,
                moto,
                3,
                moto.calcularDiaria());

        System.out.println("Valor total: R$ " +
                locacaoMoto.calcularValorTotal());
    }
}
