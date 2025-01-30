package view;

import java.awt.Cursor;
import model.CadastroCliente;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class TelaEscolhaMedico extends javax.swing.JFrame {

    private static int contadorInfo = 0;
    private static CadastroCliente conta;

    public TelaEscolhaMedico(CadastroCliente conta) {
        initComponents();
        minhasConfiguracoes(conta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelDoutor1 = new javax.swing.JLabel();
        labelDoutor2 = new javax.swing.JLabel();
        labelDoutor3 = new javax.swing.JLabel();
        labelEmail1 = new javax.swing.JLabel();
        labelEmail2 = new javax.swing.JLabel();
        labelEmail3 = new javax.swing.JLabel();
        labelFormacao1 = new javax.swing.JLabel();
        labelFormacao2 = new javax.swing.JLabel();
        labelFormacao3 = new javax.swing.JLabel();
        labelEspecializacao2 = new javax.swing.JLabel();
        labelEspecializacao1 = new javax.swing.JLabel();
        labelEspecializacao3 = new javax.swing.JLabel();
        infoClinicaLabel = new javax.swing.JLabel();
        infoClinicaPanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        labelEscolhaMed = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        imagem2Label = new javax.swing.JLabel();
        imagem3Label = new javax.swing.JLabel();
        imagem1Label = new javax.swing.JLabel();
        perfilPanelBack = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        perfilLabel = new javax.swing.JLabel();
        iconePerfilLabel = new javax.swing.JLabel();
        consultasBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelDoutor1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDoutor1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDoutor1.setText("Doutor: Marcos Sandoval");

        labelDoutor2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDoutor2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDoutor2.setText("Doutor: Marco Antônio Salum");

        labelDoutor3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelDoutor3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDoutor3.setText("Doutor: Márcio Beltrão");

        labelEmail1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEmail1.setText("Email: drmarcos@gmail.com");

        labelEmail2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEmail2.setText("Email: drmarco@gmail.com");

        labelEmail3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEmail3.setText("Email: drmarcio@gmail.com");

        labelFormacao1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelFormacao1.setText("Formação: Fisioterapia");

        labelFormacao2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelFormacao2.setText("Formação: Fisioterapia");

        labelFormacao3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelFormacao3.setText("Formação: Fisioterapia");

        labelEspecializacao2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEspecializacao2.setText("Especialização: Esportivo");

        labelEspecializacao1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEspecializacao1.setText("Especialização: Cardiovascular");

        labelEspecializacao3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        labelEspecializacao3.setText("Especialização: Quiropraxia");

        infoClinicaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        infoClinicaLabel.setForeground(new java.awt.Color(204, 0, 0));
        infoClinicaLabel.setText("Informações da Clínica ↓ ");
        infoClinicaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoClinicaLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                infoClinicaLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                infoClinicaLabelMouseExited(evt);
            }
        });

        infoClinicaPanel.setBackground(new java.awt.Color(153, 153, 153));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Cidade: Ouro Branco");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Bairro: Pioneiros");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Rua: Rua D'agua");

        jLabel23.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Número do edifício: 1903");

        jLabel24.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Número de telefone: (31) 93167-5537");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Ponto de referência: em frente ao parque de exposições");

        javax.swing.GroupLayout infoClinicaPanelLayout = new javax.swing.GroupLayout(infoClinicaPanel);
        infoClinicaPanel.setLayout(infoClinicaPanelLayout);
        infoClinicaPanelLayout.setHorizontalGroup(
            infoClinicaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoClinicaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoClinicaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        infoClinicaPanelLayout.setVerticalGroup(
            infoClinicaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoClinicaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        labelEscolhaMed.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelEscolhaMed.setForeground(new java.awt.Color(204, 0, 0));
        labelEscolhaMed.setText("Clique na foto do profissional desejado:");

        logoutBtn.setBackground(new java.awt.Color(204, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("LogOut");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        imagem2Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem2LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagem2LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagem2LabelMouseExited(evt);
            }
        });

        imagem3Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem3LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagem3LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagem3LabelMouseExited(evt);
            }
        });

        imagem1Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagem1LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagem1LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagem1LabelMouseExited(evt);
            }
        });

        perfilPanelBack.setBackground(new java.awt.Color(255, 255, 255));
        perfilPanelBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                perfilPanelBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                perfilPanelBackMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        perfilLabel.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        perfilLabel.setForeground(new java.awt.Color(204, 0, 0));
        perfilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        perfilLabel.setText("Perfil");
        perfilLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(perfilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(perfilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        iconePerfilLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconePerfilLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iconePerfilLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iconePerfilLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout perfilPanelBackLayout = new javax.swing.GroupLayout(perfilPanelBack);
        perfilPanelBack.setLayout(perfilPanelBackLayout);
        perfilPanelBackLayout.setHorizontalGroup(
            perfilPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfilPanelBackLayout.createSequentialGroup()
                .addGroup(perfilPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iconePerfilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        perfilPanelBackLayout.setVerticalGroup(
            perfilPanelBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(perfilPanelBackLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconePerfilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        consultasBtn1.setBackground(new java.awt.Color(255, 204, 204));
        consultasBtn1.setFont(new java.awt.Font("Segoe UI", 0, 19)); // NOI18N
        consultasBtn1.setForeground(new java.awt.Color(204, 0, 0));
        consultasBtn1.setText("Consultas");
        consultasBtn1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        consultasBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        consultasBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultasBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(labelEscolhaMed)
                .addContainerGap(552, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(infoClinicaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 632, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(labelDoutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelFormacao1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelEspecializacao1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(imagem1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(87, 87, 87)
                                                .addComponent(imagem2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(127, 127, 127))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(labelEspecializacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelFormacao2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelDoutor2))
                                                .addGap(105, 105, 105)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(labelEspecializacao3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelFormacao3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(labelEmail3, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(imagem3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(labelDoutor3))))
                                        .addGap(0, 30, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(consultasBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(perfilPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(infoClinicaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(labelEscolhaMed))
                            .addComponent(consultasBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelDoutor1)
                            .addComponent(labelDoutor2)
                            .addComponent(labelDoutor3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(perfilPanelBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imagem2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagem3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imagem1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelEmail1)
                                .addGap(18, 18, 18)
                                .addComponent(labelFormacao1)
                                .addGap(18, 18, 18)
                                .addComponent(labelEspecializacao1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelFormacao2)
                                    .addGap(18, 18, 18)
                                    .addComponent(labelEspecializacao2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(80, 80, 80))))
                        .addGap(54, 54, 54)
                        .addComponent(infoClinicaLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelEmail3)
                        .addGap(18, 18, 18)
                        .addComponent(labelFormacao3)
                        .addGap(18, 18, 18)
                        .addComponent(labelEspecializacao3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(infoClinicaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(42, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
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
        
        Icon imagemMedico1 = new ImageIcon("src\\main\\java\\imagens\\medico1 red..png");
        imagem1Label.setIcon(imagemMedico1);
        Icon imagemMedico2 = new ImageIcon("src\\main\\java\\imagens\\medico2 red.png");
        imagem2Label.setIcon(imagemMedico2);
        Icon imagemMedico3 = new ImageIcon("src\\main\\java\\imagens\\medico3 red..png");
        imagem3Label.setIcon(imagemMedico3);
        infoClinicaPanel.setVisible(false);
        Icon imagemPerfil = new ImageIcon("src\\main\\java\\imagens\\perfil.png");
        iconePerfilLabel.setIcon(imagemPerfil);
        iconePerfilLabel.setVisible(false);

        this.conta = conta;
    }

    private void chamarNovoFrame(JFrame tela) {
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);

        this.setVisible(false);
    }
    
    public void selecionarMedicoBtn(String nome, String especialidade) {
        TelaAgendamento telaagendamento = new TelaAgendamento(this.conta, nome, especialidade);

        chamarNovoFrame(telaagendamento);
    }

    private void imagem1LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem1LabelMouseClicked
        String especializacao1 = this.labelEspecializacao1.getText().substring(16);
        selecionarMedicoBtn("Marcos Sandoval", especializacao1);
    }//GEN-LAST:event_imagem1LabelMouseClicked

    private void imagem3LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem3LabelMouseClicked
        String especializacao3 = this.labelEspecializacao3.getText().substring(16);
        selecionarMedicoBtn("Márcio Beltrão", especializacao3);
    }//GEN-LAST:event_imagem3LabelMouseClicked

    private void imagem2LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem2LabelMouseClicked
        String especializacao2 = this.labelEspecializacao2.getText().substring(16);
        selecionarMedicoBtn("Marco Antônio Salum", especializacao2);
    }//GEN-LAST:event_imagem2LabelMouseClicked

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        TelaInicial telaInicial = new TelaInicial();

        chamarNovoFrame(telaInicial);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void infoClinicaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoClinicaLabelMouseClicked
        if (contadorInfo == 0) {
            infoClinicaPanel.setVisible(true);
            infoClinicaLabel.setText("Informações da Clínica ↑");
            contadorInfo = 1;
        } else {
            infoClinicaPanel.setVisible(false);
            infoClinicaLabel.setText("Informações da Clínica ↓");
            contadorInfo = 0;
        }
    }//GEN-LAST:event_infoClinicaLabelMouseClicked

    private void iconePerfilLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconePerfilLabelMouseEntered
        iconePerfilLabel.setVisible(true);
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_iconePerfilLabelMouseEntered
  
    private void perfilPanelBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilPanelBackMouseExited
        iconePerfilLabel.setVisible(false);
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_perfilPanelBackMouseExited

    private void perfilPanelBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilPanelBackMouseEntered
        iconePerfilLabel.setVisible(true);
    }//GEN-LAST:event_perfilPanelBackMouseEntered

    private void iconePerfilLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconePerfilLabelMouseClicked
        TelaPerfil telaPerfil = new TelaPerfil(conta);

        chamarNovoFrame(telaPerfil);
    }//GEN-LAST:event_iconePerfilLabelMouseClicked

    private void imagem1LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem1LabelMouseEntered
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagem1LabelMouseEntered

    private void imagem1LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem1LabelMouseExited
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_imagem1LabelMouseExited

    private void imagem2LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem2LabelMouseEntered
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagem2LabelMouseEntered

    private void imagem2LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem2LabelMouseExited
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_imagem2LabelMouseExited

    private void imagem3LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem3LabelMouseEntered
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagem3LabelMouseEntered

    private void imagem3LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagem3LabelMouseExited
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_imagem3LabelMouseExited

    private void infoClinicaLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoClinicaLabelMouseEntered
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_infoClinicaLabelMouseEntered

    private void infoClinicaLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoClinicaLabelMouseExited
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_infoClinicaLabelMouseExited

    private void consultasBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultasBtn1ActionPerformed
        TelaVisualizaConsultas telaConsultas = new TelaVisualizaConsultas(this.conta);
        
        chamarNovoFrame(telaConsultas);
    }//GEN-LAST:event_consultasBtn1ActionPerformed

    private void iconePerfilLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconePerfilLabelMouseExited
        iconePerfilLabel.setVisible(false);
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_iconePerfilLabelMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEscolhaMedico(conta).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consultasBtn1;
    private javax.swing.JLabel iconePerfilLabel;
    private javax.swing.JLabel imagem1Label;
    private javax.swing.JLabel imagem2Label;
    private javax.swing.JLabel imagem3Label;
    private javax.swing.JLabel infoClinicaLabel;
    private javax.swing.JPanel infoClinicaPanel;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelDoutor1;
    private javax.swing.JLabel labelDoutor2;
    private javax.swing.JLabel labelDoutor3;
    private javax.swing.JLabel labelEmail1;
    private javax.swing.JLabel labelEmail2;
    private javax.swing.JLabel labelEmail3;
    private javax.swing.JLabel labelEscolhaMed;
    private javax.swing.JLabel labelEspecializacao1;
    private javax.swing.JLabel labelEspecializacao2;
    private javax.swing.JLabel labelEspecializacao3;
    private javax.swing.JLabel labelFormacao1;
    private javax.swing.JLabel labelFormacao2;
    private javax.swing.JLabel labelFormacao3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JLabel perfilLabel;
    private javax.swing.JPanel perfilPanelBack;
    // End of variables declaration//GEN-END:variables
}
