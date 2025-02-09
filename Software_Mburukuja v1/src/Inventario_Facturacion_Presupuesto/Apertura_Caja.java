/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Inventario_Facturacion_Presupuesto;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import prg.Conexion;

public class Apertura_Caja extends javax.swing.JFrame {

    Conexion conexion;
    ResultSet rs;
    Statement st;
    int ban = 0;
    SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
    DecimalFormat separador = new DecimalFormat("#,##0");

    public Apertura_Caja() {
        initComponents();
        this.setLocationRelativeTo(null);
        conexion = Conexion.getInstanciaConexion();
        conexion.openConnection();
        setVisible(true);
        setTitle("APERTURA DE CAJA");
        Conexion conexion = new Conexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        btn_confirmar_cierre = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo_apertura_cierre = new javax.swing.JTextField();
        txt_monto_inicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_monto_cierre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_fecha_apertura = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_fecha_cierre = new javax.swing.JTextField();
        bt_nuevo = new javax.swing.JButton();
        bt_cancelar = new javax.swing.JButton();
        bt_cierre = new javax.swing.JButton();
        bt_grabar = new javax.swing.JButton();
        bt_volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6476-verde.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        btn_confirmar_cierre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        btn_confirmar_cierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btn_confirmar_cierre.setText("CONFIRMAR CIERRE");
        btn_confirmar_cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmar_cierreActionPerformed(evt);
            }
        });
        jcMousePanel1.add(btn_confirmar_cierre);
        btn_confirmar_cierre.setBounds(530, 380, 220, 50);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel2.setText("APERTURA Y CIERRE DE CAJA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 10, 210, 17);

        txt_codigo_apertura_cierre.setEnabled(false);
        jPanel1.add(txt_codigo_apertura_cierre);
        txt_codigo_apertura_cierre.setBounds(170, 50, 140, 40);

        txt_monto_inicial.setEnabled(false);
        txt_monto_inicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_monto_inicialKeyPressed(evt);
            }
        });
        jPanel1.add(txt_monto_inicial);
        txt_monto_inicial.setBounds(170, 100, 140, 40);

        jLabel3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel3.setText("MONTO INICIAL:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 110, 110, 17);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel4.setText("CODIGO:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(90, 60, 60, 17);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel6.setText("MONTO CIERRE:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(400, 70, 110, 20);

        txt_monto_cierre.setEnabled(false);
        jPanel1.add(txt_monto_cierre);
        txt_monto_cierre.setBounds(510, 60, 140, 40);

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel5.setText("FECHA APERTURA:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 170, 130, 17);

        txt_fecha_apertura.setEnabled(false);
        jPanel1.add(txt_fecha_apertura);
        txt_fecha_apertura.setBounds(170, 160, 140, 40);

        jLabel8.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jLabel8.setText("FECHA CIERRE:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(400, 120, 100, 20);

        txt_fecha_cierre.setEnabled(false);
        txt_fecha_cierre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_fecha_cierreKeyPressed(evt);
            }
        });
        jPanel1.add(txt_fecha_cierre);
        txt_fecha_cierre.setBounds(510, 110, 140, 40);

        jcMousePanel1.add(jPanel1);
        jPanel1.setBounds(20, 10, 730, 300);

        bt_nuevo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo.png"))); // NOI18N
        bt_nuevo.setText("NUEVA APERTURA");
        bt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoActionPerformed(evt);
            }
        });
        jcMousePanel1.add(bt_nuevo);
        bt_nuevo.setBounds(120, 320, 190, 50);

        bt_cancelar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        bt_cancelar.setText("CANCELAR");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });
        jcMousePanel1.add(bt_cancelar);
        bt_cancelar.setBounds(320, 320, 170, 50);

        bt_cierre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_cierre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajaregistradora.png"))); // NOI18N
        bt_cierre.setText("REALIZAR CIERRE");
        bt_cierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cierreActionPerformed(evt);
            }
        });
        jcMousePanel1.add(bt_cierre);
        bt_cierre.setBounds(280, 380, 230, 50);

        bt_grabar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajaregistradora.png"))); // NOI18N
        bt_grabar.setText("REALIZAR APERTURA");
        bt_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_grabarActionPerformed(evt);
            }
        });
        jcMousePanel1.add(bt_grabar);
        bt_grabar.setBounds(30, 380, 240, 50);

        bt_volver.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bt_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasss.png"))); // NOI18N
        bt_volver.setText("VOLVER");
        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });
        jcMousePanel1.add(bt_volver);
        bt_volver.setBounds(500, 320, 150, 50);

        getContentPane().add(jcMousePanel1);
        jcMousePanel1.setBounds(-10, 0, 1050, 580);

        setBounds(0, 0, 773, 496);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoActionPerformed

        Conexion conexion = new Conexion();
        Conexion.getInstanciaConexion().autonumerico("idapertura", "apertura_cierre_caja", txt_codigo_apertura_cierre);
        txt_fecha_apertura.setText(fecha.format(new java.util.Date()));
        bt_cancelar.setEnabled(true);
        txt_monto_inicial.setEnabled(true);
        txt_monto_inicial.requestFocus();
        ban = 1;
    }//GEN-LAST:event_bt_nuevoActionPerformed

    private void txt_monto_inicialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monto_inicialKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_monto_inicial.setEnabled(false);
            bt_grabar.setEnabled(true);
            bt_grabar.doClick();
        }
    }//GEN-LAST:event_txt_monto_inicialKeyPressed

    private void bt_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_grabarActionPerformed
        if (txt_monto_inicial.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un monto inicial",
                    "Atencion!!",
                    JOptionPane.WARNING_MESSAGE);
            txt_monto_inicial.requestFocus();
            return;
        }
        int sms = JOptionPane.showConfirmDialog(null, "¿Desea grabar?", "Atencion!!",
                JOptionPane.YES_NO_OPTION);
        if (sms == 0) {
            Conexion conexion = Conexion.getInstanciaConexion();
            if (ban == 1) {
                try {
                    if (Conexion.
                            getInstanciaConexion().
                            obtenerRutaConeccion().
                            getAutoCommit()) {

                        Conexion.getInstanciaConexion().
                                obtenerRutaConeccion().
                                setAutoCommit(false);
                    }
                    PreparedStatement p = Conexion.getInstanciaConexion().
                            obtenerRutaConeccion().
                            prepareStatement("INSERT INTO apertura_cierre_caja(\n"
                                    + "	idapertura, monto_inicial, fecha_apertura, \n"
                                    + " estado)\n"
                                    + "	VALUES (?, ?, ?, ?);");
                    p.setInt(1, Integer.parseInt(txt_codigo_apertura_cierre.getText()));
                    p.setInt(2, Integer.parseInt(txt_monto_inicial.getText()));
                    p.setDate(3, java.sql.Date.valueOf(convertit_fecha(txt_fecha_apertura.getText())));
                    p.setString(4, "Activo");
                    p.execute();
                    Conexion.getInstanciaConexion().obtenerRutaConeccion().commit();
                    JOptionPane.showMessageDialog(null, "APERTURA DE CAJA REALIZADO CON EXITO!",
                            "USUARIO", JOptionPane.WARNING_MESSAGE);
                    bt_cancelar.doClick();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al realizar la apertura. Intente de nuevo" + e);
                    deshacertransaccion();
                }
            }
        }
    }//GEN-LAST:event_bt_grabarActionPerformed

    private void btn_confirmar_cierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmar_cierreActionPerformed
        try {
            int montoCierre = Integer.parseInt(txt_monto_cierre.getText());
            int idApertura = Integer.parseInt(txt_codigo_apertura_cierre.getText());

            int sms = JOptionPane.showConfirmDialog(null, "¿Desea realizar el cierre?", "Confirmación",
                    JOptionPane.YES_NO_OPTION);
            if (sms == 0) {

                try {
                    if (Conexion.getInstanciaConexion()
                            .obtenerRutaConeccion().getAutoCommit()) {
                        // deshabilitar e; conmint automatico
                        Conexion.getInstanciaConexion().obtenerRutaConeccion().setAutoCommit(false);
                    }
                    PreparedStatement p = Conexion.
                            getInstanciaConexion().
                            obtenerRutaConeccion().
                            prepareStatement(
                                    "UPDATE apertura_cierre_caja\n"
                                    + "   SET  fecha_cierre='" + txt_fecha_cierre.getText() + "', \n"
                                    + "       monto_cierre=" + txt_monto_cierre.getText().replace(".", "")
                                    + ", estado='Inactivo'"
                                    + "where idapertura=" + txt_codigo_apertura_cierre.getText() + "");
                    System.out.println(p);
                    p.execute();
                    Conexion.getInstanciaConexion().obtenerRutaConeccion().commit();
                    JOptionPane.showMessageDialog(null, "CIERRE DE CAJA REALIZADO CON EXITO!",
                            "USUARIO", JOptionPane.WARNING_MESSAGE);
                    bt_cancelar.doClick();
                    bt_cierre.setEnabled(true);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al Insertar" + e);
                    deshacertransaccion();
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_confirmar_cierreActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void bt_cierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cierreActionPerformed
        try {
            String consulta = "SELECT idapertura, monto_inicial, fecha_apertura FROM apertura_cierre_caja "
                    + "WHERE estado = 'Activo'";

            PreparedStatement p = Conexion.getInstanciaConexion()
                    .obtenerRutaConeccion().prepareStatement(consulta);

            ResultSet resultado = p.executeQuery();

            if (resultado.next()) {
                int idApertura = resultado.getInt("idapertura");
                int montoInicial = resultado.getInt("monto_inicial");
                Date fechaApertura = resultado.getDate("fecha_apertura");
                txt_monto_cierre.setEnabled(true);
                txt_monto_cierre.requestFocus();
                btn_confirmar_cierre.setEnabled(true);
                txt_codigo_apertura_cierre.setText(String.valueOf(idApertura));
                txt_monto_inicial.setText(String.valueOf(montoInicial));
                txt_fecha_apertura.setText(fechaApertura.toString());

                LocalDate fechaCierre = LocalDate.now();
                txt_fecha_cierre.setText(fechaCierre.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una apertura activa.",
                        "Atencion!!", JOptionPane.WARNING_MESSAGE);
            }

            resultado.close();
            p.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar la apertura. Intente de nuevo" + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_cierreActionPerformed

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        conexion.closeConnection();
        dispose();
    }//GEN-LAST:event_bt_volverActionPerformed

    private void txt_fecha_cierreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fecha_cierreKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_monto_cierre.setEnabled(false);
            btn_confirmar_cierre.setEnabled(true);
            btn_confirmar_cierre.doClick();
        }
    }//GEN-LAST:event_txt_fecha_cierreKeyPressed

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
            java.util.logging.Logger.getLogger(Apertura_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Apertura_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Apertura_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Apertura_Caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apertura_Caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_cierre;
    private javax.swing.JButton bt_grabar;
    private javax.swing.JButton bt_nuevo;
    private javax.swing.JButton bt_volver;
    private javax.swing.JButton btn_confirmar_cierre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JTextField txt_codigo_apertura_cierre;
    private javax.swing.JTextField txt_fecha_apertura;
    private javax.swing.JTextField txt_fecha_cierre;
    private javax.swing.JTextField txt_monto_cierre;
    private javax.swing.JTextField txt_monto_inicial;
    // End of variables declaration//GEN-END:variables

    private void deshacertransaccion() {
        try {
            Conexion.getInstanciaConexion().obtenerRutaConeccion().rollback();

        } catch (Exception e) {

        }
    }

    private String convertit_fecha(String text) {
        String dia = "", mes = "", anho = "";
        dia = text.substring(0, 2);
        mes = text.substring(3, 5);
        anho = text.substring(6, 10);
        text = anho + "-" + mes + "-" + dia;
        return text;
    }

    private void limpiarCampos() {
        txt_codigo_apertura_cierre.setText("");
        txt_monto_inicial.setText("");
        txt_fecha_apertura.setText("");
        txt_monto_cierre.setText("");
        txt_fecha_cierre.setText("");
        txt_monto_inicial.setEnabled(false);
        txt_monto_cierre.setEnabled(false);
        txt_codigo_apertura_cierre.setEnabled(false);
        bt_nuevo.requestFocus();
        //bt_cierre.setEnabled(false);
    }

    private void confirmarCierre(int idApertura, int montoCierre) {
        try {
            String updateQuery = "UPDATE apertura_cierre_caja SET estado = 'Inactivo', "
                    + "fecha_cierre = ?, monto_cierre = ? WHERE idapertura = ?";

            PreparedStatement updateStatement = Conexion.getInstanciaConexion()
                    .obtenerRutaConeccion().prepareStatement(updateQuery);

            Date fechaCierre = new Date(); // Genera la fecha actual
            updateStatement.setDate(1, new java.sql.Date(fechaCierre.getTime())); // Convierte la fecha de Java a SQL
            updateStatement.setInt(2, montoCierre);
            updateStatement.setInt(3, idApertura);

            updateStatement.executeUpdate();

            Conexion.getInstanciaConexion().obtenerRutaConeccion().commit();

            JOptionPane.showMessageDialog(null, "Cierre realizado con éxito.",
                    "Éxito", JOptionPane.INFORMATION_MESSAGE);

            limpiarCampos();

            updateStatement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al realizar el cierre. Intente de nuevo" + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
            deshacertransaccion();
        }
    }

}
