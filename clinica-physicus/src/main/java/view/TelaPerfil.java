package view;

import control.DadosControle;
import model.CadastroCliente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TelaPerfil extends javax.swing.JFrame {

    private boolean controladorsenha;
    private static CadastroCliente conta;
    private boolean controladorEditarBtn;
    private DadosControle controle;

    public TelaPerfil(CadastroCliente conta) {
        initComponents();
        minhasConfiguracoes(conta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCadastro = new javax.swing.JLabel();
        labelEscolhaMed6 = new javax.swing.JLabel();
        cpfTxt = new javax.swing.JTextField();
        labelEscolhaMed7 = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        labelEscolhaMed8 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        labelEscolhaMed10 = new javax.swing.JLabel();
        telefoneTxt = new javax.swing.JTextField();
        labelEscolhaMed9 = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        olhinhoCadastroLabel = new javax.swing.JLabel();
        editarDadosBtn = new javax.swing.JButton();
        voltarBtn = new javax.swing.JButton();
        salvarBtn = new javax.swing.JButton();
        maxminLabel = new javax.swing.JLabel();
        infoFormaEmailLabel = new javax.swing.JLabel();
        infoFormaTelefoneLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelCadastro.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(204, 0, 0));
        labelCadastro.setText("Seus dados:");

        labelEscolhaMed6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed6.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed6.setText("CPF:");

        cpfTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelEscolhaMed7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed7.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed7.setText("Nome:");

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelEscolhaMed8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed8.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed8.setText("E-mail:");

        emailTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelEscolhaMed10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed10.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed10.setText("Telefone:");

        telefoneTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefoneTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        labelEscolhaMed9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed9.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed9.setText("Senha:");

        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaPasswordFieldKeyPressed(evt);
            }
        });

        olhinhoCadastroLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        olhinhoCadastroLabel.setForeground(new java.awt.Color(204, 0, 51));
        olhinhoCadastroLabel.setText("Ø");
        olhinhoCadastroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                olhinhoCadastroLabelMousePressed(evt);
            }
        });

        editarDadosBtn.setBackground(new java.awt.Color(204, 0, 0));
        editarDadosBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        editarDadosBtn.setForeground(new java.awt.Color(255, 255, 255));
        editarDadosBtn.setText("Editar dados");
        editarDadosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarDadosBtnActionPerformed(evt);
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

        salvarBtn.setBackground(new java.awt.Color(204, 0, 0));
        salvarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        salvarBtn.setForeground(new java.awt.Color(255, 255, 255));
        salvarBtn.setText("Salvar");
        salvarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarBtnActionPerformed(evt);
            }
        });

        maxminLabel.setText("* min 5  -  max 20");

        infoFormaEmailLabel.setText("Seguir forma padrão de gmail e yahoo");

        infoFormaTelefoneLabel.setText("Ignorar DDD e pontuação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(labelCadastro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelEscolhaMed6)
                            .addComponent(labelEscolhaMed7)
                            .addComponent(labelEscolhaMed8)
                            .addComponent(labelEscolhaMed9)
                            .addComponent(labelEscolhaMed10))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoFormaEmailLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(telefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(infoFormaTelefoneLabel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(olhinhoCadastroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(maxminLabel))))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editarDadosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(440, 440, 440))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cpfTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelEscolhaMed6))
                                        .addGap(18, 18, 18)
                                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelEscolhaMed7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(infoFormaEmailLabel)))
                            .addComponent(labelEscolhaMed8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoFormaTelefoneLabel)))
                    .addComponent(labelEscolhaMed10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscolhaMed9)
                    .addComponent(olhinhoCadastroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxminLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(editarDadosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
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
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        maxminLabel.setVisible(false);
        infoFormaEmailLabel.setVisible(false);
        infoFormaTelefoneLabel.setVisible(false);

        controle = new DadosControle();

        cpfTxt.setEditable(false);
        nomeTxt.setEditable(false);
        emailTxt.setEditable(false);
        telefoneTxt.setEditable(false);
        senhaPasswordField.setEditable(false);

        this.controladorsenha = true;
        this.controladorEditarBtn = false;

        this.conta = conta;

        cpfTxt.setText(conta.getCpf());
        nomeTxt.setText(conta.getNome());
        emailTxt.setText(conta.getEmail());
        telefoneTxt.setText(conta.getTelefone());
        senhaPasswordField.setText(conta.getSenha());
    }

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        this.setVisible(false);
    }

    private boolean verificaCamposVazios() {
        if (emailTxt.getText().isEmpty() || telefoneTxt.getText().isEmpty() || String.valueOf(senhaPasswordField.getPassword()).isEmpty()) {
            return false;
        }
        return true;
    }

    private void senhaPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaPasswordFieldKeyPressed
        if (evt.getKeyChar() == '\n') {
            editarDadosBtn.doClick();
        }
    }//GEN-LAST:event_senhaPasswordFieldKeyPressed

    private void olhinhoCadastroLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olhinhoCadastroLabelMousePressed
        if (controladorsenha) {
            olhinhoCadastroLabel.setText("O");
            senhaPasswordField.setEchoChar((char) 0);
            controladorsenha = false;
        } else {
            olhinhoCadastroLabel.setText("Ø");
            senhaPasswordField.setEchoChar('•');
            controladorsenha = true;
        }
    }//GEN-LAST:event_olhinhoCadastroLabelMousePressed

    private void editarDadosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarDadosBtnActionPerformed
        if (controladorEditarBtn == false) {
            maxminLabel.setVisible(true);
            infoFormaEmailLabel.setVisible(true);
            infoFormaTelefoneLabel.setVisible(true);

            emailTxt.setEditable(true);
            telefoneTxt.setEditable(true);
            senhaPasswordField.setEditable(true);

            controladorEditarBtn = true;
        } else {
            maxminLabel.setVisible(false);
            infoFormaEmailLabel.setVisible(false);
            infoFormaTelefoneLabel.setVisible(false);

            emailTxt.setEditable(false);
            telefoneTxt.setEditable(false);
            senhaPasswordField.setEditable(false);

            controladorEditarBtn = false;
        }
    }//GEN-LAST:event_editarDadosBtnActionPerformed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        TelaEscolhaMedico voltarTelaEscolhaMedico = new TelaEscolhaMedico(conta);

        chamarNovoFrame(voltarTelaEscolhaMedico);
    }//GEN-LAST:event_voltarBtnActionPerformed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        int indiceArroba = this.emailTxt.getText().indexOf('@');
        String formaEmailSubstring = null;

        if (indiceArroba != -1) {
            formaEmailSubstring = this.emailTxt.getText().substring(indiceArroba);
        }

        if (indiceArroba != -1 && (formaEmailSubstring.equals("@gmail.com") || formaEmailSubstring.equals("@yahoo.com"))) {
            if (verificaCamposVazios() == false) {
                JOptionPane.showMessageDialog(this, "Campos vazios.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                CadastroCliente dados = new CadastroCliente();
                dados.setEmail(emailTxt.getText());
                dados.setSenha(String.valueOf(senhaPasswordField.getPassword()));
                dados.setTelefone(telefoneTxt.getText());
                dados.setCpf(this.conta.getCpf());

                boolean controladorAtualizaPerfil = this.controle.atualizaCadastro(dados);

                if (controladorAtualizaPerfil) {
                    JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso.");

                    conta = this.controle.consultaNovosDados(this.conta.getCpf());

                    TelaEscolhaMedico telaescolhamedico = new TelaEscolhaMedico(conta);
                    chamarNovoFrame(telaescolhamedico);

                } else {
                    JOptionPane.showMessageDialog(this, "Erro! Confira suas informações.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Email fora da forma padrão @gmail.com ou @yahoo.com", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfil(conta).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfTxt;
    private javax.swing.JButton editarDadosBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel infoFormaEmailLabel;
    private javax.swing.JLabel infoFormaTelefoneLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelEscolhaMed10;
    private javax.swing.JLabel labelEscolhaMed6;
    private javax.swing.JLabel labelEscolhaMed7;
    private javax.swing.JLabel labelEscolhaMed8;
    private javax.swing.JLabel labelEscolhaMed9;
    private javax.swing.JLabel maxminLabel;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JLabel olhinhoCadastroLabel;
    private javax.swing.JButton salvarBtn;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField telefoneTxt;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
