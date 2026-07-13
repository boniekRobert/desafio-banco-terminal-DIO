# 🏦 Desafio Banco Terminal - Trilha Java Básico (DIO)

Este repositório contém a resolução do desafio proposto no módulo de **Sintaxe Java** da trilha básica da [Digital Innovation One (DIO)](https://www.dio.me/). O objetivo principal do projeto é exercitar os conceitos de variáveis, tipos primitivos, entrada de dados com a classe `Scanner`, manipulação de fluxos e concatenação de strings.

## 📝 Cenário e Requisitos do Desafio

O desafio consiste em simular a criação de uma conta bancária através do terminal de comandos. O sistema interage com o usuário solicitando dados específicos e, ao final, exibe uma mensagem de boas-vindas com as informações fornecidas e consolidadas.

### Atributos da Conta:
| Atributo | Tipo de Dado | Exemplo |
| :--- | :--- | :--- |
| `Numero` | Inteiro | `1021` |
| `Agencia` | Texto (String) | `067-8` |
| `Nome Cliente` | Texto (String) | `MARIO ANDRADE` |
| `Saldo` | Decimal (Double) | `237.48` |

### Fluxo Esperado:
1. O programa solicita o número da agência bancária através do terminal.
2. O usuário insere a informação e aperta `ENTER`.
3. O programa repete a solicitação para o número da conta, nome do cliente e saldo.
4. Após obter todos os dados, o terminal exibe a mensagem de encerramento parametrizada.

---

## 🚀 Tecnologias Utilizadas

* **Java 21** (ou versão utilizada no seu projeto)
* **IDE VS Code** (Visual Studio Code)
* **Classe `java.util.Scanner`** para captura de dados dinâmicos no console.
* **Classe `java.util.Locale`** para forçar a convenção padrão americana (`Locale.US`) na inserção de números decimais com ponto (ex: `237.48`).

---

## 🛠️ Como Executar o Projeto Localmente

Se você quiser clonar e testar o funcionamento deste projeto na sua máquina local:

1. Garanta que você possui o Java JDK instalado na máquina.
2. Clone o repositório utilizando o terminal:
   ```bash
   git clone [https://github.com/boniekRobert/desafio-banco-terminal-DIO.git](https://github.com/boniekRobert/desafio-banco-terminal-DIO.git)