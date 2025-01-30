package view;

import control.DadosControle;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.CadastroCliente;
import model.Consulta;

public class TelaVisualizaConsultas extends javax.swing.JFrame {

    private static CadastroCliente conta;
    private DadosControle controle;
    private DefaultListModel<String> consultasMarcadasModel;
    private ArrayList<Consulta> consultasMarcadasArray;
    private ArrayList<String> consultarMarcadasString;
    private SimpleDateFormat formater;

    public TelaVisualizaConsultas(CadastroCliente conta) {
        initComponents();

        minhasConfiguracoes(conta);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultasMarcadasList = new javax.swing.JList<>();
        desmarcarConsultaBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalhesConsultaTextArea = new javax.swing.JTextArea();
        labelEscolhaMed = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelConsulta.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        labelConsulta.setForeground(new java.awt.Color(204, 0, 0));
        labelConsulta.setText("Consultas Marcadas");

        consultasMarcadasList.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        consultasMarcadasList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        consultasMarcadasList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultasMarcadasList.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(consultasMarcadasList);

        desmarcarConsultaBtn.setBackground(new java.awt.Color(204, 0, 0));
        desmarcarConsultaBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        desmarcarConsultaBtn.setForeground(new java.awt.Color(255, 255, 255));
        desmarcarConsultaBtn.setText("Desmarcar Consulta");
        desmarcarConsultaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desmarcarConsultaBtnActionPerformed(evt);
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

        detalhesConsultaTextArea.setColumns(20);
        detalhesConsultaTextArea.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        detalhesConsultaTextArea.setRows(5);
        jScrollPane2.setViewportView(detalhesConsultaTextArea);

        labelEscolhaMed.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelEscolhaMed.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed.setText("Detalhes da Consulta:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(354, 354, 354)
                        .addComponent(labelConsulta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelEscolhaMed)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(desmarcarConsultaBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(labelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(desmarcarConsultaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEscolhaMed)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
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

    private void minhasConfiguracoes(CadastroCliente conta) {
        this.controle = new DadosControle();
        this.conta = conta;
        this.consultasMarcadasModel = new DefaultListModel<>();
        consultarMarcadasString = new ArrayList<>();

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        identificarIndiceSelecionado();

        this.formater = new SimpleDateFormat("dd/MM/yyyy");

        detalhesConsultaTextArea.setEditable(false);

        configuraListConsultas();
    }

    private void configuraListConsultas() {
        this.consultasMarcadasArray = this.controle.ProcuraConsultasResponsavel(this.conta.getNome());

        LocalDateTime dataHoraHoje = LocalDateTime.now();

        String nomePacienteList;
        String dataConsultaList;
        String nomeMedicoList;

        for (int i = 0; i < this.consultasMarcadasArray.size(); i++) {
            nomePacienteList = this.consultasMarcadasArray.get(i).getNomePaciente();
            dataConsultaList = this.formater.format(this.consultasMarcadasArray.get(i).getDataConsulta());
            nomeMedicoList = this.consultasMarcadasArray.get(i).getNomeMedico();

            String temp = nomePacienteList + "  /  " + dataConsultaList + "  /  " + nomeMedicoList;

            LocalDate dataConsulta = this.consultasMarcadasArray.get(i).getDataConsulta().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalTime horaConsulta = this.consultasMarcadasArray.get(i).getHorarioConsulta();

            LocalDateTime dataHoraConsulta = LocalDateTime.of(dataConsulta, horaConsulta);

            if (dataHoraConsulta.isBefore(dataHoraHoje)) {
                String invalido = "Expirada";
                temp = temp + "  /  " + invalido;
            } else {
                String valida = "Válida";
                temp = temp + "  /  " + valida;
            }

            this.consultarMarcadasString.add(temp);
        }

        this.consultasMarcadasModel.addAll(consultarMarcadasString);

        this.consultasMarcadasList.setModel(this.consultasMarcadasModel);

    }

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        this.setVisible(false);
    }

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        TelaEscolhaMedico tela = new TelaEscolhaMedico(conta);
        chamarNovoFrame(tela);
    }//GEN-LAST:event_voltarBtnActionPerformed


    private void desmarcarConsultaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desmarcarConsultaBtnActionPerformed

        if (this.consultasMarcadasList.getSelectedIndex() != -1) {
            this.controle.DesmarcarConsulta(this.consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getDataConsulta(),
                    this.consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getHorarioConsulta(),
                    this.consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getNomePaciente(),
                    this.consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getNomeMedico());

            this.consultasMarcadasArray.remove(this.consultasMarcadasList.getSelectedIndex());
            this.consultasMarcadasModel.remove(this.consultasMarcadasList.getSelectedIndex());

            JOptionPane.showMessageDialog(this, "Consulta desmarcada com sucesso!");

            detalhesConsultaTextArea.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma consulta para desmarcar", "ERROR", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_desmarcarConsultaBtnActionPerformed

    private void identificarIndiceSelecionado() {
        consultasMarcadasList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting() && consultasMarcadasList.getSelectedIndex() != -1) {

                    String nomePacienteList = consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getNomePaciente();
                    String problemaTratadoList = consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getProblemaTratado();
                    String dataConsultaList = formater.format(consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getDataConsulta());
                    String horarioList = consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getHorarioConsulta() + "";
                    String nomeMedicoList = consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getNomeMedico();
                    String cpfPacienteList = consultasMarcadasArray.get(consultasMarcadasList.getSelectedIndex()).getCpfPaciente();

                    String temp = "Paciente: " + nomePacienteList + "\n"
                            + "CPF: " + cpfPacienteList + "\n"
                            + "Problema: " + problemaTratadoList + "\n"
                            + "Data: " + dataConsultaList + "\n"
                            + "Horário: " + horarioList + "\n"
                            + "Médico: " + nomeMedicoList;

                    detalhesConsultaTextArea.setText(temp);

                    String infosInterfaceConsulta = consultarMarcadasString.get(consultasMarcadasList.getSelectedIndex());
                    String verificaValidadeConsulta = infosInterfaceConsulta.substring(infosInterfaceConsulta.length() - 6);

                    if (verificaValidadeConsulta.equalsIgnoreCase("Válida")) {
                        consultasMarcadasList.setSelectionBackground(Color.GREEN);
                        desmarcarConsultaBtn.setEnabled(true);
                    } else {
                        consultasMarcadasList.setSelectionBackground(Color.RED);
                        desmarcarConsultaBtn.setEnabled(false);
                    }

                }
            }
        });
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVisualizaConsultas(conta).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> consultasMarcadasList;
    private javax.swing.JButton desmarcarConsultaBtn;
    private javax.swing.JTextArea detalhesConsultaTextArea;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelConsulta;
    private javax.swing.JLabel labelEscolhaMed;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
