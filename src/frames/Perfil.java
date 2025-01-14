/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import frames.*;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author Acer
 */
public class Perfil extends javax.swing.JDialog {
    
    Icon image;
    String nombre, apellido;

    /**
     * Creates new form Perfil
     */
    public Perfil(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        
        if (Premium.premium) {
            
            premium.setVisible(true);
            
        } else {
            
            premium.setVisible(false);
            
        }
        
        jNombre.setText(Registro.nombre + " " + Registro.apellido);
        jCorreo.setText(Registro.correo);
        jTelefono.setText(Registro.telefono);
        jFecha.setText(Registro.fecha);
        jPais.setText(Registro.pais);
        jSexo.setText(Registro.sexo);
        tarjeta.setVisible(false);
        paypal.setVisible(false);
        
        if (Registro.ruta == null) {

        } else {

            ImageIcon icon = new ImageIcon(Registro.ruta);
            Icon icono = new ImageIcon(icon.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), Image.SCALE_DEFAULT));
            foto.setIcon(icono);

        }
        
        if (FormasDePago.monedero) {
            
            if (FormasDePago.metodo.equalsIgnoreCase("tarjeta")) {
                
                jMonedero.setText("Tarjeta registrada");
                icon.setVisible(true);
                tarjeta.setVisible(true);
                id.setVisible(true);
                id.setText(Tarjeta.numero);
                ImageIcon icono;
                
                if (Tarjeta.tipo.equalsIgnoreCase("VISA")) {
                    
                    icono = new ImageIcon(getClass().getResource("/images/visa (1).png"));
                    icon.setIcon(icono);
                    
                } else if (Tarjeta.tipo.equalsIgnoreCase("mastercard")) {
                    
                    icono = new ImageIcon(getClass().getResource("/images/mastercard.png"));
                    icon.setIcon(icono);
                    
                } else if (Tarjeta.tipo.equalsIgnoreCase("american express")) {
                    
                    icono = new ImageIcon(getClass().getResource("/images/american-express.png"));
                    icon.setIcon(icono);
                    
                } else if (Tarjeta.tipo.equalsIgnoreCase("dinners club")) {
                    
                    icono = new ImageIcon(getClass().getResource("/images/dinners-club.png"));
                    icon.setIcon(icono);
                    
                }
                
            } else if (FormasDePago.metodo.equalsIgnoreCase("paypal")){
                
                jMonedero.setText("PayPal registrado");
                icon.setVisible(true);
                paypal.setVisible(true);
                id.setVisible(true);
                id.setText(String.valueOf(Paypal.nombre_paypal));
                ImageIcon icono = new ImageIcon(getClass().getResource("/images/paypal (3).png"));
                icon.setIcon(icono);
                
            }
            
        } else {
            
            jMonedero.setText("Sin registrar");
            icon.setVisible(false);
            paypal.setVisible(false);
            tarjeta.setVisible(false);
            icon.setVisible(false);
            id.setVisible(false);
            
        }
        
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
        foto = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jCorreo = new javax.swing.JLabel();
        jSexo = new javax.swing.JLabel();
        jTelefono = new javax.swing.JLabel();
        jFecha = new javax.swing.JLabel();
        jPais = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        sexo = new javax.swing.JLabel();
        pais = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        monedero = new javax.swing.JLabel();
        paypal = new javax.swing.JLabel();
        tarjeta = new javax.swing.JLabel();
        jMonedero = new javax.swing.JLabel();
        BotonCerrar = new rojeru_san.RSButton();
        jPanel2 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        jNombre = new javax.swing.JLabel();
        premium = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1453, 838));
        setSize(new java.awt.Dimension(1453, 838));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sinperfil.png"))); // NOI18N
        jPanel1.add(foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        id.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        id.setText("243434");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 690, 550, 60));

        jCorreo.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jCorreo.setText("joaquin");
        jPanel1.add(jCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 660, 60));

        jSexo.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jSexo.setText("243434");
        jPanel1.add(jSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 650, 60));

        jTelefono.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jTelefono.setText("243434");
        jPanel1.add(jTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 220, 660, 60));

        jFecha.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jFecha.setText("243434");
        jPanel1.add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 320, 660, 60));

        jPais.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jPais.setText("243434");
        jPanel1.add(jPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 420, 660, 60));

        fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/calendar-with-spring-binder-and-date-blocks.png"))); // NOI18N
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        correo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/envelope.png"))); // NOI18N
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, -1, -1));

        tel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smartphone-call.png"))); // NOI18N
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, -1, -1));

        sexo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gender.png"))); // NOI18N
        jPanel1.add(sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, -1, -1));

        pais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/world.png"))); // NOI18N
        jPanel1.add(pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/visa (1).png"))); // NOI18N
        jPanel1.add(icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 690, -1, -1));

        monedero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wallet.png"))); // NOI18N
        jPanel1.add(monedero, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, -1, -1));

        paypal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paypal (2).png"))); // NOI18N
        jPanel1.add(paypal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 600, -1, -1));

        tarjeta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/credit-card (2).png"))); // NOI18N
        jPanel1.add(tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 600, -1, -1));

        jMonedero.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jMonedero.setText("243434");
        jPanel1.add(jMonedero, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 600, 450, 60));

        BotonCerrar.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setBorder(null);
        BotonCerrar.setText("X");
        BotonCerrar.setBorderPainted(false);
        BotonCerrar.setColorHover(new java.awt.Color(255, 0, 0));
        BotonCerrar.setColorText(new java.awt.Color(0, 0, 0));
        BotonCerrar.setFocusable(false);
        BotonCerrar.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BotonCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        user1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user (5).png"))); // NOI18N
        jPanel2.add(user1);

        jNombre.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        jNombre.setText("joaquin");
        jPanel2.add(jNombre);

        premium.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/premium (2).png"))); // NOI18N
        jPanel2.add(premium);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 810, 760));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1410, 800));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1600, 980));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, -130, 1680, 850));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 1600, 980));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_BotonCerrarMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton BotonCerrar;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel fecha;
    public static javax.swing.JLabel foto;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jCorreo;
    private javax.swing.JLabel jFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jMonedero;
    private javax.swing.JLabel jNombre;
    private javax.swing.JLabel jPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jSexo;
    private javax.swing.JLabel jTelefono;
    private javax.swing.JLabel monedero;
    private javax.swing.JLabel pais;
    private javax.swing.JLabel paypal;
    private javax.swing.JLabel premium;
    private javax.swing.JLabel sexo;
    private javax.swing.JLabel tarjeta;
    private javax.swing.JLabel tel;
    private javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}
