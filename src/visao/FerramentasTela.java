/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import dao.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peter
 */
public class FerramentasTela extends javax.swing.JFrame {

    /**
     * Creates new form FerramentasTela
     */
    public FerramentasTela() {
        initComponents();
        
        habilitaBtn(true);

        jtfId.setEnabled(false);
        habilitaTextField(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfId = new javax.swing.JTextField();
        jtfFerramenta = new javax.swing.JTextField();
        jtfEmpresa = new javax.swing.JTextField();
        jtfDono = new javax.swing.JTextField();
        jtfObra = new javax.swing.JTextField();
        jtfCidadeEstado = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfInicio = new javax.swing.JFormattedTextField();
        jtfTermino = new javax.swing.JFormattedTextField();
        jtfTelefoneForn = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaFerramentas = new javax.swing.JTable();
        jButtonNovo = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonDados = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jtfBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jCheckSim = new javax.swing.JCheckBox();
        jCheckNao = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RZM Construtora - Ferramentas/M??quinas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfIdActionPerformed(evt);
            }
        });
        getContentPane().add(jtfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 40));
        getContentPane().add(jtfFerramenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 230, 40));
        getContentPane().add(jtfEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 230, 40));
        getContentPane().add(jtfDono, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 210, 40));
        getContentPane().add(jtfObra, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 210, 40));
        getContentPane().add(jtfCidadeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 230, 40));
        getContentPane().add(jtfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 210, 40));

        try {
            jtfInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 230, 40));

        try {
            jtfTermino.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfTermino, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 210, 40));

        try {
            jtfTelefoneForn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfTelefoneForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 210, 40));

        jTabelaFerramentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Ferramenta/M??quina", "Telefone Fornecedor", "Empresa", "Dono", "Obra", "Cidade-Estado", "Endere??o"
            }
        ));
        jScrollPane1.setViewportView(jTabelaFerramentas);
        if (jTabelaFerramentas.getColumnModel().getColumnCount() > 0) {
            jTabelaFerramentas.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 900, 130));

        jButtonNovo.setContentAreaFilled(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 140, 40));

        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 590, 140, 40));

        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 590, 130, 40));

        jButtonAtualizar.setContentAreaFilled(false);
        jButtonAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 140, 40));

        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 590, 40, 40));

        jButtonDados.setText("DADOS");
        jButtonDados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 418, -1, 30));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Digite o ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 90, 30));
        getContentPane().add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 70, 30));

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 80, 30));

        jCheckSim.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jCheckSim.setForeground(new java.awt.Color(0, 0, 0));
        jCheckSim.setText("Sim");
        jCheckSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckSimActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 60, 30));

        jCheckNao.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jCheckNao.setForeground(new java.awt.Color(0, 0, 0));
        jCheckNao.setText("N??o");
        jCheckNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckNaoActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckNao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 60, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RZM Ferramentas.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 641));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDadosActionPerformed
        try {

            String sql = "select * from ferramentas";

            PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            DefaultTableModel modelo = (DefaultTableModel) jTabelaFerramentas.getModel();

            modelo.setNumRows(0);

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("ferramenta"),
                    rs.getString("dataInicio"),
                    rs.getString("dataTermino"),
                    rs.getString("telefonefornecedor"),
                    rs.getString("empresa"),
                    rs.getString("cidadeEstado"),
                    rs.getString("endereco"),
                    rs.getString("dono"),
                    rs.getString("obra")
                });
                
            }

            rs.close();
            stm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }//GEN-LAST:event_jButtonDadosActionPerformed

    private void jtfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfIdActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        habilitaBtn(false);
        habilitaTextField(true);
        limparCampoForm();
        jtfFerramenta.requestFocus();
        jtfId.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampoForm();
        habilitaBtn(true);
        habilitaTextField(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        habilitaBtn(true);
        habilitaTextField(false);

        try {

            String sql = "INSERT INTO ferramentas "
                    + "(ferramenta,"
                    + " dataInicio, "
                    + "dataTermino, "
                    + "telefonefornecedor, "
                    + "empresa, "
                    + "cidadeEstado, "
                    + "endereco, "
                    + "dono, "
                    + "obra) VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);

            stm.setString(1, jtfFerramenta.getText());
            stm.setString(2, jtfInicio.getText());
            stm.setString(3, jtfTermino.getText());
            stm.setString(4, jtfTelefoneForn.getText());
            stm.setString(5, jtfEmpresa.getText());
            stm.setString(6, jtfCidadeEstado.getText());
            stm.setString(7, jtfEndereco.getText());
            stm.setString(8, jtfDono.getText());
            stm.setString(9, jtfObra.getText());

            stm.execute();
            stm.close();

            JOptionPane.showMessageDialog(null, "cadastrado no BD");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ao gravar " + e);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        habilitaBtn(false);
        habilitaTextField(true);
        jtfFerramenta.requestFocus();

        if (jtfId.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o ID");
        } else {
            try {

                String sql = "UPDATE ferramentas set"
                        + " ferramenta=?,"
                        + " dataInicio=?,"
                        + " dataTermino=?,"
                        + " telefonefornecedor=?,"
                        + " empresa=?,"
                        + " cidadeEstado=?,"
                        + " endereco=?,"
                        + " dono=?,"
                        + " obra=? where id=?";

                PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);

                stm.setString(1, jtfFerramenta.getText());
                stm.setString(2, jtfInicio.getText());
                stm.setString(3, jtfTermino.getText());
                stm.setString(4, jtfTelefoneForn.getText());
                stm.setString(5, jtfEmpresa.getText());
                stm.setString(6, jtfCidadeEstado.getText());
                stm.setString(7, jtfEndereco.getText());
                stm.setString(8, jtfDono.getText());
                stm.setString(9, jtfObra.getText());
                stm.setString(10, jtfId.getText());

                stm.execute();
                stm.close();

                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e);
            }

        }

    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if (jtfId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o ID");
        } else {
            try {

                String sql = "DELETE from ferramentas WHERE id=?";

                PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);

                stm.setString(1, jtfId.getText());

                stm.execute();
                stm.close();
                JOptionPane.showMessageDialog(null, "Exclu??do com Sucesso!");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Informe o ID a ser exclu??do!" + e);
            }
        }
        limparCampoForm();

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        habilitaTextField(true);
        if (jtfBuscar.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o ID para a busca!");
        } else {
            try {

                String sql = "select * from ferramentas where id like ?";

                PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);

                stm.setString(1, "%" + jtfBuscar.getText());

                ResultSet rs = stm.executeQuery();

                while (rs.next()) {
                    jtfId.setText(rs.getString("id"));
                    jtfFerramenta.setText(rs.getString("ferramenta"));
                    jtfInicio.setText(rs.getString("dataInicio"));
                    jtfTermino.setText(rs.getString("dataTermino"));
                    jtfTelefoneForn.setText(rs.getString("telefonefornecedor"));
                    jtfEmpresa.setText(rs.getString("empresa"));
                    jtfCidadeEstado.setText(rs.getString("cidadeEstado"));
                    jtfEndereco.setText(rs.getString("endereco"));
                    jtfDono.setText(rs.getString("dono"));
                    jtfObra.setText(rs.getString("obra"));
                }

                rs.close();
                stm.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro" + e);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jCheckSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckSimActionPerformed
        jtfInicio.setEnabled(false);
        jtfTermino.setEnabled(false);
        jtfTelefoneForn.setEnabled(false);
        jtfEmpresa.setEnabled(false);
        jtfEmpresa.setText("Pr??prio");
        jCheckNao.setSelected(false);
    }//GEN-LAST:event_jCheckSimActionPerformed

    private void jCheckNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckNaoActionPerformed
        jCheckSim.setSelected(false);
    }//GEN-LAST:event_jCheckNaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FerramentasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FerramentasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FerramentasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FerramentasTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FerramentasTela().setVisible(true);
            }
        });
    }
    
    

    public void habilitaBtn(boolean estado) {
        jButtonNovo.setEnabled(estado);
        jButtonAtualizar.setEnabled(estado);
        jButtonExcluir.setEnabled(estado);
        jButtonSalvar.setEnabled(!estado);
        jButtonCancelar.setEnabled(!estado);
    }

    public void habilitaTextField(boolean estado) {
        jtfFerramenta.setEnabled(estado);
        jtfCidadeEstado.setEnabled(estado);
        jtfEmpresa.setEnabled(estado);
        jtfEndereco.setEnabled(estado);
        jtfTelefoneForn.setEnabled(estado);
        jtfInicio.setEnabled(estado);
        jtfTermino.setEnabled(estado);
        jtfDono.setEnabled(estado);
        jtfObra.setEnabled(estado);
    }

    public void limparCampoForm() {
        jtfFerramenta.setText("");
        jtfCidadeEstado.setText("");
        jtfEmpresa.setText("");
        jtfEndereco.setText("");
        jtfTelefoneForn.setText("");
        jtfInicio.setText("");
        jtfTermino.setText("");
        jtfDono.setText("");
        jtfObra.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDados;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    public javax.swing.JCheckBox jCheckNao;
    public javax.swing.JCheckBox jCheckSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTabelaFerramentas;
    public javax.swing.JTextField jtfBuscar;
    public javax.swing.JTextField jtfCidadeEstado;
    public javax.swing.JTextField jtfDono;
    public javax.swing.JTextField jtfEmpresa;
    public javax.swing.JTextField jtfEndereco;
    public javax.swing.JTextField jtfFerramenta;
    public javax.swing.JTextField jtfId;
    public javax.swing.JFormattedTextField jtfInicio;
    public javax.swing.JTextField jtfObra;
    public javax.swing.JFormattedTextField jtfTelefoneForn;
    public javax.swing.JFormattedTextField jtfTermino;
    // End of variables declaration//GEN-END:variables
}
