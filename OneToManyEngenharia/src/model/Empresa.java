package model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String codEmpresa;
    private String cnpj;
    private String razaoSocial;
    private String responsavelTecnico;
    private int dataCriacao;
    private boolean status;
    private String telefone;
    private String email;
    private String senha;
    private long longitude;
    private long latitude;
    private String cep;
    private String logradouro;
    private String numero;
    private String bairro;
    private List<Colaborador> colaborador = new ArrayList<>();
    
    public Empresa(){}

    public Empresa(String codEmpresa, String cnpj, String razaoSocial, String responsavelTecnico, int dataCriacao, boolean status, String telefone, String email, String senha, long longitude, long latitude, String cep, String logradouro, String numero, String bairro) {
        this.codEmpresa = codEmpresa;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.responsavelTecnico = responsavelTecnico;
        this.dataCriacao = dataCriacao;
        this.status = status;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.longitude = longitude;
        this.latitude = latitude;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(String responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

    public int getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(int dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    
}
