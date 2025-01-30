package model;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

public class Consulta {

    private String nomeResponsavel;
    private String nomePaciente;
    private String problemaTratado;
    private Date dataConsulta;
    private LocalTime horarioConsulta;
    private String nomeMedico;
    private String cpfPaciente;

    public Consulta() {
    }

    public Consulta(String nomeResponsavel, String nomePaciente, String problemaTratado, Date dataConsulta, LocalTime horarioConsulta, String nomeMedico, String cpfPaciente) {
        this.nomeResponsavel = nomeResponsavel;
        this.nomePaciente = nomePaciente;
        this.problemaTratado = problemaTratado;
        this.dataConsulta = dataConsulta;
        this.horarioConsulta = horarioConsulta;
        this.nomeMedico = nomeMedico;
        this.cpfPaciente = cpfPaciente;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getProblemaTratado() {
        return problemaTratado;
    }

    public void setProblemaTratado(String problemaTratado) {
        this.problemaTratado = problemaTratado;
    }

    public Date getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Date dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getCpfPaciente() {
        return cpfPaciente;
    }

    public void setCpfPaciente(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }
}
