/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import frames.*;
import java.sql.*;
import com.sun.glass.events.KeyEvent;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Acer
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    
    public static String nombre=null, apellido=null, sexo=null, pais=null, correo=null, contrasenia=null, telefono=null, ruta=null, fecha = null;
    public static int id_sexo, id_pais;
    public byte[] imagen = null;
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    public FileInputStream entrada;
    FileOutputStream salida;
    public Icon icono;
    public ImageIcon icon;
    
    
    
    public Registro() {
        initComponents();
        setLocationRelativeTo(null);
        error1.setVisible(false);
        error2.setVisible(false);
        error3.setVisible(false);

        
    }
    
    public byte[] AbrirArchivo(File archivo) {
        
        byte[] imagen = new byte[1024*100];
        try {
            entrada = new FileInputStream(archivo);
            entrada.read(imagen);
        } catch (Exception e) {
            
        }
        return imagen;
    }
    
    public String GuardarArchivo (File archivo, byte[] imagen) {
        
        String msj = null;
        try {
            salida = new FileOutputStream(archivo);
            salida.write(imagen);
            msj = "Archivo Guardado";
        } catch (Exception e) {
        }
        return msj;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoSexo = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        BotonIniciar = new rojeru_san.RSButton();
        jLabel1 = new javax.swing.JLabel();
        Imagen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        otro = new javax.swing.JRadioButton();
        CampoApellido = new rojeru_san.RSMTextFull();
        CampoNombre = new rojeru_san.RSMTextFull();
        CampoCorreo = new rojeru_san.RSMTextFull();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        CampoPais = new javax.swing.JComboBox();
        CampoFecha = new rojeru_san.componentes.RSDateChooser();
        CampoTelefono = new rojeru_san.RSMTextFull();
        CampoContrasenia = new rojeru_san.RSMPassView();
        error3 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        panel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        BotonCerrar = new rojeru_san.RSButton();
        BotonMinimizar1 = new rojeru_san.RSButton();
        fondo = new javax.swing.JLabel();
        fondo1 = new javax.swing.JLabel();
        fondo2 = new javax.swing.JLabel();
        fondo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1531, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setPreferredSize(new java.awt.Dimension(940, 560));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIniciar.setBackground(new java.awt.Color(200, 4, 17));
        BotonIniciar.setText("Registrarse");
        BotonIniciar.setColorHover(new java.awt.Color(181, 18, 27));
        BotonIniciar.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        BotonIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarMouseClicked(evt);
            }
        });
        panel.add(BotonIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 680, 340, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-button-inside-black-circle (4).png"))); // NOI18N
        jLabel1.setEnabled(false);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel1KeyTyped(evt);
            }
        });
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1530, 420, 130, 150));

        Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/square (1).png"))); // NOI18N
        Imagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImagenMouseClicked(evt);
            }
        });
        panel.add(Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 70, 520, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        otro.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSexo.add(otro);
        otro.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        otro.setText("Otro");
        otro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                otroMouseClicked(evt);
            }
        });
        otro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                otroKeyTyped(evt);
            }
        });
        jPanel1.add(otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 680, 160, 100));

        CampoApellido.setForeground(new java.awt.Color(0, 0, 0));
        CampoApellido.setBordeColorFocus(new java.awt.Color(181, 18, 27));
        CampoApellido.setBotonColor(new java.awt.Color(181, 18, 27));
        CampoApellido.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        CampoApellido.setPlaceholder("Apellido");
        CampoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoApellidoActionPerformed(evt);
            }
        });
        CampoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoApellidoKeyTyped(evt);
            }
        });
        jPanel1.add(CampoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 500, 90));

        CampoNombre.setForeground(new java.awt.Color(0, 0, 0));
        CampoNombre.setBordeColorFocus(new java.awt.Color(181, 18, 27));
        CampoNombre.setBotonColor(new java.awt.Color(181, 18, 27));
        CampoNombre.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        CampoNombre.setPlaceholder("Nombre");
        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });
        CampoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoNombreKeyTyped(evt);
            }
        });
        jPanel1.add(CampoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 460, 90));

        CampoCorreo.setForeground(new java.awt.Color(0, 0, 0));
        CampoCorreo.setBordeColorFocus(new java.awt.Color(181, 18, 27));
        CampoCorreo.setBotonColor(new java.awt.Color(181, 18, 27));
        CampoCorreo.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        CampoCorreo.setPlaceholder("Correo electrónico");
        CampoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCorreoActionPerformed(evt);
            }
        });
        CampoCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoCorreoKeyTyped(evt);
            }
        });
        jPanel1.add(CampoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 910, 110));

        hombre.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSexo.add(hombre);
        hombre.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        hombre.setText("Hombre");
        hombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hombreMouseClicked(evt);
            }
        });
        hombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                hombreKeyTyped(evt);
            }
        });
        jPanel1.add(hombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 680, 240, 100));

        mujer.setBackground(new java.awt.Color(255, 255, 255));
        GrupoSexo.add(mujer);
        mujer.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        mujer.setText("Mujer");
        mujer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mujerMouseClicked(evt);
            }
        });
        mujer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mujerKeyTyped(evt);
            }
        });
        jPanel1.add(mujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 680, 200, 100));

        CampoPais.setEditable(true);
        CampoPais.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        CampoPais.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione país de nacimiento ", "Afganistán ", "Albania  ", "Alemania ", "Andorra ", "Angola Antigua y Barbuda ", "Arabia Saudita ", "Argelia ", "Argentina ", "Armenia ", "Australia ", "Austria ", "Azerbaiyán ", "Bahamas ", "Bangladés ", "Barbados ", "Baréin ", "Bélgica ", "Belice ", "Benín ", "Bielorrusia ", "Birmania ", "Bolivia ", "Bosnia y Herzegovina ", "Botsuana ", "Brasil ", "Brunéi ", "Bulgaria ", "Burkina Faso ", "Burundi ", "Bután ", "Cabo Verde", "Camboya ", "Camerún ", "Canadá ", "Catar ", "Chad ", "Chile ", "China ", "Chipre ", "Ciudad del Vaticano ", "Colombia ", "Comoras ", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica ", "Croacia ", "Cuba ", "Dinamarca ", "Dominica ", "Ecuador ", "Egipto ", "El Salvador ", "Emiratos Árabes Unidos ", "Eritrea ", "Eslovaquia ", "Eslovenia", "España ", "Estados Unidos ", "Estonia ", "Etiopía ", "Filipinas ", "Finlandia ", "Fiyi ", "Francia ", "Gabón ", "Gambia ", "Georgia ", "Ghana ", "Granada ", "Grecia ", "Guatemala ", "Guyana ", "Guinea ", "Guinea ecuatorial ", "Guinea-Bisáu ", "Haití ", "Honduras ", "Hungría ", "India ", "Indonesia ", "Irak ", "Irán ", "Irlanda ", "Islandia ", "Islas Marshall ", "Islas Salomón ", "Israel ", "Italia ", "Jamaica ", "Japón ", "Jordania ", "Kazajistán ", "Kenia ", "Kirguistán ", "Kiribati ", "Kuwait ", "Laos ", "Lesoto ", "Letonia ", "Líbano ", "Liberia ", "Libia ", "Liechtenstein ", "Lituania ", "Luxemburgo ", "Macedonia del Norte ", "Madagascar ", "Malasia ", "Malaui ", "Maldivas ", "Malí ", "Malta ", "Marruecos ", "Mauricio ", "Mauritania ", "México ", "Micronesia", "Moldavia ", "Mónaco ", "Mongolia ", "Montenegro ", "Mozambique ", "Namibia ", "Nauru ", "Nepal ", "Nicaragua ", "Níger ", "Nigeria ", "Noruega ", "Nueva Zelanda ", "Omán ", "Países Bajos ", "Pakistán ", "Palaos ", "Panamá ", "Papúa ", "Nueva Guinea ", "Paraguay", "Perú ", "Polonia ", "Portugal ", "Reino Unido ", "República Centroafricana ", "República Checa ", "República del Congo ", "República Democrática del Congo ", "República Dominicana ", "República Sudafricana ", "Ruanda ", "Rumanía ", "Rusia ", "Samoa ", "San Cristóbal y Nieves ", "San Marino ", "San Vicente y las Granadinas ", "Santa Lucía ", "Santo Tomé y Príncipe ", "Senegal ", "Serbia ", "Seychelles ", "Sierra Leona ", "Singapur ", "Siria ", "Somalia ", "Sri Lanka ", "Suazilandia ", "Sudán ", "Sudán del Sur ", "Suecia ", "Suiza ", "Surinam ", "Tailandia ", "Tanzania ", "Tayikistán ", "Timor Oriental ", "Togo ", "Tonga ", "Trinidad y Tobago ", "Túnez ", "Turkmenistán ", "Turquía ", "Tuvalu ", "Ucrania ", "Uganda ", "Uruguay ", "Uzbekistán ", "Vanuatu ", "Venezuela ", "Vietnam ", "Yemen ", "Yibuti", "Zambia ", "Zimbabue" }));
        CampoPais.setFocusable(false);
        CampoPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoPaisKeyTyped(evt);
            }
        });
        jPanel1.add(CampoPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 910, 100));

        CampoFecha.setColorBackground(new java.awt.Color(181, 18, 27));
        CampoFecha.setColorButtonHover(new java.awt.Color(181, 18, 27));
        CampoFecha.setColorForeground(new java.awt.Color(0, 0, 0));
        CampoFecha.setFont(new java.awt.Font("Roboto Bold", 3, 48));
        CampoFecha.setFuente(new java.awt.Font("Roboto Bold", 3, 48));
        CampoFecha.setPlaceholder("Seleccione fecha de nacimiento");
        CampoFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoFechaKeyTyped(evt);
            }
        });
        jPanel1.add(CampoFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 910, 100));

        CampoTelefono.setForeground(new java.awt.Color(0, 0, 0));
        CampoTelefono.setBordeColorFocus(new java.awt.Color(181, 18, 27));
        CampoTelefono.setBotonColor(new java.awt.Color(181, 18, 27));
        CampoTelefono.setFont(new java.awt.Font("Roboto Bold", 3, 48)); // NOI18N
        CampoTelefono.setPlaceholder("Teléfono");
        CampoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoTelefonoActionPerformed(evt);
            }
        });
        CampoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CampoTelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(CampoTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 910, 110));

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
        jPanel1.add(CampoContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 910, 110));

        error3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel (2).png"))); // NOI18N
        jPanel1.add(error3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, 70));

        error1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel (2).png"))); // NOI18N
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        error2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel (2).png"))); // NOI18N
        jPanel1.add(error2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1120, 810));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 1740, 850));

        panel1.setBackground(new java.awt.Color(255, 255, 255));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-cinemark.png"))); // NOI18N
        logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoMouseClicked(evt);
            }
        });
        panel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 140));

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
        panel1.add(BotonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 0, 80, 40));

        BotonMinimizar1.setBackground(new java.awt.Color(255, 255, 255));
        BotonMinimizar1.setBorder(null);
        BotonMinimizar1.setText("—");
        BotonMinimizar1.setBorderPainted(false);
        BotonMinimizar1.setColorHover(new java.awt.Color(204, 204, 204));
        BotonMinimizar1.setColorText(new java.awt.Color(0, 0, 0));
        BotonMinimizar1.setFocusable(false);
        BotonMinimizar1.setFont(new java.awt.Font("Roboto Bold", 1, 24)); // NOI18N
        BotonMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMinimizar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonMinimizar1MouseEntered(evt);
            }
        });
        BotonMinimizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMinimizar1ActionPerformed(evt);
            }
        });
        panel1.add(BotonMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1780, 0, 60, 40));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 140));

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 1560, 780));

        fondo1.setBackground(new java.awt.Color(255, 255, 255));
        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 790));

        fondo2.setBackground(new java.awt.Color(255, 255, 255));
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 1560, 820));

        fondo3.setBackground(new java.awt.Color(255, 255, 255));
        fondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo.jpg"))); // NOI18N
        getContentPane().add(fondo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 1390, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void CampoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoApellidoActionPerformed

    private void CampoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCorreoActionPerformed

    private void CampoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefonoActionPerformed

    
    private void hombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hombreMouseClicked
        
    }//GEN-LAST:event_hombreMouseClicked

    private void mujerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mujerMouseClicked
       
    }//GEN-LAST:event_mujerMouseClicked

    private void otroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_otroMouseClicked
        
    }//GEN-LAST:event_otroMouseClicked

    
    private void ImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImagenMouseClicked

    }//GEN-LAST:event_ImagenMouseClicked

    private void BotonIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarMouseClicked

        iniciar();
    }//GEN-LAST:event_BotonIniciarMouseClicked

    private void logoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoMouseClicked
        int msj = JOptionPane.showConfirmDialog(null, "¿Estás seguro/a que desea salir?", "", JOptionPane.YES_NO_OPTION);

        if (msj==JOptionPane.YES_OPTION){

            nombre = null;
            contrasenia = null;
            Login ventana = new Login();
            ventana.setVisible(true);
            this.dispose();
        }          // TODO add your handling code here:
    }//GEN-LAST:event_logoMouseClicked

    private void BotonCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCerrarMouseClicked
        int msj = JOptionPane.showConfirmDialog(null, "¿Estás seguro/a que desea salir?", "", JOptionPane.YES_NO_OPTION);

        if (msj==JOptionPane.YES_OPTION){

            System.exit(0);

        }   ;
    }//GEN-LAST:event_BotonCerrarMouseClicked

    private void BotonMinimizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMinimizar1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_BotonMinimizar1MouseClicked

    private void BotonMinimizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMinimizar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMinimizar1MouseEntered

    private void BotonMinimizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMinimizar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMinimizar1ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          if (seleccionar.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
                
                archivo = seleccionar.getSelectedFile();
                ruta = seleccionar.getSelectedFile().getAbsolutePath();
                
                if (archivo.canRead()) {
                    
                    if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif"));
                    imagen=AbrirArchivo(archivo);
                    icon = new ImageIcon(imagen);
                    icono = new ImageIcon(icon.getImage().getScaledInstance(Imagen.getWidth(), Imagen.getHeight(), Image.SCALE_DEFAULT));
                    Imagen.setIcon(icono);

                    if (seleccionar.showDialog(null, "Guardar") == JFileChooser.APPROVE_OPTION) {
                        
                        archivo = seleccionar.getSelectedFile();
                        
                        if (archivo.getName().endsWith("jpg") || archivo.getName().endsWith("png") || archivo.getName().endsWith("gif")) {
                            
                            String respuesta = GuardarArchivo(archivo, imagen);
                            
                            if (respuesta != null) {
                                
                                JOptionPane.showMessageDialog(null, respuesta);
                                
                            } else {
                                
                                JOptionPane.showMessageDialog(null, "Archivo no Guardado");
                                
                            }
                            
                        }else {
                            
                            JOptionPane.showMessageDialog(null, "Archivo Guardado");
                            
                        }
                        
                    }
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Error! Archivo no compatible", "", JOptionPane.ERROR_MESSAGE);
                    
                }
                
            }        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        jLabel1.setEnabled(true);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setEnabled(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseExited

    private void CampoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoNombreKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombreKeyTyped

    private void CampoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoApellidoKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoApellidoKeyTyped

    private void CampoCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoCorreoKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoCorreoKeyTyped

    private void CampoContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoContraseniaKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoContraseniaKeyTyped

    private void CampoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoTelefonoKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoTelefonoKeyTyped

    private void CampoFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoFechaKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoFechaKeyTyped

    private void CampoPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CampoPaisKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_CampoPaisKeyTyped

    private void hombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hombreKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_hombreKeyTyped

    private void mujerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mujerKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_mujerKeyTyped

    private void otroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_otroKeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_otroKeyTyped

    private void jLabel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyTyped
        char cTeclaPresionada = evt.getKeyChar();

        if (cTeclaPresionada == java.awt.event.KeyEvent.VK_ENTER) {

            iniciar();

        }          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1KeyTyped

    public static SimpleDateFormat formato;
    
    public void iniciar(){
        
        if (CampoNombre.getText().length() == 0 || CampoApellido.getText().length() == 0 || CampoContrasenia.getText().length() == 0 || CampoCorreo.getText().length() == 0 || CampoTelefono.getText().length() == 0) {

            JOptionPane.showMessageDialog(null, "¡Debes rellenar los campos más importantes!", "", JOptionPane.WARNING_MESSAGE);

        } else if (CampoPais.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "¡Debes rellenar los campos más importantes!", "", JOptionPane.WARNING_MESSAGE);

        } else {

            fecha = CampoFecha.getDatoFecha().toString(); 

            try {

                if (fecha.equals("")) {

                } else if (hombre.isSelected() == true || mujer.isSelected() == true || otro.isSelected() == true) {

                    if (hombre.isSelected() == true) {

                        id_sexo = 1;
                        sexo = hombre.getText();

                    } else if (mujer.isSelected() == true) {

                        id_sexo = 2;
                        sexo = mujer.getText();

                    } else if (otro.isSelected() == true) {

                        id_sexo = 3;
                        sexo = otro.getText();

                    }

                    if (CampoCorreo.getText().contains("@") && CampoCorreo.getText().contains(".")) {

                        error1.setVisible(false);

                        if (CampoTelefono.getText().trim().matches("[0-9]+")) {

                            error3.setVisible(false);

                            if (CampoContrasenia.getText().length() >= 6) {

                                error2.setVisible(false);
                                
                                correo = CampoCorreo.getText().trim();
                                nombre = CampoNombre.getText().trim();
                                apellido = CampoApellido.getText().trim();
                                contrasenia = String.valueOf(CampoContrasenia.getPassword());
                                telefono = CampoTelefono.getText().trim();
                                pais = (String) CampoPais.getSelectedItem();
                                id_pais = (int) CampoPais.getSelectedIndex();
                                Condiciones ventana = new Condiciones();
                                ventana.setVisible(true);
                                this.dispose();

                            } else {

                                JOptionPane.showMessageDialog(null, "La contraseña debe tener un mínimo de 6 caracteres", "", JOptionPane.ERROR_MESSAGE);
                                error2.setVisible(true);

                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "Error! Teléfono inválido", "", JOptionPane.ERROR_MESSAGE);
                            error3.setVisible(true);
                        }

                    } else {

                        JOptionPane.showMessageDialog(null, "Error! Correo inválido", "", JOptionPane.ERROR_MESSAGE);
                        error1.setVisible(true);
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "¡Debes rellenar los campos más importantes", "", JOptionPane.WARNING_MESSAGE);
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(null, "¡Debes rellenar los campos más importantes! " + ex, "", JOptionPane.WARNING_MESSAGE);

            }
        }
        
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.RSButton BotonCerrar;
    private rojeru_san.RSButton BotonIniciar;
    private rojeru_san.RSButton BotonMinimizar1;
    private rojeru_san.RSMTextFull CampoApellido;
    private rojeru_san.RSMPassView CampoContrasenia;
    private rojeru_san.RSMTextFull CampoCorreo;
    private rojeru_san.componentes.RSDateChooser CampoFecha;
    private rojeru_san.RSMTextFull CampoNombre;
    private javax.swing.JComboBox CampoPais;
    private rojeru_san.RSMTextFull CampoTelefono;
    public static javax.swing.ButtonGroup GrupoSexo;
    public static javax.swing.JLabel Imagen;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel error3;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel fondo3;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JRadioButton otro;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}