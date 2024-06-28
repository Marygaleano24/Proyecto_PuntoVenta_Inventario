/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prg;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class informe_todos {

    prg.Conexion bd;

    public void imprimir(String consulta, String nombrerporte) {
        bd = prg.Conexion.getInstanciaConexion();
        bd.listar_datos(consulta);
        try {
            JRResultSetDataSource si = new JRResultSetDataSource(bd.rt);

            Map parameters = new HashMap();

            parameters.put("REPORT_CONNECTION", prg.Conexion.getInstanciaConexion().obtenerRutaConeccion());
            URL urlMaestro = getClass().getClassLoader().getResource("reportes_formularios/" + nombrerporte + ".jasper");
            // Cargamos el reporte
            JasperReport masterReport = null;
            masterReport = (JasperReport) JRLoader.loadObject(urlMaestro);
            JasperPrint masterPrint = null;
            masterPrint = JasperFillManager.fillReport(masterReport, parameters, si);

            JasperViewer ventana = new JasperViewer(masterPrint, false);
            ventana.setTitle("reportes " + nombrerporte + "".toUpperCase());
            ventana.setExtendedState(ventana.MAXIMIZED_BOTH);
            ventana.setVisible(true);
            try {
                bd.rt.close();

            } catch (Exception ex) {
                Logger.getLogger(informe_todos.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (JRException e) {
            //e.printStackTrace();
            System.out.println("Error:" + e.getMessage());
        }

    }
}
