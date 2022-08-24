package model;

public class Avaliacao {
    private Servico servico; 
    private Cliente cliente;
    private int notaAvaliacao;
    private int localDate;
    private String comentario;

    public Avaliacao() {}

    public Avaliacao(Servico Servico, Cliente Cliente, int notaAvaliacao, int localDate, String comentario) {
        this.servico = Servico;
        this.cliente = Cliente;
        this.notaAvaliacao = notaAvaliacao;
        this.localDate = localDate;
        this.comentario = comentario;
    }

    public int getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public int getLocalDate() {
        return localDate;
    }

    public String getComentario() {
        return comentario;
    }

    public void setNotaAvaliacao(int notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public void setLocalDate(int localDate) {
        this.localDate = localDate;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
}