
package frontend;

import backend.Cliente;
import backend.Empleado;
import java.awt.Color;



public class VtnPrincipal extends javax.swing.JFrame {

    LogIn objVtnLogIn = null;
    VtnCliente objVtnCliente = null;
    VtnEmpleado objVtnEmpleado = null;
    VtnProducto objVtnProducto = null;
    Cliente objCliente = null;
    Empleado objEmpleado = null;
    
    
    public VtnPrincipal() {
        initComponents();
    }
    
       public VtnPrincipal(LogIn objVtnLogIn) {
        this.objVtnLogIn = objVtnLogIn;
        initComponents(); 
        this.setLocationRelativeTo(null);      
        objCliente = new Cliente();
        objEmpleado = new Empleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img_logo = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        btn_Productos = new javax.swing.JButton();
        btn_Clientes = new javax.swing.JButton();
        btn_Empleados1 = new javax.swing.JButton();
        img_fondo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        img_logo.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel1.add(img_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 100));

        lbl_titulo.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Los Pollos Bélicos");
        jPanel1.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 310, 40));

        btn_Productos.setBackground(new java.awt.Color(0, 0, 0));
        btn_Productos.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        btn_Productos.setForeground(new java.awt.Color(255, 255, 255));
        btn_Productos.setText("Productos");
        btn_Productos.setFocusPainted(false);
        btn_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseExited(evt);
            }
        });
        btn_Productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProductosActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 150, 50));

        btn_Clientes.setBackground(new java.awt.Color(0, 0, 0));
        btn_Clientes.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        btn_Clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_Clientes.setText("Clientes");
        btn_Clientes.setFocusPainted(false);
        btn_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClientesMouseExited(evt);
            }
        });
        btn_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 150, 50));

        btn_Empleados1.setBackground(new java.awt.Color(0, 0, 0));
        btn_Empleados1.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 18)); // NOI18N
        btn_Empleados1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Empleados1.setText("Empleados");
        btn_Empleados1.setFocusPainted(false);
        btn_Empleados1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_Empleados1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_Empleados1MouseExited(evt);
            }
        });
        btn_Empleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Empleados1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Empleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 310, 160, 50));

        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gallo Negro.jpg"))); // NOI18N
        jPanel1.add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, -1, 300));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 60, 60));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 300, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        objVtnLogIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_ClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMouseEntered
        btn_Clientes.setBackground(new Color(133,5,20));
    }//GEN-LAST:event_btn_ClientesMouseEntered

    private void btn_ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMouseExited
        btn_Clientes.setBackground(Color.BLACK);
    }//GEN-LAST:event_btn_ClientesMouseExited

    private void btn_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseEntered
        btn_Productos.setBackground(new Color(133,5,20));
    }//GEN-LAST:event_btn_ProductosMouseEntered

    private void btn_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseExited
        btn_Productos.setBackground(Color.BLACK);
    }//GEN-LAST:event_btn_ProductosMouseExited

    private void btn_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClientesActionPerformed
       if (objVtnCliente == null) {
           objVtnCliente = new VtnCliente(this, objCliente);
       }
       
       objVtnCliente.setVisible(true);
       this.setVisible(false);
       
       
    }//GEN-LAST:event_btn_ClientesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objVtnLogIn.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void btn_ProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProductosActionPerformed
        if (objVtnProducto == null) {
           objVtnProducto = new VtnProducto(this);
            }
       
       objVtnProducto.setVisible(true);
       this.setVisible(false);
       
       
    }//GEN-LAST:event_btn_ProductosActionPerformed

    private void btn_Empleados1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Empleados1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Empleados1MouseEntered

    private void btn_Empleados1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Empleados1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Empleados1MouseExited

    private void btn_Empleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Empleados1ActionPerformed
      if (objVtnEmpleado == null) {
           objVtnEmpleado = new VtnEmpleado(this, objEmpleado);
            }
       
       objVtnEmpleado.setVisible(true);
       this.setVisible(false);
       
    }//GEN-LAST:event_btn_Empleados1ActionPerformed

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clientes;
    private javax.swing.JButton btn_Empleados1;
    private javax.swing.JButton btn_Productos;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_titulo;
    // End of variables declaration//GEN-END:variables
}
