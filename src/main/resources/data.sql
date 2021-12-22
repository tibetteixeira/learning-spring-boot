CREATE TABLE cliente
(
    id   INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100)
);

CREATE TABLE produto
(
    id             INTEGER PRIMARY KEY AUTO_INCREMENT,
    descricao      VARCHAR(100),
    preco_unitario NUMERIC(20, 2)
);

CREATE TABLE pedido
(
    id          INTEGER PRIMARY KEY AUTO_INCREMENT,
    client_id   INTEGER REFERENCES cliente (id),
    data_pedido TIMESTAMP
);

CREATE TABLE item_pedido
(
    id         INTEGER PRIMARY KEY AUTO_INCREMENT,
    pedido_id  INTEGER REFERENCES pedido (id),
    produto_id INTEGER REFERENCES produto (id),
    quantidade INTEGER
);