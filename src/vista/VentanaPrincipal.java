/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;


import conexionBD.Conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author clara
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    Conexion conexion;
    
    public VentanaPrincipal() {
        initComponents();
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

        background = new javax.swing.JPanel();
        jpMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpOrdersByCustomers = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jpCustomers = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jpOrders = new javax.swing.JPanel();
        jlTrabajaEn = new javax.swing.JLabel();
        jpShippers = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jpContenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpMenu.setBackground(new java.awt.Color(133, 39, 71));
        jpMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Northwind");
        jpMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 68, 120, -1));
        jpMenu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 105, 177, 12));

        jpOrdersByCustomers.setBackground(new java.awt.Color(133, 39, 71));
        jpOrdersByCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpOrdersByCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpOrdersByCustomersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpOrdersByCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpOrdersByCustomersMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Orders by Customer");

        javax.swing.GroupLayout jpOrdersByCustomersLayout = new javax.swing.GroupLayout(jpOrdersByCustomers);
        jpOrdersByCustomers.setLayout(jpOrdersByCustomersLayout);
        jpOrdersByCustomersLayout.setHorizontalGroup(
            jpOrdersByCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOrdersByCustomersLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(27, 27, 27))
        );
        jpOrdersByCustomersLayout.setVerticalGroup(
            jpOrdersByCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpOrdersByCustomersLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jpMenu.add(jpOrdersByCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 70));

        jpCustomers.setBackground(new java.awt.Color(133, 39, 71));
        jpCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpCustomers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpCustomersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpCustomersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpCustomersMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Customers");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jpCustomersLayout = new javax.swing.GroupLayout(jpCustomers);
        jpCustomers.setLayout(jpCustomersLayout);
        jpCustomersLayout.setHorizontalGroup(
            jpCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCustomersLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72))
        );
        jpCustomersLayout.setVerticalGroup(
            jpCustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCustomersLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22))
        );

        jpMenu.add(jpCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 240, 70));

        jpOrders.setBackground(new java.awt.Color(133, 39, 71));
        jpOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpOrders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpOrdersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpOrdersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpOrdersMouseExited(evt);
            }
        });

        jlTrabajaEn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlTrabajaEn.setForeground(new java.awt.Color(255, 255, 255));
        jlTrabajaEn.setText("Orders");

        javax.swing.GroupLayout jpOrdersLayout = new javax.swing.GroupLayout(jpOrders);
        jpOrders.setLayout(jpOrdersLayout);
        jpOrdersLayout.setHorizontalGroup(
            jpOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrdersLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jlTrabajaEn)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jpOrdersLayout.setVerticalGroup(
            jpOrdersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpOrdersLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlTrabajaEn)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpMenu.add(jpOrders, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 240, 70));

        jpShippers.setBackground(new java.awt.Color(133, 39, 71));
        jpShippers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jpShippers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpShippersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpShippersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpShippersMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Shippers");

        javax.swing.GroupLayout jpShippersLayout = new javax.swing.GroupLayout(jpShippers);
        jpShippers.setLayout(jpShippersLayout);
        jpShippersLayout.setHorizontalGroup(
            jpShippersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpShippersLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel6)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jpShippersLayout.setVerticalGroup(
            jpShippersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpShippersLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jpMenu.add(jpShippers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 70));

        background.add(jpMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        jpContenido.setBackground(new java.awt.Color(245, 205, 185));

        javax.swing.GroupLayout jpContenidoLayout = new javax.swing.GroupLayout(jpContenido);
        jpContenido.setLayout(jpContenidoLayout);
        jpContenidoLayout.setHorizontalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        jpContenidoLayout.setVerticalGroup(
            jpContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        background.add(jpContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 960, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCustomersMouseEntered
        jpCustomers.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpCustomersMouseEntered

    private void jpCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCustomersMouseExited
        jpCustomers.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpCustomersMouseExited

    private void jpOrdersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrdersMouseEntered
        jpOrders.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpOrdersMouseEntered

    private void jpOrdersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrdersMouseExited
        jpOrders.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpOrdersMouseExited

    private void jpShippersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpShippersMouseEntered
        jpShippers.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpShippersMouseEntered

    private void jpShippersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpShippersMouseExited
        jpShippers.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpShippersMouseExited

    private void jpOrdersByCustomersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrdersByCustomersMouseEntered
        jpOrdersByCustomers.setBackground(new Color(162,65,107));
    }//GEN-LAST:event_jpOrdersByCustomersMouseEntered

    private void jpOrdersByCustomersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrdersByCustomersMouseExited
        jpOrdersByCustomers.setBackground(new Color(133,39,71));
    }//GEN-LAST:event_jpOrdersByCustomersMouseExited

    private void jpCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpCustomersMouseClicked
        MenuCustomers mc = new MenuCustomers();
        mostrarPanelMenuABCC(mc);
        mc.mostrarTabla("SELECT * FROM customers");
        
    }//GEN-LAST:event_jpCustomersMouseClicked

    private void jpOrdersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrdersMouseClicked
        MenuOrders mo = new MenuOrders();
        mostrarPanelMenuABCC(mo);
        mo.mostrarTabla("SELECT * FROM orders");
        
    }//GEN-LAST:event_jpOrdersMouseClicked

    private void jpShippersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpShippersMouseClicked
        MenuShippers ms = new MenuShippers();
        mostrarPanelMenuABCC(ms);
        ms.mostrarTabla("SELECT * FROM Shippers");
        
    }//GEN-LAST:event_jpShippersMouseClicked

    private void jpOrdersByCustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpOrdersByCustomersMouseClicked
        MenuOrdersByCustomers moc = new MenuOrdersByCustomers();
        mostrarPanelMenuABCC(moc);
        moc.mostrarTabla();
        
    }//GEN-LAST:event_jpOrdersByCustomersMouseClicked

    
        
    private void mostrarPanelMenuABCC (JPanel p){
        p.setSize(960, 700);
        p.setLocation(0, 0);
        
        jpContenido.removeAll();
        jpContenido.add(p, BorderLayout.CENTER);
        jpContenido.revalidate();
        jpContenido.repaint();
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        Conexion cn = new Conexion(1);
        cn.getConexion();
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
                //new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlTrabajaEn;
    private javax.swing.JPanel jpContenido;
    private javax.swing.JPanel jpCustomers;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JPanel jpOrders;
    private javax.swing.JPanel jpOrdersByCustomers;
    private javax.swing.JPanel jpShippers;
    // End of variables declaration//GEN-END:variables

    public JPanel getJpContenido() {
        return jpContenido;
    }
}
