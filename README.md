# SETUP DO PROJETO LOCADORA DE VEÍCULOS - POO

## 📌 SOBRE O PROJETO

Este projeto foi desenvolvido para disciplina de **Programação Orientada a Objetos**, com
objetivo de aplicar na prática os principais conceitos estudados em sala de aula utilizando a 
linguagem **JAVA**.
O Sistema simula uma locadora de veículos, permitindo representar clientes, veículos disponíveis para aluguel
e o processo de locação.

## Objetivo do Projeto
Aplicar os conceitos fundamentais de POO:
- Classes e Objetos
- Atributos e Métodos
- Encapsulamento
- Herança
- Classe abstrata
- interface
- Polimorfismo
- Associação entre classes

## Estrutura do Projeto
```bash
└── 📁projeto-locadora
    └── 📁.vscode
        ├── settings.json
    └── 📁bin
        └── 📁interfaces
            ├── OperacoesLocacao.class
        └── 📁model
            ├── Carro.class
            ├── Cliente.class
            ├── Locacao.class
            ├── Moto.class
            ├── Veiculo.class
        ├── App.class
    └── 📁lib
    └── 📁src
        └── 📁interfaces
            ├── OperacoesLocacao.java
        └── 📁model
            ├── Carro.java
            ├── Cliente.java
            ├── Locacao.java
            ├── Moto.java
            ├── Veiculo.java
        ├── App.java
    └── README.md
```

## 🧩 Modelagem do Sistema
### 🔹 Veiculo

Classe abstrata base do sistema.

Atributos comuns:

- marca
- modelo
- cor
- ano

Também define métodos abstratos que serão implementados pelas subclasses.

### 🔹 Carro

Classe que herda de Veiculo.

Possui comportamentos específicos de carro e cálculo de diária própria.

### 🔹 Moto

Classe que herda de Veiculo.

Possui comportamentos específicos de motocicleta e cálculo de diária própria.

### Cliente

Representa o cliente da locadora.

Atributos:

- nome
- idade
- CPF
- telefone

### 🔹 Locacao

Responsável por registrar uma locação.

Contém:

- cliente
- veículo
- dias alugados
- valor da diária

Realiza o cálculo do valor total do aluguel.

### 🔹 OperacoesLocacao

Interface que define o contrato de locação:

- `alugarVeiculo()`
- `devolverVeiculo()`
- `calcularDiaria()`

## 💡 Conceitos de POO Aplicados
### ✅ Encapsulamento

Uso de atributos private com getters e setters.

### ✅ Herança

Carro e Moto herdam de Veiculo.

### ✅ Abstração

Classe Veiculo definida como abstrata.

### ✅ Interface

Uso da interface OperacoesLocacao.

### ✅ Polimorfismo

Objetos Carro e Moto podem ser tratados pela interface OperacoesLocacao.

Exemplo:

OperacoesLocacao aluguel = carro;

## ▶️ Execução do Sistema

Ao executar o programa, o sistema:

- Cria cliente
- Cria veículos
- Exibe detalhes
- Realiza locação
- Calcula valor total
- Mostra resultado no console

## 📌 Exemplo de Saída
```bash
===== LOCAÇÃO DO CARRO =====
O carro foi alugado.
Valor total: R$ 720.00

===== LOCAÇÃO DA MOTO =====
A moto foi alugada.
Valor total: R$ 150.00
```

## 👥 Integrantes
- Kauan Rodrigues Oliveira
- Miguel Braga Alves Gabriel
- João Victor Bandeira de Sousa

## 📚 Considerações Finais

Este projeto permitiu aplicar conceitos importantes de Programação Orientada a Objetos de forma prática, simulando um sistema real e reforçando boas práticas de organização e modelagem em Java.