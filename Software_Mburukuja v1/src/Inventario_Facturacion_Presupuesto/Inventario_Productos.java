package Inventario_Facturacion_Presupuesto;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import prg.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Inventario_Productos extends javax.swing.JFrame {

    Conexion conexion;
    int ban = 0;
    ResultSet rs;
    Statement st;

    public Inventario_Productos() {
        initComponents();
        conexion = Conexion.getInstanciaConexion();
        conexion.openConnection();
        cargar_tabla();
        setTitle("Gestionar Productos - Software Mburukuja v1");
        this.setLocationRelativeTo(null);
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

        jButton1 = new javax.swing.JButton();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_codigo_producto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_stock = new javax.swing.JTextField();
        txt_codigo_barras = new javax.swing.JTextField();
        txt_descri_producto = new javax.swing.JTextField();
        txt_ultimo_reporte = new javax.swing.JTextField();
        txt_precio_venta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_usuario_nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt_cancelar = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_volver = new javax.swing.JButton();
        bt_nuevo = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_grabar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_productos = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(null);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6476-verde.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(60, 63, 65)), "REGISTRAR PRODUCTO/INVENTARIO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 12))); // NOI18N
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel4.setText("Cod. de Barras:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 90, 90, 15);

        jLabel6.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel6.setText("Cod. Producto:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 40, 90, 15);

        txt_codigo_producto.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_codigo_producto.setForeground(new java.awt.Color(255, 255, 255));
        txt_codigo_producto.setEnabled(false);
        jPanel1.add(txt_codigo_producto);
        txt_codigo_producto.setBounds(110, 30, 150, 30);

        jLabel9.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel9.setText("Descripción:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 140, 70, 15);

        jLabel10.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel10.setText("Precio Venta:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 40, 80, 15);

        jLabel11.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel11.setText("Stock:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(320, 90, 40, 15);

        jLabel12.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel12.setText("Ultimo Reporte:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 140, 90, 15);

        txt_stock.setEnabled(false);
        txt_stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_stockKeyPressed(evt);
            }
        });
        jPanel1.add(txt_stock);
        txt_stock.setBounds(360, 80, 140, 30);

        txt_codigo_barras.setEnabled(false);
        txt_codigo_barras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_codigo_barrasKeyPressed(evt);
            }
        });
        jPanel1.add(txt_codigo_barras);
        txt_codigo_barras.setBounds(110, 80, 150, 30);

        txt_descri_producto.setEnabled(false);
        txt_descri_producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_descri_productoKeyPressed(evt);
            }
        });
        jPanel1.add(txt_descri_producto);
        txt_descri_producto.setBounds(110, 130, 150, 30);

        txt_ultimo_reporte.setEnabled(false);
        txt_ultimo_reporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_ultimo_reporteKeyPressed(evt);
            }
        });
        jPanel1.add(txt_ultimo_reporte);
        txt_ultimo_reporte.setBounds(360, 130, 140, 30);

        txt_precio_venta.setEnabled(false);
        txt_precio_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_precio_ventaKeyPressed(evt);
            }
        });
        jPanel1.add(txt_precio_venta);
        txt_precio_venta.setBounds(360, 30, 140, 30);

        jcMousePanel1.add(jPanel1);
        jPanel1.setBounds(10, 70, 530, 190);

        jLabel7.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario:");
        jcMousePanel1.add(jLabel7);
        jLabel7.setBounds(20, 30, 50, 15);

        txt_usuario_nombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txt_usuario_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_usuario_nombre.setEnabled(false);
        jcMousePanel1.add(txt_usuario_nombre);
        txt_usuario_nombre.setBounds(80, 20, 150, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Black", 0, 12))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        bt_cancelar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        bt_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        bt_cancelar.setText("CANCELAR");
        bt_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_cancelar);
        bt_cancelar.setBounds(140, 70, 140, 50);

        bt_modificar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        bt_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar.png"))); // NOI18N
        bt_modificar.setText("MODIFICAR");
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_modificar);
        bt_modificar.setBounds(130, 20, 130, 40);

        bt_volver.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        bt_volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atrasss.png"))); // NOI18N
        bt_volver.setText("VOLVER");
        bt_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_volverActionPerformed(evt);
            }
        });
        jPanel2.add(bt_volver);
        bt_volver.setBounds(140, 130, 120, 50);

        bt_nuevo.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        bt_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nuevo.png"))); // NOI18N
        bt_nuevo.setText("NUEVO");
        bt_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nuevoActionPerformed(evt);
            }
        });
        jPanel2.add(bt_nuevo);
        bt_nuevo.setBounds(10, 20, 110, 40);

        bt_eliminar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        bt_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        bt_eliminar.setText("ELIMINAR");
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_eliminar);
        bt_eliminar.setBounds(10, 130, 120, 50);

        bt_grabar.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        bt_grabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        bt_grabar.setText("GUARDAR");
        bt_grabar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        bt_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_grabarActionPerformed(evt);
            }
        });
        jPanel2.add(bt_grabar);
        bt_grabar.setBounds(10, 70, 120, 50);

        jcMousePanel1.add(jPanel2);
        jPanel2.setBounds(550, 70, 300, 190);

        tbl_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Codigo Barras", "Descripcion", "Precio Venta", "Stock", "Estado", "Ultimo reporte"
            }
        ));
        tbl_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_productos);

        jcMousePanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 270, 840, 270);

        getContentPane().add(jcMousePanel1);
        jcMousePanel1.setBounds(0, 0, 870, 620);

        setBounds(0, 0, 879, 612);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_codigo_barrasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_barrasKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_codigo_barras.setEnabled(false);
            txt_descri_producto.setEnabled(true);
            txt_descri_producto.requestFocus();
        }
    }//GEN-LAST:event_txt_codigo_barrasKeyPressed

    private void txt_descri_productoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_descri_productoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_descri_producto.setEnabled(false);
            txt_precio_venta.setEnabled(true);
            txt_precio_venta.requestFocus();
        }
    }//GEN-LAST:event_txt_descri_productoKeyPressed

    private void txt_precio_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_precio_ventaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_precio_venta.setEnabled(false);
            txt_stock.setEnabled(true);
            txt_stock.requestFocus();
        }
    }//GEN-LAST:event_txt_precio_ventaKeyPressed

    private void txt_stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_stockKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_stock.setEnabled(false);
            txt_ultimo_reporte.setEnabled(true);
            txt_ultimo_reporte.requestFocus();
        }
    }//GEN-LAST:event_txt_stockKeyPressed

    private void txt_ultimo_reporteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ultimo_reporteKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txt_ultimo_reporte.setEnabled(false);
            bt_grabar.requestFocus();
            bt_grabar.setEnabled(true);
            bt_grabar.doClick();
        }
    }//GEN-LAST:event_txt_ultimo_reporteKeyPressed

    private void bt_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nuevoActionPerformed
        Conexion conexion = new Conexion();

        bt_cancelar.doClick();
        Conexion.getInstanciaConexion().deshabilitar_btn(bt_nuevo, bt_modificar, bt_eliminar, bt_grabar);
        Conexion.getInstanciaConexion().autonumerico("idproducto", "productos", txt_codigo_producto);
        if (txt_codigo_producto.getText().equals("")) {
            txt_codigo_producto.setText("1");
        }
        txt_codigo_barras.setEnabled(true);
        txt_codigo_barras.requestFocus();
        ban = 1;
    }//GEN-LAST:event_bt_nuevoActionPerformed

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
        if (txt_codigo_producto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro", "Atencion", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Conexion.getInstanciaConexion().deshabilitar_btn(bt_nuevo, bt_modificar, bt_eliminar, bt_grabar);
        txt_codigo_barras.setEnabled(true);
        txt_codigo_barras.requestFocus();
        ban = 2;
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        if (txt_codigo_producto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un registro", "Atencion", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int sms = JOptionPane.showConfirmDialog(null, "¿Desea eliminar", "Eliminar", JOptionPane.YES_NO_OPTION);
        if (sms == 0) {
            try {
                if (Conexion.getInstanciaConexion().obtenerRutaConeccion().getAutoCommit()) {
                    Conexion.getInstanciaConexion().obtenerRutaConeccion().setAutoCommit(false);
                }
                PreparedStatement p = Conexion.getInstanciaConexion().
                        obtenerRutaConeccion().
                        prepareStatement("update productos"
                                + " set estado='Inactivo'"
                                + " where idproducto=" + txt_codigo_producto.getText());
                p.executeUpdate();
                Conexion.getInstanciaConexion().obtenerRutaConeccion().commit();
                bt_cancelar.doClick();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al anular registro" + e);

            }

        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void bt_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_grabarActionPerformed
        if (txt_codigo_barras.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el codigo de barra", "Atencion!!", JOptionPane.WARNING_MESSAGE);
            txt_codigo_barras.requestFocus();
            return;
        }
        if (txt_descri_producto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar la descripcion del producto", "Atencion!!", JOptionPane.WARNING_MESSAGE);
            txt_descri_producto.requestFocus();
            return;
        }
        if (txt_precio_venta.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar el precio de venta del producto", "Atencion!!", JOptionPane.WARNING_MESSAGE);
            txt_precio_venta.requestFocus();
            return;
        }

        int sms = JOptionPane.showConfirmDialog(null, "¿Desea grabar", "Grabar", JOptionPane.YES_NO_OPTION);
        if (sms == 0) {
            Conexion conexion = null;
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
                            prepareStatement("INSERT INTO productos(\n"
                                    + "	idproducto, cod_barras, usuario, descripcion, \n"
                                    + "	precio_venta, estado, stock_disponible, ultimo_reporte)\n"
                                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);");
                    p.setInt(1, Integer.parseInt(txt_codigo_producto.getText()));
                    p.setString(2, (txt_codigo_barras.getText()));
                    p.setString(3, (txt_usuario_nombre.getText()));
                    p.setString(4, (txt_descri_producto.getText()));
                    p.setInt(5, Integer.parseInt(txt_precio_venta.getText()));
                    p.setString(6, "Activo");
                    p.setInt(7, Integer.parseInt(txt_stock.getText()));
                    p.setString(8, (txt_ultimo_reporte.getText()));
                    p.executeUpdate();
                    Conexion.getInstanciaConexion().obtenerRutaConeccion().commit();

                    cargar_tabla();
                    
                    bt_cancelar.doClick();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al grabar nuevo registro" + e);
                    deshacertransaccion();
                }
            } else {

                try {
                    if (Conexion.
                            getInstanciaConexion().
                            obtenerRutaConeccion().
                            getAutoCommit()) {

                        Conexion.getInstanciaConexion().
                                obtenerRutaConeccion().
                                setAutoCommit(false);
                    }
                    double cantidad = Double.parseDouble(txt_stock.getText());

                    PreparedStatement pm = Conexion.getInstanciaConexion().
                            obtenerRutaConeccion().
                            prepareStatement("UPDATE productos\n"
                                    + "	SET cod_barras=?,descripcion=?,\n"
                                    + "	precio_venta=?,"
                                    + " stock_disponible=?, ultimo_reporte=?\n"
                                    + "	WHERE idproducto=?;");
                    pm.setString(1, txt_codigo_barras.getText().trim());
                    pm.setString(2, txt_descri_producto.getText().trim());
                    pm.setInt(3, Integer.parseInt(txt_precio_venta.getText()));
                    pm.setInt(4, Integer.parseInt(txt_stock.getText()));
                    pm.setString(5, txt_descri_producto.getText().trim());
                    pm.setInt(6, Integer.parseInt(txt_codigo_producto.getText()));
                    pm.executeUpdate();
                    Conexion.getInstanciaConexion().obtenerRutaConeccion().commit();

                    bt_cancelar.doClick();
                    cargar_tabla();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al guardar la modificación" + e);
                    deshacertransaccion();
                }

            }

        }


    }//GEN-LAST:event_bt_grabarActionPerformed

    private void bt_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_volverActionPerformed
        conexion.closeConnection();
        dispose();

    }//GEN-LAST:event_bt_volverActionPerformed

    private void bt_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelarActionPerformed
        ban = 0;
        Conexion.getInstanciaConexion().habilitar_btn(bt_nuevo, bt_modificar, bt_eliminar, bt_grabar);
        txt_codigo_producto.setText("");
        txt_codigo_barras.setText("");
        txt_descri_producto.setText("");
        txt_precio_venta.setText("");
        txt_stock.setText("");
        txt_ultimo_reporte.setText("");
        txt_ultimo_reporte.setEnabled(false);
        txt_codigo_barras.setEnabled(false);
        txt_descri_producto.setEnabled(false);
        txt_precio_venta.setEnabled(false);
        txt_stock.setEnabled(false);
        cargar_tabla();
    }//GEN-LAST:event_bt_cancelarActionPerformed

    private void tbl_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_productosMouseClicked
        if (ban == 0) {
            String vcod = tbl_productos.getValueAt(tbl_productos.getSelectedRow(), 0).toString();
            recuperar_producto(vcod);
        }
    }//GEN-LAST:event_tbl_productosMouseClicked

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
            java.util.logging.Logger.getLogger(Inventario_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventario_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventario_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventario_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventario_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancelar;
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_grabar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_nuevo;
    private javax.swing.JButton bt_volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JTable tbl_productos;
    public static javax.swing.JTextField txt_codigo_barras;
    public static javax.swing.JTextField txt_codigo_producto;
    public static javax.swing.JTextField txt_descri_producto;
    public static javax.swing.JTextField txt_precio_venta;
    public static javax.swing.JTextField txt_stock;
    public static javax.swing.JTextField txt_ultimo_reporte;
    public static javax.swing.JTextField txt_usuario_nombre;
    // End of variables declaration//GEN-END:variables

    private void cargar_tabla() {
        Conexion.getInstanciaConexion().openConnection();
        DefaultTableModel tab = (DefaultTableModel) tbl_productos.getModel();
        tab.setRowCount(0);
        try {
            st = Conexion.getInstanciaConexion().
                    obtenerRutaConeccion().
                    createStatement();
            rs = st.executeQuery("select * from productos " + " order by descripcion asc");
            while (rs.next()) {
                tab.addRow(new Object[]{rs.getInt("idproducto"),
                    rs.getString("cod_barras"),
                    rs.getString("descripcion"),
                    rs.getString("precio_venta"),
                    rs.getString("stock_disponible"),
                    rs.getString("estado"),
                    rs.getString("ultimo_reporte")
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla" + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    private void deshacertransaccion() {
        try {
            Conexion.getInstanciaConexion().obtenerRutaConeccion().rollback();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar tabla" + e);
        }
    }

    private void recuperar_producto(String vcod) {
        try {
            st = Conexion.getInstanciaConexion().obtenerRutaConeccion().createStatement();
            rs = st.executeQuery("SELECT idproducto, cod_barras,  \n"
                    + " descripcion, \n"
                    + " precio_venta, stock_disponible, \n"
                    + " ultimo_reporte, usuario\n"
                    + "	FROM productos where idproducto=" + vcod);
            if (rs.next()) {
                txt_codigo_producto.setText(rs.getString("idproducto"));
                txt_codigo_barras.setText(rs.getString("cod_barras"));
                txt_descri_producto.setText(rs.getString("descripcion"));
                txt_precio_venta.setText(rs.getString("precio_venta"));
                txt_stock.setText(rs.getString("stock_disponible"));
                txt_ultimo_reporte.setText(rs.getString("ultimo_reporte"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar productos" + e);
            e.printStackTrace();
        }
    }

}
