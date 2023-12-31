
package frontend;

import java.awt.Color;
import java.awt.event.KeyEvent;


public class LogIn extends javax.swing.JFrame {

    VtnPrincipal objVtnPrincipal = null;
    
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        img_gallo = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_contrasenia = new javax.swing.JLabel();
        pf_contrasenia = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        cb_mostrarContra = new javax.swing.JCheckBox();
        img_lateral = new javax.swing.JLabel();
        btn_iniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        img_gallo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Gallo.png"))); // NOI18N

        lbl_login.setFont(new java.awt.Font("Georgia", 1, 34)); // NOI18N
        lbl_login.setText("Iniciar Sesión");

        lbl_usuario.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_usuario.setText("Usuario");

        txt_usuario.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        txt_usuario.setForeground(new java.awt.Color(153, 153, 153));
        txt_usuario.setText("Escribe tu usuario");
        txt_usuario.setBorder(null);
        txt_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_usuarioMousePressed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        lbl_contrasenia.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        lbl_contrasenia.setText("Contraseña");

        pf_contrasenia.setFont(new java.awt.Font("Nirmala UI", 0, 16)); // NOI18N
        pf_contrasenia.setForeground(new java.awt.Color(153, 153, 153));
        pf_contrasenia.setText("Escribe tu contrasenia");
        pf_contrasenia.setBorder(null);
        pf_contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pf_contraseniaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pf_contraseniaMousePressed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        cb_mostrarContra.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 12)); // NOI18N
        cb_mostrarContra.setText("Mostrar Contraseña");
        cb_mostrarContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_mostrarContraActionPerformed(evt);
            }
        });

        img_lateral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Pollo Asado.jpg"))); // NOI18N

        btn_iniciarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iniciar sesion.png"))); // NOI18N
        btn_iniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarSesionMouseClicked(evt);
            }
        });
        btn_iniciarSesion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_iniciarSesionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cb_mostrarContra)
                                .addGap(68, 68, 68)
                                .addComponent(btn_iniciarSesion))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_contrasenia)
                                .addComponent(lbl_usuario)
                                .addComponent(jSeparator2)
                                .addComponent(jSeparator1)
                                .addComponent(txt_usuario)
                                .addComponent(pf_contrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(img_gallo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_login)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(img_lateral))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(img_gallo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbl_login)))
                .addGap(26, 26, 26)
                .addComponent(lbl_usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lbl_contrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pf_contrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_mostrarContra)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_iniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34))))
            .addComponent(img_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void txt_usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_usuarioMousePressed
        if(txt_usuario.getText().equals("Escribe tu usuario")){
           txt_usuario.setText("");
           txt_usuario.setForeground(Color.black);
        }
        if(String.valueOf(pf_contrasenia.getPassword()).isEmpty()){
        pf_contrasenia.setText("Escribe tu contrasenia");
        pf_contrasenia.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_txt_usuarioMousePressed

    private void pf_contraseniaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_contraseniaMousePressed
        if(txt_usuario.getText().isEmpty()){
            txt_usuario.setText("Escribe tu usuario");
            txt_usuario.setForeground(new Color(204,204,204));
        }
        if("Escribe tu contrasenia".equals(String.valueOf(pf_contrasenia.getPassword()))){
            pf_contrasenia.setText("");
            pf_contrasenia.setForeground(Color.black);
        }
    }//GEN-LAST:event_pf_contraseniaMousePressed

    private void cb_mostrarContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_mostrarContraActionPerformed
        if(!"Escribe tu contrasenia".equals(String.valueOf(pf_contrasenia.getPassword()))){
            if(cb_mostrarContra.isSelected()){
                pf_contrasenia.setEchoChar((char)0);
            }
            else{
                pf_contrasenia.setEchoChar('*');
            }
        }
    }//GEN-LAST:event_cb_mostrarContraActionPerformed

    private void pf_contraseniaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pf_contraseniaMouseExited

    }//GEN-LAST:event_pf_contraseniaMouseExited

    private void btn_iniciarSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarSesionMouseClicked
                if("1234".equals(String.valueOf(pf_contrasenia.getPassword())) && txt_usuario.getText().equals("pollo")){
           
                    if(objVtnPrincipal== null){
                        objVtnPrincipal = new VtnPrincipal(this);
                    }
        
                    objVtnPrincipal.setVisible(true);

        
                    this.setVisible(false); //nos sirve para ocultar la ventana principal
                    pf_contrasenia.setText("Escribe tu contrasenia"); //Dejamos la contraseña predeterminada
                    pf_contrasenia.setForeground(new Color(204,204,204));
                    
                    cb_mostrarContra.setSelected(false);
                    pf_contrasenia.setEchoChar('*');
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Los datos de ingreso son incorrectos", "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            pf_contrasenia.setText("Escribe tu contrasenia");
            pf_contrasenia.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_btn_iniciarSesionMouseClicked

    private void btn_iniciarSesionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_iniciarSesionKeyPressed

    }//GEN-LAST:event_btn_iniciarSesionKeyPressed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_iniciarSesion;
    private javax.swing.JCheckBox cb_mostrarContra;
    private javax.swing.JLabel img_gallo;
    private javax.swing.JLabel img_lateral;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_contrasenia;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JPasswordField pf_contrasenia;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
