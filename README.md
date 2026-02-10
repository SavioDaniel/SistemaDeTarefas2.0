# 📝 Sistema de Gerenciamento de Tarefas em Java

## 📌 Descrição

Este projeto é um **Gerenciador de Tarefas em Java (modo console)** desenvolvido para praticar **Programação Orientada a Objetos (POO)**.

O sistema permite:

* Criar tarefas
* Listar tarefas
* Concluir tarefas
* Excluir tarefas com confirmação
* Gerenciar tarefas em memória

Projeto ideal para iniciantes que estão estudando **Java Back-end** e lógica de programação.

---

## 🎯 Objetivo do Projeto

Praticar conceitos fundamentais de Java:

* Classes e objetos
* Encapsulamento
* Arrays de objetos
* Métodos
* Organização em pacotes
* Interação com usuário (Scanner)
* Estrutura de menus
* Lógica de sistemas reais

---

## 🗂 Estrutura do Projeto

```
ProjetoPrincipal/
│
├── dominio/
│   ├── Tarefa.java
│   ├── GerenciadorTarefas.java
│   └── ExclusorTarefas.java
│
└── test/
    └── TarefasTest.java
```

### 📁 dominio

Contém as regras de negócio do sistema.

* **Tarefa** → Representa uma tarefa
* **GerenciadorTarefas** → Cria, lista e conclui tarefas
* **ExclusorTarefas** → Responsável pela exclusão segura

### 📁 test

Contém a classe principal com o `main`, onde o sistema roda.

---

## 🚀 Funcionalidades

### ✔ Criar tarefa

O usuário digita o nome e a tarefa é adicionada ao sistema.

### ✔ Listar tarefas

Mostra todas as tarefas com status:

* Pendente
* Concluída

### ✔ Concluir tarefa

Marca uma tarefa como concluída.

### ✔ Excluir tarefa

* Lista tarefas numeradas
* Permite escolher pelo número
* Se estiver pendente → pede confirmação
* Remove do sistema

### ✔ Menu interativo

Sistema roda em loop até o usuário escolher sair.

---

## 🧠 Conceitos aplicados

* Programação Orientada a Objetos (POO)
* Encapsulamento
* Classes separadas por responsabilidade
* Métodos getters
* Manipulação de arrays
* Validação de dados
* Estrutura de repetição `while`
* `switch case`
* Scanner para entrada de dados

---

## ▶ Como executar

### 1. Abra em uma IDE:

* IntelliJ
* Eclipse
* VS Code

### 2. Execute a classe:

```
TarefasTest.java
```

---

## 🖥 Exemplo de uso

```
------ MENU ------
1 - Criar
2 - Concluir
3 - Excluir
4 - Listar
5 - Sair
Opção: 1

Nome da tarefa: Estudar Java
Tarefa criada!

------ MENU ------
4 - Listar

1 - Estudar Java [Pendente]

------ MENU ------
2 - Concluir
Número: 1
Concluída!

1 - Estudar Java [Concluída]
```

---

## 🔥 Melhorias futuras (nível profissional)

* Salvar tarefas em arquivo (TXT ou JSON)
* Banco de dados (MySQL)
* Interface gráfica (Java Swing ou JavaFX)
* Prioridade de tarefas
* Data de vencimento
* Login de usuário
* Versão web com Spring Boot
* API REST

---

## 👨‍💻 Autor

**Sávio Daniel**
Formado em Engenharia da Computação
Foco: Back-end Java

Estudando para se tornar Desenvolvedor Java profissional 🚀
