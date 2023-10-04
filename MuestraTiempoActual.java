
package practica006;

/**
 *
 * @author emiia
 */
public class MuestraTiempoActual implements Observer,ElementoDespliegue{
    private float temperatura;
    private float humedad;
    private Subject datoTiempo;
    
    public MuestraTiempoActual(Subject datoTiempo){
        this.datoTiempo = datoTiempo;
        datoTiempo.registerObserver(this);
    }
    
    @Override
    public void update(float temperatura, float humedad, float presion) {
        this.humedad = humedad;
        this.temperatura = temperatura;
        mostrar();
    }

    @Override
    public void mostrar() {
        System.out.println("Condiciones del Tiempo Ahora: " + temperatura +
                " grados C " + humedad + "% humedad");
    }
}
