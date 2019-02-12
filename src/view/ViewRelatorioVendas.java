/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ControllerCliente;
import controller.ControllerVendas;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import model.ModelCliente;
import util.BLDatas;

/**
 *
 * @author Administrador
 */
public class ViewRelatorioVendas extends javax.swing.JFrame {

    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    ControllerCliente controllerCliente = new ControllerCliente();
    
    /**
     * Creates new form ViewRelatorioVendas
     */
    public ViewRelatorioVendas() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/imagens/myADM_mini.png")).getImage());
        listarClientes();
        setLocationRelativeTo(null);
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
        jbCancelar = new javax.swing.JButton();
        jbGerarRelatorio = new javax.swing.JButton();
        jdcData = new com.toedter.calendar.JDateChooser();
        jrbData = new javax.swing.JRadioButton();
        jrbCliente = new javax.swing.JRadioButton();
        jcbCliente = new componentes.UJComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de vendas");

        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/No.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbGerarRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/18x18/Report.png"))); // NOI18N
        jbGerarRelatorio.setText("Gerar relatório");
        jbGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarRelatorioActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbData);
        jrbData.setSelected(true);
        jrbData.setText("Por data:");

        buttonGroup1.add(jrbCliente);
        jrbCliente.setText("Por cliente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbGerarRelatorio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbData)
                        .addGap(37, 37, 37)
                        .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 271, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jrbCliente)
                        .addGap(29, 29, 29)
                        .addComponent(jcbCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbData))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCliente)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbGerarRelatorio))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarRelatorioActionPerformed
        ControllerVendas controllerVendas = new ControllerVendas();
        BLDatas bl = new BLDatas();
        if (jrbData.isSelected()) {
            Date data = null;
            try {
                data = bl.converterDataParaDateUS(bl.converterDataParaDateUS(jdcData.getDate()));
            } catch (Exception ex) {
                Logger.getLogger(ViewVenda.class.getName()).log(Level.SEVERE, null, ex);
            }
            controllerVendas.gerarRelatorioVendaData(data);
        }else {
            controllerVendas.gerarRelatorioVendaCliente(jcbCliente.getSelectedItem().toString());
        }
            
    }//GEN-LAST:event_jbGerarRelatorioActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void listarClientes(){
        listaModelClientes = controllerCliente.getListaClienteController();
        jcbCliente.removeAllItems();
        for (int i = 0; i < listaModelClientes.size(); i++){
            jcbCliente.addItem(listaModelClientes.get(i).getNome());
        }
    }
    
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
            java.util.logging.Logger.getLogger(ViewRelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRelatorioVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRelatorioVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbGerarRelatorio;
    private componentes.UJComboBox jcbCliente;
    private com.toedter.calendar.JDateChooser jdcData;
    private javax.swing.JRadioButton jrbCliente;
    private javax.swing.JRadioButton jrbData;
    // End of variables declaration//GEN-END:variables
}
