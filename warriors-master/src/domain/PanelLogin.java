/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import Data.Conexion;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Polygon;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author henry
 */
public class PanelLogin extends javax.swing.JPanel {
    Conexion con =new Conexion();
    /**
     * Creates new form PanelLogin
     */
    
    UIManager UI;
    public PanelLogin() {
        initComponents();
    }

    public void paintComponent(Graphics g) {
        g.setColor(new Color(30,80,250));
        int[] valoresX = {390,390,0};
        int[] valoresY = {100,290,290};
        g.fillPolygon(valoresX,valoresY,3);
        
        
        
        //imagen
        Dimension tamanio = getSize();
        ImageIcon logo = new ImageIcon("src/Images/userLogin.png");
        lblimagen.setIcon(new ImageIcon(logo.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_SMOOTH)));
        setOpaque(false);
        super.paintComponent(g);
        

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagen = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(400, 300));
        setMinimumSize(new java.awt.Dimension(400, 300));

        lblimagen.setText("jLabel1");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AdmUsuario.png"))); // NOI18N

        txtUsuario.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 153, 255), null));
        txtUsuario.setNextFocusableComponent(txtpassword);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/password.png"))); // NOI18N

        txtpassword.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 255), null));
        txtpassword.setEnabled(false);
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtpassword))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        txtpassword.setEnabled(true);
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        
    }//GEN-LAST:event_txtpasswordKeyReleased

    public void Ingresar(){
       
        
        if(txtUsuario.getText().isEmpty() && String.valueOf(txtpassword.getPassword()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Debe especificar un usuario/contraseña");
        }
        String q="SELECT * FROM USUARIOS WHERE USERNAME='"+txtUsuario.getText()+"' AND PASSWORD='"+String.valueOf(txtpassword.getPassword())+"'";
        //System.out.println("query: "+q);
        try {
            ResultSet resp;
            con.conectar();
            resp=con.getData(q);
            int count=0;
            String user="";
            while (resp.next()) {                
                count++;
                user=resp.getString("Nombre").toUpperCase();
            }
            if(count>0){
                
                JOptionPane.showMessageDialog(null, "Bienvenido "+user+" al sistema","Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                MenuPrincipal menu = new MenuPrincipal(user);
                menu.setVisible(true);
                
                Login frame=(Login) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "El usuario/contraseña no son validos");
            }
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
        con.desconexion();
    }
    
    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        int key = evt.getKeyChar();
        //System.out.println("KeyCode: "+key);
        if(key==10){
            Ingresar();
        }
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
