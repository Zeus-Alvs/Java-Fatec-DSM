package br.edu.fatecpg.model;

import com.google.gson.annotations.SerializedName;

public class Socio {
    private String nome_socio;

    @SerializedName("cnpj_cpf_do_socio")
    private String documento_socio;
    @SerializedName("qualificacao_socio")
    private String qualificacao;

    public Socio() {
    }

    public String getNome_socio() {
        return nome_socio;
    }

    public void setNome_socio(String nome_socio) {
        this.nome_socio = nome_socio;
    }

    public String getQualificacao() {
        return qualificacao;
    }

    public void setQualificacao(String qualificacao) {
        this.qualificacao = qualificacao;
    }

    public String getDocumento_socio() {
        return documento_socio;
    }

    public void setDocumento_socio(String documento_socio) {
        this.documento_socio = documento_socio;
    }
}
