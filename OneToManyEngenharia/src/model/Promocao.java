package model;

public class Promocao {

    private int codPromocao;
    private String chavePromocao;
    private double desconto;
    private String descricao;
    private Servico codServico;

    public Promocao() {
    }

    public Promocao(int codPromocao, String chavePromocao, double desconto, String descricao, Servico codServico) {
        this.codPromocao = codPromocao;
        this.chavePromocao = chavePromocao;
        this.desconto = desconto;
        this.descricao = descricao;
        this.codServico = codServico;
    }

    public int getCodPromocao() {
        return codPromocao;
    }

    public String getChavePromocao() {
        return chavePromocao;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getDescricao() {
        return descricao;
    }

    public Servico getCodServico() {
        return codServico;
    }

    public void setChavePromocao(String chavePromocao) {
        this.chavePromocao = chavePromocao;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCodServico(Servico codServico) {
        this.codServico = codServico;
    }

    

    

    
}