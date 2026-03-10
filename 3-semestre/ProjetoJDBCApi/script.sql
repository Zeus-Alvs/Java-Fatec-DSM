CREATE TABLE empresa (
                         cnpj VARCHAR(20) PRIMARY KEY,
                         nome VARCHAR(100),
                         razao_social VARCHAR(100),
                         logradouro VARCHAR(100)
);

CREATE TABLE socio (
                       id SERIAL PRIMARY KEY,
                       cnpj_empresa VARCHAR(20),
                       nome_socio VARCHAR(255),
                       documento_socio VARCHAR(50),
                       qualificacao VARCHAR(100),

                       CONSTRAINT fk_empresa FOREIGN KEY (cnpj_empresa) REFERENCES empresa(cnpj)
);