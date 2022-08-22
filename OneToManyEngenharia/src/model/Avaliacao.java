package model;

public class Avaliacao {
    private Servico codServico; 
    private Cliente codCliente;
    private int notaAvaliacao;
    private int dataAvaliacao;
    private String comentario;

    public Avaliacao() {}

    public Avaliacao(String codServico, String codCliente, int notaAvaliacao, int dataAvaliacao, String comentario) {
        this.codServico = codServico;
        this.codCliente = codCliente;
        this.notaAvaliacao = notaAvaliacao;
        this.dataAvaliacao = dataAvaliacao;
        this.comentario = comentario;
    }

    public String getCodServico() {
        return codServico;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public int getDataAvaliacao() {
        return dataAvaliacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setCodServico(String codServico) {
        this.codServico = codServico;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public void setDataAvaliacao(int dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}