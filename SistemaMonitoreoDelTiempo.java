
package practica006;

/**
 *
 * @author emiia
 */
public class SistemaMonitoreoDelTiempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DatoDelTiempo datoTiempo = new DatoDelTiempo();
        MuestraTiempoActual tiempoActual = new MuestraTiempoActual(datoTiempo);
        MuestraEstadisticas estadisticas = new MuestraEstadisticas(datoTiempo);
        MuestraPronostico pronostico = new MuestraPronostico(datoTiempo);
        
        System.out.println("SISTEMA DE MONITOREO DEL TIEMPO");
        System.out.println();
        datoTiempo.setMedidas(28,65,30.4f);
        datoTiempo.setMedidas(32,70,29.2f);
        datoTiempo.setMedidas(30,90,29.2f);
        
        
        
        
    }
    
}
