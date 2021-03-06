/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.profissionais;

import model.bean.ConselhoRegionalBean;
import model.bean.EspecializacaoBean;
import model.bean.ProfissionalBean;
import controller.ProfissionalController;
import javax.swing.JOptionPane;
import model.combobox.ConselhoComboBoxModel;
import model.combobox.EspecializacaoComboBoxModel;
import util.MaskFormatTextUtil;

/**
 *
 * @author vande
 */
public class CadastrarProfissionalView extends javax.swing.JDialog {

    private static ConselhoComboBoxModel comboboxmodelConselho = new ConselhoComboBoxModel();
    private static EspecializacaoComboBoxModel comboboxmodelEspecializacao = new EspecializacaoComboBoxModel();

    /**
     * Creates new form CadastrarProfissional
     */
    public CadastrarProfissionalView(javax.swing.JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        jcbConselhoRegional.setModel(comboboxmodelConselho);
        jcbEspecializacao.setModel(comboboxmodelEspecializacao);
    }

    /**
     * Checa os dados preenchidos no formulário de cadastro de profissional.
     */
    private boolean checkForm() {
        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nome é obrigatório.");
            return false;
        }
        if (jcbConselhoRegional.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Conselho deve ser selecionado.");
            return false;
        }
        if (txtTelefone.getText().length() != 13 || txtTelefone.getText().equalsIgnoreCase("(  )    -    ")) {
            JOptionPane.showMessageDialog(null, "O campo de telefone deve conter 10 digitos númericos.");
            return false;
        }
        if (txtCelular.getText().length() != 14 || txtCelular.getText().equalsIgnoreCase("(  )     -    ")) {
            JOptionPane.showMessageDialog(null, "O campo de celular deve conter 11 digitos númericos.");
            return false;
        }
        if (txtNumConselho.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Número do conselho é obrigatório");
            return false;
        }
        if (jcbUf.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "UF é obrigatório");
            return false;
        }
        if (jcbEspecializacao.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(null, "Especialização é obrigatório");
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpCadProfissional = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcbConselhoRegional = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNumConselho = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcbUf = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jcbEspecializacao = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        jmbCadProfissional = new javax.swing.JMenuBar();
        jmSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cila's System - Cadastrar profissional");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("CADASTRAR PROFISSIONAL");

        jLabel2.setText("Nome:");

        jLabel3.setText("Conselho:");

        jcbConselhoRegional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setText("Nº do conselho:");

        jLabel5.setText("UF:");

        jcbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"AC", "AL", "AP", "AM",
            "BA", "CE", "DF", "ES",
            "GO", "MA", "MT", "MS",
            "MG", "PA", "PB", "PR",
            "PE", "PI", "RJ", "RN",
            "RS", "RO", "RR", "SC",
            "SP", "SE", "TO"}));

jLabel6.setText("Especialização:");

jcbEspecializacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

jLabel7.setText("Telefone:");

jLabel8.setText("Celular:");

btnCadastrar.setText("CADASTRAR");
btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnCadastrarActionPerformed(evt);
    }
    });

    try {
        txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    try {
        txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
    } catch (java.text.ParseException ex) {
        ex.printStackTrace();
    }

    javax.swing.GroupLayout jpCadProfissionalLayout = new javax.swing.GroupLayout(jpCadProfissional);
    jpCadProfissional.setLayout(jpCadProfissionalLayout);
    jpCadProfissionalLayout.setHorizontalGroup(
        jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpCadProfissionalLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpCadProfissionalLayout.createSequentialGroup()
                    .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCadProfissionalLayout.createSequentialGroup()
                            .addComponent(jcbEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTelefone))
                        .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jpCadProfissionalLayout.createSequentialGroup()
                                .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jcbConselhoRegional, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))
                            .addComponent(jLabel6)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpCadProfissionalLayout.createSequentialGroup()
                            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addGroup(jpCadProfissionalLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel5)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jpCadProfissionalLayout.createSequentialGroup()
                            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtCelular, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNumConselho, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jcbUf, 0, 56, Short.MAX_VALUE))))
                .addGroup(jpCadProfissionalLayout.createSequentialGroup()
                    .addComponent(btnCadastrar)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jpCadProfissionalLayout.setVerticalGroup(
        jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jpCadProfissionalLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel4)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbConselhoRegional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtNumConselho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabel7)
                .addComponent(jLabel8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jpCadProfissionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEspecializacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnCadastrar)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jmSobre.setText("Sobre");
    jmbCadProfissional.add(jmSobre);

    setJMenuBar(jmbCadProfissional);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jpCadProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jpCadProfissional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        if (checkForm()) {
            ProfissionalBean pro = new ProfissionalBean();
            pro.setNome(txtNome.getText());
            pro.setConselho(new ConselhoRegionalBean(jcbConselhoRegional.getSelectedItem().toString()));
            pro.setNumConselho(Integer.parseInt(txtNumConselho.getText()));
            pro.setUfConselho((String) jcbUf.getSelectedItem());
            pro.setEspecializacao(new EspecializacaoBean(jcbEspecializacao.getSelectedItem().toString()));
            pro.setTelefone(MaskFormatTextUtil.onlyNumbers(txtTelefone.getText()));
            pro.setCelular(MaskFormatTextUtil.onlyNumbers(txtCelular.getText()));
            ProfissionalController.createProfissional(pro);
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarProfissionalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastrarProfissionalView dialog = new CadastrarProfissionalView(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> jcbConselhoRegional;
    private javax.swing.JComboBox<String> jcbEspecializacao;
    private javax.swing.JComboBox<String> jcbUf;
    private javax.swing.JMenu jmSobre;
    private javax.swing.JMenuBar jmbCadProfissional;
    private javax.swing.JPanel jpCadProfissional;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumConselho;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
