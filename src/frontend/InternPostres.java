/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package frontend;

/**
 *
 * @author Diego
 */
public class InternPostres extends javax.swing.JInternalFrame {

    /**
     * Creates new form InternGuarniciones
     */
    public InternPostres() {
        initComponents();
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
        img_nieveVainilla = new javax.swing.JLabel();
        img_brownie = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        lbl_polloCompleto = new javax.swing.JLabel();
        lbl_jericalla = new javax.swing.JLabel();
        txt_descripcion1 = new javax.swing.JTextArea();
        txt_descripcion2 = new javax.swing.JTextArea();
        txt_descripcion3 = new javax.swing.JTextArea();
        lbl_tacosPollo = new javax.swing.JLabel();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        img_jericalla = new javax.swing.JLabel();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_nieveVainilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuNieveVainilla.jpg"))); // NOI18N
        jPanel1.add(img_nieveVainilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 180, 100));

        img_brownie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuBrownie.jpg"))); // NOI18N
        jPanel1.add(img_brownie, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 180, 110));

        precio1.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        precio1.setForeground(new java.awt.Color(255, 51, 51));
        precio1.setText("$20");
        jPanel1.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        lbl_polloCompleto.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        lbl_polloCompleto.setForeground(new java.awt.Color(255, 51, 51));
        lbl_polloCompleto.setText("Nieve de Vainilla");
        jPanel1.add(lbl_polloCompleto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 138, -1, -1));

        lbl_jericalla.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        lbl_jericalla.setForeground(new java.awt.Color(255, 51, 51));
        lbl_jericalla.setText("Jericalla");
        jPanel1.add(lbl_jericalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 270, -1, -1));

        txt_descripcion1.setEditable(false);
        txt_descripcion1.setBackground(new java.awt.Color(0, 0, 0));
        txt_descripcion1.setColumns(20);
        txt_descripcion1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        txt_descripcion1.setForeground(new java.awt.Color(255, 255, 255));
        txt_descripcion1.setRows(5);
        txt_descripcion1.setText("Brownie de chocolate con nuez\n(1 pza).");
        txt_descripcion1.setBorder(null);
        jPanel1.add(txt_descripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 257, -1));

        txt_descripcion2.setEditable(false);
        txt_descripcion2.setBackground(new java.awt.Color(0, 0, 0));
        txt_descripcion2.setColumns(20);
        txt_descripcion2.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        txt_descripcion2.setForeground(new java.awt.Color(255, 255, 255));
        txt_descripcion2.setRows(5);
        txt_descripcion2.setText("3 bolas de nieve de vainilla\n(Cono o plato).");
        txt_descripcion2.setBorder(null);
        jPanel1.add(txt_descripcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 257, -1));

        txt_descripcion3.setEditable(false);
        txt_descripcion3.setBackground(new java.awt.Color(0, 0, 0));
        txt_descripcion3.setColumns(20);
        txt_descripcion3.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        txt_descripcion3.setForeground(new java.awt.Color(255, 255, 255));
        txt_descripcion3.setRows(5);
        txt_descripcion3.setText("Postre de origen tapatío");
        txt_descripcion3.setBorder(null);
        jPanel1.add(txt_descripcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 257, -1));

        lbl_tacosPollo.setFont(new java.awt.Font("MV Boli", 1, 16)); // NOI18N
        lbl_tacosPollo.setForeground(new java.awt.Color(255, 51, 51));
        lbl_tacosPollo.setText("Brownie de Chocolate");
        jPanel1.add(lbl_tacosPollo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        precio2.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        precio2.setForeground(new java.awt.Color(255, 51, 51));
        precio2.setText("$35");
        jPanel1.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        precio3.setFont(new java.awt.Font("MV Boli", 1, 20)); // NOI18N
        precio3.setForeground(new java.awt.Color(255, 51, 51));
        precio3.setText("$20");
        jPanel1.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        img_jericalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MenuJericalla.jpg"))); // NOI18N
        jPanel1.add(img_jericalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 180, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_brownie;
    private javax.swing.JLabel img_jericalla;
    private javax.swing.JLabel img_nieveVainilla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_jericalla;
    private javax.swing.JLabel lbl_polloCompleto;
    private javax.swing.JLabel lbl_tacosPollo;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JTextArea txt_descripcion1;
    private javax.swing.JTextArea txt_descripcion2;
    private javax.swing.JTextArea txt_descripcion3;
    // End of variables declaration//GEN-END:variables
}
