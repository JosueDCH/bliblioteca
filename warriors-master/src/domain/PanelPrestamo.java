package domain;

import Data.Conexion;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;

public class PanelPrestamo extends javax.swing.JPanel {

    Conexion con = new Conexion();
    Busqueda buscar;

    public PanelPrestamo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdPrestamo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFechaSalida = new javax.swing.JTextField();
        btnBuscarClientes = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtIdLibro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTituloLibro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtAutorLibro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtEditorialLibro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtAnioLibro = new javax.swing.JTextField();
        lblImagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/IconoPrestamo.png"))); // NOI18N
        jLabel1.setText("Prestamo");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de los Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 14))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel2.setText("Registro Prestamo");

        txtIdPrestamo.setEditable(false);
        txtIdPrestamo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel3.setText("Id Cliente");

        txtIdCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel4.setText("Nombre");

        txtNombreCliente.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setText("Fecha de Salida");

        txtFechaSalida.setEditable(false);
        txtFechaSalida.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtFechaSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaSalidaActionPerformed(evt);
            }
        });

        btnBuscarClientes.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search2.png"))); // NOI18N
        btnBuscarClientes.setToolTipText("");
        btnBuscarClientes.setBorderPainted(false);
        btnBuscarClientes.setOpaque(false);
        btnBuscarClientes.setRequestFocusEnabled(false);
        btnBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Datos de los Libros", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 14))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel6.setText("Id Libro");

        txtIdLibro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtIdLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdLibroActionPerformed(evt);
            }
        });
        txtIdLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdLibroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdLibroKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel7.setText("Titulo Libro");

        txtTituloLibro.setEditable(false);
        txtTituloLibro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtTituloLibro.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Search2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel8.setText("Autor Libro");

        txtAutorLibro.setEditable(false);
        txtAutorLibro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtAutorLibro.setOpaque(false);

        jLabel9.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel9.setText("Editorial");

        txtEditorialLibro.setEditable(false);
        txtEditorialLibro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtEditorialLibro.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel10.setText("Año");

        txtAnioLibro.setEditable(false);
        txtAnioLibro.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtAnioLibro.setOpaque(false);

        lblImagen.setToolTipText("Imagen de la caratula del libro");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtTituloLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                        .addComponent(txtAutorLibro))
                    .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnioLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTituloLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutorLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditorialLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAnioLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save Color.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancel.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
        try {
            con.conectar();
            String query = "SELECT IDCLIENTE, NOMBRE, APELLIDO, TELEFONO, EMAIL, DIRECCION FROM CLIENTES WHERE IDCLIENTE=" + txtIdCliente.getText().trim();
            ResultSet resp;
            con.conectar();
            resp = con.getData(query);
            int count = 0;
            String nombre = null;
            while (resp.next()) {
                count = count + 1;
                nombre = resp.getString(2) + " " + resp.getString(3);
            }

            System.out.println("Boolean: " + (count > 0));

            if (count > 0) {
                txtNombreCliente.setText(nombre);
                System.out.println("hay registros");
            } else {
                JOptionPane.showMessageDialog(null, "No existen registros con ese ID de cliente");
            }
        } catch (Exception e) {
        }
        con.desconexion();
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCamposLibros();
        Busqueda.tipoBusqueda = 2;

        buscar = new Busqueda();
        buscar.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLibroActionPerformed
        try {
            con.conectar();
            String query = "SELECT IDLIBRO, TITULO, EDITORIAL, AUTOR, IDIOMA, YEAR, IMAGEN FROM LIBROS WHERE IDLIBRO=" + txtIdLibro.getText().trim();
            ResultSet resp;
            con.conectar();
            resp = con.getData(query);
            int count = 0;
            String titulo = null, autor = null, editorial = null, imageUrl = null;
            int year = 0;
            while (resp.next()) {
                count = count + 1;
                titulo = resp.getString(2);
                autor = resp.getString(4);
                editorial = resp.getString(3);
                year = resp.getInt(6);
                imageUrl = resp.getString(7);
            }

            System.out.println("Boolean: " + (count > 0));

            if (count > 0) {
                txtTituloLibro.setText(titulo);
                txtAutorLibro.setText(autor);
                txtEditorialLibro.setText(editorial);
                txtAnioLibro.setText(String.valueOf(year));
                lblImagen.setIcon(new ImageIcon(imageUrl));
                ImageIcon icon = new ImageIcon(imageUrl);
                Image imagen = icon.getImage();
                Image newimagen = imagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newIcon = new ImageIcon(newimagen);
                lblImagen.setIcon(newIcon);
                System.out.println("hay registros");
                System.out.println("URL: " + imageUrl);
            } else {
                JOptionPane.showMessageDialog(null, "No existen registros con ese ID de libro");
            }
        } catch (Exception e) {
        }
        con.desconexion();

    }//GEN-LAST:event_txtIdLibroActionPerformed
    java.util.Date date = new java.util.Date();
    long t = date.getTime();
    java.sql.Date sqlDate = new java.sql.Date(t);
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
            try {

                String query = "INSERT INTO PRESTAMOS (IDPRESTAMO, IDCLIENTE, IDLIBRO, FECHAPRESTAMO, ACTIVO) VALUES(PRESTAMO_SEQ.NextVal, ?,?,?,?)";
                con.conectar();
                PreparedStatement pstm = Conexion.con.prepareStatement(query);
                pstm.setInt(1, Integer.parseInt(txtIdCliente.getText().trim()));
                pstm.setInt(2, Integer.parseInt(txtIdLibro.getText().trim()));
                pstm.setDate(3, sqlDate);
                pstm.setString(4, "Y");

                int row = pstm.executeUpdate();
                if (row >= 1) {
                    JOptionPane.showMessageDialog(null, "Se ha creado con exito el registro");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un problema al insertar en la base de datos");
                }
                //System.out.println("Row affected: "+row);

                //Limpia los Campos
                limpiarCamposCliente();
                txtIdCliente.setText("");
                limpiarCamposLibros();
                txtIdLibro.setText("");

            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCamposCliente();
        limpiarCamposLibros();
        txtIdLibro.setText("");
        txtIdCliente.setText("");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtIdLibroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdLibroKeyPressed
        limpiarCamposLibros();
    }//GEN-LAST:event_txtIdLibroKeyPressed

    public void limpiarCamposLibros() {
        txtTituloLibro.setText("");
        txtAutorLibro.setText("");
        txtAnioLibro.setText("");
        txtEditorialLibro.setText("");
        lblImagen.setIcon(null);

    }

    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("YYYY-M-d");

        return formatoFecha.format(fecha);
    }

    private void txtFechaSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaSalidaActionPerformed

    }//GEN-LAST:event_txtFechaSalidaActionPerformed

    private void txtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyPressed
        txtFechaSalida.setText(fechaActual());
        txtNombreCliente.setText("");
    }//GEN-LAST:event_txtIdClienteKeyPressed

    private void txtIdLibroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdLibroKeyTyped
        if (txtIdLibro.getText().equals(":/")) {
            Busqueda buscar = new Busqueda();

            buscar.setVisible(true);
        }
    }//GEN-LAST:event_txtIdLibroKeyTyped

    private void btnBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientesActionPerformed
        // TODO add your handling code here:
        limpiarCamposCliente();

        Busqueda.tipoBusqueda = 1;

        buscar = new Busqueda();
        buscar.setVisible(true);

    }//GEN-LAST:event_btnBuscarClientesActionPerformed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
    
    }//GEN-LAST:event_formMouseMoved

    public void limpiarCamposCliente() {
        txtNombreCliente.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarClientes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtAnioLibro;
    private javax.swing.JTextField txtAutorLibro;
    private javax.swing.JTextField txtEditorialLibro;
    private javax.swing.JTextField txtFechaSalida;
    public static javax.swing.JTextField txtIdCliente;
    public static javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtIdPrestamo;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtTituloLibro;
    // End of variables declaration//GEN-END:variables
}
