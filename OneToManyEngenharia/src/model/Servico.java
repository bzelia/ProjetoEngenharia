package model;

public class Servico {
    private String codServico;
    private String codEmpresa;
    private int periodoServico;
    private double valorServico;
    
    public Servico(){}

    public Servico(String codServico, String codEmpresa, int periodoServico, double valorServico) {
        this.codServico = codServico;
        this.codEmpresa = codEmpresa;
        this.periodoServico = periodoServico;
        this.valorServico = valorServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public String getCodServico() {
        return codServico;
    }

    public void setCodServico(String codServico) {
        this.codServico = codServico;
    }

    public String getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(String codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public int getPeriodoServico() {
        return periodoServico;
    }

    public void setPeriodoServico(int periodoServico) {
        this.periodoServico = periodoServico;
    }
    
    
    
}
