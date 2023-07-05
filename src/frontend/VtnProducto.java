
package frontend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class VtnProducto extends javax.swing.JFrame {

    VtnPrincipal objVtnPrincipal = null;
    
    public VtnProducto() {
        initComponents();
    }

    public VtnProducto(VtnPrincipal objVtnPrincipal) {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.objVtnPrincipal = objVtnPrincipal;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/plantas.jpg"));
        Image image = icon.getImage();
        dskpnl_fondo = new javax.swing.JDesktopPane(){

            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jSeparator1 = new javax.swing.JSeparator();
        img_logo = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        img_lateral = new javax.swing.JLabel();
        menubar_Productos = new javax.swing.JMenuBar();
        menu_comida = new javax.swing.JMenu();
        mnitem_guarnicones = new javax.swing.JMenuItem();
        mnitem_pollos = new javax.swing.JMenuItem();
        mnitem_platillos = new javax.swing.JMenuItem();
        menu_bebidas = new javax.swing.JMenu();
        mnitem_refrescos = new javax.swing.JMenuItem();
        mnitem_AguasDelDia = new javax.swing.JMenuItem();
        menu_postres = new javax.swing.JMenu();
        menu_salir = new javax.swing.JMenu();

        setBackground(new java.awt.Color(0, 0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dskpnl_fondo.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        dskpnl_fondo.add(jSeparator1);
        jSeparator1.setBounds(230, 220, 240, 20);

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        img_logo.setPreferredSize(new java.awt.Dimension(110, 100));
        dskpnl_fondo.add(img_logo);
        img_logo.setBounds(100, 160, 110, 100);

        lbl_titulo.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Los Pollos Bélicos");
        dskpnl_fondo.add(lbl_titulo);
        lbl_titulo.setBounds(280, 230, 142, 21);

        lbl_menu.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        lbl_menu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_menu.setText("Menú");
        dskpnl_fondo.add(lbl_menu);
        lbl_menu.setBounds(280, 160, 143, 55);

        img_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parrillaLateral.jpg"))); // NOI18N
        dskpnl_fondo.add(img_lateral);
        img_lateral.setBounds(610, 0, 225, 590);

        getContentPane().add(dskpnl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 490));

        menubar_Productos.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        menu_comida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/platillos.png"))); // NOI18N
        menu_comida.setText("Comida");
        menu_comida.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        menu_comida.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_comida.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_comida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu_comidaMouseEntered(evt);
            }
        });

        mnitem_guarnicones.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnitem_guarnicones.setText("Guarniciones");
        mnitem_guarnicones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_guarniconesActionPerformed(evt);
            }
        });
        menu_comida.add(mnitem_guarnicones);

        mnitem_pollos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnitem_pollos.setText("Pollos");
        mnitem_pollos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_pollosActionPerformed(evt);
            }
        });
        menu_comida.add(mnitem_pollos);

        mnitem_platillos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnitem_platillos.setText("Platillos");
        mnitem_platillos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_platillosActionPerformed(evt);
            }
        });
        menu_comida.add(mnitem_platillos);

        menubar_Productos.add(menu_comida);

        menu_bebidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bebidas.png"))); // NOI18N
        menu_bebidas.setText("Bebidas");
        menu_bebidas.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        menu_bebidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_bebidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_bebidas.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        menu_bebidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        mnitem_refrescos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnitem_refrescos.setText("Refrescos");
        mnitem_refrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_refrescosActionPerformed(evt);
            }
        });
        menu_bebidas.add(mnitem_refrescos);

        mnitem_AguasDelDia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mnitem_AguasDelDia.setText("Aguas del Día");
        mnitem_AguasDelDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnitem_AguasDelDiaActionPerformed(evt);
            }
        });
        menu_bebidas.add(mnitem_AguasDelDia);

        menubar_Productos.add(menu_bebidas);

        menu_postres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dulces.png"))); // NOI18N
        menu_postres.setText("Postres");
        menu_postres.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N
        menu_postres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_postres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_postres.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        menu_postres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_postres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_postresMouseClicked(evt);
            }
        });
        menubar_Productos.add(menu_postres);

        menu_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return.png"))); // NOI18N
        menu_salir.setText("Salir");
        menu_salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_salir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        menu_salir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        menu_salir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        menu_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_salirMouseClicked(evt);
            }
        });
        menubar_Productos.add(menu_salir);

        setJMenuBar(menubar_Productos);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menu_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_salirMouseClicked
        objVtnPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_salirMouseClicked

    private void mnitem_guarniconesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_guarniconesActionPerformed
        InternGuarniciones vtnGuarniciones = new InternGuarniciones();
        dskpnl_fondo.add(vtnGuarniciones);
        vtnGuarniciones.show();
    }//GEN-LAST:event_mnitem_guarniconesActionPerformed

    private void mnitem_platillosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_platillosActionPerformed
        InternPlatillos vtnPlatillos = new InternPlatillos();
        dskpnl_fondo.add(vtnPlatillos);
        vtnPlatillos.show();
    }//GEN-LAST:event_mnitem_platillosActionPerformed

    private void mnitem_pollosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_pollosActionPerformed
        InternPollos vtnPollos = new InternPollos();
        dskpnl_fondo.add(vtnPollos);
        vtnPollos.show();
    }//GEN-LAST:event_mnitem_pollosActionPerformed

    private void mnitem_refrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_refrescosActionPerformed
        InternRefrescos vtnRefrescos = new InternRefrescos();
        dskpnl_fondo.add(vtnRefrescos);
        vtnRefrescos.show();
    }//GEN-LAST:event_mnitem_refrescosActionPerformed

    private void mnitem_AguasDelDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnitem_AguasDelDiaActionPerformed
        InternAguas vtnAguas = new InternAguas();
        dskpnl_fondo.add(vtnAguas);
        vtnAguas.show();
    }//GEN-LAST:event_mnitem_AguasDelDiaActionPerformed

    private void menu_postresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_postresMouseClicked
        InternPostres vtnPostres = new InternPostres();
        dskpnl_fondo.add(vtnPostres);
        vtnPostres.show();
    }//GEN-LAST:event_menu_postresMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objVtnPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void menu_comidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_comidaMouseEntered
        menu_comida.setBackground(new Color(0,0,40));
    }//GEN-LAST:event_menu_comidaMouseEntered

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
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dskpnl_fondo;
    private javax.swing.JLabel img_lateral;
    private javax.swing.JLabel img_logo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_menu;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JMenu menu_bebidas;
    private javax.swing.JMenu menu_comida;
    private javax.swing.JMenu menu_postres;
    private javax.swing.JMenu menu_salir;
    private javax.swing.JMenuBar menubar_Productos;
    private javax.swing.JMenuItem mnitem_AguasDelDia;
    private javax.swing.JMenuItem mnitem_guarnicones;
    private javax.swing.JMenuItem mnitem_platillos;
    private javax.swing.JMenuItem mnitem_pollos;
    private javax.swing.JMenuItem mnitem_refrescos;
    // End of variables declaration//GEN-END:variables
}
