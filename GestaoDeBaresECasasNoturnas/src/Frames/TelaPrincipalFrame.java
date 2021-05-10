/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Listas.ListaClientes;
import model.Listas.ListaConsumo;
import model.Listas.ListaProduto;

/**
 *
 * @author Ketrin D. Vargas, Marina B. Otokovieski, Rafael Souza
 */
public class TelaPrincipalFrame extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalFrame
     */
    private static ListaClientes listaCliente;
    private static ListaProduto listaProduto;
    private static ListaConsumo listaConsumo;
    
    public TelaPrincipalFrame() {
        initComponents();
        listaCliente = new ListaClientes(); 
        listaProduto = new ListaProduto();
        listaConsumo = new ListaConsumo();
        
         setExtendedState(MAXIMIZED_BOTH);  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jAreaClienteBarraSuperior = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jAreaProdutosBarraSuperior = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jCaixaBarraSuperiorTelaPrincipal = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jSobre = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jComoUsarTelaPrincipal = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenu1.setText("Clientes");

        jAreaClienteBarraSuperior.setText("Área do Cliente");
        jAreaClienteBarraSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAreaClienteBarraSuperiorActionPerformed(evt);
            }
        });
        jMenu1.add(jAreaClienteBarraSuperior);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cart.png"))); // NOI18N
        jMenu2.setText("Produtos");

        jAreaProdutosBarraSuperior.setText("Área de Produtos");
        jAreaProdutosBarraSuperior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAreaProdutosBarraSuperiorActionPerformed(evt);
            }
        });
        jMenu2.add(jAreaProdutosBarraSuperior);

        jMenuBar1.add(jMenu2);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/money_dollar.png"))); // NOI18N
        jMenu5.setText("Financeiro");

        jCaixaBarraSuperiorTelaPrincipal.setText("Caixa");
        jCaixaBarraSuperiorTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCaixaBarraSuperiorTelaPrincipalActionPerformed(evt);
            }
        });
        jMenu5.add(jCaixaBarraSuperiorTelaPrincipal);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/information.png"))); // NOI18N
        jMenu3.setText("Sobre");

        jSobre.setText("Sobre o sistema");
        jMenu3.add(jSobre);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ajuda");

        jComoUsarTelaPrincipal.setText("Como Usar");
        jComoUsarTelaPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComoUsarTelaPrincipalActionPerformed(evt);
            }
        });
        jMenu4.add(jComoUsarTelaPrincipal);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jAreaClienteBarraSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAreaClienteBarraSuperiorActionPerformed
        AreaCliente Clientess = null;
        try {
            Clientess = new AreaCliente(listaCliente);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(TelaPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TelaPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(TelaPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(Clientess);
        Clientess.setVisible(true);
    }//GEN-LAST:event_jAreaClienteBarraSuperiorActionPerformed

    private void jAreaProdutosBarraSuperiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAreaProdutosBarraSuperiorActionPerformed
        AreaProdutos Produtoss = null;
        try {
            Produtoss = new AreaProdutos(listaProduto);
        } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException ex) {
            Logger.getLogger(TelaPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(Produtoss);
        Produtoss.setVisible(true);
    }//GEN-LAST:event_jAreaProdutosBarraSuperiorActionPerformed

    private void jCaixaBarraSuperiorTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCaixaBarraSuperiorTelaPrincipalActionPerformed
        Contabilidade Adm = null;
        try {
            Adm = new Contabilidade(listaConsumo);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(TelaPrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDesktopPane1.add(Adm);
        Adm.setVisible(true);
    }//GEN-LAST:event_jCaixaBarraSuperiorTelaPrincipalActionPerformed

    private void jComoUsarTelaPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComoUsarTelaPrincipalActionPerformed
        JOptionPane.showMessageDialog(jMenuBar1, "Clientes: A área de administração de clientes pode ser acessada através da caixa"
            + "de seleção na tela inicial e através do menu superior Clientes\n"
            + "Produtos: A área de administração de produtos pode ser acessada através da caixa"
            + "de seleção na tela inicial e através do menu superior Produtos\n"
            + "Financeiro: a área de contabilidade e controle de caixa pode ser acessada"
            + "através da caixa de seleção na tela inicial e através do menu superior Financeiro");
    }//GEN-LAST:event_jComoUsarTelaPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAreaClienteBarraSuperior;
    private javax.swing.JMenuItem jAreaProdutosBarraSuperior;
    private javax.swing.JMenuItem jCaixaBarraSuperiorTelaPrincipal;
    private javax.swing.JMenuItem jComoUsarTelaPrincipal;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jSobre;
    // End of variables declaration//GEN-END:variables
}