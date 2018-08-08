/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Logica.DataPersona;
import Logica.Fabrica;
import Logica.IControladorPersona;
import Logica.Persona;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apias
 */
public class Principal extends javax.swing.JFrame {

    private IControladorPersona ICP;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        
        this.setSize(550, 550);
        this.internalBusqueda.setVisible(false);
        
        //Inicialización
        Fabrica fabrica = Fabrica.getInstance();
        ICP = fabrica.getIControladorPersona();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalBusqueda = new javax.swing.JInternalFrame();
        jSplitPane2 = new javax.swing.JSplitPane();
        btBuscar = new javax.swing.JButton();
        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        txnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablap = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        internalBusqueda.setTitle("Busqueda de Personas");
        internalBusqueda.setVisible(true);
        internalBusqueda.getContentPane().setLayout(new javax.swing.BoxLayout(internalBusqueda.getContentPane(), javax.swing.BoxLayout.Y_AXIS));

        jSplitPane2.setDividerLocation(220);

        btBuscar.setText("Buscar");
        btBuscar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btBuscarMouseMoved(evt);
            }
        });
        btBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btBuscarFocusLost(evt);
            }
        });
        btBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btBuscarMouseClicked(evt);
            }
        });
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jSplitPane2.setRightComponent(btBuscar);

        jSplitPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre");
        jSplitPane1.setLeftComponent(jLabel1);

        txnombre.setToolTipText("");
        txnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txnombreFocusLost(evt);
            }
        });
        txnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txnombreActionPerformed(evt);
            }
        });
        jSplitPane1.setRightComponent(txnombre);

        jSplitPane2.setLeftComponent(jSplitPane1);

        internalBusqueda.getContentPane().add(jSplitPane2);

        tablap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad"
            }
        ));
        jScrollPane1.setViewportView(tablap);

        internalBusqueda.getContentPane().add(jScrollPane1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        internalBusqueda.getContentPane().add(jButton1);

        getContentPane().add(internalBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 360, 250));

        jMenu1.setText("Registros");

        jMenuItem1.setText("Alta Persona");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consultas");

        jMenuItem3.setText("Eliminar persona");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem2.setText("Busqueda Personas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        AltaPersona ap=new AltaPersona(ICP);
        ap.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.internalBusqueda.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        // TODO add your handling code here:
        List<DataPersona> personas=ICP.BuscarPersonas(txnombre.getText());
        DefaultTableModel modelo=(DefaultTableModel) tablap.getModel();
        modelo.setRowCount(0);
        for (int i=0;i<personas.size();i++) {
            DataPersona p=(DataPersona)personas.get(i);
            Object[] dat={p.getNombre(),p.getEdad()};
            modelo.addRow(dat);
        }                
    }//GEN-LAST:event_btBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.txnombre.setText("");
        DefaultTableModel modelo=(DefaultTableModel) tablap.getModel();
        modelo.setRowCount(0);        
        this.internalBusqueda.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarMouseClicked

    private void txnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txnombreActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        EliminarPersona ep=new EliminarPersona(ICP);
        ep.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void btBuscarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btBuscarMouseMoved
        javax.swing.JOptionPane.showMessageDialog(null,"HOLA");
    }//GEN-LAST:event_btBuscarMouseMoved

    private void btBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btBuscarFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_btBuscarFocusLost

    private void txnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txnombreFocusLost
        javax.swing.JOptionPane.showMessageDialog(null,"HOLA");
        List<DataPersona> personas=ICP.BuscarPersonas(txnombre.getText());
        DefaultTableModel modelo=(DefaultTableModel) tablap.getModel();
        modelo.setRowCount(0);
        for (int i=0;i<personas.size();i++) {
            DataPersona p=(DataPersona)personas.get(i);
            Object[] dat={p.getNombre(),p.getEdad()};
            modelo.addRow(dat);
        }         
        
    }//GEN-LAST:event_txnombreFocusLost

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JInternalFrame internalBusqueda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable tablap;
    private javax.swing.JTextField txnombre;
    // End of variables declaration//GEN-END:variables
}
