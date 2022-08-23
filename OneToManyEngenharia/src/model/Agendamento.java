package model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Agendamento {
    private int codAgendamento;
    private Empresa empresa;
    private Cliente cliente;
    private LocalDateTime horario;
    private LocalDate data;

    public Agendamento() {
    }

    public Agendamento(int codAgendamento, Empresa codEmpresa, Cliente codCliente, LocalDateTime horario, LocalDate data) {
        this.codAgendamento = codAgendamento;
        this.codEmpresa = codEmpresa;
        this.codCliente = codCliente;
        this.horario = horario;
        this.data = data;
    }

    public int getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(int codAgendamento) {
        this.codAgendamento = codAgendamento;
    }

    public Empresa getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Empresa codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Cliente getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Cliente codCliente) {
        this.codCliente = codCliente;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
    
    
    
}
