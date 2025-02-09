/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package inicio_sesion;

import Inventario_Facturacion_Presupuesto.Apertura_Caja;
import Inventario_Facturacion_Presupuesto.Facturacion;
import static Inventario_Facturacion_Presupuesto.Facturacion.txt_usuario_venta;
import Inventario_Facturacion_Presupuesto.Inventario_Productos;
import Inventario_Facturacion_Presupuesto.busca_productos;
import Inventario_Facturacion_Presupuesto.reporte_balance_caja;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import prg.Conexion;

/**
 *
 * @author User
 */
public class Menu_Principal extends javax.swing.JFrame {

    Conexion conexion;
    ResultSet rs;
    Statement st;

    /**
     * Creates new form Menu_Principal
     */
    public Menu_Principal() {

        initComponents();
        conexion = Conexion.getInstanciaConexion();
        conexion.openConnection();
        setTitle("MENU PRINCIPAL DEL SISTEMA");
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        Conexion conexion = new Conexion();
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        txt_menu_usuario.setText(nombreDeUsuario);
    }
    //Por favor, realiza esta corrección en tu código y prueba nuevamente. Debería funcionar sin problemas. Si sigues teniendo problemas o necesitas más ayuda, no dudes en preguntar.

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jcMousePanel1 = new jcMousePanel.jcMousePanel();
        jLabel1 = new javax.swing.JLabel();
        txt_menu_usuario = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmenu = new javax.swing.JMenu();
        menu_inventario = new javax.swing.JMenuItem();
        menu_apertura_caja = new javax.swing.JMenuItem();
        menu_realizar_venta = new javax.swing.JMenuItem();
        menu_balance_caja = new javax.swing.JMenuItem();
        menu_busc_producto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menu_cerrar_sesion = new javax.swing.JMenuItem();
        menu_usuarios = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jcMousePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo-pantalla-mburukuja.jpg"))); // NOI18N
        jcMousePanel1.setVisibleLogo(false);
        jcMousePanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empleados.png"))); // NOI18N
        jLabel1.setText("USUARIO:");
        jcMousePanel1.add(jLabel1);
        jLabel1.setBounds(20, 60, 100, 40);

        txt_menu_usuario.setEnabled(false);
        txt_menu_usuario.setFocusable(false);
        jcMousePanel1.add(txt_menu_usuario);
        txt_menu_usuario.setBounds(120, 60, 160, 40);

        getContentPane().add(jcMousePanel1);
        jcMousePanel1.setBounds(0, -40, 1470, 740);

        jmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/paquete.png"))); // NOI18N
        jmenu.setText("INVENTARIO-PRODUCTOS-VENTAS");
        jmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuActionPerformed(evt);
            }
        });

        menu_inventario.setText("Inventario/Productos");
        menu_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_inventarioActionPerformed(evt);
            }
        });
        jmenu.add(menu_inventario);

        menu_apertura_caja.setText("Apertura y Cierre de Caja");
        menu_apertura_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_apertura_cajaActionPerformed(evt);
            }
        });
        jmenu.add(menu_apertura_caja);

        menu_realizar_venta.setText("Realizar Venta");
        menu_realizar_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_realizar_ventaActionPerformed(evt);
            }
        });
        jmenu.add(menu_realizar_venta);

        menu_balance_caja.setText("Balance de Caja");
        menu_balance_caja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_balance_cajaActionPerformed(evt);
            }
        });
        jmenu.add(menu_balance_caja);

        menu_busc_producto.setText("Busqueda de productos");
        menu_busc_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_busc_productoActionPerformed(evt);
            }
        });
        jmenu.add(menu_busc_producto);

        jMenuBar1.add(jmenu);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/opciones.png"))); // NOI18N
        jMenu1.setText("OTROS");

        menu_cerrar_sesion.setText("Cerrar Sesión");
        menu_cerrar_sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cerrar_sesionActionPerformed(evt);
            }
        });
        jMenu1.add(menu_cerrar_sesion);

        menu_usuarios.setText("Usuarios");
        menu_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_usuariosActionPerformed(evt);
            }
        });
        jMenu1.add(menu_usuarios);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 1430, 779);
    }// </editor-fold>//GEN-END:initComponents

    private void jmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuActionPerformed

    }//GEN-LAST:event_jmenuActionPerformed

    private void menu_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_inventarioActionPerformed
        String nombreDeUsuario = txt_menu_usuario.getText();
        Inventario_Productos otroFormulario = new Inventario_Productos();
        otroFormulario.txt_usuario_nombre.setText(nombreDeUsuario);
        otroFormulario.setVisible(true);
    }//GEN-LAST:event_menu_inventarioActionPerformed

    private void menu_cerrar_sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cerrar_sesionActionPerformed
        conexion.openConnection();

        if (!cajaEstaCerrada()) {
            JOptionPane.showMessageDialog(this, "Debe cerrar la caja antes de salir del sistema", "Advertencia", JOptionPane.WARNING_MESSAGE);
            Apertura_Caja fac = new Apertura_Caja();
            
        } else {
            dispose();
            Login_sesion ls = new Login_sesion();
            ls.setVisible(true);
        }


    }//GEN-LAST:event_menu_cerrar_sesionActionPerformed

    private void menu_apertura_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_apertura_cajaActionPerformed

        Apertura_Caja otroFormulario5 = new Apertura_Caja();
        otroFormulario5.setVisible(true);
    }//GEN-LAST:event_menu_apertura_cajaActionPerformed

    private void menu_realizar_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_realizar_ventaActionPerformed

        String nombreDeUsuario = txt_menu_usuario.getText();
        Facturacion otroFormulario2 = new Facturacion();
        otroFormulario2.txt_usuario_venta.setText(nombreDeUsuario);
        otroFormulario2.setVisible(true);
    }//GEN-LAST:event_menu_realizar_ventaActionPerformed

    private void menu_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_usuariosActionPerformed
        Usuarios otroFormulario3 = new Usuarios();
        otroFormulario3.setVisible(true);
    }//GEN-LAST:event_menu_usuariosActionPerformed

    private void menu_balance_cajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_balance_cajaActionPerformed
        reporte_balance_caja otroFormulario10 = new reporte_balance_caja();
        otroFormulario10.setVisible(true);
    }//GEN-LAST:event_menu_balance_cajaActionPerformed

    private void menu_busc_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_busc_productoActionPerformed
        busca_productos dialog = new busca_productos(this, rootPaneCheckingEnabled);
        dialog.setVisible(true);
    }//GEN-LAST:event_menu_busc_productoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private jcMousePanel.jcMousePanel jcMousePanel1;
    private javax.swing.JMenu jmenu;
    private javax.swing.JMenuItem menu_apertura_caja;
    private javax.swing.JMenuItem menu_balance_caja;
    private javax.swing.JMenuItem menu_busc_producto;
    private javax.swing.JMenuItem menu_cerrar_sesion;
    private javax.swing.JMenuItem menu_inventario;
    private javax.swing.JMenuItem menu_realizar_venta;
    private javax.swing.JMenuItem menu_usuarios;
    public static javax.swing.JTextField txt_menu_usuario;
    // End of variables declaration//GEN-END:variables

    private boolean cajaEstaCerrada() {
        boolean resultado = false;
        try {
            st = Conexion.getInstanciaConexion().obtenerRutaConeccion().createStatement();
            rs = st.executeQuery("select estado FROM apertura_cierre_caja ORDER BY idapertura DESC LIMIT 1");
            if (rs.next()) {
                String estado = rs.getString("estado");
                if (estado.equals("Inactivo")) {
                    resultado = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al recuperar cierre" + e);
            e.printStackTrace();
        }
        return resultado;
    }

}
