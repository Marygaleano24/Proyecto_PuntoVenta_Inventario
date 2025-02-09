/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inicio_sesion;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import prg.Conexion;

/**
 *
 * @author User
 */
public class Login_sesion extends javax.swing.JFrame {

    Conexion conexion;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form Login_sesion
     */
    public Login_sesion() {
        conexion = Conexion.getInstanciaConexion();
        conexion.openConnection();
        initComponents();
        setTitle("Acceso al sistema");
        txt_usuario.requestFocus();
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        btn_salir = new javax.swing.JButton();
        btn_ingresar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        bt_usuario = new javax.swing.JButton();
        jcMousePanel2 = new jcMousePanel.jcMousePanel();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/users_theuser_6177.png"))); // NOI18N
        jLabel1.setText("Inicio de Sesión");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 230, 50);

        jLabel2.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 140, 80, 17);

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 70, 60, 17);

        txt_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_usuarioKeyReleased(evt);
            }
        });
        jPanel1.add(txt_usuario);
        txt_usuario.setBounds(40, 100, 200, 30);

        txt_password.setEnabled(false);
        txt_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_passwordKeyPressed(evt);
            }
        });
        jPanel1.add(txt_password);
        txt_password.setBounds(40, 160, 200, 30);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir);
        btn_salir.setBounds(150, 270, 120, 50);

        btn_ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/entrar.png"))); // NOI18N
        btn_ingresar.setText("INGRESAR AL SISTEMA");
        btn_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingresarActionPerformed(evt);
            }
        });
        btn_ingresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_ingresarKeyPressed(evt);
            }
        });
        jPanel1.add(btn_ingresar);
        btn_ingresar.setBounds(40, 214, 200, 41);

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar);
        btn_cancelar.setBounds(10, 270, 130, 50);

        bt_usuario.setText("CREAR USUARIO");
        bt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(bt_usuario);
        bt_usuario.setBounds(60, 340, 150, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(260, 0, 280, 420);

        jcMousePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6496-verde.jpg"))); // NOI18N
        jcMousePanel2.setVisibleLogo(false);
        jcMousePanel2.setLayout(null);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini_mburuu-whats (10).png"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);

        javax.swing.GroupLayout jcMousePanel1Layout = new javax.swing.GroupLayout(jcMousePanel1);
        jcMousePanel1.setLayout(jcMousePanel1Layout);
        jcMousePanel1Layout.setHorizontalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jcMousePanel1Layout.setVerticalGroup(
            jcMousePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jcMousePanel2.add(jcMousePanel1);
        jcMousePanel1.setBounds(30, 20, 200, 200);

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel4.setText("Cel: 0985 853 486");
        jcMousePanel2.add(jLabel4);
        jLabel4.setBounds(80, 250, 110, 15);

        jLabel5.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        jLabel5.setText("WhatsApp: 0982 410 510");
        jcMousePanel2.add(jLabel5);
        jLabel5.setBounds(60, 230, 140, 15);

        getContentPane().add(jcMousePanel2);
        jcMousePanel2.setBounds(0, 0, 260, 440);

        setBounds(0, 0, 555, 445);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.txt_usuario.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No puede estar vacio...Ingresa tu usuario");
                this.txt_usuario.requestFocus();
            } else {

                txt_password.setEnabled(true);
                txt_password.requestFocus();
            }
        }
    }//GEN-LAST:event_txt_usuarioKeyPressed

    private void txt_usuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarioKeyReleased
        txt_usuario.setText(txt_usuario.getText().trim());
    }//GEN-LAST:event_txt_usuarioKeyReleased

    private void txt_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passwordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (this.txt_password.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No puede estar vacio,Ingresa tu contraseña");
                this.txt_password.setText("");
                this.txt_password.requestFocus();
            } else {
                btn_ingresar.requestFocus();
                btn_ingresar.doClick();
            }
        }
        /*if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btn_ingresar.requestFocus();
        }*/

    }//GEN-LAST:event_txt_passwordKeyPressed

    private void btn_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingresarActionPerformed

        JOptionPane.showMessageDialog(null, "ACCEDIENDO AL SISTEMA",
                "ACCESO AL SISTEMA", JOptionPane.WARNING_MESSAGE);
        Conexion.getInstanciaConexion();
        try {
            st = Conexion.getInstanciaConexion().
                    obtenerRutaConeccion().
                    createStatement();
            rs = st.executeQuery("select * from"
                    + " usuarios "
                    + " where usuario ='" + txt_usuario.getText() + "'"
                    + " and contraseña =('" + new String(txt_password.getPassword()) + "')");
            if (rs.next()) {

                JOptionPane.showMessageDialog(null, "ACCEDIÓ DE MANERA EXITOSA AL SISTEMA!",
                        "BIENVENIDO/A", JOptionPane.WARNING_MESSAGE);
                Menu_Principal menu = new Menu_Principal();
              
                // Establecer el nombre de usuario en el menú principal
                menu.setNombreDeUsuario(txt_usuario.getText());

                // Mostrar el menú principal y cerrar el formulario de inicio de sesión
                menu.setVisible(true);
                dispose();
               
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorectas", "Error", JOptionPane.ERROR_MESSAGE);
                txt_usuario.setText("");
                txt_password.setText("");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_ingresarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        txt_password.setText("");
        txt_usuario.setText("");
        txt_password.setEnabled(false);
        txt_usuario.requestFocus();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_ingresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_ingresarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btn_ingresar.doClick();
        }
    }//GEN-LAST:event_btn_ingresarKeyPressed

    private void bt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_usuarioActionPerformed
        Usuarios otroFormulario7 = new Usuarios();
        otroFormulario7.setVisible(true);
    }//GEN-LAST:event_bt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_usuario;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ingresar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private jcMousePanel.jcMousePanel jcMousePanel2;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables

}
