/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import util.GerViewUtil;
import util.SessaoUtil;
import view.caixa.FluxoDeCaixaView;
import view.funcionario.GerenciarFuncionariosView;

/**
 *
 * @author vande
 */
public class MenuPrincipalView extends javax.swing.JFrame {

    public static GerenciarFuncionariosView gererenciarFuncionarios = null;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipalView() {
        initComponents();
        //DesignSystemUtil.defLogo(this);
    }

    /**
     * Determina os acessos do menu principal de acordo com o cargo.
     */
    public void defSessao() {
        try {
            txtBemVindo.setText("Bem vindo(a) ");
            txtBemVindo.setText(txtBemVindo.getText() + " " + SessaoUtil.getFuncionario().getNome() + ".");
            switch (SessaoUtil.getFuncionario().getCargo().getDescricao()) {
                case "Administrador":
                    setSessaoAdministrador();
                    break;
                case "Funcionário(a)":
                    setSessaoFuncionario();
                    break;
                case "Profissional realizante":
                    setSessaoProRealizante();
                    break;
            }
        } catch (NullPointerException ex) {
            SessaoUtil.verificarSessao(this);
        }
    }

    private void setSessaoFuncionario() {
        btnFinanceiro.setEnabled(false);
        btnLaudos.setEnabled(false);
        btnConsultas.setEnabled(false);
        btnConvenios.setEnabled(false);
        btnFuncionarios.setEnabled(false);
        btnConfiguracoes.setEnabled(false);
    }

    private void setSessaoAdministrador() {
        btnFinanceiro.setEnabled(true);
        btnLaudos.setEnabled(true);
        btnConsultas.setEnabled(true);
        btnConvenios.setEnabled(true);
        btnFuncionarios.setEnabled(true);
        btnConfiguracoes.setEnabled(true);
    }
    
    private void setSessaoProRealizante() {
        btnFinanceiro.setEnabled(true);
        btnLaudos.setEnabled(true);
        btnConsultas.setEnabled(false);
        btnConvenios.setEnabled(false);
        btnFuncionarios.setEnabled(false);
        btnConfiguracoes.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAgenda = new javax.swing.JToggleButton();
        btnConsultas = new javax.swing.JButton();
        btnFinanceiro = new javax.swing.JButton();
        btnMedicos = new javax.swing.JButton();
        btnLaudos = new javax.swing.JButton();
        btnConfiguracoes = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtBemVindo = new javax.swing.JLabel();
        btnFuncionarios = new javax.swing.JButton();
        btnConvenios = new javax.swing.JButton();
        jmbMenuPrincipal = new javax.swing.JMenuBar();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cila's System - Menu principal");
        setName("jfMenuPrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnAgenda.setText("Agenda");
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        btnConsultas.setText("Consultas");
        btnConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultasActionPerformed(evt);
            }
        });

        btnFinanceiro.setText("Caixa");
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        btnMedicos.setText("Profissionais");
        btnMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicosActionPerformed(evt);
            }
        });

        btnLaudos.setText("Laudos");
        btnLaudos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLaudosActionPerformed(evt);
            }
        });

        btnConfiguracoes.setText("Configurações");
        btnConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesActionPerformed(evt);
            }
        });

        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtBemVindo.setText("Bem vindo(a) ");

        btnFuncionarios.setText("Funcionários");
        btnFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionariosActionPerformed(evt);
            }
        });

        btnConvenios.setText("Convênios");
        btnConvenios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConveniosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBemVindo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFinanceiro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLaudos)
                        .addGap(12, 12, 12)
                        .addComponent(btnMedicos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsultas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConvenios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFuncionarios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfiguracoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgenda)
                    .addComponent(btnConsultas)
                    .addComponent(btnFinanceiro)
                    .addComponent(btnMedicos)
                    .addComponent(btnLaudos)
                    .addComponent(btnConfiguracoes)
                    .addComponent(btnSair)
                    .addComponent(btnFuncionarios)
                    .addComponent(btnConvenios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBemVindo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jmSobre.setText("Sobre");
        jmbMenuPrincipal.add(jmSobre);

        setJMenuBar(jmbMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 306, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewAgenda();
    }//GEN-LAST:event_btnAgendaActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        AutenticarAcessoView autentica = new AutenticarAcessoView();
        SessaoUtil.redefinirFuncionario();
        autentica.setVisible(true);
        GerViewUtil.closeAllView();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionariosActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewFuncionaio();
    }//GEN-LAST:event_btnFuncionariosActionPerformed

    private void btnConveniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConveniosActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewConvenio();
    }//GEN-LAST:event_btnConveniosActionPerformed

    private void btnMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicosActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewProfissional();
    }//GEN-LAST:event_btnMedicosActionPerformed

    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewConfiguracao();
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

    private void btnConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultasActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewConsulta();
    }//GEN-LAST:event_btnConsultasActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        defSessao();
    }//GEN-LAST:event_formWindowActivated

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewCaixa();
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnLaudosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLaudosActionPerformed
        // TODO add your handling code here:
        GerViewUtil.getViewLaudo();
    }//GEN-LAST:event_btnLaudosActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgenda;
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnConsultas;
    private javax.swing.JButton btnConvenios;
    private javax.swing.JButton btnFinanceiro;
    private javax.swing.JButton btnFuncionarios;
    private javax.swing.JButton btnLaudos;
    private javax.swing.JButton btnMedicos;
    private javax.swing.JButton btnSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbMenuPrincipal;
    private javax.swing.JLabel txtBemVindo;
    // End of variables declaration//GEN-END:variables
}
