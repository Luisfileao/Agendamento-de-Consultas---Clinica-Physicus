package view;

import control.DadosControle;
import model.CadastroCliente;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TelaCadastro extends javax.swing.JFrame {

    private boolean controladorsenha;
    private DadosControle controle;

    public TelaCadastro() {
        initComponents();
        minhasConfiguracoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelCadastro = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        confirmarBtn = new javax.swing.JButton();
        labelEscolhaMed6 = new javax.swing.JLabel();
        labelEscolhaMed7 = new javax.swing.JLabel();
        labelEscolhaMed8 = new javax.swing.JLabel();
        labelEscolhaMed9 = new javax.swing.JLabel();
        labelEscolhaMed10 = new javax.swing.JLabel();
        olhinhoCadastroLabel = new javax.swing.JLabel();
        senhaCadastroPasswordField = new javax.swing.JPasswordField();
        voltarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelCadastro.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        labelCadastro.setForeground(new java.awt.Color(204, 0, 0));
        labelCadastro.setText("Cadastro");

        txtCpf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtNome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtTelefone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        confirmarBtn.setBackground(new java.awt.Color(204, 0, 0));
        confirmarBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmarBtn.setForeground(new java.awt.Color(255, 255, 255));
        confirmarBtn.setText("Confirmar");
        confirmarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarBtnActionPerformed(evt);
            }
        });

        labelEscolhaMed6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed6.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed6.setText("CPF:");

        labelEscolhaMed7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed7.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed7.setText("Nome:");

        labelEscolhaMed8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed8.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed8.setText("E-mail:");

        labelEscolhaMed9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed9.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed9.setText("Senha:");

        labelEscolhaMed10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed10.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed10.setText("Telefone:");

        olhinhoCadastroLabel.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        olhinhoCadastroLabel.setForeground(new java.awt.Color(204, 0, 51));
        olhinhoCadastroLabel.setText("Ø");
        olhinhoCadastroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                olhinhoCadastroLabelMousePressed(evt);
            }
        });

        senhaCadastroPasswordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaCadastroPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        senhaCadastroPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaCadastroPasswordFieldKeyPressed(evt);
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

        jLabel1.setText("* min 5  -  max 20");

        jLabel2.setText("Ignorar a pontuação");

        jLabel3.setText("Seguir forma padrão de gmail e yahoo");

        jLabel4.setText("Ignorar DDD e pontuação");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(confirmarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(455, 455, 455))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelCadastro)
                .addGap(430, 430, 430))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEscolhaMed6)
                    .addComponent(labelEscolhaMed7)
                    .addComponent(labelEscolhaMed8)
                    .addComponent(labelEscolhaMed9)
                    .addComponent(labelEscolhaMed10))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(senhaCadastroPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(olhinhoCadastroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(labelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                            .addComponent(labelEscolhaMed6))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelEscolhaMed7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addComponent(labelEscolhaMed8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(labelEscolhaMed10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEscolhaMed9)
                    .addComponent(olhinhoCadastroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaCadastroPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addComponent(confirmarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(voltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
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

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        this.setVisible(false);
    }

    private void minhasConfiguracoes() {
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        controladorsenha = true;
        this.controle = new DadosControle();
    }

    private boolean verificaCamposVazios() {
        if (txtCpf.getText().isEmpty() || txtEmail.getText().isEmpty() || txtNome.getText().isEmpty() || txtTelefone.getText().isEmpty()) {
            return false;
        }
        return true;
    }

    private void confirmarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarBtnActionPerformed
        int indiceArroba = txtEmail.getText().indexOf('@');
        String formaEmailSubstring = null;

        if (indiceArroba != -1) {
            formaEmailSubstring = txtEmail.getText().substring(indiceArroba);            
        }

        if (indiceArroba != -1 && (formaEmailSubstring.equals("@gmail.com") || formaEmailSubstring.equals("@yahoo.com"))) {
            if (verificaCamposVazios() == false) {
                JOptionPane.showMessageDialog(this, "Campos vazios.", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                CadastroCliente dados = new CadastroCliente();
                dados.setCpf(txtCpf.getText());
                dados.setEmail(txtEmail.getText());
                dados.setSenha(String.valueOf(senhaCadastroPasswordField.getPassword()));
                dados.setNome(txtNome.getText());
                dados.setTelefone(txtTelefone.getText());

                boolean controladorRegistraCliente = this.controle.cadastrarCliente(dados);

                if (controladorRegistraCliente) {
                    JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso.");

                    TelaInicial telainicial = new TelaInicial();
                    chamarNovoFrame(telainicial);

                } else if (controladorRegistraCliente == false) {
                    JOptionPane.showMessageDialog(this, "Erro! Confira suas informações.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "Email fora da forma @gmail.com ou @yahoo.com", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmarBtnActionPerformed

    private void olhinhoCadastroLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olhinhoCadastroLabelMousePressed

        if (controladorsenha) {
            olhinhoCadastroLabel.setText("O");
            senhaCadastroPasswordField.setEchoChar((char) 0);
            controladorsenha = false;
        } else {
            olhinhoCadastroLabel.setText("Ø");
            senhaCadastroPasswordField.setEchoChar('•');
            controladorsenha = true;
        }
    }//GEN-LAST:event_olhinhoCadastroLabelMousePressed

    private void senhaCadastroPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaCadastroPasswordFieldKeyPressed
        if (evt.getKeyChar() == '\n') {
            confirmarBtn.doClick();
        }
    }//GEN-LAST:event_senhaCadastroPasswordFieldKeyPressed

    private void voltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarBtnActionPerformed
        TelaInicial voltarTelaInicial = new TelaInicial();

        chamarNovoFrame(voltarTelaInicial);
    }//GEN-LAST:event_voltarBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCadastro;
    private javax.swing.JLabel labelEscolhaMed10;
    private javax.swing.JLabel labelEscolhaMed6;
    private javax.swing.JLabel labelEscolhaMed7;
    private javax.swing.JLabel labelEscolhaMed8;
    private javax.swing.JLabel labelEscolhaMed9;
    private javax.swing.JLabel olhinhoCadastroLabel;
    private javax.swing.JPasswordField senhaCadastroPasswordField;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JButton voltarBtn;
    // End of variables declaration//GEN-END:variables
}
