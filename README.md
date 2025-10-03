<div align="center">

# 📦 Flyway Demo - Projeto Spring Boot com H2  

Disciplina: **Java Advanced** \| FIAP  

</div>

------------------------------------------------------------------------

## 🎯 Objetivo da Atividade

Implementar um **sistema de controle de versão de banco de dados**
usando **Flyway** em uma aplicação **Spring Boot**, criando e
gerenciando migrações para a entidade **Produto**.\
O sistema deve permitir que todas as alterações de schema sejam
rastreadas e aplicadas de forma consistente em diferentes ambientes.

------------------------------------------------------------------------

## 📚 Tecnologias Utilizadas

-   **Java 17+**
-   **Spring Boot 3**
-   **Spring Web**
-   **Spring Data JPA**
-   **H2 Database** (em memória)
-   **Flyway** (controle de versões do banco)
-   **Maven**

------------------------------------------------------------------------

## 🏗 Estrutura do Projeto

``` bash
src/
├── main/
│   ├── java/com/example/flywaydemo/
│   │   ├── FlywaydemoApplication.java     # Classe principal
│   │   ├── config/DatabaseConfig.java     # Configuração do Flyway
│   │   ├── model/Produto.java             # Entidade Produto
│   │   ├── repository/ProdutoRepository.java # Repositório JPA
│   │   └── controller/ProdutoController.java # Endpoints REST
│   └── resources/
│       ├── application.properties         # Configurações da aplicação
│       └── db/migration/                  # Migrações Flyway
│           ├── V1__Create_products_table.sql
│           ├── V2__Add_category_to_products.sql
│           └── V3__Insert_initial_products.sql
```

------------------------------------------------------------------------

## 🗄 Migrações Flyway

1.  \*\*V1\_\_Create_products_table.sql\*\* → Criação da tabela
    `produto`.\
2.  \*\*V2\_\_Add_category_to_products.sql\*\* → Adição da coluna
    `categoria`.\
3.  \*\*V3\_\_Insert_initial_products.sql\*\* → Inserção de dados
    iniciais.

------------------------------------------------------------------------

## 🌐 Endpoints da API

Base URL: `http://localhost:8080/produtos`

  Método   Endpoint           Descrição
  -------- ------------------ ----------------------------
  GET      `/produtos`        Lista todos os produtos
  GET      `/produtos/{id}`   Busca produto por ID
  POST     `/produtos`        Cria novo produto
  PUT      `/produtos/{id}`   Atualiza produto existente
  DELETE   `/produtos/{id}`   Remove produto por ID

### 🔹 Exemplo de POST

``` json
{
  "nome": "Monitor LG",
  "preco": 999.90,
  "quantidade": 3,
  "categoria": "Informática"
}
```

------------------------------------------------------------------------

## 📸 Prints de Funcionamento

### Console H2

![H2 Console](docs/images/h2-console.png)

### API -- Listagem de Produtos

![GET /produtos](docs/images/get-produtos.png)

------------------------------------------------------------------------

## ✅ Validações

-   [x] As migrações do **Flyway** foram executadas automaticamente no
    start da aplicação.\
-   [x] Os dados iniciais estão populados corretamente.\
-   [x] A API REST responde conforme os requisitos.

------------------------------------------------------------------------

## 👨‍💻 Autor

-   **Léo Mota Lima**
    -   [GitHub](https://github.com/leomotalima)\
    -   RM: **557851**\
    -   Curso: **2TDSB - FIAP**
