package view;

import control.DadosControle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaAtualizaSenha extends javax.swing.JFrame {

    private DadosControle controle;
    private boolean controladorNovaSenha;
    private boolean controladorConfirmarSenha;
    private static String cpf;

    public TelaAtualizaSenha(String cpf) {
        initComponents();
        minhasConfiguracoes(cpf);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelAtualizaSenha = new javax.swing.JLabel();
        labelNovaSenha = new javax.swing.JLabel();
        labelConfirmarSenha = new javax.swing.JLabel();
        novaSenhaPasswordField = new javax.swing.JPasswordField();
        olhinhoConfirmarSenhaLabel = new javax.swing.JLabel();
        olhinhoNovaSenhaLabel = new javax.swing.JLabel();
        salvarBtn = new javax.swing.JButton();
        confirmarSenhaPasswordField = new javax.swing.JPasswordField();
        logoutBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelAtualizaSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelAtualizaSenha.setForeground(new java.awt.Color(204, 0, 0));
        labelAtualizaSenha.setText("Informe a nova senha:");

        labelNovaSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelNovaSenha.setText("Nova Senha:");

        labelConfirmarSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelConfirmarSenha.setText("Confirmar Senha:");

        novaSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        novaSenhaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        olhinhoConfirmarSenhaLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        olhinhoConfirmarSenhaLabel.setForeground(new java.awt.Color(204, 0, 51));
        olhinhoConfirmarSenhaLabel.setText("Ø");
        olhinhoConfirmarSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                olhinhoConfirmarSenhaLabelMousePressed(evt);
            }
        });

        olhinhoNovaSenhaLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        olhinhoNovaSenhaLabel.setForeground(new java.awt.Color(204, 0, 51));
        olhinhoNovaSenhaLabel.setText("Ø");
        olhinhoNovaSenhaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                olhinhoNovaSenhaLabelMousePressed(evt);
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

        confirmarSenhaPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmarSenhaPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirmarSenhaPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmarSenhaPasswordFieldKeyPressed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(204, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Voltar");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("* min 5  -  max 20");

        jLabel2.setText("* min 5  -  max 20");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(473, 473, 473)
                .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(409, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAtualizaSenha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(novaSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(olhinhoNovaSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelNovaSenha)
                            .addComponent(labelConfirmarSenha)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmarSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(olhinhoConfirmarSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(393, 393, 393))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(labelAtualizaSenha)
                .addGap(119, 119, 119)
                .addComponent(labelNovaSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olhinhoNovaSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelConfirmarSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(olhinhoConfirmarSenhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmarSenhaPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(59, 59, 59)
                .addComponent(salvarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void minhasConfiguracoes(String cpf) {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        this.cpf = cpf;
        this.controladorConfirmarSenha = true;
        this.controladorNovaSenha = true;
        this.controle = new DadosControle();
    }

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        this.setVisible(false);
    }

    private boolean verificaCamposVazios(String novaSenha, String confirmarNovaSenha) {
        if (novaSenha.isEmpty() || confirmarNovaSenha.isEmpty()) {
            return false;
        }
        return true;
    }

    private void olhinhoConfirmarSenhaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olhinhoConfirmarSenhaLabelMousePressed
        if (controladorConfirmarSenha) {
            olhinhoConfirmarSenhaLabel.setText("O");
            confirmarSenhaPasswordField.setEchoChar((char) 0);
            controladorConfirmarSenha = false;
        } else {
            olhinhoConfirmarSenhaLabel.setText("Ø");
            confirmarSenhaPasswordField.setEchoChar('•');
            controladorConfirmarSenha = true;
        }
    }//GEN-LAST:event_olhinhoConfirmarSenhaLabelMousePressed

    private void olhinhoNovaSenhaLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olhinhoNovaSenhaLabelMousePressed
        if (controladorNovaSenha) {
            olhinhoNovaSenhaLabel.setText("O");
            novaSenhaPasswordField.setEchoChar((char) 0);
            controladorNovaSenha = false;
        } else {
            olhinhoNovaSenhaLabel.setText("Ø");
            novaSenhaPasswordField.setEchoChar('•');
            controladorNovaSenha = true;
        }
    }//GEN-LAST:event_olhinhoNovaSenhaLabelMousePressed

    private void salvarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarBtnActionPerformed
        String novaSenhaStr = String.valueOf(novaSenhaPasswordField.getPassword());
        String confirmarSenhaStr = String.valueOf(confirmarSenhaPasswordField.getPassword());

        if (verificaCamposVazios(novaSenhaStr, confirmarSenhaStr)) {
            boolean resultado = this.controle.atualizaSenha(novaSenhaStr, confirmarSenhaStr, cpf);

            if (resultado) {
                JOptionPane.showMessageDialog(this, "Senha alterada com sucesso");

                TelaInicial salvarTelainicial = new TelaInicial();
                chamarNovoFrame(salvarTelainicial);

            } else {
                JOptionPane.showMessageDialog(this, "Erro ao atualizar a senha. Verifique se as senhas são iguais e respeitam o limite (min 5 / max 20)", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Campos vazios.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_salvarBtnActionPerformed

    private void confirmarSenhaPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmarSenhaPasswordFieldKeyPressed
        if (evt.getKeyChar() == '\n') {
            salvarBtn.doClick();
        }
    }//GEN-LAST:event_confirmarSenhaPasswordFieldKeyPressed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        TelaInicial telaInicial = new TelaInicial();
        chamarNovoFrame(telaInicial);
    }//GEN-LAST:event_logoutBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizaSenha(cpf).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmarSenhaPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAtualizaSenha;
    private javax.swing.JLabel labelConfirmarSenha;
    private javax.swing.JLabel labelNovaSenha;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField novaSenhaPasswordField;
    private javax.swing.JLabel olhinhoConfirmarSenhaLabel;
    private javax.swing.JLabel olhinhoNovaSenhaLabel;
    private javax.swing.JButton salvarBtn;
    // End of variables declaration//GEN-END:variables
}
