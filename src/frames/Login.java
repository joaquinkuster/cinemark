package frames;

import frames.*;
import frames.*;
import java.sql.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Login extends javax.swing.JFrame {

    protected char i;
    String nombre, contrasena;
    public static int ID;

    public Login() {
        initComponents();
        setLocationRelativeTo(null);

        //loading.setVisible(false);
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font(
                "Roboto Bold", Font.BOLD, 36)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        panel2 = new rojeru_san.RSPanelShadow();
        usuario = new javax.swing.JLabel();
        clave = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JLabel();
        CampoContrasenia = new rojeru_san.RSMPassView();
        CampoNombre = new rojeru_san.RSMTextFull();
        BotonMinimizar = new rojeru_san.RSButton();
        BotonIniciar = new rojeru_san.RSButton();
        BotonCerrar1 = new rojeru_san.RSButton();
        jLabelLoginImage = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel2.setBackground(new java.awt.Color(255, 255, 153));
        panel2.setForeground(new java.awt.Color(255, 153, 153));
        panel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/man-user.png"))); // NOI18N
        panel2.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        clave.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        clave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/key.png"))); // NOI18N
        panel2.add(clave, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-cinemark.png"))); // NOI18N
        panel2.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 770, 100));

        BotonRegistrar.setFont(new java.awt.Font("Roboto Bold", 3, 24)
        );
        BotonRegistrar.setText("¿No tienes cuenta? Regístrate ");
        BotonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarMouseClicked(evt);
            }
        });
        panel2.add(BotonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, 40));

        CampoContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        CampoContrasenia.setBordeColorFocus(new java.awt.Color(181, 18, 27));
        CampoContrasenia.setBotonColor(new java.awt.Color(181, 18, 27));
        CampoContrasenia.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        CampoContrasenia.setPlaceholder("Contraseña");
        CampoContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoContraseniaKeyTyped(evt);
            }
        });
        panel2.add(CampoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 580, 120));

        CampoNombre.setForeground(new java.awt.Color(0, 0, 0));
        CampoNombre.setBordeColorFocus(new java.awt.Color(181, 18, 27));
        CampoNombre.setBotonColor(new java.awt.Color(181, 18, 27));
        CampoNombre.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        CampoNombre.setPlaceholder("Nombre de usuario");
        CampoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNombreKeyTyped(evt);
            }
        });
        panel2.add(CampoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 580, 110));

        panel.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 790, 500));

        BotonMinimizar.setBackground(new java.awt.Color(255, 255, 255));
        BotonMinimizar.setBorder(null);
        BotonMinimizar.setText("—");
        BotonMinimizar.setBorderPainted(false);
        BotonMinimizar.setColorHover(new java.awt.Color(204, 204, 204));
        BotonMinimizar.setColorText(new java.awt.Color(0, 0, 0));
        BotonMinimizar.setFocusable(false);
        BotonMinimizar.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BotonMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMinimizarMouseEntered(evt);
            }
        });
        BotonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMinimizarActionPerformed(evt);
            }
        });
        panel.add(BotonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 50));

        BotonIniciar.setBackground(new java.awt.Color(200, 4, 17));
        BotonIniciar.setText("Iniciar Sesión");
        BotonIniciar.setColorHover(new java.awt.Color(181, 18, 27));
        BotonIniciar.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        BotonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarMouseClicked(evt);
            }
        });
        panel.add(BotonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 900, 360, 120));

        BotonCerrar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonCerrar1.setBorder(null);
        BotonCerrar1.setText("X");
        BotonCerrar1.setBorderPainted(false);
        BotonCerrar1.setColorHover(new java.awt.Color(255, 0, 0));
        BotonCerrar1.setColorText(new java.awt.Color(0, 0, 0));
        BotonCerrar1.setFocusable(false);
        BotonCerrar1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BotonCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCerrar1MouseClicked(evt);
            }
        });
        panel.add(BotonCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 60, 50));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, 850, 1080));

        jLabelLoginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/c1_Mesa de trabajo 1.jpg"))); // NOI18N
        getContentPane().add(jLabelLoginImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1120, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMouseClicked

        Registro ventana = new Registro();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BotonRegistrarMouseClicked

    private void BotonIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarMouseClicked

        iniciar();

    }//GEN-LAST:event_BotonIniciarMouseClicked

    private void BotonMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BotonMinimizarMouseClicked

    private void BotonCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrar1MouseClicked

        int msj = JOptionPane.showConfirmDialog(null, "¿Estás seguro que desea salir?", "", JOptionPane.YES_NO_OPTION);

        if (msj == JOptionPane.YES_OPTION) {

            System.exit(0);

        }


    }//GEN-LAST:event_BotonCerrar1MouseClicked

    public void iniciar() {

        try {
              
	    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_cinemark", "root", "");
            PreparedStatement pst = cn.prepareStatement("SELECT * FROM usuarios WHERE (nombre = ?) AND (contrasenia = ?)");
            
            pst.setString(1, CampoNombre.getText().trim());
            pst.setString(2, CampoContrasenia.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                 
                 Registro.nombre = rs.getString("nombre");
                 Registro.apellido = rs.getString("apellido");
                 Registro.correo = rs.getString("correo");
                 Registro.telefono = rs.getString("telefono");
                 Registro.contrasenia = rs.getString("contrasenia");
                 Registro.fecha = rs.getString("fecha");
                 Registro.pais = rs.getString("pais");
                 Registro.sexo = rs.getString("sexo");
                 ID = rs.getInt("id");
                 
                 Registro.ruta = rs.getString("ruta");
                 if (Registro.ruta.equalsIgnoreCase("sin foto de perfil")) {
                     
                     Registro.ruta = null;
                     
                 } 
                 
                 
                 Registro.id_sexo = rs.getInt("idsexo");
                 Registro.id_pais = rs.getInt("idpais");
                 Premium.premium = rs.getBoolean("premium");
                 FormasDePago.monedero = rs.getBoolean("monedero");
                 
                 FormasDePago.metodo = rs.getString("formadepago");
                 if (FormasDePago.metodo.equalsIgnoreCase("sin registrar")) {
                     
                     FormasDePago.metodo = null;
                     
                 }
                 
                 Tarjeta.numero = rs.getString("numero_tarjeta");
                 if (Tarjeta.numero.equalsIgnoreCase("nulo")) {
                     
                     Tarjeta.numero = null;
                     
                 }
                 
                 Tarjeta.tipo = rs.getString("tipo_tarjeta");
                 if (Tarjeta.tipo.equalsIgnoreCase("nulo")) {
                     
                     Tarjeta.tipo = null;
                     
                 }
                 
                 Paypal.nombre_paypal = rs.getString("nombre_paypal");
                 if (Paypal.nombre_paypal.equalsIgnoreCase("nulo")) {
                     
                     Paypal.nombre_paypal = null;
                     
                 }

                 Loading ventana = new Loading(new Lobby());
                 ventana.setVisible(true);
                 this.dispose();
                 
            } else {
                
                if (CampoNombre.getText().isEmpty() || CampoContrasenia.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(null, "¡Debes rellenar todos los campos!", "", JOptionPane.ERROR_MESSAGE);

                } else {

                    nombre = CampoNombre.getText().trim();
                    contrasena = CampoContrasenia.getText().trim();

                    try {

                        if (Registro.nombre.equalsIgnoreCase(nombre)) {

                            if (Registro.contrasenia.equals(contrasena)) {

                                Loading ventana = new Loading(new Lobby());
                                ventana.setVisible(true);
                                this.dispose();

                            } else {

                                JOptionPane.showMessageDialog(null, "Error! Contraseña  incorrecta", "", JOptionPane.ERROR_MESSAGE);

                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "Error! Nombre de usuario incorrecto", "", JOptionPane.ERROR_MESSAGE);

                        }

                    } catch (Exception ex) {

                        JOptionPane.showMessageDialog(null, "Error! La cuenta ingresada no existe \n" + ex, "", JOptionPane.ERROR_MESSAGE);

                    }

                }
                
            }
            
        } catch (Exception e) {
        
        JOptionPane.showMessageDialog(null, "Error! " + e);
            
        }

    }

    private void BotonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMinimizarActionPerformed

    private void BotonMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMinimizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMinimizarMouseEntered

    private void CampoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNombreKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == KeyEvent.VK_ENTER) {

            iniciar();

        }        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreKeyTyped

    private void CampoContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoContraseniaKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == KeyEvent.VK_ENTER) {

            iniciar();

        }  
        
    }//GEN-LAST:event_CampoContraseniaKeyTyped

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton BotonCerrar1;
    public rojeru_san.RSButton BotonIniciar;
    private rojeru_san.RSButton BotonMinimizar;
    private javax.swing.JLabel BotonRegistrar;
    private rojeru_san.RSMPassView CampoContrasenia;
    private rojeru_san.RSMTextFull CampoNombre;
    private javax.swing.JLabel clave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLoginImage;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private rojeru_san.RSPanelShadow panel2;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
