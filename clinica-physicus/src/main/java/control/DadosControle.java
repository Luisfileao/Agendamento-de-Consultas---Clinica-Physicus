package control;

import dao.ServicosCliente;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import model.CadastroCliente;
import model.Consulta;

public class DadosControle {

    private ServicosCliente servicosCliente;

    public DadosControle() {
        this.servicosCliente = new ServicosCliente();
    }

    public CadastroCliente verificacaoDados(CadastroCliente dados) {
        CadastroCliente dadosCliente = this.servicosCliente.consultarLogin(dados);

        return dadosCliente;
    }

    public boolean esqueceuSenha(String cpf) {
        if (cpf.length() != 11) {
            return false;
        }
        return this.servicosCliente.confereEsqueceuSenha(cpf);
    }

    public boolean cadastrarCliente(CadastroCliente dados) {
        if (dados.getCpf().length() != 11 || dados.getTelefone().length() != 9 || dados.getSenha().length() < 5 || dados.getSenha().length() > 20) {
            return false;
        }

        boolean verificador = this.servicosCliente.gravarCliente(dados);

        return verificador;
    }

    public boolean atualizaSenha(String novaSenha, String confirmarSenha, String cpf) {
        if (novaSenha.equals(confirmarSenha) && novaSenha.length() >= 5 && novaSenha.length() <= 20) {
            boolean verificador = this.servicosCliente.atualizarSenha(novaSenha, cpf);

            return verificador;
        }

        return false;
    }

    public boolean atualizaCadastro(CadastroCliente dados) {
        if (dados.getEmail().length() < 11 || dados.getEmail().length() > 70 || dados.getTelefone().length() != 9 || dados.getSenha().length() < 5 || dados.getSenha().length() > 20) {
            return false;
        }

        boolean verificador = this.servicosCliente.atualizarCadastro(dados.getSenha(), dados.getCpf(), dados.getEmail(), dados.getTelefone());

        return verificador;
    }

    public CadastroCliente consultaNovosDados(String cpf) {
        return this.servicosCliente.consultarNovosDados(cpf);
    }

    public ArrayList<Date> consultaDiasCheios(String nomeMedico) {
        return this.servicosCliente.ConsultaDiasCheios(nomeMedico);
    }

    public ArrayList<LocalTime> HorariosDisponiveis(String nomeMedico, Date data) {
        return servicosCliente.HorariosDisponiveisMedico(nomeMedico, data);

    }

    public boolean InsereAgendamento(Consulta consulta) {
        boolean verificador = false;

        int quantHorarios = servicosCliente.ContadorDeHorariosAgendados(consulta.getNomeMedico(), consulta.getDataConsulta());
        verificador = servicosCliente.insereAgendamentoDAO(consulta);

        if (quantHorarios == 5) {
            verificador = servicosCliente.InsereDiasCheios(consulta.getNomeMedico(), consulta.getDataConsulta());
        }
        return verificador;
    }

    public ArrayList<String> consultaProblemas(String especialidade) {
        return servicosCliente.procuraProblemasTratados(especialidade);
    }

    public boolean verificaAgendamento(Date data, int indiceHorario, int indiceProblema) {
        LocalDate dataEscolhida = data.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate diaHoje = LocalDate.now();

        if ((dataEscolhida.getDayOfYear() == diaHoje.getDayOfYear() && dataEscolhida.getYear() == diaHoje.getYear()) || indiceHorario == -1 || indiceProblema == -1) {
            return false;
        } else {
            return true;
        }
    }

    public ArrayList<LocalTime> horasAgendadasPaciente(Date data, String cpfpaciente) {
        if (cpfpaciente.length() != 11) {
            return null;
        }
        return servicosCliente.ConsultaPacienteHorasAgendadas(data, cpfpaciente);
    }

    public ArrayList<Consulta> ProcuraConsultasResponsavel(String nomeresponsavel) {
        return servicosCliente.ProcuraConsultasResponsavel(nomeresponsavel);
    }

    public boolean DesmarcarConsulta(Date data, LocalTime horario, String nomepaciente, String nomemedico) {
        int quantHorarios = servicosCliente.ContadorDeHorariosAgendados(nomemedico, data);

        if (quantHorarios == 6) {
            servicosCliente.deletaConsultaDiasCheios(nomemedico, data);
        }
        return servicosCliente.deletaConsulta(data, horario, nomepaciente);
    }
}
