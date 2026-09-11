# 🎮 DSList

API REST desenvolvida com **Java e Spring Boot** para gerenciamento e organização de jogos em listas.

O projeto foi desenvolvido durante meus estudos de **desenvolvimento backend com Java e Spring Boot**, colocando em prática conceitos de APIs REST, persistência de dados, relacionamentos entre entidades e organização em camadas.

> Projeto desenvolvido a partir do projeto DSList apresentado pela [DevSuperior](https://devsuperior.com.br/), utilizado como base de estudo e prática.

## 🚀 Funcionalidades

* Listagem de jogos
* Busca de jogo por ID
* Listagem de gêneros/categorias
* Organização de jogos em listas
* Reordenação de jogos dentro de uma lista
* Persistência de dados
* Relacionamento entre entidades

## 🛠️ Tecnologias

* **Java**
* **Spring Boot**
* **Spring Data JPA**
* **Hibernate**
* **H2 Database**
* **PostgreSQL**
* **Maven**

## 🏗️ Arquitetura

O projeto utiliza uma arquitetura organizada em camadas:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

### Principais entidades

```text
Game
GameList
Belonging
```

A entidade `Belonging` é responsável por representar a associação entre jogos e listas, incluindo a posição de cada jogo dentro da lista.

## 🔗 Principais endpoints

### Jogos

```http
GET /games
```

Retorna todos os jogos.

```http
GET /games/{id}
```

Retorna os detalhes de um jogo específico.

### Listas

```http
GET /lists
```

Retorna as listas disponíveis.

```http
GET /lists/{listId}/games
```

Retorna os jogos pertencentes a uma determinada lista.

### Reordenação

```http
POST /lists/{listId}/replacement
```

Realiza a movimentação/reordenação dos jogos dentro de uma lista.

## ▶️ Como executar

### Pré-requisitos

* Java 17 ou superior
* Maven
* PostgreSQL (caso utilize o perfil de produção)

### Clonar o projeto

```bash
git clone https://github.com/eduardomoreiraviter/demodslist.git
```

### Entrar no diretório

```bash
cd demodslist
```

### Executar

No Windows:

```bash
mvnw.cmd spring-boot:run
```

No Linux/macOS:

```bash
./mvnw spring-boot:run
```

A API ficará disponível em:

```text
http://localhost:8080
```

## 📚 O que pratiquei

Durante o desenvolvimento deste projeto, pratiquei:

* Desenvolvimento de APIs REST
* Spring Boot
* Injeção de dependências
* Spring Data JPA
* Hibernate
* Mapeamento objeto-relacional (ORM)
* Relacionamentos entre entidades
* DTOs
* Arquitetura em camadas
* Consultas com JPA
* Persistência de dados
* Banco H2 e PostgreSQL
* Tratamento de requisições HTTP

## 🎯 Objetivo

O objetivo principal do projeto foi consolidar meus conhecimentos em **Java e Spring Boot**, desenvolvendo uma API REST com uma estrutura próxima à utilizada em aplicações backend reais.

## 👨‍💻 Autor

**Eduardo Viter**

Estudante de Análise e Desenvolvimento de Sistemas com foco em desenvolvimento backend utilizando **Java e Spring Boot**.

GitHub:
https://github.com/eduardomoreiraviter
