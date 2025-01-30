package view;

import control.DadosControle;
import model.CadastroCliente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

    private boolean controladorsenha;
    private DadosControle controle;

    public TelaInicial() {
        initComponents();
        minhasConfiguracoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelLogo = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        txtUsuarioLogin = new javax.swing.JTextField();
        acessarBtn = new javax.swing.JButton();
        cadastrarBtn = new javax.swing.JButton();
        labelLogin1 = new javax.swing.JLabel();
        labelLogin2 = new javax.swing.JLabel();
        senhaPasswordField = new javax.swing.JPasswordField();
        olhinhoLabel = new javax.swing.JLabel();
        esqueceuSenhaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelLogo.setFont(new java.awt.Font("Consolas", 0, 62)); // NOI18N
        labelLogo.setForeground(new java.awt.Color(204, 0, 0));
        labelLogo.setText("Clínica Physicus");

        labelLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelLogin.setText("Login");

        txtUsuarioLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtUsuarioLogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        acessarBtn.setBackground(new java.awt.Color(204, 0, 0));
        acessarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        acessarBtn.setForeground(new java.awt.Color(255, 255, 255));
        acessarBtn.setText("Acessar");
        acessarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessarBtnActionPerformed(evt);
            }
        });

        cadastrarBtn.setBackground(new java.awt.Color(204, 0, 0));
        cadastrarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cadastrarBtn.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBtn.setText("Cadastrar-se");
        cadastrarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBtnActionPerformed(evt);
            }
        });

        labelLogin1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelLogin1.setText("Usuário ou E-mail:");

        labelLogin2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelLogin2.setText("Senha:");

        senhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaPasswordFieldKeyPressed(evt);
            }
        });

        olhinhoLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        olhinhoLabel.setForeground(new java.awt.Color(204, 0, 51));
        olhinhoLabel.setText("Ø");
        olhinhoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                olhinhoLabelMousePressed(evt);
            }
        });

        esqueceuSenhaLabel.setForeground(new java.awt.Color(255, 0, 102));
        esqueceuSenhaLabel.setText("Esqueceu a senha?");
        esqueceuSenhaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        esqueceuSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                esqueceuSenhaLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelLogin1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(labelLogin)))
                            .addGap(416, 416, 416))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(acessarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cadastrarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(481, 481, 481)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelLogin2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(esqueceuSenhaLabel)
                                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(olhinhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(333, 333, 333))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(labelLogo)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(labelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelLogin)
                .addGap(50, 50, 50)
                .addComponent(labelLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuarioLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelLogin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olhinhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(esqueceuSenhaLabel)
                .addGap(43, 43, 43)
                .addComponent(acessarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(cadastrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
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

    private void minhasConfiguracoes() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.setLocationRelativeTo(null);
        senhaPasswordField.setEchoChar('•');
        controladorsenha = true;
        this.controle = new DadosControle();
    }

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        this.setVisible(false);
    }

    private void cadastrarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBtnActionPerformed
        TelaCadastro telacadastro = new TelaCadastro();
        chamarNovoFrame(telacadastro);
    }//GEN-LAST:event_cadastrarBtnActionPerformed

    private void acessarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessarBtnActionPerformed
        CadastroCliente cadastroConsulta = new CadastroCliente();

        cadastroConsulta.setEmail(txtUsuarioLogin.getText());
        cadastroConsulta.setSenha(String.valueOf(senhaPasswordField.getPassword()));

        CadastroCliente retornoVerificacao = this.controle.verificacaoDados(cadastroConsulta);

        if (retornoVerificacao != null) {
            TelaEscolhaMedico telaescolhamedico = new TelaEscolhaMedico(retornoVerificacao);

            chamarNovoFrame(telaescolhamedico);

        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorretos.", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtUsuarioLogin.setText("");
            senhaPasswordField.setText("");
        }
    }//GEN-LAST:event_acessarBtnActionPerformed

    private void olhinhoLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olhinhoLabelMousePressed
        if (controladorsenha) {
            olhinhoLabel.setText("O");
            senhaPasswordField.setEchoChar((char) 0);
            controladorsenha = false;
        } else {
            olhinhoLabel.setText("Ø");
            senhaPasswordField.setEchoChar('•');
            controladorsenha = true;
        }
    }//GEN-LAST:event_olhinhoLabelMousePressed

    private void senhaPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaPasswordFieldKeyPressed
        if (evt.getKeyChar() == '\n') {
            acessarBtn.doClick();
        }
    }//GEN-LAST:event_senhaPasswordFieldKeyPressed

    private void esqueceuSenhaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_esqueceuSenhaLabelMouseClicked
        String cpf = JOptionPane.showInputDialog(this, "Informe seu CPF para prosseguir");

        if (this.controle.esqueceuSenha(cpf)) {
            TelaAtualizaSenha telaAtualizaSenha = new TelaAtualizaSenha(cpf);
            chamarNovoFrame(telaAtualizaSenha);
        } else {
            JOptionPane.showMessageDialog(this, "CPF incorreto ou inexistente!", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_esqueceuSenhaLabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessarBtn;
    private javax.swing.JButton cadastrarBtn;
    private javax.swing.JLabel esqueceuSenhaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelLogin1;
    private javax.swing.JLabel labelLogin2;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel olhinhoLabel;
    private javax.swing.JPasswordField senhaPasswordField;
    private javax.swing.JTextField txtUsuarioLogin;
    // End of variables declaration//GEN-END:variables
}
