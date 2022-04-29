package com.imed.cep.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cep {

    @Id
    public String cep;
    public String Logradoura;
    public String Complemento;
    public String Bairro;
    public String Cidade;
    public String Estado;


    public String getLogradoura() {
        return Logradoura;
    }

    public void setLogradoura(String logradoura) {
        Logradoura = logradoura;
    }

    public String getComplemento() {
        return Complemento;
    }

    public void setComplemento(String complemento) {
        Complemento = complemento;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
