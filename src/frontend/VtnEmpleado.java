
package frontend;

import backend.Empleado;
import java.awt.Color;
import javax.swing.JOptionPane;
import basedatos.BD;
import javax.swing.table.DefaultTableModel;



public class VtnEmpleado extends javax.swing.JFrame {
    
    VtnPrincipal objVtnPrincipal = null;
    Empleado objEmpleado = null;
    BD objBd = null;
    DefaultTableModel modeloEmpleado = new DefaultTableModel();
    
     public VtnEmpleado() {
        initComponents();
    }
    
    public VtnEmpleado(VtnPrincipal objVtnPrincipal, Empleado objEmpleado){
        initComponents();
        this.setLocationRelativeTo(null);
        this.objVtnPrincipal = objVtnPrincipal;    
        this.objEmpleado = objEmpleado;
        objBd = new BD();
        modeloEmpleado = objBd.crear_modelo_empleado(modeloEmpleado);
        btngroup_sexo.add(radbtn_masculino);
        btngroup_sexo.add(radbtn_femenino);
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngroup_sexo = new javax.swing.ButtonGroup();
        img_logo = new javax.swing.JLabel();
        lbl_titulo1 = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tab_empleados = new javax.swing.JTabbedPane();
        tab_agregar = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_edad = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_sexo = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_edad = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_pagoPorHora = new javax.swing.JTextField();
        txt_horasTrabajadasMensuales = new javax.swing.JTextField();
        txt_numDeEmpleado = new javax.swing.JTextField();
        txt_puesto = new javax.swing.JTextField();
        lbl_sexo1 = new javax.swing.JLabel();
        lbl_numDeEmpleado = new javax.swing.JLabel();
        lbl_puesto = new javax.swing.JLabel();
        lbl_pagoPorHora = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        radbtn_femenino = new javax.swing.JRadioButton();
        radbtn_masculino = new javax.swing.JRadioButton();
        tab_mostrar = new javax.swing.JPanel();
        pnl_mostrar = new javax.swing.JPanel();
        txt_datosEmpleado = new javax.swing.JTextArea();
        txt_ingresoNumDeEmpleado = new javax.swing.JTextField();
        btn_mostrarEmpleado = new javax.swing.JButton();
        btn_eliminarEmpleado = new javax.swing.JButton();
        tab_Actualizar = new javax.swing.JPanel();
        lbl_actualizarEmpleado = new javax.swing.JLabel();
        lbl_nombreActualizar = new javax.swing.JLabel();
        lbl_edadActualizar = new javax.swing.JLabel();
        lbl_emailActualizar = new javax.swing.JLabel();
        lbl_apellidoActualizar = new javax.swing.JLabel();
        lbl_telefonoActualizar = new javax.swing.JLabel();
        txt_nombreActualizar = new javax.swing.JTextField();
        txt_edadActualizar = new javax.swing.JTextField();
        txt_emailActualizar = new javax.swing.JTextField();
        txt_apellidoActualizar = new javax.swing.JTextField();
        txt_pagoPorHoraActualizar = new javax.swing.JTextField();
        txt_horasTrabajadasActualizar = new javax.swing.JTextField();
        txt_numEmpleadoAActualizar = new javax.swing.JTextField();
        txt_puestoActualizar = new javax.swing.JTextField();
        lbl_horasTrabajadasActualizar = new javax.swing.JLabel();
        lbl_puestoActualizar = new javax.swing.JLabel();
        lbl_pagoPorHoraActualizar = new javax.swing.JLabel();
        txt_telefonoActualizar = new javax.swing.JTextField();
        btn_actualizar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tab_tablaEmpleados = new javax.swing.JPanel();
        txt_tablaEmpleado = new javax.swing.JTextField();
        btn_buscarEmpleado = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Empleado = new javax.swing.JTable();
        img_fondo = new javax.swing.JLabel();

        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Logo.png"))); // NOI18N
        img_logo.setPreferredSize(new java.awt.Dimension(110, 100));
        getContentPane().add(img_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 6, 97, 109));

        lbl_titulo1.setFont(new java.awt.Font("Georgia", 2, 36)); // NOI18N
        lbl_titulo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo1.setText("Los Pollos Bélicos");
        getContentPane().add(lbl_titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 18, 310, 40));

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Return.png"))); // NOI18N
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 6, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 64, 310, 10));

        tab_empleados.setBackground(new java.awt.Color(0, 0, 0));
        tab_empleados.setForeground(new java.awt.Color(255, 255, 255));
        tab_empleados.setFont(new java.awt.Font("Cambria", 0, 16)); // NOI18N

        tab_agregar.setBackground(new java.awt.Color(102, 0, 0));
        tab_agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_titulo.setText("Agregar un Empleado");
        tab_agregar.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 33));

        lbl_nombre.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre:");
        tab_agregar.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 27));

        lbl_edad.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_edad.setForeground(new java.awt.Color(255, 255, 255));
        lbl_edad.setText("Edad:");
        tab_agregar.add(lbl_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 52, 20));

        lbl_email.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_email.setForeground(new java.awt.Color(255, 255, 255));
        lbl_email.setText("Email:");
        tab_agregar.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, -1, -1));

        lbl_apellido.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellido.setText("Apellido:");
        tab_agregar.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        lbl_telefono.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("Telefono:");
        tab_agregar.add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 101, -1));

        lbl_sexo.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_sexo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sexo.setText("Sexo:");
        tab_agregar.add(lbl_sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 52, 25));

        txt_nombre.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 208, -1));

        txt_edad.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 208, -1));

        txt_email.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 208, -1));

        txt_apellido.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        tab_agregar.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 208, -1));

        txt_pagoPorHora.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_pagoPorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 259, -1));

        txt_horasTrabajadasMensuales.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_horasTrabajadasMensuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 259, -1));

        txt_numDeEmpleado.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_numDeEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 259, -1));

        txt_puesto.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_puestoActionPerformed(evt);
            }
        });
        tab_agregar.add(txt_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 259, -1));

        lbl_sexo1.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_sexo1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sexo1.setText("Horas trabajadas del mes:");
        tab_agregar.add(lbl_sexo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 180, 25));

        lbl_numDeEmpleado.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_numDeEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_numDeEmpleado.setText("No. de empleado:");
        tab_agregar.add(lbl_numDeEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 142, 25));

        lbl_puesto.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_puesto.setForeground(new java.awt.Color(255, 255, 255));
        lbl_puesto.setText("Puesto:");
        tab_agregar.add(lbl_puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 142, 25));

        lbl_pagoPorHora.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_pagoPorHora.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pagoPorHora.setText("Pago por hora:");
        tab_agregar.add(lbl_pagoPorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 142, 25));

        txt_telefono.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        tab_agregar.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 208, -1));

        btn_guardar.setBackground(new java.awt.Color(255, 185, 29));
        btn_guardar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_guardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_guardarMouseExited(evt);
            }
        });
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        tab_agregar.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, 44));

        radbtn_femenino.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        radbtn_femenino.setForeground(new java.awt.Color(255, 255, 255));
        radbtn_femenino.setText("Femenino");
        radbtn_femenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radbtn_femeninoActionPerformed(evt);
            }
        });
        tab_agregar.add(radbtn_femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        radbtn_masculino.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        radbtn_masculino.setForeground(new java.awt.Color(255, 255, 255));
        radbtn_masculino.setText("Masculino");
        tab_agregar.add(radbtn_masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        tab_empleados.addTab("Agregar", tab_agregar);

        pnl_mostrar.setBackground(new java.awt.Color(0, 0, 0));
        pnl_mostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_datosEmpleado.setEditable(false);
        txt_datosEmpleado.setColumns(20);
        txt_datosEmpleado.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_datosEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        txt_datosEmpleado.setRows(5);
        txt_datosEmpleado.setText("Aquí aparecerán los datos del empleado...");
        pnl_mostrar.add(txt_datosEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 330, 210));

        txt_ingresoNumDeEmpleado.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_ingresoNumDeEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        txt_ingresoNumDeEmpleado.setText("Ingresa aquí el numero de empleado");
        txt_ingresoNumDeEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_ingresoNumDeEmpleadoMouseClicked(evt);
            }
        });
        pnl_mostrar.add(txt_ingresoNumDeEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 330, 30));

        btn_mostrarEmpleado.setBackground(new java.awt.Color(255, 185, 29));
        btn_mostrarEmpleado.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_mostrarEmpleado.setText("Mostrar Empleado");
        btn_mostrarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_mostrarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_mostrarEmpleadoMouseExited(evt);
            }
        });
        btn_mostrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mostrarEmpleadoActionPerformed(evt);
            }
        });
        pnl_mostrar.add(btn_mostrarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        btn_eliminarEmpleado.setBackground(new java.awt.Color(255, 51, 51));
        btn_eliminarEmpleado.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_eliminarEmpleado.setText("Eliminar Empleado");
        btn_eliminarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_eliminarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_eliminarEmpleadoMouseExited(evt);
            }
        });
        btn_eliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarEmpleadoActionPerformed(evt);
            }
        });
        pnl_mostrar.add(btn_eliminarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, -1, -1));

        javax.swing.GroupLayout tab_mostrarLayout = new javax.swing.GroupLayout(tab_mostrar);
        tab_mostrar.setLayout(tab_mostrarLayout);
        tab_mostrarLayout.setHorizontalGroup(
            tab_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
            .addGroup(tab_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))
        );
        tab_mostrarLayout.setVerticalGroup(
            tab_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
            .addGroup(tab_mostrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnl_mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
        );

        tab_empleados.addTab("Mostrar", tab_mostrar);

        tab_Actualizar.setBackground(new java.awt.Color(51, 0, 0));
        tab_Actualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_actualizarEmpleado.setFont(new java.awt.Font("Lucida Fax", 3, 18)); // NOI18N
        lbl_actualizarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_actualizarEmpleado.setText("Actualizar un Empleado");
        tab_Actualizar.add(lbl_actualizarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 33));

        lbl_nombreActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_nombreActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombreActualizar.setText("Nombre:");
        tab_Actualizar.add(lbl_nombreActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, 27));

        lbl_edadActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_edadActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_edadActualizar.setText("Edad:");
        tab_Actualizar.add(lbl_edadActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 52, 20));

        lbl_emailActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_emailActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_emailActualizar.setText("Email:");
        tab_Actualizar.add(lbl_emailActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        lbl_apellidoActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_apellidoActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellidoActualizar.setText("Apellido:");
        tab_Actualizar.add(lbl_apellidoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        lbl_telefonoActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_telefonoActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefonoActualizar.setText("Telefono:");
        tab_Actualizar.add(lbl_telefonoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 101, -1));

        txt_nombreActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_nombreActualizar.setEnabled(false);
        tab_Actualizar.add(txt_nombreActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 208, -1));

        txt_edadActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_edadActualizar.setEnabled(false);
        tab_Actualizar.add(txt_edadActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 208, -1));

        txt_emailActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_emailActualizar.setEnabled(false);
        tab_Actualizar.add(txt_emailActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 208, -1));

        txt_apellidoActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_apellidoActualizar.setEnabled(false);
        tab_Actualizar.add(txt_apellidoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 208, -1));

        txt_pagoPorHoraActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_pagoPorHoraActualizar.setEnabled(false);
        tab_Actualizar.add(txt_pagoPorHoraActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 130, -1));

        txt_horasTrabajadasActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_horasTrabajadasActualizar.setEnabled(false);
        tab_Actualizar.add(txt_horasTrabajadasActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 130, -1));

        txt_numEmpleadoAActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_numEmpleadoAActualizar.setForeground(new java.awt.Color(153, 153, 153));
        txt_numEmpleadoAActualizar.setText("Ingresa el numero de empleado");
        txt_numEmpleadoAActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_numEmpleadoAActualizarMouseClicked(evt);
            }
        });
        tab_Actualizar.add(txt_numEmpleadoAActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 210, 30));

        txt_puestoActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_puestoActualizar.setEnabled(false);
        tab_Actualizar.add(txt_puestoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, -1));

        lbl_horasTrabajadasActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_horasTrabajadasActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_horasTrabajadasActualizar.setText("Horas trabajadas del mes:");
        tab_Actualizar.add(lbl_horasTrabajadasActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 180, 25));

        lbl_puestoActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_puestoActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_puestoActualizar.setText("Puesto:");
        tab_Actualizar.add(lbl_puestoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 142, 25));

        lbl_pagoPorHoraActualizar.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        lbl_pagoPorHoraActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pagoPorHoraActualizar.setText("Pago por hora:");
        tab_Actualizar.add(lbl_pagoPorHoraActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 142, 25));

        txt_telefonoActualizar.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_telefonoActualizar.setEnabled(false);
        tab_Actualizar.add(txt_telefonoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 208, -1));

        btn_actualizar.setBackground(new java.awt.Color(255, 185, 29));
        btn_actualizar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_actualizar.setText("Actualizar");
        btn_actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_actualizarMouseExited(evt);
            }
        });
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        tab_Actualizar.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 130, 30));

        btn_buscar.setBackground(new java.awt.Color(255, 185, 29));
        btn_buscar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        tab_Actualizar.add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GalloColeta.jpg"))); // NOI18N
        tab_Actualizar.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 210, 170));

        tab_empleados.addTab("Actualizar", tab_Actualizar);

        tab_tablaEmpleados.setBackground(new java.awt.Color(51, 51, 51));

        txt_tablaEmpleado.setFont(new java.awt.Font("Cambria", 0, 13)); // NOI18N
        txt_tablaEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        txt_tablaEmpleado.setText("Ingresa el numero de empleado");
        txt_tablaEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_tablaEmpleadoMouseClicked(evt);
            }
        });

        btn_buscarEmpleado.setBackground(new java.awt.Color(255, 185, 29));
        btn_buscarEmpleado.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btn_buscarEmpleado.setText("Buscar Empleado");
        btn_buscarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarEmpleadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarEmpleadoMouseExited(evt);
            }
        });
        btn_buscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarEmpleadoActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(null);

        tbl_Empleado.setBackground(new java.awt.Color(0, 0, 0));
        tbl_Empleado.setForeground(new java.awt.Color(255, 255, 255));
        tbl_Empleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl_Empleado);

        javax.swing.GroupLayout tab_tablaEmpleadosLayout = new javax.swing.GroupLayout(tab_tablaEmpleados);
        tab_tablaEmpleados.setLayout(tab_tablaEmpleadosLayout);
        tab_tablaEmpleadosLayout.setHorizontalGroup(
            tab_tablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_tablaEmpleadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txt_tablaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        tab_tablaEmpleadosLayout.setVerticalGroup(
            tab_tablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tab_tablaEmpleadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(tab_tablaEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tablaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tab_empleados.addTab("Tabla Empleados", tab_tablaEmpleados);

        getContentPane().add(tab_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 131, -1, 420));

        img_fondo.setBackground(new java.awt.Color(51, 0, 153));
        img_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fogata.jpg"))); // NOI18N
        getContentPane().add(img_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 610, 572));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_puestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_puestoActionPerformed

    private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
        objVtnPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_regresarMouseClicked

    private void btn_guardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseEntered
        btn_guardar.setBackground(new Color(0,0,0));
        btn_guardar.setForeground(Color.white);
    }//GEN-LAST:event_btn_guardarMouseEntered

    private void btn_guardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_guardarMouseExited
        btn_guardar.setBackground(new Color(255,185,29));
        btn_guardar.setForeground(Color.black);
    }//GEN-LAST:event_btn_guardarMouseExited

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        objEmpleado.setNombre(txt_nombre.getText());
        objEmpleado.setApellido(txt_apellido.getText());
        objEmpleado.setEmail(txt_email.getText());
        objEmpleado.setEdad(Integer.parseInt(txt_edad.getText()));
        objEmpleado.setNumDeTelefono(txt_telefono.getText());
        if(radbtn_masculino.isSelected()){
            objEmpleado.setSexo("Masculino");
        }
        else{
            objEmpleado.setSexo("Femenino");
        }
        objEmpleado.setHorasTrabajadasMensuales(Double.parseDouble(txt_horasTrabajadasMensuales.getText()));
        objEmpleado.setPagoPorHora(Double.parseDouble(txt_pagoPorHora.getText()));
        objEmpleado.setNumeroDeEmpleado(txt_numDeEmpleado.getText());
        objEmpleado.setPuesto(txt_puesto.getText());
        objEmpleado.calcular_salario();
            
            objBd.abrir_conexion();
            objBd.insertar_empleado(objEmpleado);
            objBd.cerrar_conexion();
        
        JOptionPane.showMessageDialog(this, "Datos almacenados");
        limpiar_cajas();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void radbtn_femeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radbtn_femeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radbtn_femeninoActionPerformed

    private void btn_mostrarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarEmpleadoMouseEntered
        btn_mostrarEmpleado.setBackground(new Color(0,0,0));
        btn_mostrarEmpleado.setForeground(Color.white);
    }//GEN-LAST:event_btn_mostrarEmpleadoMouseEntered

    private void btn_mostrarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mostrarEmpleadoMouseExited
        btn_mostrarEmpleado.setBackground(new Color(255,185,29));
        btn_mostrarEmpleado.setForeground(Color.black);
    }//GEN-LAST:event_btn_mostrarEmpleadoMouseExited

    private void btn_mostrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mostrarEmpleadoActionPerformed

        objBd.abrir_conexion();
        objEmpleado = objBd.consultar_empleado(txt_ingresoNumDeEmpleado.getText());
        objBd.cerrar_conexion();

        if(objEmpleado!= null){
            txt_datosEmpleado.setForeground(Color.black);
            txt_datosEmpleado.setText(objEmpleado.mostrar_datos());
        }else{
            txt_ingresoNumDeEmpleado.setText("Ingresa aquí el numero de empleado");
            txt_ingresoNumDeEmpleado.setForeground(new Color(153,153,153));
            txt_datosEmpleado.setText("Aquí aparecerán los datos del empleado...");
            txt_datosEmpleado.setForeground(new Color(153,153,153));
            JOptionPane.showMessageDialog(this, "Empleado no fue encontrado en la base de datos")                                                                 ;
        }

        txt_datosEmpleado.setText(objEmpleado.mostrar_datos());

    }//GEN-LAST:event_btn_mostrarEmpleadoActionPerformed

    private void btn_eliminarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarEmpleadoMouseEntered
        btn_eliminarEmpleado.setBackground(new Color(133,4,19));
        btn_eliminarEmpleado.setForeground(Color.white);
    }//GEN-LAST:event_btn_eliminarEmpleadoMouseEntered

    private void btn_eliminarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarEmpleadoMouseExited
        btn_eliminarEmpleado.setBackground(new Color(255,51,51));
        btn_eliminarEmpleado.setForeground(Color.black);
    }//GEN-LAST:event_btn_eliminarEmpleadoMouseExited

    private void btn_eliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarEmpleadoActionPerformed
        objBd.abrir_conexion();
        objEmpleado = objBd.consultar_empleado(txt_ingresoNumDeEmpleado.getText());

        if(objEmpleado != null){
            objBd.eliminar_empleado(objEmpleado);
            JOptionPane.showMessageDialog(this,"Empleado eliminado de la base de datos");
        }else{
            JOptionPane.showMessageDialog(this,"Empleado no encontrado en la base de datos");
        }
        limpiar_cajas();
        objBd.cerrar_conexion();

    }//GEN-LAST:event_btn_eliminarEmpleadoActionPerformed

    private void txt_ingresoNumDeEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ingresoNumDeEmpleadoMouseClicked
        txt_ingresoNumDeEmpleado.setText("");
        txt_ingresoNumDeEmpleado.setForeground(Color.black);
    }//GEN-LAST:event_txt_ingresoNumDeEmpleadoMouseClicked

    private void btn_actualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseEntered
        btn_actualizar.setBackground(new Color(0,0,0));
        btn_actualizar.setForeground(Color.white);
    }//GEN-LAST:event_btn_actualizarMouseEntered

    private void btn_actualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_actualizarMouseExited
        btn_actualizar.setBackground(new Color(255,185,29));
        btn_actualizar.setForeground(Color.black);
    }//GEN-LAST:event_btn_actualizarMouseExited

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        
        objEmpleado.actualizar_empleado(objEmpleado,
                              txt_nombreActualizar.getText(),
                              txt_apellidoActualizar.getText(),
                              txt_emailActualizar.getText(),
                              Integer.parseInt(txt_edadActualizar.getText()),
                              txt_telefonoActualizar.getText(),
                              Double.parseDouble(txt_horasTrabajadasActualizar.getText()),
                              Double.parseDouble(txt_pagoPorHoraActualizar.getText()),
                              txt_puestoActualizar.getText());
                              objEmpleado.calcular_salario();
                              
        objBd.abrir_conexion();
        objBd.actualizar_empleado(objEmpleado);
        objBd.cerrar_conexion();
        
        JOptionPane.showMessageDialog(this, "Empleado Actualizado");
        limpiar_cajas();
        deshabilitar_cajas();
              
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered
        btn_buscar.setBackground(new Color(0,0,0));
        btn_buscar.setForeground(Color.white);
    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
        btn_buscar.setBackground(new Color(255,185,29));
        btn_buscar.setForeground(Color.black);
    }//GEN-LAST:event_btn_buscarMouseExited

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        objBd.abrir_conexion();
        objEmpleado = objBd.consultar_empleado(txt_numEmpleadoAActualizar.getText());
        objBd.cerrar_conexion();
        
        
        if(objEmpleado!=null) {
            JOptionPane.showMessageDialog(this, "Empleado encontrado, lo puedes actualizar");
            habilitar_cajas();
            txt_nombreActualizar.setText(objEmpleado.getNombre());
            txt_apellidoActualizar.setText(objEmpleado.getApellido());
            txt_emailActualizar.setText(objEmpleado.getEmail());
            txt_edadActualizar.setText(Integer.toString(objEmpleado.getEdad()));
            txt_telefonoActualizar.setText(objEmpleado.getNumDeTelefono());
            txt_horasTrabajadasActualizar.setText(Double.toString(objEmpleado.getHorasTrabajadasMensuales()));
            txt_pagoPorHoraActualizar.setText(Double.toString(objEmpleado.getPagoPorHora()));
            txt_puestoActualizar.setText(objEmpleado.getPuesto());
            
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Empleado no encontrado");
            deshabilitar_cajas();
            txt_numEmpleadoAActualizar.setText("Ingresa el numero de Empleado");
            txt_numEmpleadoAActualizar.setForeground(new Color(153,153,153));
        }  
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txt_numEmpleadoAActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_numEmpleadoAActualizarMouseClicked
        txt_numEmpleadoAActualizar.setText("");
        txt_numEmpleadoAActualizar.setForeground(Color.black);
    }//GEN-LAST:event_txt_numEmpleadoAActualizarMouseClicked

    private void btn_buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarEmpleadoActionPerformed
        objBd.abrir_conexion();
        if(txt_tablaEmpleado.getText().isBlank() || "Ingresa el numero de empleado".equals(txt_tablaEmpleado.getText()))
            modeloEmpleado = objBd.consultar_empleado(modeloEmpleado);
        else
            modeloEmpleado = objBd.consultar_empleado(txt_tablaEmpleado.getText(), modeloEmpleado);
        
        if(modeloEmpleado.getRowCount()!= 0)
            tbl_Empleado.setModel(modeloEmpleado);
        else
            JOptionPane.showMessageDialog(this, "Cliente no se encuentra en la base de datos");
        
        objBd.cerrar_conexion();
        limpiar_cajas();
    }//GEN-LAST:event_btn_buscarEmpleadoActionPerformed

    private void btn_buscarEmpleadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarEmpleadoMouseExited
        btn_buscarEmpleado.setBackground(new Color(255,185,29));
        btn_buscarEmpleado.setForeground(Color.black);
    }//GEN-LAST:event_btn_buscarEmpleadoMouseExited

    private void btn_buscarEmpleadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarEmpleadoMouseEntered
        btn_buscarEmpleado.setBackground(new Color(0,0,0));
        btn_buscarEmpleado.setForeground(Color.white);
    }//GEN-LAST:event_btn_buscarEmpleadoMouseEntered

    private void txt_tablaEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_tablaEmpleadoMouseClicked
        txt_tablaEmpleado.setText("");
        txt_tablaEmpleado.setForeground(Color.black);
    }//GEN-LAST:event_txt_tablaEmpleadoMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        objVtnPrincipal.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    
    public void limpiar_cajas(){
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_email.setText("");
        txt_edad.setText("");
        txt_telefono.setText("");
        txt_pagoPorHora.setText("");
        txt_horasTrabajadasMensuales.setText("");
        txt_numDeEmpleado.setText("");
        txt_puesto.setText("");
        
        txt_nombreActualizar.setText("");
        txt_apellidoActualizar.setText("");
        txt_emailActualizar.setText("");
        txt_edadActualizar.setText("");
        txt_telefonoActualizar.setText("");
        txt_horasTrabajadasActualizar.setText("");
        txt_pagoPorHoraActualizar.setText("");
        txt_puestoActualizar.setText("");
        txt_numEmpleadoAActualizar.setText("");
    }
    public void habilitar_cajas(){
        txt_nombreActualizar.setEnabled(true);
        txt_apellidoActualizar.setEnabled(true);
        txt_emailActualizar.setEnabled(true);
        txt_edadActualizar.setEnabled(true);
        txt_telefonoActualizar.setEnabled(true);
        txt_horasTrabajadasActualizar.setEnabled(true);
        txt_pagoPorHoraActualizar.setEnabled(true);
        txt_puestoActualizar.setEnabled(true);
    }
    public void deshabilitar_cajas(){
        txt_nombreActualizar.setEnabled(false);
        txt_apellidoActualizar.setEnabled(false);
        txt_emailActualizar.setEnabled(false);
        txt_edadActualizar.setEnabled(false);
        txt_telefonoActualizar.setEnabled(false);
        txt_horasTrabajadasActualizar.setEnabled(false);
        txt_pagoPorHoraActualizar.setEnabled(false);
        txt_puestoActualizar.setEnabled(false);
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
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VtnEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VtnEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_buscarEmpleado;
    private javax.swing.JButton btn_eliminarEmpleado;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_mostrarEmpleado;
    private javax.swing.JLabel btn_regresar;
    private javax.swing.ButtonGroup btngroup_sexo;
    private javax.swing.JLabel img_fondo;
    private javax.swing.JLabel img_logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_actualizarEmpleado;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_apellidoActualizar;
    private javax.swing.JLabel lbl_edad;
    private javax.swing.JLabel lbl_edadActualizar;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_emailActualizar;
    private javax.swing.JLabel lbl_horasTrabajadasActualizar;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombreActualizar;
    private javax.swing.JLabel lbl_numDeEmpleado;
    private javax.swing.JLabel lbl_pagoPorHora;
    private javax.swing.JLabel lbl_pagoPorHoraActualizar;
    private javax.swing.JLabel lbl_puesto;
    private javax.swing.JLabel lbl_puestoActualizar;
    private javax.swing.JLabel lbl_sexo;
    private javax.swing.JLabel lbl_sexo1;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JLabel lbl_telefonoActualizar;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_titulo1;
    private javax.swing.JPanel pnl_mostrar;
    private javax.swing.JRadioButton radbtn_femenino;
    private javax.swing.JRadioButton radbtn_masculino;
    private javax.swing.JPanel tab_Actualizar;
    private javax.swing.JPanel tab_agregar;
    private javax.swing.JTabbedPane tab_empleados;
    private javax.swing.JPanel tab_mostrar;
    private javax.swing.JPanel tab_tablaEmpleados;
    private javax.swing.JTable tbl_Empleado;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_apellidoActualizar;
    private javax.swing.JTextArea txt_datosEmpleado;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_edadActualizar;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_emailActualizar;
    private javax.swing.JTextField txt_horasTrabajadasActualizar;
    private javax.swing.JTextField txt_horasTrabajadasMensuales;
    private javax.swing.JTextField txt_ingresoNumDeEmpleado;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_nombreActualizar;
    private javax.swing.JTextField txt_numDeEmpleado;
    private javax.swing.JTextField txt_numEmpleadoAActualizar;
    private javax.swing.JTextField txt_pagoPorHora;
    private javax.swing.JTextField txt_pagoPorHoraActualizar;
    private javax.swing.JTextField txt_puesto;
    private javax.swing.JTextField txt_puestoActualizar;
    private javax.swing.JTextField txt_tablaEmpleado;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_telefonoActualizar;
    // End of variables declaration//GEN-END:variables
}
