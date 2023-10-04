
package practica006;

/**
 *
 * @author emiia
 */
public class MuestraEstadisticas implements Observer, ElementoDespliegue{
    private float maxTemp = Float.MIN_VALUE;  
    private float minTemp = Float.MAX_VALUE;
    private float tempSum;
    private int numReadings;
    private DatoDelTiempo datoTiempo;
    
    public MuestraEstadisticas(DatoDelTiempo datoTiempo){
        this.datoTiempo = datoTiempo;
        datoTiempo.registerObserver(this);
    }
    @Override
    public void update(float temp, float humedad, float presion) {
        this.maxTemp = Math.max(this.maxTemp, temp);
        this.minTemp = Math.min(this.minTemp, temp);
        tempSum += temp;
        numReadings++;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.println("Estadisticas del Tiempo");
        System.out.println("Temperatura promedio: " + (tempSum / numReadings));
        System.out.println("Temperatura maxima: " + maxTemp);
        System.out.println("Temperatura minima: " + minTemp);
    }
    
}
