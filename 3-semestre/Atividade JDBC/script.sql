
CREATE TABLE categorias (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
);


CREATE TABLE tarefas (
    id SERIAL PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    concluida BOOLEAN DEFAULT FALSE,
    categoria_id INT REFERENCES categorias(id)
);


INSERT INTO categorias (nome) VALUES ('Estudos'), ('Trabalho'), ('Casa');