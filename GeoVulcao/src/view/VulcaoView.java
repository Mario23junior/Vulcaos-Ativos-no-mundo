package view;

import dao.VulcaoDAO;
import javax.swing.JOptionPane;
import table.VulcaoTableModel;
import model.Vulcao;

 
public class VulcaoView extends javax.swing.JFrame {
  
    Vulcao vul = new Vulcao();
    VulcaoDAO prd = new VulcaoDAO();
    
    public VulcaoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbVulcao.setModel(new VulcaoTableModel(new VulcaoDAO().listarTodos()));
        btExcluir.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfNome = new javax.swing.JTextField();
        tfFormadoPor = new javax.swing.JTextField();
        tfUltimaErupcao = new javax.swing.JTextField();
        tfStatus = new javax.swing.JTextField();
        tfCoordenadas = new javax.swing.JTextField();
        tfPais = new javax.swing.JTextField();
        tfTipoLava = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        tfErupcaoVulcanica = new javax.swing.JTextField();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVulcao = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        tfPesquisaNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sistema vulcaos geotermicos");

        jLabel1.setText("ID : ");

        jLabel2.setText("Nome :");

        jLabel3.setText("Formador por :");

        jLabel4.setText("Ultima Erupção :");

        jLabel5.setText("Status :");

        jLabel6.setText("Coordenadas :");

        jLabel7.setText("paìs de origem :");

        jLabel8.setText("Tipo de Lava : ");

        jLabel9.setText("Descrição :");

        jLabel10.setText("Erupçao Vulcanica :");

        tfId.setEditable(false);
        tfId.setBackground(new java.awt.Color(102, 102, 102));

        tfUltimaErupcao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUltimaErupcaoActionPerformed(evt);
            }
        });

        tfTipoLava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipoLavaActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        tbVulcao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbVulcao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVulcaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVulcao);

        jLabel11.setText("Pesquisar por nome : ");

        tfPesquisaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaNomeActionPerformed(evt);
            }
        });
        tfPesquisaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaNomeKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfFormadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfCoordenadas, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfPais, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfTipoLava, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfErupcaoVulcanica, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfUltimaErupcao, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfDescricao))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE))
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(3, 3, 3)
                        .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfFormadoPor, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfUltimaErupcao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tfTipoLava, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfErupcaoVulcanica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tfPesquisaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfTipoLavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipoLavaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipoLavaActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        tbVulcao.setModel(new VulcaoTableModel(new VulcaoDAO().listarTodos()));
            tfId.setText("");
            tfNome.setText("");
            tfFormadoPor.setText("");
            tfUltimaErupcao.setText("");
            tfStatus.setText("");
            tfCoordenadas.setText("");
            tfPais.setText("");
            tfTipoLava.setText("");
            tfErupcaoVulcanica.setText("");
            tfDescricao.setText("");
            tfPesquisaNome.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void tfPesquisaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaNomeActionPerformed

    private void tfUltimaErupcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUltimaErupcaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUltimaErupcaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
       
        if(tfNome.getText().equals("") || tfFormadoPor.getText().equals("") || tfUltimaErupcao.getText().equals("")
                || tfStatus.getText().equals("")
                || tfCoordenadas.getText().equals("") 
                || tfPais.getText().equals("") 
                || tfTipoLava.getText().equals("")
                || tfErupcaoVulcanica.getText().equals("")
                || tfDescricao.getText().equals("")
                ){
            
            String avisoMsg = " Há campos que são obrigatórios, por favor insira valores validos";
            JOptionPane.showConfirmDialog(null,avisoMsg,"Vulcaos - SALVAR", JOptionPane.WARNING_MESSAGE);
        } else {
            
         if(tfId.getText().equals("")) {
            vul.setNome(tfNome.getText());
            vul.setFormadoPor(tfFormadoPor.getText());
            vul.setUltimaErupcao(tfUltimaErupcao.getText());
            vul.setStatus(tfStatus.getText());
            vul.setCoordenadas(tfCoordenadas.getText());
            vul.setPais(tfPais.getText());
            vul.setTipoLava(tfTipoLava.getText());
            vul.setErupcaoVulcanica(tfErupcaoVulcanica.getText());
            vul.setDescricao(tfDescricao.getText());
            prd.inserir(vul);
       } else {
            vul.setId(Integer.parseInt(tfId.getText()));
            vul.setNome(tfNome.getText());
            vul.setFormadoPor(tfFormadoPor.getText());
            vul.setUltimaErupcao(tfUltimaErupcao.getText());
            vul.setStatus(tfStatus.getText());
            vul.setCoordenadas(tfCoordenadas.getText());
            vul.setPais(tfPais.getText());
            vul.setTipoLava(tfTipoLava.getText());
            vul.setErupcaoVulcanica(tfErupcaoVulcanica.getText());
            vul.setDescricao(tfDescricao.getText());
            prd.alterar(vul);
        }
      }
        
            tbVulcao.setModel(new VulcaoTableModel(new VulcaoDAO().listarTodos()));
            tfId.setText("");
            tfNome.setText("");
            tfFormadoPor.setText("");
            tfUltimaErupcao.setText("");
            tfStatus.setText("");
            tfCoordenadas.setText("");
            tfPais.setText("");
            tfTipoLava.setText("");
            tfErupcaoVulcanica.setText("");
            tfDescricao.setText("");
            tfPesquisaNome.setText("");
            btExcluir.setEnabled(false);
                  

    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbVulcaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVulcaoMouseClicked
        tfId.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_ID_VULCAO).toString());
        tfNome.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_NOME_VULCAO).toString());
        tfFormadoPor.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_FORMADO_POR_VULCAO).toString());
        tfUltimaErupcao.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_ULTIMA_ERUPCAO_VULCAO).toString());
        tfStatus.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_STATUS_VULCAO).toString());
        tfCoordenadas.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_COORDENADAS_VULCAO).toString());
        tfPais.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_PAIS_VULCAO).toString());
        tfTipoLava.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_TIPOLAVA_VULCAO).toString());
        tfErupcaoVulcanica.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_ERUPCAO_VULCANICA_VULCAO).toString());
        tfDescricao.setText(tbVulcao.getValueAt(tbVulcao.getSelectedRow(),VulcaoTableModel.COL_DESCRICAOS_VULCAO).toString());
        btExcluir.setEnabled(true);

    }//GEN-LAST:event_tbVulcaoMouseClicked

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       
        String nomeJanela = "Vulcao  (EXCLUIR)";
        String aviso = "Você tem certeza que deseja apagar essa informação, esses dados serão apagados permanentemente";
        
        int escolha = JOptionPane.showConfirmDialog(null,aviso,nomeJanela, JOptionPane.YES_NO_OPTION);
        
        if(escolha == 0){
        int id = Integer.parseInt(tfId.getText());
        prd.excluir(id);
        tbVulcao.setModel(new VulcaoTableModel(new VulcaoDAO().listarTodos()));
            tfId.setText("");
            tfNome.setText("");
            tfFormadoPor.setText("");
            tfUltimaErupcao.setText("");
            tfStatus.setText("");
            tfCoordenadas.setText("");
            tfPais.setText("");
            tfTipoLava.setText("");
            tfErupcaoVulcanica.setText("");
            tfDescricao.setText("");
            tfPesquisaNome.setText("");
            btExcluir.setEnabled(false);

        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaNomeKeyPressed
        String pesquisa = tfPesquisaNome.getText();
        tbVulcao.setModel(new VulcaoTableModel(new VulcaoDAO().listarTodosNome(pesquisa)));
    }//GEN-LAST:event_tfPesquisaNomeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVulcao;
    private javax.swing.JTextField tfCoordenadas;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfErupcaoVulcanica;
    private javax.swing.JTextField tfFormadoPor;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPais;
    private javax.swing.JTextField tfPesquisaNome;
    private javax.swing.JTextField tfStatus;
    private javax.swing.JTextField tfTipoLava;
    private javax.swing.JTextField tfUltimaErupcao;
    // End of variables declaration//GEN-END:variables
}
