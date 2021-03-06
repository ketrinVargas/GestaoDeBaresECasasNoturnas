/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Arquivo;
import model.Enums.Classe;
import model.Listas.ListaProduto;
import model.Objetos.Produto;


/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class AreaProdutos extends javax.swing.JInternalFrame{
    
    /**
     * Creates new form AreaProdutos
     */
    
    private static List<Produto> listaProduto;
    private DefaultTableModel dtm;
    private static int ide;
    private static int[] indexCod;
    private static boolean editavel;
    
    public AreaProdutos(ListaProduto listaProduto) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        initComponents();
        indexCod = new int[1000];
        editavel = false;
        ide = 0;
 
        DefaultTableModel modelo = (DefaultTableModel) jTabProdCadastrados.getModel();
        jTabProdCadastrados.setRowSorter(new TableRowSorter (modelo));
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        jCadEdProd = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jBuscaCod = new javax.swing.JTextField();
        jBotaoPesquisarProd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabProdCadastrados = new javax.swing.JTable();
        jBotaoExcluirProd = new javax.swing.JButton();
        jBotaoEditarProd = new javax.swing.JButton();
        jBotaoOrdenar = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jCodCad = new javax.swing.JTextField();
        jQtdProdCad = new javax.swing.JTextField();
        jCustoProdCad = new javax.swing.JTextField();
        jVendaProdCad = new javax.swing.JTextField();
        jBotaoConfirmaCadProd = new javax.swing.JButton();
        jCod = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Produtos Cadastrados");

        jLabel8.setText("Busca por C??digo");

        jBotaoPesquisarProd.setText("Pesquisar");
        jBotaoPesquisarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoPesquisarProdActionPerformed(evt);
            }
        });

        jTabProdCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C??digo", "Descri????o", "Quantidade", "Pre??o Custo", "Pre??o Venda "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabProdCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabProdCadastradosMouseClicked(evt);
            }
        });
        jTabProdCadastrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTabProdCadastradosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabProdCadastrados);

        jBotaoExcluirProd.setText("Excluir");
        jBotaoExcluirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluirProdActionPerformed(evt);
            }
        });

        jBotaoEditarProd.setText("Editar");
        jBotaoEditarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoEditarProdActionPerformed(evt);
            }
        });

        jBotaoOrdenar.setText("Ordenar");
        jBotaoOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoOrdenarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "C??digo", "Consumo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBotaoExcluirProd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotaoEditarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBotaoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel7))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBuscaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotaoPesquisarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jBuscaCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoPesquisarProd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoExcluirProd)
                    .addComponent(jBotaoEditarProd)
                    .addComponent(jBotaoOrdenar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jCadEdProd.addTab("Produtos Cadastrados", jPanel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Produtos\n");

        jLabel1.setText("C??digo");

        jLabel3.setText("Descri????o");

        jLabel4.setText("Quantidade");

        jLabel5.setText("Pre??o de custo");

        jLabel6.setText("Pre??o de venda");

        jCodCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodCadActionPerformed(evt);
            }
        });

        jBotaoConfirmaCadProd.setText("Confirma");
        jBotaoConfirmaCadProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConfirmaCadProdActionPerformed(evt);
            }
        });

        jCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jCod, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCodCad, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCustoProdCad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jQtdProdCad, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jVendaProdCad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jBotaoConfirmaCadProd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCodCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jQtdProdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCustoProdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jVendaProdCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jBotaoConfirmaCadProd)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        jCadEdProd.addTab("Cadastro/Edi????o de Produtos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCadEdProd)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCadEdProd)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoEditarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoEditarProdActionPerformed
        // TODO add your handling code here:
        
          if(jTabProdCadastrados.getSelectedRow() != -1){
              EditarProduto();
            jTabProdCadastrados.setValueAt(jCod.getText(), jTabProdCadastrados.getSelectedRow(), 0);
            jTabProdCadastrados.setValueAt(jCodCad.getText(), jTabProdCadastrados.getSelectedRow(), 1);
            jTabProdCadastrados.setValueAt(jQtdProdCad.getText(), jTabProdCadastrados.getSelectedRow(), 2);            
            jTabProdCadastrados.setValueAt(jCustoProdCad.getText(), jTabProdCadastrados.getSelectedRow(), 3);           
            jTabProdCadastrados.setValueAt(jVendaProdCad.getText(), jTabProdCadastrados.getSelectedRow(), 4);  
    
        }
    }//GEN-LAST:event_jBotaoEditarProdActionPerformed

    private void jBotaoConfirmaCadProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoConfirmaCadProdActionPerformed
        try {
            // TODO add your handling code here:
            iniciar();
        } catch (IOException ex) {
            Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
       if (jCod.getText().equals("") || jCodCad.getText().equals("") || jQtdProdCad.getText().equals("")||
          jCustoProdCad.getText().equals("")|| jVendaProdCad.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
      } else {
          Produto prod = new Produto( 
                  Integer.parseInt(jCod.getText().trim()),
                  jCodCad.getText().trim(),
                  Integer.parseInt(jQtdProdCad.getText().trim()),
                  Float.parseFloat(jCustoProdCad.getText().trim()),
                  Float.parseFloat(jVendaProdCad.getText().trim()));
          
           
            if (ListaProduto.addProduto(prod) == false){           
                   JOptionPane.showMessageDialog(null, "N??o foi poss??vel salvar.");
            
            } else {
              try {
                  ListaProduto.encera();
                  JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                  listarProduto();
              } catch (IllegalAccessException ex) {
                  Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
              } catch (IllegalArgumentException ex) {
                  Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
              } catch (InvocationTargetException ex) {
                  Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
              } catch (IOException ex) {
                  Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
              }
                   limpar();
            }
       }
                
    }//GEN-LAST:event_jBotaoConfirmaCadProdActionPerformed

    private void jCodCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodCadActionPerformed

    private void jBotaoExcluirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluirProdActionPerformed
        // TODO add your handling code here:
      
        int index = jTabProdCadastrados.getSelectedRow();
        int cod = getCod(index);
       
        if (ListaProduto.remove(cod)) {
            JOptionPane.showMessageDialog(null, "Campo n??o encontro");
        } else {
            try {
               ListaProduto.encera(); ; 
               DefaultTableModel dtm = (DefaultTableModel) jTabProdCadastrados.getModel(); 
               dtm.removeRow(jTabProdCadastrados.getSelectedRow()); 
               JOptionPane.showMessageDialog(null, "Campo deletado com sucesso.");
            } catch (IOException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jBotaoExcluirProdActionPerformed

    private void jTabProdCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabProdCadastradosMouseClicked
        // TODO add your handling code here:
        
        if( jTabProdCadastrados.getSelectedRow() != -1){
          
          jCod.setText( jTabProdCadastrados.getValueAt( jTabProdCadastrados.getSelectedRow(), 0).toString()); 
          jCodCad.setText( jTabProdCadastrados.getValueAt( jTabProdCadastrados.getSelectedRow(), 1).toString());
          jQtdProdCad.setText( jTabProdCadastrados.getValueAt( jTabProdCadastrados.getSelectedRow(), 2).toString());
          jCustoProdCad.setText( jTabProdCadastrados.getValueAt( jTabProdCadastrados.getSelectedRow(), 3).toString());
          jVendaProdCad.setText( jTabProdCadastrados.getValueAt( jTabProdCadastrados.getSelectedRow(), 4).toString());
        }
    }//GEN-LAST:event_jTabProdCadastradosMouseClicked

    private void jTabProdCadastradosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabProdCadastradosKeyReleased
        // TODO add your handling code here:
        
         if(jTabProdCadastrados.getSelectedRow() != -1){
          
          jCod.setText( jTabProdCadastrados.getValueAt( jTabProdCadastrados.getSelectedRow(), 0).toString()); 
          jCodCad.setText(jTabProdCadastrados.getValueAt(jTabProdCadastrados.getSelectedRow(), 1).toString());
          jQtdProdCad.setText(jTabProdCadastrados.getValueAt(jTabProdCadastrados.getSelectedRow(), 2).toString());
          jCustoProdCad.setText(jTabProdCadastrados.getValueAt(jTabProdCadastrados.getSelectedRow(), 3).toString());
          jVendaProdCad.setText(jTabProdCadastrados.getValueAt(jTabProdCadastrados.getSelectedRow(), 4).toString());
    
        }
    }//GEN-LAST:event_jTabProdCadastradosKeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jBotaoOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoOrdenarActionPerformed
        // TODO add your handling code here:
        
        String indice = jComboBox1.getSelectedItem().toString();
        switch (indice) {
            case "C??digo":
                ListaProduto.listarProdutoPorCodigo();
           break;
            case "Consumo":
                ListaProduto.listarProdutoPorCodigo();
            break;  
        }  
        try {
            listarProduto();
        } catch (IllegalAccessException | InvocationTargetException ex) {
                    Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotaoOrdenarActionPerformed

    private void jBotaoPesquisarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoPesquisarProdActionPerformed
        // TODO add your handling code here:
        try {
            int i = Integer.parseInt(jBuscaCod.getText());
            ListaProduto.listarProdutoPorCodigo();
            listarProduto();           
        } catch (Exception ex) {
            Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBotaoPesquisarProdActionPerformed

    private void jCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoConfirmaCadProd;
    private javax.swing.JButton jBotaoEditarProd;
    private javax.swing.JButton jBotaoExcluirProd;
    private javax.swing.JButton jBotaoOrdenar;
    private javax.swing.JButton jBotaoPesquisarProd;
    private javax.swing.JTextField jBuscaCod;
    private javax.swing.JTabbedPane jCadEdProd;
    private javax.swing.JTextField jCod;
    private javax.swing.JTextField jCodCad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jCustoProdCad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jQtdProdCad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTabProdCadastrados;
    private javax.swing.JTextField jVendaProdCad;
    // End of variables declaration//GEN-END:variables
   
    private void limpar() {
      jCod.equals("");
      jCodCad.equals("");
      jQtdProdCad.equals("");
      jCustoProdCad.equals("");
      jVendaProdCad.equals("");
    }
    
     public static int getCod(int index){
        return indexCod[index];
    }

   public void listarProduto() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
    /*Produto objetoProduto =  new Produto(null, 0, 0, 0);
    dtm = (DefaultTableModel) jTabProdCadastrados.getModel();
    listaProduto = ListaProduto.getLista(objetoProduto, null, null);

    for (int i = 0; i<listaProduto.size(); i++){
        Produto prod = listaProduto.get(i);
          indexCod[i++] = prod.getCod(); 
    }

    int indexador = 0;
    for (Produto m : listaProduto){
        jTabProdCadastrados.setValueAt(m.getCod(), indexador, 0);
        jTabProdCadastrados.setValueAt(m.getDescricao(), indexador, 1);
        jTabProdCadastrados.setValueAt(m.getQuantidade(), indexador, 2);
        jTabProdCadastrados.setValueAt(m.getPrecoCusto(), indexador, 3);
        jTabProdCadastrados.setValueAt(m.getPrecoVenda(), indexador, 4);
        indexador++;
    }*/
    
      DefaultTableModel dtm = (DefaultTableModel) jTabProdCadastrados.getModel();
      Object [] dados = {jCod.getText(),jCodCad.getText(), jQtdProdCad.getText(),jCustoProdCad.getText(), jVendaProdCad.getText()};
      dtm.addRow(dados);

      }
   
   public void iniciar() throws IOException{
              
     for(Classe c : Classe.values()){
         try {
             Arquivo.iniciaArquivos(c);
         } catch (IOException ex) {
             Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
         }
           }
            ListaProduto.inicia();
            
   }
   
   private void EditarProduto(){
        Produto prod = null;
        if (ListaProduto.editar(ide, prod) == false) {
                    JOptionPane.showMessageDialog(null, "N??o foi poss??vel editar.");
                    editavel = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Edi????o efetuada!");
                    editavel = false;
                try { 
                    ListaProduto.encera();
                } catch (IOException ex) {
                    Logger.getLogger(AreaProdutos.class.getName()).log(Level.SEVERE, null, ex);
                }
              
       
   }
   }
   
   
}
