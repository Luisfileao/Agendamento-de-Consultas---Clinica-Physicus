package dao;

import model.CadastroCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Consulta;
import tool.Conexao;

public class ServicosCliente {

    private Connection c;

    public ServicosCliente() {
        this.c = Conexao.obterConexao();
    }

    public CadastroCliente consultarLogin(CadastroCliente dados) {
        CadastroCliente atual = null;
        String sql = "SELECT * FROM public.cliente where (email=? AND senha=?) OR (nome= ? AND senha=?)";
        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, dados.getEmail());
            consulta.setString(2, dados.getSenha());
            consulta.setString(3, dados.getEmail());
            consulta.setString(4, dados.getSenha());
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                atual = new CadastroCliente();
                atual.setCpf(resultado.getString("cpf"));
                atual.setNome(resultado.getString("nome"));
                atual.setTelefone(resultado.getString("telefone"));
                atual.setEmail(resultado.getString("email"));
                atual.setSenha(resultado.getString("senha"));
                System.out.println(atual);
            }
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(ServicosCliente.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }

    public boolean gravarCliente(CadastroCliente dados) {

        String sql = "INSERT INTO public.cliente(cpf, nome, senha, email, telefone) VALUES (?,?,?,?,?) returning cpf";

        try (PreparedStatement insercao = c.prepareStatement(sql)) {
            insercao.setString(1, dados.getCpf());
            insercao.setString(2, dados.getNome());
            insercao.setString(3, dados.getSenha());
            insercao.setString(4, dados.getEmail());
            insercao.setString(5, dados.getTelefone());
            insercao.executeQuery();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ServicosCliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean atualizarSenha(String senha, String cpf) {
        String sql = "UPDATE public.cliente SET senha = ? WHERE cpf = ?";

        try (PreparedStatement update = c.prepareStatement(sql)) {

            update.setString(1, senha);
            update.setString(2, cpf);

            int linhaMudada = update.executeUpdate();
            return linhaMudada >= 1;

        } catch (SQLException ex) {
            Logger.getLogger(ServicosCliente.class
                    .getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean confereEsqueceuSenha(String cpf) {
        String sql = "SELECT cpf FROM public.cliente where cpf = ?";

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, cpf);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                String tempCpf = resultado.getString("cpf");
                if (cpf.equalsIgnoreCase(tempCpf)) {
                    return true;
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(ServicosCliente.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            return false;
        }
    }

    public boolean atualizarCadastro(String senha, String cpf, String email, String telefone) {
        String sql = "UPDATE public.cliente SET senha =?, email =?, telefone =? WHERE cpf =?";

        try (PreparedStatement update = c.prepareStatement(sql)) {
            update.setString(1, senha);
            update.setString(2, email);
            update.setString(3, telefone);
            update.setString(4, cpf);

            int linhaMudada = update.executeUpdate();
            //return linhaMudada >= 1;

            if (linhaMudada >= 1) {
                return true;
            } else {
                System.out.println("errin");
                return false;

            }

        } catch (SQLException ex) {
            Logger.getLogger(ServicosCliente.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public CadastroCliente consultarNovosDados(String cpf) {
        CadastroCliente atual = null;
        String sql = "SELECT * FROM public.cliente where cpf = ?";

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, cpf);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                atual = new CadastroCliente();
                atual.setCpf(resultado.getString("cpf"));
                atual.setNome(resultado.getString("nome"));
                atual.setTelefone(resultado.getString("telefone"));
                atual.setEmail(resultado.getString("email"));
                atual.setSenha(resultado.getString("senha"));
                System.out.println(atual);
            }
            return atual;

        } catch (SQLException ex) {
            Logger.getLogger(ServicosCliente.class
                    .getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }

    public ArrayList<Date> ConsultaDiasCheios(String nomeMedico) {
        String sql = "SELECT dataconsulta FROM public.diascheios where nomemedico = ?";
        ArrayList<Date> diasCheios = new ArrayList<>();

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, nomeMedico);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Date dataTemp = resultado.getDate("dataConsulta");
                diasCheios.add(dataTemp);
            }

            return diasCheios;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar diasCheios");
        }
        return null;
    }

    public ArrayList<LocalTime> HorariosDisponiveisMedico(String nomeMedico, Date data) {
        String sql = "SELECT * FROM public.todos_horarios where horario not in"
                + "( SELECT horario FROM public.agendamento where nomemedico = ? AND dataconsulta = ?) ORDER BY horario ASC";
        ArrayList<LocalTime> horariosDisponiveis = new ArrayList<>();

        java.sql.Date dataSql = new java.sql.Date(data.getTime());

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, nomeMedico);
            consulta.setDate(2, dataSql);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                LocalTime horarioTemp = resultado.getTime("horario").toLocalTime();
                horariosDisponiveis.add(horarioTemp);
            }

            return horariosDisponiveis;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar horariosDisponiveis");
        }
        return null;
    }

    public int ContadorDeHorariosAgendados(String nomeMedico, Date data) {
        String sql = "SELECT COUNT(horario) FROM public.agendamento WHERE nomemedico = ? AND dataconsulta = ?";

        java.sql.Date dataSql = new java.sql.Date(data.getTime());

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, nomeMedico);
            consulta.setDate(2, dataSql);
            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                int quantTemp = resultado.getInt("count");
                System.out.println(quantTemp);
                return quantTemp;
            }

        } catch (SQLException ex) {
            System.out.println("Erro ao consultar horariosOcupados");
        }
        return 0;
    }

    public boolean InsereDiasCheios(String nomemedico, Date data) {
        java.sql.Date dataSql = new java.sql.Date(data.getTime());

        String sql = "INSERT INTO public.diascheios(dataconsulta, nomemedico) VALUES (?,?) returning codigo";

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setDate(1, dataSql);
            consulta.setString(2, nomemedico);
            consulta.execute();

            return true;

        } catch (SQLException ex) {
            System.out.println("Erro ao Inserir em diasCheios");
            return false;
        }
    }

    public boolean insereAgendamentoDAO(Consulta dados) {
        String sql = "INSERT INTO public.agendamento(nomeresponsavel, nomepaciente, problematratado, dataconsulta, horario, nomemedico, cpfdopaciente) VALUES (?,?,?,?,?,?,?) returning codigo";

        java.sql.Date dataSql = new java.sql.Date(dados.getDataConsulta().getTime());
        Time tempo = Time.valueOf(dados.getHorarioConsulta());

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, dados.getNomeResponsavel());
            consulta.setString(2, dados.getNomePaciente());
            consulta.setString(3, dados.getProblemaTratado());
            consulta.setDate(4, dataSql);
            consulta.setTime(5, tempo);
            consulta.setString(6, dados.getNomeMedico());
            consulta.setString(7, dados.getCpfPaciente());
            consulta.execute();

            return true;

        } catch (SQLException ex) {
            System.out.println("Erro ao Inserir em agendamento");
            return false;
        }
    }

    public ArrayList<String> procuraProblemasTratados(String especialidade) {
        String sql = "SELECT problematratado FROM public.tratamentoproblemas where especialidade = ?";
        ArrayList<String> problemasTratados = new ArrayList<>();

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, especialidade);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                String problemaTemp = resultado.getString("problematratado");
                problemasTratados.add(problemaTemp);
            }

            return problemasTratados;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar problemasTratados");
        }
        return null;
    }

    public boolean deletaConsulta(Date data, LocalTime horario, String nomepaciente) {
        String sql = "DELETE FROM public.agendamento WHERE dataconsulta = ? AND horario = ? AND nomepaciente = ?";

        java.sql.Date dataSql = new java.sql.Date(data.getTime());
        Time tempo = Time.valueOf(horario);

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setDate(1, dataSql);
            consulta.setTime(2, tempo);
            consulta.setString(3, nomepaciente);

            boolean resultado = consulta.execute();

            return true;

        } catch (SQLException ex) {
            System.out.println("Erro ao DeletarConsulta");
            return false;
        }
    }

    public boolean deletaConsultaDiasCheios(String nomemedico, Date data) {
        String sql = "DELETE FROM public.diascheios WHERE dataconsulta = ? AND nomemedico = ?";

        java.sql.Date dataSql = new java.sql.Date(data.getTime());

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setDate(1, dataSql);
            consulta.setString(2, nomemedico);

            boolean resultado = consulta.execute();

            return true;

        } catch (SQLException ex) {
            System.out.println("Erro ao DeletarConsultarDiasCheios");
            return false;
        }
    }

    public ArrayList<LocalTime> ConsultaPacienteHorasAgendadas(Date data, String cpf) {
        String sql = "SELECT horario FROM public.agendamento WHERE dataconsulta = ? AND cpfdopaciente = ?";
        ArrayList<LocalTime> horasAgendadas = new ArrayList<>();

        java.sql.Date dataSql = new java.sql.Date(data.getTime());

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setDate(1, dataSql);
            consulta.setString(2, cpf);
            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                LocalTime horaAgendada = resultado.getTime("horario").toLocalTime();
                horasAgendadas.add(horaAgendada);
            }

            return horasAgendadas;
        } catch (SQLException ex) {
            System.out.println("Erro ao consultar horasAgendadasPaciente");
        }
        return null;
    }

    public ArrayList<Consulta> ProcuraConsultasResponsavel(String nomeResponsavel) {
        String sql = "SELECT * FROM public.agendamento WHERE nomeresponsavel = ? ORDER BY dataconsulta DESC, horario DESC";

        ArrayList<Consulta> dadosConsulta = new ArrayList<>();

        try (PreparedStatement consulta = c.prepareStatement(sql)) {
            consulta.setString(1, nomeResponsavel);

            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()) {
                Consulta consultaTemp = new Consulta();

                consultaTemp.setNomeResponsavel(resultado.getString("nomeresponsavel"));
                consultaTemp.setNomePaciente(resultado.getString("nomepaciente"));
                consultaTemp.setProblemaTratado(resultado.getString("problematratado"));
                
                java.util.Date dataConsultaUtil = new java.util.Date(resultado.getDate("dataconsulta").getTime());                
                consultaTemp.setDataConsulta(dataConsultaUtil);
                
                consultaTemp.setHorarioConsulta(resultado.getTime("horario").toLocalTime());
                consultaTemp.setNomeMedico(resultado.getString("nomemedico"));
                consultaTemp.setCpfPaciente(resultado.getString("cpfdopaciente"));

                dadosConsulta.add(consultaTemp);
            }

            return dadosConsulta;
        } catch (SQLException ex) {
            System.out.println("Erro ao procurar consultasResponsável");
        }
        return null;
    }
}
