# 🚀 Web Services com Spring Boot, JPA e Hibernate

API REST desenvolvida em **Java com Spring Boot**, utilizando **JPA e Hibernate** para persistência de dados.  
O projeto simula um sistema de pedidos (e-commerce), contendo usuários, produtos, categorias, pedidos, itens de pedido e pagamentos.

Desenvolvido com base no curso **Java COMPLETO**, do professor **Nélio Alves**, com foco em boas práticas de desenvolvimento backend e arquitetura em camadas.

---

## 📖 Sobre o Projeto

Este projeto tem como objetivo consolidar os principais conceitos de desenvolvimento backend com Java, incluindo:

- Construção de APIs REST
- Modelagem de domínio complexa
- Persistência de dados com JPA/Hibernate
- Arquitetura em camadas
- CRUD completo
- Tratamento de exceções

---

## 🎯 Objetivos

- Criar um projeto Spring Boot
- Implementar modelo de domínio completo
- Estruturar camadas: Resource, Service e Repository
- Configurar banco de dados H2 para testes
- Popular banco com dados iniciais (seed)
- Implementar operações CRUD
- Tratar exceções de forma profissional

---

## 🧠 Arquitetura

A aplicação segue o padrão de arquitetura em camadas:

Application  
↓  
Resource Layer (Controllers)  
↓  
Service Layer (Regras de negócio)  
↓  
Repository Layer (Acesso a dados)  
↓  
Database  

### 📌 Responsabilidades

- **Resource (Controller)** → recebe requisições HTTP e retorna respostas  
- **Service** → contém regras de negócio  
- **Repository** → comunicação com banco de dados via JPA  
- **Entities** → representam o modelo de domínio  

---

## 🛠️ Tecnologias Utilizadas

- Java  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- Hibernate  
- Maven  
- H2 Database (teste)  
- PostgreSQL (produção)  
- Apache Tomcat  
- Postman  

---

## 📦 Modelo de Domínio

O sistema é composto pelas seguintes entidades:

- **User**  
- **Order**  
- **Product**  
- **Category**  
- **OrderItem**  
- **Payment**  
- **OrderStatus (Enum)**  

---

## 🔗 Relacionamentos

- Um **User** pode ter vários **Orders**  
- Um **Order** pertence a um **User**  
- Um **Order** possui vários **OrderItems**  
- Um **Product** pode estar em vários pedidos  
- Um **Product** pode pertencer a várias **Categories**  
- Um **Order** pode ter um **Payment**  
- Um **Order** possui um **OrderStatus**  

---

## ⚙️ Funcionalidades

✔️ CRUD de usuários  
✔️ Consulta de pedidos  
✔️ Consulta de produtos e categorias  
✔️ Relacionamento entre entidades  
✔️ Cálculo de subtotal (OrderItem)  
✔️ Cálculo de total do pedido  
✔️ Seed automático de dados  
✔️ Tratamento de exceções  

---

## 🔌 Endpoints da API

### 👤 Users

GET /users  
GET /users/{id}  
POST /users  
PUT /users/{id}  
DELETE /users/{id}  

### 📦 Orders

GET /orders  
GET /orders/{id}  

### 🛍️ Products

GET /products  
GET /products/{id}  

### 🏷️ Categories

GET /categories  
GET /categories/{id}  

---

## 📄 Exemplos de Requisição

### Criar usuário

{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}

### Atualizar usuário

{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755"
}

---

## 💾 Banco de Dados (H2)

O projeto utiliza banco em memória para ambiente de teste.

### 🔗 Acessar console H2

http://localhost:8080/h2-console

### ⚙️ Configuração

JDBC URL: jdbc:h2:mem:testdb  
User: sa  
Password:  

---

## ⚠️ Tratamento de Exceções

A aplicação implementa tratamento global de erros utilizando:

- ResourceNotFoundException  
- DatabaseException  
- StandardError  
- ResourceExceptionHandler  

### ✔️ Erros tratados

- Recurso não encontrado (404)  
- Erro de integridade de dados  
- Erros de banco de dados  
- Operações inválidas  

---

## 🧪 Como Executar o Projeto

### 📌 Pré-requisitos

- Java instalado  
- Maven instalado  

### ▶️ Passos

git clone https://github.com/marcosvors/springboot-jpa.git  
cd springboot-jpa  
mvn spring-boot:run  

### 🌐 Aplicação rodando em:

http://localhost:8080  

---

## 🧪 Testando a API

GET http://localhost:8080/users  
GET http://localhost:8080/orders  
GET http://localhost:8080/products  
GET http://localhost:8080/categories  

---

## 🧠 Conceitos Praticados

- API REST  
- Arquitetura em camadas  
- Injeção de dependência  
- JPA / Hibernate  
- Mapeamento objeto-relacional  
- Relacionamentos:
  - OneToMany  
  - ManyToMany  
  - OneToOne  
- Chave composta  
- Enumeração  
- Banco H2  
- Seed de dados  
- CRUD  
- Tratamento de exceções  

---

## 🚀 Possíveis Melhorias

- Autenticação com JWT  
- Documentação com Swagger  
- Testes automatizados  
- Paginação de dados  
- Validação com Bean Validation  
- Deploy em cloud (Render, AWS)  
- Integração com PostgreSQL em produção  

---

## 👨‍💻 Autor

Desenvolvido por **Marcos Vinícius**  
🎓 Estudante de Engenharia de Software  
💻 Focado em desenvolvimento backend com Java  

---

## 📚 Referência

Projeto baseado no curso:

**Java COMPLETO - Programação Orientada a Objetos + Projetos**  
Professor: **Nélio Alves**
