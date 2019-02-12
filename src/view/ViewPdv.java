/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.ControllerCaixa;
import controller.ControllerCliente;
import controller.ControllerProdutos;
import controller.ControllerTipoPagamento;
import controller.ControllerVendas;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelCaixa;
import model.ModelCliente;
import model.ModelProdutos;
import model.ModelSessaoUsuario;
import model.ModelTipoPagamento;
import model.ModelVendas;
import util.BLDatas;

/**
 *
 * @author Administrador
 */
public class ViewPdv extends javax.swing.JFrame {
    ControllerVendas controllerVendas = new ControllerVendas();
    ModelVendas modelVendas = new ModelVendas();
    ModelProdutos modelProdutos = new ModelProdutos();
    ArrayList<ModelVendas> listaModelVendas = new ArrayList<>();
    ArrayList<ModelCliente> listaModelClientes = new ArrayList<>();
    ArrayList<ModelProdutos> listaProdutoses = new ArrayList<>();
    ControllerCliente controllerCliente = new ControllerCliente();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerTipoPagamento controllerTipoPagamento = new ControllerTipoPagamento();
    ModelCaixa modelCaixa = new ModelCaixa();
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    ArrayList<ModelTipoPagamento> listaModelTipoPagamentos = new ArrayList<>();
    float valorCartao, valorCheque, valorDinheiro, valorVale;
    public int quantidadeProduto;
    public int codigoProduto;
    private int returnStatus;
    public float valorTotal;
    private ViewPagamentoPDV viewPagamentoPDV;
    public float desconto;
    public int codigoVenda;
    String pNomeUsuario;

    /**
     * Creates new form ViewPdv
     */
    public ViewPdv() {
        setUndecorated(rootPaneCheckingEnabled);
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        quantidadeProduto = 1;
        //setLocationRelativeTo(null);
        configurar();
        this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
        jtfCodigoProduto.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfValorPagar = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jcbImprimirPDF = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        jtfCodigoProduto = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlOperador = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmArquivo = new javax.swing.JMenu();
        jmiSair = new javax.swing.JMenuItem();
        jmComandos = new javax.swing.JMenu();
        jmiAlterarQuantidade = new javax.swing.JMenuItem();
        jmiFinalizarVenda = new javax.swing.JMenuItem();
        jmiPesquisarProduto = new javax.swing.JMenuItem();
        jmiEstoque = new javax.swing.JMenuItem();
        jmiCancelarProduto = new javax.swing.JMenuItem();
        jmiImprimirCupom = new javax.swing.JMenuItem();

        jLabel13.setText("jLabel13");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BLVendas PDV");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 48)); // NOI18N
        jLabel9.setText("Sua Logo Aqui");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 400, 106));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bl trasparente.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        tbProdutos.setAutoCreateRowSorter(true);
        tbProdutos.setBackground(new java.awt.Color(255, 255, 204));
        tbProdutos.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 11)); // NOI18N
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Quant.", "Valor Unit.", "Valor Tot."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbProdutos.setRowSelectionAllowed(false);
        tbProdutos.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tbProdutos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setMaxWidth(40);
            tbProdutos.getColumnModel().getColumn(1).setMaxWidth(60);
            tbProdutos.getColumnModel().getColumn(2).setMinWidth(250);
            tbProdutos.getColumnModel().getColumn(2).setMaxWidth(250);
            tbProdutos.getColumnModel().getColumn(3).setMinWidth(50);
            tbProdutos.getColumnModel().getColumn(3).setMaxWidth(50);
        }

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Valor Total");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jtfValorPagar.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jtfValorPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfValorPagar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51), 2));
        jtfValorPagar.setEnabled(false);
        jtfValorPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorPagarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Status do caixa");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel3)
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Caixa aberto");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Comandos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("F7 - Cancelar produto");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("F3 - Alterar quantidade");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("F4 - Finalizar venda");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("F5 - Pesquisar produto");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("F6 - Verificar estoque");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("F8 - Imprimir cupom manual");

        jcbImprimirPDF.setSelected(true);
        jcbImprimirPDF.setText("Gerar PDF da venda para imprimir");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("F9 - Sair");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jtfValorPagar)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTextField2)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbImprimirPDF)
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfValorPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbImprimirPDF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(27, 27, 27))
        );

        jtfCodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jtfCodigoProduto.setMaximumSize(new java.awt.Dimension(6, 50));
        jtfCodigoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoProdutoActionPerformed(evt);
            }
        });
        jtfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Caixa: 1");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Operador:");

        jlOperador.setText("nome do operador");

        jmArquivo.setText("Arquivo");
        jmArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmArquivoActionPerformed(evt);
            }
        });

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jmiSair.setText("Sair");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jmArquivo.add(jmiSair);

        jMenuBar1.add(jmArquivo);

        jmComandos.setText("Comandos");

        jmiAlterarQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiAlterarQuantidade.setText("Alterar quantidade");
        jmiAlterarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAlterarQuantidadeActionPerformed(evt);
            }
        });
        jmComandos.add(jmiAlterarQuantidade);

        jmiFinalizarVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiFinalizarVenda.setText("Finalizar venda");
        jmiFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiFinalizarVendaActionPerformed(evt);
            }
        });
        jmComandos.add(jmiFinalizarVenda);

        jmiPesquisarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jmiPesquisarProduto.setText("Pesquisar produto");
        jmiPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPesquisarProdutoActionPerformed(evt);
            }
        });
        jmComandos.add(jmiPesquisarProduto);

        jmiEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jmiEstoque.setText("Verificar estoque");
        jmiEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEstoqueActionPerformed(evt);
            }
        });
        jmComandos.add(jmiEstoque);

        jmiCancelarProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        jmiCancelarProduto.setText("Cancelar produto");
        jmiCancelarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCancelarProdutoActionPerformed(evt);
            }
        });
        jmComandos.add(jmiCancelarProduto);

        jmiImprimirCupom.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jmiImprimirCupom.setText("Imprimir Cupom");
        jmiImprimirCupom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiImprimirCupomActionPerformed(evt);
            }
        });
        jmComandos.add(jmiImprimirCupom);

        jMenuBar1.add(jmComandos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlOperador)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jlOperador))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmArquivoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmArquivoActionPerformed

    private void jmiEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEstoqueActionPerformed
        // TODO add your handling code here:
         new ViewEstoquePDV().setVisible(true);
    }//GEN-LAST:event_jmiEstoqueActionPerformed

    private void jtfCodigoProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyPressed
        // TODO add your handling code here:
        keyPressed(evt);
        this.jtfValorPagar.setText(String.valueOf(this.somaEAtualizaValorTotal()));
        
    }//GEN-LAST:event_jtfCodigoProdutoKeyPressed

    private void jtfCodigoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoProdutoActionPerformed

    private void jmiAlterarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAlterarQuantidadeActionPerformed
        // TODO add your handling code here:
        ViewQuantidadePDV viewQuantidadePDV = new ViewQuantidadePDV(this, rootPaneCheckingEnabled);
        viewQuantidadePDV.setVisible(true);        
        quantidadeProduto = viewQuantidadePDV.getReturnStatus();
    }//GEN-LAST:event_jmiAlterarQuantidadeActionPerformed

    private void jmiCancelarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCancelarProdutoActionPerformed
        //pegunta se realmente deseja excluir
        int linha = tbProdutos.getSelectedRow();
        String nome = (String) tbProdutos.getValueAt(linha, 2);
        int item = (int) tbProdutos.getValueAt(linha, 0);

        int opcao = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja"
                + " excluir o item: " + item + " \n" + "\n " + nome + "?", "Atenção", JOptionPane.YES_NO_OPTION);
        //se sim exclui, se não não faz nada    
        if (opcao == JOptionPane.OK_OPTION) {

            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            int linhaSelecionada = tbProdutos.getSelectedRow();
            System.out.print("Você selecionou a linha" + linhaSelecionada);
            // Verificamos se existe realmente alguma linha selecionada
            if (linhaSelecionada < 0) {
                return;
            } else {
                // Remove a linha
                modelo.removeRow(linhaSelecionada);
            }
        }
    }//GEN-LAST:event_jmiCancelarProdutoActionPerformed

    private void jmiFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiFinalizarVendaActionPerformed
        viewPagamentoPDV.setValorTotal(Float.parseFloat(this.jtfValorPagar.getText()));
        viewPagamentoPDV.setTextFildValorTotal();
        viewPagamentoPDV.setVisible(true);
        zerarValoresCaixa();
        if (viewPagamentoPDV.getReturnStatus() == 1) {
            salvarVenda();
        }
    }//GEN-LAST:event_jmiFinalizarVendaActionPerformed

    private void jmiPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPesquisarProdutoActionPerformed
        // TODO add your handling code here:
        ViewPesquisarProdutoPDV viewPesquisarProduto = new ViewPesquisarProdutoPDV(this, rootPaneCheckingEnabled);
        viewPesquisarProduto.setVisible(true);        
        codigoProduto = viewPesquisarProduto.getReturnStatus();
        this.adicionarProdutoPesquisa(codigoProduto);
        somaEAtualizaValorTotal();
    }//GEN-LAST:event_jmiPesquisarProdutoActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiImprimirCupomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiImprimirCupomActionPerformed
        // TODO add your handling code here:
        new ViewImprimirPDV(this, rootPaneCheckingEnabled).setVisible(true);
        
    }//GEN-LAST:event_jmiImprimirCupomActionPerformed

    private void jtfValorPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfValorPagarActionPerformed

    private void adicionarValorCaixa() {
        modelCaixa = new ModelCaixa();
        modelCaixa = controllerCaixa.getCaixaController(1);
        if (modelVendas.getTipoPagamento() == 1) {
            valorDinheiro = modelVendas.getValorTotal();
            modelCaixa.setDinheiro(modelCaixa.getDinheiro() + valorDinheiro);
        } else if (modelVendas.getTipoPagamento() == 2) {
            valorCartao = modelVendas.getValorTotal();
            modelCaixa.setCartao(modelCaixa.getCartao() + valorCartao);
        } else if (modelVendas.getTipoPagamento() == 3) {
            valorCheque = modelVendas.getValorTotal();
            modelCaixa.setCheque(modelCaixa.getCheque() + valorCheque);
        } else if (modelVendas.getTipoPagamento() == 4) {
            valorVale = modelVendas.getValorTotal();
            modelCaixa.setVale(modelCaixa.getVale() + valorVale);
        }
        controllerCaixa.atualizarCaixaController(modelCaixa);
    }
    
    private void zerarValoresCaixa() {
        valorCartao = 0;
        valorCheque = 0;
        valorDinheiro = 0;
        valorVale = 0;
    }
    
    //PEGA LETRAS DIGITADAS       
    public void keyPressed(java.awt.event.KeyEvent e) {
        if (e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            ControllerProdutos controllerProdutos = new ControllerProdutos();
            ModelProdutos modelProdutos = new ModelProdutos();
            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            try{
            modelProdutos = controllerProdutos.getProdutosCodigoBarrasController(this.jtfCodigoProduto.getText());

            modelo.addRow(new Object[]{
                tbProdutos.getRowCount() + 1,
                modelProdutos.getCodigo(),
                modelProdutos.getNome(),
                quantidadeProduto,
                modelProdutos.getValor(),
                modelProdutos.getValor() * quantidadeProduto
            });
            

            quantidadeProduto = 1;
            this.jtfCodigoProduto.setText(null);
            }catch(Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Código inexistente!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        
    }

    private void adicionarProdutoPesquisa(int pCodigoProduto) {
        ControllerProdutos controllerProdutos = new ControllerProdutos();
        ModelProdutos modelProdutos = new ModelProdutos();
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelProdutos = controllerProdutos.getProdutosController(pCodigoProduto);

        System.out.println(quantidadeProduto);

        modelo.addRow(new Object[]{
            tbProdutos.getRowCount() + 1,
            modelProdutos.getCodigo(),
            modelProdutos.getNome(),
            quantidadeProduto,
            modelProdutos.getValor(),
            modelProdutos.getValor() * quantidadeProduto
        });

        quantidadeProduto = 1;
        this.jtfCodigoProduto.setText(null);
    }
    
    private void limparTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
        modelo.setNumRows(0);
    }
    
    /**
     * Soma e atualiza os valores total
     * @return 
     */
    private double somaEAtualizaValorTotal() {
        double soma = 0;
        double valor = 0;
        int cont = tbProdutos.getRowCount();
        for (int i = 0; i < cont; i++) {
            valor = Double.parseDouble(String.valueOf(tbProdutos.getValueAt(i, 5)));
            soma = valor+soma;
        }
        return soma;
    }
    
    public int getReturnStatus() {
        return returnStatus;
    }
    
    public float getValorTotal(){
        return valorTotal;
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
            java.util.logging.Logger.getLogger(ViewPdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPdv.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPdv().setVisible(true);
            }
        });
    }
    /**
     * Imprimir cupom
     */
    private void imprimirCupom(){
        ControllerVendas controllerVendas = new ControllerVendas();
        controllerVendas.gerarRelatorioPDV(codigoVenda);
    }
    
    
    public String retornarUsuarioLogado(){
        return new ModelSessaoUsuario().nome;
    }
    
    
    private void configurar(){
        pNomeUsuario = retornarUsuarioLogado();
        jlOperador.setText(pNomeUsuario);
        
    }
    
    private boolean salvarVenda() {
           listaModelVendas = new ArrayList<>();
            listaProdutoses = new ArrayList<>();
            int codigoProduto, quantidade;
            BLDatas bl = new BLDatas();

            for (int i = 0; i < tbProdutos.getRowCount(); i++) {
                modelVendas = new ModelVendas();
                modelProdutos = new ModelProdutos();
                modelVendas.setClientesCodigo(1);
                modelVendas.setDesconto(viewPagamentoPDV.getDesconto());
                modelVendas.setValorTotal(viewPagamentoPDV.getValorTotal());
                try {
                    modelVendas.setDataVenda(bl.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
                } catch (Exception ex) {
                    Logger.getLogger(ViewVenda.class.getName()).log(Level.SEVERE, null, ex);
                }
                codigoProduto = Integer.parseInt(tbProdutos.getValueAt(i, 1).toString());
                modelVendas.setProdutosCodigo(codigoProduto);
                modelVendas.setQuantidade(Integer.parseInt(tbProdutos.getValueAt(i, 3).toString()));
                modelVendas.setTipoPagamento(controllerTipoPagamento.getTipoPagamentoController(viewPagamentoPDV.getTipoPagamento()).getCodigo());
                modelProdutos.setCodigo(codigoProduto);
                quantidade = controllerProdutos.getProdutosController(codigoProduto).getEstoque() - Integer.parseInt(tbProdutos.getValueAt(i, 3).toString());
                modelProdutos.setEstoque(quantidade);
                listaModelVendas.add(modelVendas);
                listaProdutoses.add(modelProdutos);
            }
            modelVendas.setListamModelVendases(listaModelVendas);
            modelProdutos.setListaModelProdutoses(listaProdutoses);
            
            //salvar venda
            codigoVenda = controllerVendas.salvarVendasController(modelVendas);
            if (codigoVenda > 0) {
                modelVendas.setCodigo(codigoVenda);
                //da baixa no estoque
                controllerProdutos.atualizarProdutosQuantidadeController(modelProdutos);
                //salvar lista de produtos
                controllerVendas.salvarVendasProdutosController(modelVendas);
                JOptionPane.showMessageDialog(this, "Registro gravado com sucesso!");
                adicionarValorCaixa();
                if (jcbImprimirPDF.isSelected()) {
                    //imprimir cupom
                    imprimirCupom();
                }
                limparTabela();
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao gravar os dados!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox jcbImprimirPDF;
    private javax.swing.JLabel jlOperador;
    private javax.swing.JMenu jmArquivo;
    private javax.swing.JMenu jmComandos;
    private javax.swing.JMenuItem jmiAlterarQuantidade;
    private javax.swing.JMenuItem jmiCancelarProduto;
    private javax.swing.JMenuItem jmiEstoque;
    private javax.swing.JMenuItem jmiFinalizarVenda;
    private javax.swing.JMenuItem jmiImprimirCupom;
    private javax.swing.JMenuItem jmiPesquisarProduto;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JFormattedTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfValorPagar;
    private javax.swing.JTable tbProdutos;
    // End of variables declaration//GEN-END:variables
}
