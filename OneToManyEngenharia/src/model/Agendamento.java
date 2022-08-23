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

    public Agendamento(int codAgendamento, Empresa empresa, Cliente cliente, LocalDateTime horario, LocalDate data) {
        this.codAgendamento = codAgendamento;
        this.empresa = empresa;
        this.cliente = cliente;
        this.horario = horario;
        this.data = data;
    }

    public int getCodAgendamento() {
        return codAgendamento;
    }

    public void setCodAgendamento(int codAgendamento) {
        this.codAgendamento = codAgendamento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
