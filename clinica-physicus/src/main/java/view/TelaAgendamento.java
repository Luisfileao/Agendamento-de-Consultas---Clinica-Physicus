package view;

import com.toedter.calendar.JCalendar;
import control.DadosControle;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import model.CadastroCliente;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import model.Consulta;

public class TelaAgendamento extends javax.swing.JFrame {

    private static CadastroCliente conta;
    private static String nomeMedico;
    private static String especialidade;
    private ConfigEvaluator evaluator;
    private DadosControle controle;
    private DefaultComboBoxModel<LocalTime> horariosModelCombo;
    private DefaultComboBoxModel<String> tratamentosModelCombo;
    private boolean controlaKeyPressedPaciente;

    public TelaAgendamento(CadastroCliente conta, String nomeMedico, String especialidade) {
        initComponents();
        minhasConfiguracoes(conta, nomeMedico, especialidade);
        configuraAgendamento();
        configuraProblemasCombo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAgendamento = new javax.swing.JLabel();
        labelEscolhaMed = new javax.swing.JLabel();
        labelNomeDoutorAgendamento = new javax.swing.JLabel();
        labelEscolhaMed2 = new javax.swing.JLabel();
        labelEscolhaMed3 = new javax.swing.JLabel();
        labelEscolhaMed4 = new javax.swing.JLabel();
        labelEscolhaMed5 = new javax.swing.JLabel();
        labelEscolhaMed6 = new javax.swing.JLabel();
        txtNomeAgendamento = new javax.swing.JTextField();
        txtCpfAgendamento = new javax.swing.JTextField();
        txtTelefoneAgendamento = new javax.swing.JTextField();
        finalizarAgendamentoBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        horarioAgendamentoComboBox = new javax.swing.JComboBox<>();
        calendarioJCalendar = new com.toedter.calendar.JCalendar();
        labelEscolhaMed7 = new javax.swing.JLabel();
        problemaTratadoComboBox = new javax.swing.JComboBox<>();
        labelEspecialidadeDoutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelAgendamento.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        labelAgendamento.setForeground(new java.awt.Color(204, 0, 0));
        labelAgendamento.setText("Agendamento");

        labelEscolhaMed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed.setText("Agende seu horário com o doutor:");

        labelNomeDoutorAgendamento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelNomeDoutorAgendamento.setForeground(new java.awt.Color(204, 0, 0));
        labelNomeDoutorAgendamento.setText("label");
        labelNomeDoutorAgendamento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        labelEscolhaMed2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed2.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed2.setText("Nome do paciente:");

        labelEscolhaMed3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed3.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed3.setText("CPF do paciente:");

        labelEscolhaMed4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed4.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed4.setText("Telefone:");

        labelEscolhaMed5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed5.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed5.setText("Data Consulta:");

        labelEscolhaMed6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed6.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed6.setText("Tratamento:");

        txtNomeAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        txtCpfAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        txtCpfAgendamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCpfAgendamentoKeyReleased(evt);
            }
        });

        txtTelefoneAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        finalizarAgendamentoBtn.setBackground(new java.awt.Color(204, 0, 0));
        finalizarAgendamentoBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        finalizarAgendamentoBtn.setForeground(new java.awt.Color(255, 255, 255));
        finalizarAgendamentoBtn.setText("Finalizar Agendamento");
        finalizarAgendamentoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarAgendamentoBtnActionPerformed(evt);
            }
        });

        voltarBtn.setBackground(new java.awt.Color(204, 0, 0));
        voltarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        voltarBtn.setForeground(new java.awt.Color(255, 255, 255));
        voltarBtn.setText("Voltar");
        voltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarBtnActionPerformed(evt);
            }
        });

        horarioAgendamentoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        calendarioJCalendar.setMinSelectableDate(new java.util.Date(-62135755133000L));

        labelEscolhaMed7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed7.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed7.setText("Horário:");

        problemaTratadoComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        labelEspecialidadeDoutor.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelEspecialidadeDoutor.setForeground(new java.awt.Color(204, 0, 0));
        labelEspecialidadeDoutor.setText("label");
        labelEspecialidadeDoutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEscolhaMed3)
                            .addComponent(labelEscolhaMed2)
                            .addComponent(labelEscolhaMed4)
                            .addComponent(labelEscolhaMed5)
                            .addComponent(labelEscolhaMed6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNomeAgendamento)
                            .addComponent(txtCpfAgendamento)
                            .addComponent(txtTelefoneAgendamento)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(calendarioJCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                                .addComponent(labelEscolhaMed7)
                                .addGap(18, 18, 18)
                                .addComponent(horarioAgendamentoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(problemaTratadoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(finalizarAgendamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(labelEscolhaMed)
                .addGap(18, 18, 18)
                .addComponent(labelNomeDoutorAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEspecialidadeDoutor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelAgendamento)
                .addGap(401, 401, 401))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(labelAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscolhaMed)
                    .addComponent(labelNomeDoutorAgendamento)
                    .addComponent(labelEspecialidadeDoutor))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscolhaMed2)
                    .addComponent(txtNomeAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEscolhaMed3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCpfAgendamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEscolhaMed4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefoneAgendamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEscolhaMed5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(horarioAgendamentoComboBox)
                                .addComponent(labelEscolhaMed7, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(calendarioJCalendar, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscolhaMed6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(problemaTratadoComboBox))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(finalizarAgendamentoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minhasConfiguracoes(CadastroCliente conta, String nomeMedico, String especialidade) {
        this.controle = new DadosControle();
        this.conta = conta;
        this.nomeMedico = nomeMedico;
        this.especialidade = especialidade;
        this.horariosModelCombo = new DefaultComboBoxModel<>();
        this.tratamentosModelCombo = new DefaultComboBoxModel<>();
        this.controlaKeyPressedPaciente = false;

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        this.txtNomeAgendamento.setText(conta.getNome());
        this.txtCpfAgendamento.setText(conta.getCpf());
        this.txtTelefoneAgendamento.setText(conta.getTelefone());

        this.labelNomeDoutorAgendamento.setText(nomeMedico);
        this.labelEspecialidadeDoutor.setText("-  " + especialidade);
    }

    private void configuraAgendamento() {
        Calendar calendario = Calendar.getInstance();
        calendario.add(Calendar.DAY_OF_MONTH, 1);
        calendarioJCalendar.setMinSelectableDate(calendario.getTime());

        this.evaluator = new ConfigEvaluator();

        this.evaluator.setNomeMedico(this.labelNomeDoutorAgendamento.getText());
        this.calendarioJCalendar.getDayChooser().addDateEvaluator(this.evaluator);

        horarioAgendamentoComboBox.setEnabled(false);

        this.calendarioJCalendar.updateUI();

        MouseClickedCalendario(calendario, this.calendarioJCalendar);
    }

    private void configuraProblemasCombo() {
        ArrayList<String> tratamentosConsultados = controle.consultaProblemas(this.especialidade);

        this.tratamentosModelCombo.addAll(tratamentosConsultados);

        this.problemaTratadoComboBox.setModel(this.tratamentosModelCombo);
    }

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        this.setVisible(false);
    }

    private boolean verificaCamposVazios() {
        if (txtCpfAgendamento.getText().isEmpty() || txtTelefoneAgendamento.getText().isEmpty() || txtNomeAgendamento.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    public void AtualizaHorario() {
        this.horarioAgendamentoComboBox.setEnabled(true);

        ArrayList<LocalTime> horariosDisponiveis = this.controle.HorariosDisponiveis(this.nomeMedico, this.calendarioJCalendar.getDate());
        ArrayList<LocalTime> horasAgendadasPaciente = this.controle.horasAgendadasPaciente(this.calendarioJCalendar.getDate(), txtCpfAgendamento.getText());

        horariosDisponiveis.removeAll(horasAgendadasPaciente);

        this.horariosModelCombo.removeAllElements();
        this.horariosModelCombo.addAll(horariosDisponiveis);

        this.horarioAgendamentoComboBox.setModel(this.horariosModelCombo);
    }

    private void finalizarAgendamentoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarAgendamentoBtnActionPerformed
        if (verificaCamposVazios() == false || controle.verificaAgendamento(calendarioJCalendar.getDate(), horarioAgendamentoComboBox.getSelectedIndex(),
                problemaTratadoComboBox.getSelectedIndex()) == false) {
            JOptionPane.showMessageDialog(this, "Campos vazios ou erro nas informações.", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            Consulta consulta = new Consulta(this.conta.getNome(), this.txtNomeAgendamento.getText(), tratamentosModelCombo.getElementAt(problemaTratadoComboBox.getSelectedIndex()),
                    calendarioJCalendar.getDate(), horariosModelCombo.getElementAt(horarioAgendamentoComboBox.getSelectedIndex()), nomeMedico, txtCpfAgendamento.getText());

            this.controle.InsereAgendamento(consulta);

            JOptionPane.showMessageDialog(this, "Consulta agendada com sucesso.");
            JOptionPane.showMessageDialog(this, "Caso não compareça à consulta, estará sujeito à taxa de cobrança!");

            TelaVisualizaConsultas telavisualizaconsultas = new TelaVisualizaConsultas(this.conta);

            chamarNovoFrame(telavisualizaconsultas);
        }
    }//GEN-LAST:event_finalizarAgendamentoBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        TelaEscolhaMedico voltarTelaMedico = new TelaEscolhaMedico(conta);
        chamarNovoFrame(voltarTelaMedico);
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void txtCpfAgendamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCpfAgendamentoKeyReleased
        if (this.controlaKeyPressedPaciente && txtCpfAgendamento.getText().length() == 11) {
            AtualizaHorario();
        }
    }//GEN-LAST:event_txtCpfAgendamentoKeyReleased

    private void MouseClickedCalendario(Calendar calendario, JCalendar calendarioJCalendar) {
        calendarioJCalendar.getDayChooser().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if (txtCpfAgendamento.getText().length() == 11) {
                    AtualizaHorario();
                    controlaKeyPressedPaciente = true;
                } else {
                    JOptionPane.showMessageDialog(jPanel1, "Erro nos dados do paciente", "ERROR", JOptionPane.ERROR_MESSAGE);
                    horarioAgendamentoComboBox.setEnabled(false);
                }
            }
        });
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAgendamento(conta, nomeMedico, especialidade).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JCalendar calendarioJCalendar;
    private javax.swing.JButton finalizarAgendamentoBtn;
    private javax.swing.JComboBox<LocalTime> horarioAgendamentoComboBox;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAgendamento;
    private javax.swing.JLabel labelEscolhaMed;
    private javax.swing.JLabel labelEscolhaMed2;
    private javax.swing.JLabel labelEscolhaMed3;
    private javax.swing.JLabel labelEscolhaMed4;
    private javax.swing.JLabel labelEscolhaMed5;
    private javax.swing.JLabel labelEscolhaMed6;
    private javax.swing.JLabel labelEscolhaMed7;
    private javax.swing.JLabel labelEspecialidadeDoutor;
    private javax.swing.JLabel labelNomeDoutorAgendamento;
    private javax.swing.JComboBox<String> problemaTratadoComboBox;
    private javax.swing.JTextField txtCpfAgendamento;
    private javax.swing.JTextField txtNomeAgendamento;
    private javax.swing.JTextField txtTelefoneAgendamento;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
