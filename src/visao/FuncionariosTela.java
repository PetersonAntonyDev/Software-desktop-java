/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import dao.ConexaoBD;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peter
 */
public class FuncionariosTela extends javax.swing.JFrame {

    //construtor
    public FuncionariosTela() {
        initComponents();
        
        //chamando metodos criados e funções do Java Swing
        habilitaBtn(true);
        jtfId.setEnabled(false);
        habilitaTextField(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCancelar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        JButtonAlterar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();
        jtfApelido = new javax.swing.JTextField();
        jtfCidadeEstado = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfId = new javax.swing.JTextField();
        jtfDataNasc = new javax.swing.JFormattedTextField();
        jtfTelefone = new javax.swing.JFormattedTextField();
        jtfCpf = new javax.swing.JFormattedTextField();
        jProfissao = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelaFunc = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jtfBuscar = new javax.swing.JFormattedTextField();
        jButtonDados = new javax.swing.JButton();
        jiTelaFunc = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("RZM Construtora -  Funcionários");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonCancelar.setContentAreaFilled(false);
        jButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 590, 150, 50));

        jButtonSalvar.setContentAreaFilled(false);
        jButtonSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, 140, 40));

        JButtonAlterar.setContentAreaFilled(false);
        JButtonAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 600, 150, 40));

        jButtonNovo.setContentAreaFilled(false);
        jButtonNovo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 150, 50));

        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 50, 50));

        jtfNome.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        getContentPane().add(jtfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 520, 40));
        getContentPane().add(jtfApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 180, 40));
        getContentPane().add(jtfCidadeEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 230, 40));
        getContentPane().add(jtfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 270, 250, 40));
        getContentPane().add(jtfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 180, 40));
        getContentPane().add(jtfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 70, 40));

        try {
            jtfDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, 230, 40));

        try {
            jtfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 250, 40));

        try {
            jtfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(jtfCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 180, 40));

        jProfissao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Engenheiro", "Mestre de Obras", "Pedreiro", "Ajudante", "Pintor", "Eletricista" }));
        getContentPane().add(jProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 190, 40));

        jTabelaFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Apelido", "Data Nasc.", "Telefone", "E-mail", "Cidade", "Endereço", "CPF", "Profissão"
            }
        ));
        jScrollPane1.setViewportView(jTabelaFunc);
        if (jTabelaFunc.getColumnModel().getColumnCount() > 0) {
            jTabelaFunc.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 900, 130));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Digite o ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, 90, 30));

        jButtonBuscar.setBackground(new java.awt.Color(153, 204, 255));
        jButtonBuscar.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jButtonBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 70, 30));

        jtfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jtfBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 70, 30));

        jButtonDados.setText("Dados");
        jButtonDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDadosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, 30));

        jiTelaFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/RZM funcionarios.png"))); // NOI18N
        getContentPane().add(jiTelaFunc, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //botão salvar - chama os métodos criados abaixo e insere no BD os dados capturados nos campos de texto
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        habilitaBtn(true);
        habilitaTextField(false);
        
        
        try {
            //Código do MySQL para inserir dados
            String sql = "INSERT INTO funcionarios (nome, apelido, dataNasc, telefone, email, cidadeEstado, endereco, cpf, especialidade) VALUES (?,?,?,?,?,?,?,?,?)";
            
            //PreparedStatement - prepara os parametros para serem inseridos no banco com mais segurança
            //chama a Classe ConexaoBD e chama o método criado nele para abrir a conexão com o banco de dados
            PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);
            
            //pega a string de cada campo de texto e adiciona nos parametros "?" colocados no comando do MySQL
            stm.setString(1, jtfNome.getText());
            stm.setString(2, jtfApelido.getText());
            stm.setString(3, jtfDataNasc.getText());
            stm.setString(4, jtfTelefone.getText());
            stm.setString(5, jtfEmail.getText());
            stm.setString(6, jtfCidadeEstado.getText());
            stm.setString(7, jtfEndereco.getText());
            stm.setString(8, jtfCpf.getText());
            stm.setString(9, (String) jProfissao.getSelectedItem());
            
            //executa a inserção
            stm.execute();
            //fecha o banco para que não entre mais nada desnecessario
            stm.close();

            JOptionPane.showMessageDialog(null, "cadastrado no BD");

        } catch (Exception e) {
            //mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao gravar " + e);
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed
    
    //botão novo - chama os metodos criado abaixo e funcões do java swing para formatar a tela da maneira desejada 
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        habilitaBtn(false);
        habilitaTextField(true);
        limparCampoForm();
        jtfNome.requestFocus();
        jtfId.setText("");
    }//GEN-LAST:event_jButtonNovoActionPerformed

    //botão cancelar - chama os metodos criado abaixo para formatar a tela da maneira desejada
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        limparCampoForm();
        habilitaBtn(true);
        habilitaTextField(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    //botão atualizar - chama os métodos criados abaixo e atualiza(UPDATE) no BD os dados que já estavam no banco
    private void JButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAlterarActionPerformed
        habilitaBtn(false);
        habilitaTextField(true);
        jtfNome.requestFocus();
        
        //se o id for igual a 0, o JOptionPane mostra uma mensagem de erro e pede pra informar um id
        if (jtfId.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o ID");
        } else {
            try {
                //comando MySQL para dar UPDATE na linha respectiva ao ID
                String sql = "UPDATE funcionarios set nome=?, apelido=?, dataNasc=?, telefone=?, email=?, cidadeEstado=?, endereco=?, cpf=?, especialidade=? where id=?";

                
                //PreparedStatement prepara os parametros para serem inseridos no banco com mais segurança
                //chama a Classe ConexaoBD e chama o método criado nele para abrir a conexão com o banco de dados
                PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);
                
                //pega a string de cada campo de texto e adiciona nos parametros "?" colocados no comando do MySQL
                stm.setString(1, jtfNome.getText());
                stm.setString(2, jtfApelido.getText());
                stm.setString(3, jtfDataNasc.getText());
                stm.setString(4, jtfTelefone.getText());
                stm.setString(5, jtfEmail.getText());
                stm.setString(6, jtfCidadeEstado.getText());
                stm.setString(7, jtfEndereco.getText());
                stm.setString(8, jtfCpf.getText());
                stm.setString(9, (String) jProfissao.getSelectedItem());
                stm.setString(10, jtfId.getText());

                stm.execute();
                stm.close();

                JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e);
            }

        }


    }//GEN-LAST:event_JButtonAlterarActionPerformed
    
    //botão buscar - chama os métodos criados abaixo e seleciona(SELECT) a linha no BD que contem os dados que estão no banco
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        habilitaTextField(true);
        
        //se o id for igual a 0, o JOptionPane mostra uma mensagem de erro e pede pra informar um id
        if (jtfBuscar.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o ID para a busca!");
        } else {
            try {
                //comando MySQL para dar UPDATE na linha respectiva ao ID
                String sql = "select * from funcionarios where id like ?";
                
                //PreparedStatement prepara os parametros para serem inseridos no banco com mais segurança
                //chama a Classe ConexaoBD e chama o método criado nele para abrir a conexão com o banco de dados
                PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);
                
                
                //captura o id informado no campo jtfBuscar
                stm.setString(1, "%" + jtfBuscar.getText());
                
                //o ResultSet mantém um ponteiro que sempre aponta para a linha atual de dados
                ResultSet rs = stm.executeQuery();
                
                //a função "next()" do ResultSet move esse ponteiro para a proxima linha e quando não há mais linha ele retrona false
                //no laço de repetição while ele é usado para iterar no conjunto de resultados
                while (rs.next()) {
                    //selecionando e mandando os dados do banco para os respectivos campos
                    jtfId.setText(rs.getString("id"));
                    jtfNome.setText(rs.getString("nome"));
                    jtfApelido.setText(rs.getString("apelido"));
                    jtfDataNasc.setText(rs.getString("dataNasc"));
                    jtfTelefone.setText(rs.getString("telefone"));
                    jtfEmail.setText(rs.getString("email"));
                    jtfCidadeEstado.setText(rs.getString("cidadeEstado"));
                    jtfEndereco.setText(rs.getString("endereco"));
                    jtfCpf.setText(rs.getString("cpf"));
                    jProfissao.setSelectedItem(rs.getString("especialidade"));
                }

                rs.close();
                stm.close();

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Erro" + e);
            }
        }

    }//GEN-LAST:event_jButtonBuscarActionPerformed
    
    //botão dados - chama os métodos criados abaixo e lista os dados do BD na tabela 
    private void jButtonDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDadosActionPerformed
        try {
            
            //comando MySQL para selecionar/mostrar as linhas de uma tabela
            String sql = "select * from funcionarios";

            //PreparedStatement prepara os parametros para serem inseridos no banco com mais segurança
            //chama a Classe ConexaoBD e chama o método criado nele para abrir a conexão com o banco de dados
            PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);
            
            //executeQuery - Executa uma instrução SQL que retorna um único objeto ResultSet.
            ResultSet rs = stm.executeQuery();
            
            /*O DefaultTableModel é uma classe do pacote javax.swing.table e implementa a interface TableModel,
            fornecendo todo o controle dos dados da JTable.*/
            DefaultTableModel modelo = (DefaultTableModel) jTabelaFunc.getModel();
            
            //setNumRows(0) - seta em zero o número de linhas, ou seja, é feito para que não se dupliquem dados cada vez que o método buscar é invocado.
            modelo.setNumRows(0);

            while (rs.next()) {
                //addRows - adiciona os dados vindos do banco à tabela
                modelo.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("nome"),
                    rs.getString("apelido"),
                    rs.getString("dataNasc"),
                    rs.getString("telefone"),
                    rs.getString("email"),
                    rs.getString("cidadeEstado"),
                    rs.getString("endereco"),
                    rs.getString("cpf"),
                    rs.getString("especialidade")
                });

            }

            rs.close();
            stm.close();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro" + e);
        }
    }//GEN-LAST:event_jButtonDadosActionPerformed

    //botão excluir - chama os métodos criados abaixo e deleta(DELETE) a linha no BD que contem os dados que estavam no banco
    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //se o id for igual a 0, o JOptionPane mostra uma mensagem de erro e pede pra informar um id
        if (jtfId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe o ID");
        } else {
            try {
                //comando MySQL para deletar a linha de uma tabela
                String sql = "DELETE from funcionarios WHERE id=?";
                
                //PreparedStatement prepara os parametros para serem inseridos no banco com mais segurança
                //chama a Classe ConexaoBD e chama o método criado nele para abrir a conexão com o banco de dados
                PreparedStatement stm = ConexaoBD.abreConexao().prepareStatement(sql);

                //captura o id que está no campo ID para que ele seja apagado
                stm.setString(1, jtfId.getText());

                stm.execute();
                stm.close();
                JOptionPane.showMessageDialog(null, "Excluído com Sucesso!");
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Informe o ID a ser excluído!" + e);
            }
        }
        limparCampoForm();

    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jtfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionariosTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionariosTela().setVisible(true);
            }
        });
    }
    
    //metodo para habiltar e desabilitar os botões 
    public void habilitaBtn(boolean estado) {
        jButtonNovo.setEnabled(estado);
        JButtonAlterar.setEnabled(estado);
        jButtonExcluir.setEnabled(estado);
        jButtonSalvar.setEnabled(!estado);
        jButtonCancelar.setEnabled(!estado);
    }
    
    //metodo para habiltar e desabilitar os textFields 
    public void habilitaTextField(boolean estado) {
        jtfNome.setEnabled(estado);
        jtfApelido.setEnabled(estado);
        jtfCidadeEstado.setEnabled(estado);
        jtfEmail.setEnabled(estado);
        jtfEndereco.setEnabled(estado);
        jtfTelefone.setEnabled(estado);
        jtfDataNasc.setEnabled(estado);
        jtfCpf.setEnabled(estado);
        jProfissao.setEnabled(estado);
    }
    
    
    //metodo para limpar os campos 
    public void limparCampoForm() {
        jtfNome.setText("");
        jtfApelido.setText("");
        jtfCidadeEstado.setText("");
        jtfEmail.setText("");
        jtfEndereco.setText("");
        jtfTelefone.setText("");
        jtfDataNasc.setText("");
        jtfCpf.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton JButtonAlterar;
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonDados;
    public javax.swing.JButton jButtonExcluir;
    public javax.swing.JButton jButtonNovo;
    public javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JComboBox<String> jProfissao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelaFunc;
    private javax.swing.JLabel jiTelaFunc;
    public javax.swing.JTextField jtfApelido;
    public javax.swing.JFormattedTextField jtfBuscar;
    public javax.swing.JTextField jtfCidadeEstado;
    public javax.swing.JFormattedTextField jtfCpf;
    public javax.swing.JFormattedTextField jtfDataNasc;
    public javax.swing.JTextField jtfEmail;
    public javax.swing.JTextField jtfEndereco;
    public javax.swing.JTextField jtfId;
    public javax.swing.JTextField jtfNome;
    public javax.swing.JFormattedTextField jtfTelefone;
    // End of variables declaration//GEN-END:variables
}
