-- Cria a tabela produto com id, nome, preco e quantidade
CREATE TABLE produto (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INT
);
