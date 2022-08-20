package model;

public class Cliente {
    private String codCliente;
    private long cpf;
    private String enderecoCliente;
    private String nome;
    private String email;
    private int dataNascimento;
    private String genero;
    private int dataCriacao;
    private boolean ativo;
    private String senha;
    private long celular;
    private long latitude;
    private long longitude;
    private int cep;
    private String logradouro;
    private String bairro;
    private String numero;

    public Cliente(){}

    public Cliente(String codCliente, long cpf, String enderecoCliente, String nome, String email, int dataNascimento, String genero, int dataCriacao, boolean ativo, String senha, long celular, long latitude, long longitude, int cep, String logradouro, String bairro, String numero){
        this.codCliente = codCliente;
        this.cpf = cpf;
        this.enderecoCliente = enderecoCliente;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.dataCriacao = dataCriacao;
        this.ativo = ativo;
        this.senha = senha;
        this.celular = celular;
        this.latitude = latitude;
        this.longitude = longitude;
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.numero = numero;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public long getCpf() {
        return cpf;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public int getDataCriacao() {
        return dataCriacao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public String getSenha() {
        return senha;
    }

    public long getCelular() {
        return celular;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public int getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDataCriacao(int dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}