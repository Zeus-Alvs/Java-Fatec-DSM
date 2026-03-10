package br.edu.fatecpg.apicep.model;

public class Endereco {


    private String cep;
    private String uf;
    private String localidade;
    private String bairro;
    private String logradouro;


    public Endereco(String cep, String uf, String localidade, String bairro, String logradouro) {
        this.cep = cep;
        this.uf = uf;
        this.localidade = localidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @Override
    public String toString() {
        return "CEP: " + cep + " | " + logradouro + " - Bairro: " + bairro + " (" + localidade + "/" + uf + ")";
    }
}