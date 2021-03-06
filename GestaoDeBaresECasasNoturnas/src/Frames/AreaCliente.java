/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.Arquivo;
import model.Enums.Classe;
import model.Listas.ListaClientes;
import model.Objetos.Cliente;


/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */

public class AreaCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form AreaCliente
     */
    private static List<Cliente> listaCliente;
    private DefaultTableModel dtmCliente;
    private static int ide;
    private static int[] indexRg;
    private static boolean editavel;

     
    public AreaCliente(ListaClientes listaCliente) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        initComponents();
        indexRg = new int[1000];
        editavel = false;
        ide = 0;

        DefaultTableModel modelo = (DefaultTableModel) jTabClientesCadastrados.getModel();
        jTabClientesCadastrados.setRowSorter(new TableRowSorter (modelo));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBuscaRG = new javax.swing.JTextField();
        jBotaoPesquisarCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabClientesCadastrados = new javax.swing.JTable();
        jBotaoExcluirCliente = new javax.swing.JButton();
        jBotaoEditarCliente = new javax.swing.JButton();
        jBotaoConfirmaClienteVis = new javax.swing.JButton();
        jComboBox11 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jNomeCadCliente = new javax.swing.JTextField();
        jNroRGCadCliente = new javax.swing.JTextField();
        jDropDCatCliente = new javax.swing.JComboBox<>();
        jCredCadCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("??rea de Clientes");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Clientes Cadastrados");

        jLabel7.setText("Busca por RG");

        jBotaoPesquisarCliente.setText("Pesquisar");
        jBotaoPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoPesquisarClienteActionPerformed(evt);
            }
        });

        jTabClientesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "RG", "Categoria", "Cr??ditos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTabClientesCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabClientesCadastradosMouseClicked(evt);
            }
        });
        jTabClientesCadastrados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTabClientesCadastradosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTabClientesCadastrados);

        jBotaoExcluirCliente.setText("Excluir");
        jBotaoExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoExcluirClienteActionPerformed(evt);
            }
        });

        jBotaoEditarCliente.setText("Editar");
        jBotaoEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoEditarClienteActionPerformed(evt);
            }
        });

        jBotaoConfirmaClienteVis.setText("Ordenar");
        jBotaoConfirmaClienteVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotaoConfirmaClienteVisActionPerformed(evt);
            }
        });

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Nome", "Categoria" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBotaoExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotaoEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBotaoConfirmaClienteVis, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBuscaRG, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBotaoPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 70, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jBuscaRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBotaoPesquisarCliente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotaoExcluirCliente)
                    .addComponent(jBotaoEditarCliente)
                    .addComponent(jBotaoConfirmaClienteVis)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clientes Cadastrados", jPanel1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Clientes");

        jLabel2.setText("Nome Completo");

        jLabel3.setText("N??mero RG");

        jLabel4.setText("Categoria");

        jLabel5.setText("Cr??dito");

        jDropDCatCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione  a categoria desejada>", "Pista", "Camarote", "V.I.P" }));

        jButton1.setText("Confirma");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jNroRGCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jNomeCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDropDCatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCredCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(244, 244, 244))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jNomeCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jNroRGCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jDropDCatCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCredCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jButton1)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro/Edi????o Clientes", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotaoEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoEditarClienteActionPerformed
        // TODO add your handling code here:
        
        if(jTabClientesCadastrados.getSelectedRow() != -1){
            EditarClientes();
            
            jTabClientesCadastrados.setValueAt(jNomeCadCliente.getText(), jTabClientesCadastrados.getSelectedRow(), 0);
            jTabClientesCadastrados.setValueAt(jNroRGCadCliente.getText(), jTabClientesCadastrados.getSelectedRow(), 1);
            jTabClientesCadastrados.setValueAt(jDropDCatCliente.getSelectedItem(), jTabClientesCadastrados.getSelectedRow(), 2);            
            jTabClientesCadastrados.setValueAt(jCredCadCliente.getText(), jTabClientesCadastrados.getSelectedRow(), 3);           
         
    
        }
        
    }//GEN-LAST:event_jBotaoEditarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            iniciar();
        } catch (IOException ex) {
            Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      if (jNomeCadCliente.getText().equals("") || jNroRGCadCliente.getText().equals("")||
          jDropDCatCliente.getSelectedItem().equals("")|| jCredCadCliente.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe todos os campos!");
      } else {
          Cliente client = new Cliente(
                  Integer.parseInt(jNroRGCadCliente.getText().trim()),
                  jDropDCatCliente.getSelectedItem().toString(),
                  jNomeCadCliente.getText().trim(),
                  Integer.parseInt(jCredCadCliente.getText().trim()));
          
         if (ListaClientes.addCliente(client) == false) {
                JOptionPane.showMessageDialog(null, "N??o foi poss??vel salvar.");
            } else {
              try {

                  try {
                      ListaClientes.encera();
                  } catch (IOException ex) {
                      Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  JOptionPane.showMessageDialog(null, "Cadastro Efetuado!");
                   
                  listarClientes();
   
                  limpar();
              } catch (IllegalAccessException ex) {
                  Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
              } catch (IllegalArgumentException ex) {
                  Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
              } catch (InvocationTargetException ex) {
                  Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
              } catch (IOException ex) {
                  Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
              }
         }
      }
                    
                      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotaoExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoExcluirClienteActionPerformed
      
        int index = jTabClientesCadastrados.getSelectedRow();
        int rg = getRg(index);
       
        if (ListaClientes.remove(rg)) {
            JOptionPane.showMessageDialog(null, "Campo n??o encontro");
        } else {
            try {
              ListaClientes.encera(); 
               DefaultTableModel dtm = (DefaultTableModel) jTabClientesCadastrados.getModel(); 
               dtm.removeRow(jTabClientesCadastrados.getSelectedRow()); 
               JOptionPane.showMessageDialog(null, "Campo deletado com sucesso.");
            } catch (IOException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jBotaoExcluirClienteActionPerformed

    private void jTabClientesCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabClientesCadastradosMouseClicked
        // TODO add your handling code here:
        
        if(jTabClientesCadastrados.getSelectedRow() != -1){
            
          jNomeCadCliente.setText(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 0).toString());
          jNroRGCadCliente.setText(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 1).toString());
          jDropDCatCliente.setActionCommand(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 2).toString());
          jCredCadCliente.setText(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 3).toString());
    
        }
            
        
    }//GEN-LAST:event_jTabClientesCadastradosMouseClicked

    private void jTabClientesCadastradosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabClientesCadastradosKeyReleased
        // TODO add your handling code here:
        
        if(jTabClientesCadastrados.getSelectedRow() != -1){
            
          jNomeCadCliente.setText(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 0).toString());
          jNroRGCadCliente.setText(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 1).toString());
          jDropDCatCliente.setActionCommand(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 2).toString());
          jCredCadCliente.setText(jTabClientesCadastrados.getValueAt(jTabClientesCadastrados.getSelectedRow(), 3).toString());
    
        }
        
    }//GEN-LAST:event_jTabClientesCadastradosKeyReleased

    private void jBotaoPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoPesquisarClienteActionPerformed
        // TODO add your handling code here:
        
        int indice = Integer.parseInt(jBuscaRG.getText());
        try {
            ListaClientes.consultarCliente(indice);
            listarClientes();           
        } catch (Exception ex) {
            Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
              
        
    }//GEN-LAST:event_jBotaoPesquisarClienteActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jBotaoConfirmaClienteVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotaoConfirmaClienteVisActionPerformed
        // TODO add your handling code here:
        
        String indice = jComboBox11.getSelectedItem().toString();
        switch (indice) {
            case "Nome":
                ListaClientes.listarPorNome();
        {
            try {
                listarClientes();
            } catch (IllegalAccessException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
           break;
            case "Categoria":
                ListaClientes.listaPorCategoria();
        {
            try {
                listarClientes();
            } catch (IllegalAccessException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InvocationTargetException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            break;    
        }  
      
    }//GEN-LAST:event_jBotaoConfirmaClienteVisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotaoConfirmaClienteVis;
    private javax.swing.JButton jBotaoEditarCliente;
    private javax.swing.JButton jBotaoExcluirCliente;
    private javax.swing.JButton jBotaoPesquisarCliente;
    private javax.swing.JTextField jBuscaRG;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox11;
    private javax.swing.JTextField jCredCadCliente;
    private javax.swing.JComboBox<String> jDropDCatCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNomeCadCliente;
    private javax.swing.JTextField jNroRGCadCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabClientesCadastrados;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
 
    private void limpar() {
       jNomeCadCliente.equals("");
       jNroRGCadCliente.equals("");
       jDropDCatCliente.equals("");
       jCredCadCliente.equals("");
    }
    
    public static int getRg(int index){
        return indexRg[index];
    }
    
     
     public void EditarClientes(){
        Cliente client = null;

                if (ListaClientes.editar(ide, client) != false) {
                    JOptionPane.showMessageDialog(null, "N??o foi poss??vel editar.");
                    editavel = false;
                } else {
                     JOptionPane.showMessageDialog(null, "Edi????o efetuada!");
                   editavel = false;

                try { 
                    ListaClientes.encera();
                } catch (IOException ex) {
                    Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
         
              }
          
     }

            
 
   public void listarClientes() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException{
    /*Cliente objetoCliente =  new Cliente(0, null, null, 0);
    dtmCliente = (DefaultTableModel) jTabClientesCadastrados.getModel();
    listaCliente = ListaClientes.getLista(objetoCliente, null, null);
    

    for (int i = 0; i<listaCliente.size(); i++){
        Cliente client = listaCliente.get(i);
        indexRg[i++] = client.getRG(); 
    }

    int indexador = 0;
    for (Cliente m : listaCliente){
        jTabClientesCadastrados.setValueAt(m.getNome(), indexador, 0);
        jTabClientesCadastrados.setValueAt(m.getRG(), indexador, 1);
        jTabClientesCadastrados.setValueAt(m.getCategoria(), indexador, 2);
        jTabClientesCadastrados.setValueAt(m.getCredito(), indexador, 3);
        indexador++;
    }*/
    
      this.jTabbedPane1.setSelectedIndex(1);
      DefaultTableModel dtm = (DefaultTableModel) jTabClientesCadastrados.getModel();
      Object [] dados = {jNomeCadCliente.getText(), jNroRGCadCliente.getText(),jDropDCatCliente.getSelectedItem(), jCredCadCliente.getText()};
      dtm.addRow(dados);
     
     
     /* DefaultTableModel dtm = (DefaultTableModel) jTabClientesCadastrados.getModel();
      if(dtm.getRowCount()> 0){
          dtm.setRowCount(0);
          
      }
      
      String dir = System.getProperty("user.home") + "C:\\Users\\ketrim\\Documents\\ArquivoPOO";
      String nomeArquivo = "ArquivoPOO";
      File arquivo = new File(dir,nomeArquivo);
      
      FileInputStream fis = new FileInputStream(arquivo);
      InputStreamReader isr = new InputStreamReader(fis); 
      BufferedReader br = new BufferedReader(isr);
      
      String linha = br.readLine();
      while(linha != null){
          Object[] obj = linha.split(";");
          dtm.addRow(obj);
          linha = br.readLine();
      }*/
      
   
   
   }
   
    public void iniciar() throws IOException{
              
     for(Classe c : Classe.values()){
         try {
             Arquivo.iniciaArquivos(c);
         } catch (IOException ex) {
             Logger.getLogger(AreaCliente.class.getName()).log(Level.SEVERE, null, ex);
         }
           }
            ListaClientes.inicia();
            
   }
}
