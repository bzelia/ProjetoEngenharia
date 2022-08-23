package model;

public class Promocao {

    private int codPromocao;
    private String chavePromocao;
    private double desconto;
    private String descricao;
    
    public Promocao() {
    }

    public Promocao(int codPromocao, String chavePromocao, double desconto, String descricao) {
        this.codPromocao = codPromocao;
        this.chavePromocao = chavePromocao;
        this.desconto = desconto;
        this.descricao = descricao;
        
    }

    public int getCodPromocao() {
        return codPromocao;
    }

    public void setCodPromocao(int codPromocao) {
        this.codPromocao = codPromocao;
    }

    public String getChavePromocao() {
        return chavePromocao;
    }

    public void setChavePromocao(String chavePromocao) {
        this.chavePromocao = chavePromocao;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}