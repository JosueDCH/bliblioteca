package domain;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.*;

public class PanelHome extends javax.swing.JPanel {

    public PanelHome() {
        initComponents();
    }

    public void paintComponent(Graphics g) {
        Dimension tamanio = getSize();
        ImageIcon fondo = new ImageIcon("img/LogoGrupo.jpeg");
        g.drawImage(fondo.getImage(), 0, 0, tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblimagenlogoprincipal = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(lblimagenlogoprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblimagenlogoprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblimagenlogoprincipal;
    // End of variables declaration//GEN-END:variables
}
