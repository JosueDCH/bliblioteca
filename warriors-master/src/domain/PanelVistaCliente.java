/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Data.Conexion;
import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author henry
 */
public class PanelVistaCliente extends javax.swing.JPanel {
    Conexion con=new Conexion();

    /**
     * Creates new form PanelVistaCliente
     */
    public PanelVistaCliente() {
        initComponents();
        LoadClients();
    }
    DefaultTableModel model;
    private void LoadClients(){
        model=new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
            
        };
        String query="SELECT IDCLIENTE, NOMBRE, APELLIDO, TELEFONO, EMAIL, DIRECCION FROM CLIENTES ORDER BY IDCLIENTE";
        model.setColumnIdentifiers(new Object[]{"ID","NOMBRE","TELEFONO","EMAIL","DIRECCION"});
        try {
            con.conectar();
            ResultSet resp;
            resp=con.getData(query);
            while (resp.next()) {                
                model.addRow(new Object[]{resp.getInt(1),resp.getString(2)+" "+resp.getString(3),resp.getString(4),resp.getString(5),resp.getString(6)});
            }
            TableCliente.setModel(model);
            
            
        } catch (Exception e) {
        }
        con.desconexion();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelClientes = new javax.swing.JPanel();
        txtBusquedaCLiente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        PanelClientes.setBackground(new java.awt.Color(255, 255, 255));
        PanelClientes.setMaximumSize(new java.awt.Dimension(980, 548));
        PanelClientes.setMinimumSize(new java.awt.Dimension(980, 548));
        PanelClientes.setName(""); // NOI18N

        txtBusquedaCLiente.setToolTipText("Buscar Cliente");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add-user.png"))); // NOI18N
        jButton1.setText("Añadir Cliente");
        jButton1.setBorderPainted(false);
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        TableCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdCliente", "Nombre", "Apellido", "Telefono", "Email", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(TableCliente);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserFrom.png"))); // NOI18N
        jLabel1.setText("Clientes");
        jLabel1.setPreferredSize(new java.awt.Dimension(180, 30));

        btnActualizar.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Update.png"))); // NOI18N
        btnActualizar.setToolTipText("Actualizar Tabla");
        btnActualizar.setBorderPainted(false);
        btnActualizar.setOpaque(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelClientesLayout = new javax.swing.GroupLayout(PanelClientes);
        PanelClientes.setLayout(PanelClientesLayout);
        PanelClientesLayout.setHorizontalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelClientesLayout.createSequentialGroup()
                        .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(PanelClientesLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(PanelClientesLayout.createSequentialGroup()
                        .addComponent(txtBusquedaCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        PanelClientesLayout.setVerticalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClientesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnActualizar)
                    .addGroup(PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBusquedaCLiente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelAddCliente addcliente = new PanelAddCliente();
        addcliente.setSize(980, 548);//tama;o
        addcliente.setLocation(5, 5);//posicion

       
        PanelClientes.removeAll();
        PanelClientes.add(addcliente, BorderLayout.CENTER);
        PanelClientes.revalidate();
        PanelClientes.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        LoadClients();
    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelClientes;
    private javax.swing.JTable TableCliente;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBusquedaCLiente;
    // End of variables declaration//GEN-END:variables
}
