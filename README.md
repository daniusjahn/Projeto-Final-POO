# 🎬 Sistema de Locadora de Filmes

Um projeto simples desenvolvido em Java para simular o funcionamento de uma locadora de filmes. O sistema permite cadastrar filmes, realizar aluguéis e devoluções, além de gerar relatórios sobre a disponibilidade dos títulos cadastrados.

---

## 📋 Funcionalidades

✅ Cadastro de filmes

✅ Listagem de filmes cadastrados

✅ Busca de filmes por código

✅ Aluguel de filmes

✅ Devolução de filmes

✅ Relatório de filmes disponíveis

✅ Relatório de filmes alugados

---

## 🏗 Estrutura do Projeto

```text
ProjetoLocadora
│
├── App.java
├── Filme.java
├── Locadora.java
├── Menu.java
└── Relatorio.java
```

### Descrição das Classes

| Classe      | Responsabilidade                                      |
| ----------- | ----------------------------------------------------- |
| `App`       | Classe principal responsável pela execução do sistema |
| `Filme`     | Representa um filme e seus atributos                  |
| `Locadora`  | Gerencia o catálogo de filmes                         |
| `Menu`      | Controla as operações de aluguel e devolução          |
| `Relatorio` | Gera relatórios de filmes disponíveis e alugados      |

---

## 🚀 Como Executar

### Pré-requisitos

* Java JDK 8 ou superior
* IDE Java (VS Code, IntelliJ IDEA, Eclipse ou similar)

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/ProjetoLocadora.git
```

2. Abra o projeto em sua IDE.

3. Compile e execute a classe:

```java
App.java
```

---

## 💻 Exemplo de Saída

```text
Filme cadastrado com sucesso!
Filme cadastrado com sucesso!

Vingadores - 1 - Disponível
Titanic - 2 - Disponível

Filme alugado com sucesso!

Filmes Disponíveis:
Titanic - 2

Filmes Alugados:
Vingadores - 1

Filme devolvido com sucesso!

Obrigado por usar a locadora.
```

---

## 🛠 Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Collections Framework (`ArrayList`)

---

## 📚 Conceitos Aplicados

* Encapsulamento
* Associação entre classes
* Manipulação de listas
* Métodos de busca
* Controle de estado de objetos
* Organização em múltiplas classes

---

## 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos e prática de Programação Orientada a Objetos em Java.
