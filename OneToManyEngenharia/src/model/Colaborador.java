
package model;

import java.time.LocalDate;

public class Colaborador {
    private String cod_colaborador;
    private Empresa codEmpresa;
    private LocalDate data_contrato;
    private String nome;
    private String email;
    private LocalDate data_nascimento;
    private String genero;
    private String telefone;
    private String senha;
    private boolean status;
    private boolean privilegio_adm;
    private String funcao;

    
    
    
    public Colaborador() {
    }

    public Colaborador(String cod_colaborador, Empresa codEmpresa, LocalDate data_contrato, String nome, String email, LocalDate data_nascimento, String genero, String telefone, String senha, boolean status, boolean privilegio_adm, String funcao) {
        this.cod_colaborador = cod_colaborador;
        this.codEmpresa = codEmpresa;
        this.data_contrato = data_contrato;
        this.nome = nome;
        this.email = email;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.telefone = telefone;
        this.senha = senha;
        this.status = status;
        this.privilegio_adm = privilegio_adm;
        this.funcao = funcao;
    }

    public String getCod_colaborador() {
        return cod_colaborador;
    }

    public void setCod_colaborador(String cod_colaborador) {
        this.cod_colaborador = cod_colaborador;
    }

    public Empresa getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Empresa codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public LocalDate getData_contrato() {
        return data_contrato;
    }

    public void setData_contrato(LocalDate data_contrato) {
        this.data_contrato = data_contrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(LocalDate data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isPrivilegio_adm() {
        return privilegio_adm;
    }

    public void setPrivilegio_adm(boolean privilegio_adm) {
        this.privilegio_adm = privilegio_adm;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
     
    
}
