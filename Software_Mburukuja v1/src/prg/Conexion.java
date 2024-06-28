package prg;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Conexion {

    private static Conexion instanciaConexion;

    Connection Conexion = null;
    public String bde = "bd_prueba";
    public String login = "postgres";
    public String password = "12345";//12345
    public final String CONTROLADOR_JDBC = "org.postgresql.Driver";
    public Statement statement;
    public ResultSet resultado;
    public Statement st;
    public ResultSet rt;

    public static Connection getConexion() {
        Connection cn = null;

        try {
            Class.forName("org.postgresql.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_prueba", "postgres", "12345");
            System.out.println("se hizo la conexion exitosa");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return cn;
    }

    public Conexion() {
        String URL_BASEDEDATOS = "jdbc:postgresql://localhost:5432/" + bde;

        try {
            Class.forName(CONTROLADOR_JDBC);
            Conexion = DriverManager.getConnection(URL_BASEDEDATOS, login, password);
            System.out.println("Conexion Exitosa");

        } catch (ClassNotFoundException e) {
            // Generico_Excepcion Errores = new Generico_Excepcion(e,"Error Durante Verificacion del Driver");
            System.out.println("Error Durante Verificacion del Driver");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            //JOptionPane.showMessageDialog(null, "Error Durante Verificacion del Driver", "AVISO", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
//            System.out.println(Arrays.toString(e.getStackTrace()));
            //Generico_Excepcion Errores = new Generico_Excepcion(e,"Error Durante la Conecion");
            JOptionPane.showMessageDialog(null, "Error Durante la Conexion", "AVISO", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static Conexion getInstanciaConexion() {
        if (instanciaConexion == null) {
            instanciaConexion = new Conexion();
        }
        return instanciaConexion;
    }

    public Connection obtenerRutaConeccion() {
        return Conexion;
    }

    public void deshabilitar_btn(JButton btnuevo, JButton btmodificar, JButton bteliminar, JButton btgrabar) {
        btnuevo.setEnabled(false);
        btmodificar.setEnabled(false);
        bteliminar.setEnabled(false);
        btgrabar.setEnabled(true);
    }

    public void habilitar_btn(JButton btnuevo, JButton btmodificar, JButton bteliminar, JButton btgrabar) {
        btnuevo.setEnabled(true);
        btmodificar.setEnabled(true);
        bteliminar.setEnabled(true);
        btgrabar.setEnabled(false);
    }

    public void deshabilitar_btn2(JButton btnuevo, JButton bteliminar, JButton btgrabar) {
        btnuevo.setEnabled(false);
        bteliminar.setEnabled(false);
        btgrabar.setEnabled(true);
    }

    public void deshabilitar_btn3(JButton btnuevo, JButton btgrabar) {
        btnuevo.setEnabled(false);
        btgrabar.setEnabled(true);
    }

    public void habilitar_btn2(JButton btnuevo, JButton bteliminar, JButton btgrabar) {
        btnuevo.setEnabled(true);
        bteliminar.setEnabled(true);
        btgrabar.setEnabled(false);
    }

    public void habilitar_btn3(JButton btnuevo, JButton bteliminar, JButton btgrabar) {
        btnuevo.setEnabled(true);
        btgrabar.setEnabled(false);
    }

    public void autonumerico(String condicion, String tabla, JTextField texto) {

        try {
            st = obtenerRutaConeccion().createStatement();

            rt = st.executeQuery("select coalesce( max(" + condicion + "),0) + 1 as cod\n"
                    + "from " + tabla + "");
            if (rt.next()) {
                texto.setText(rt.getString("cod"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en autonumerico " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void no_letras(KeyEvent evt) {

        char c = evt.getKeyChar();
        //false seria letras
        //verdadero seria numeros
        if (Character.isDigit(c) == false) {
            evt.consume();//borra el caracter
        }
    }

    public void no_numero(KeyEvent evt) {

        char c = evt.getKeyChar();
        //false seria letras
        //verdadero seria numeros
        if (Character.isDigit(c) == true) {
            evt.consume();//borra el caracter
        }
    }

    public void listar_datos(String sql) {
        try {
            st = obtenerRutaConeccion().createStatement();
            rt = st.executeQuery(sql);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar" + e);
        }
    }

    public void actualizar(String actualiza) throws SQLException {
        st.executeUpdate(actualiza);

    }

    public ResultSet consultar(String consulta) throws SQLException {
        return (st.executeQuery(consulta));
    }

    public void deshabilitar_btn(JButton bt_nuevo, JButton bt_apertura) {
        bt_nuevo.setEnabled(false);
        bt_apertura.setEnabled(true);
    }

    public void habilitar_btn(JButton bt_nuevo, JButton bt_apertura) {
        bt_nuevo.setEnabled(false);
        bt_apertura.setEnabled(true);
    }
// Método para desconectar la base de datos

    public void desconectar() {
        if (this.Conexion != null) {
            try {
                this.Conexion.close();
                System.out.println("Conexión cerrada exitosamente");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión", "AVISO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
  public void openConnection() {
        try {
            Class.forName(CONTROLADOR_JDBC);
            Conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + bde, login, password);
            System.out.println("Conexion Exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error Durante Verificacion del Driver");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    public void closeConnection() {
        try {
            if (Conexion != null && !Conexion.isClosed()) {
                Conexion.close();
                System.out.println("Conexion Cerrada");
            }
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion");
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }  
}
