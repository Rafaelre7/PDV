/**
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e código fonte
*/
package view;

import controller.ControllerUsuario;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.ModelSessaoUsuario;
import model.ModelUsuario;

public class ViewLogin extends javax.swing.JFrame {
    
   
    private ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();

    public ViewLogin() {
        setUndecorated(rootPaneCheckingEnabled);
        initComponents();
        setLocation(400,100);
    
        //this.setIconImage(new ImageIcon(getClass().getResource("/imagens/myADM_mini.png")).getImage());
        bEntrar.setBackground(new Color(0,0,0,0));
        bSair.setBackground(new Color(0,0,0,0));
        setSize(500, 480);
     
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfUsuario = new javax.swing.JTextField();
        jtfSenha = new javax.swing.JPasswordField();
        bEntrar = new javax.swing.JButton();
        bSair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("myPDV - Login");
        setMaximumSize(new java.awt.Dimension(321, 167));
        setMinimumSize(new java.awt.Dimension(321, 167));
        getContentPane().setLayout(null);

        jtfUsuario.setBackground(new java.awt.Color(204, 204, 204));
        jtfUsuario.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        getContentPane().add(jtfUsuario);
        jtfUsuario.setBounds(140, 190, 220, 50);

        jtfSenha.setBackground(new java.awt.Color(204, 204, 204));
        jtfSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jtfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jtfSenha);
        jtfSenha.setBounds(140, 280, 220, 50);

        bEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ok.png"))); // NOI18N
        bEntrar.setAutoscrolls(true);
        bEntrar.setBorder(null);
        bEntrar.setBorderPainted(false);
        bEntrar.setContentAreaFilled(false);
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(bEntrar);
        bEntrar.setBounds(350, 380, 80, 80);

        bSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Cancelar.png"))); // NOI18N
        bSair.setToolTipText("Cancelar");
        bSair.setBorder(null);
        bSair.setBorderPainted(false);
        bSair.setContentAreaFilled(false);
        bSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSairActionPerformed(evt);
            }
        });
        getContentPane().add(bSair);
        bSair.setBounds(250, 380, 80, 80);

        jLabel4.setFont(new java.awt.Font("Courier New", 3, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundoLogin.png"))); // NOI18N
        jLabel4.setText(".");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -30, 526, 540);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 70, 63, 63);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private boolean visibilidade(){
    return true;
}
    
    private void bSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bSairActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_bEntrarActionPerformed

    private void autenticar() {

        ModelUsuario modelUsuario = new ModelUsuario();
        ControllerUsuario controllerUsuario = new ControllerUsuario();
        modelUsuario.setLogin(this.jtfUsuario.getText());
        modelUsuario.setSenha(new String(this.jtfSenha.getPassword()));

       
        if (controllerUsuario.getUsuarioController(modelUsuario)) {
            modelSessaoUsuario.nome = controllerUsuario.getUsuarioController(modelUsuario.getLogin()).getNome();
            ViewPrincipal viewPrincipal = new ViewPrincipal();
            viewPrincipal.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Usuário/Senha inválida.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }

    }
    private void jtfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSenhaActionPerformed
        // TODO add your handling code here:
        autenticar();
    }//GEN-LAST:event_jtfSenhaActionPerformed

        public static void main(String args[]) {         
            
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                new ViewLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JButton bSair;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jtfSenha;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
