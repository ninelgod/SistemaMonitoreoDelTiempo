
package practica006;

/**
 *
 * @author emiia
 */
public class MuestraPronostico implements Observer, ElementoDespliegue{
    private float presionActual;
    private float ultimaPresion;
    private DatoDelTiempo datoTiempo;
    
    public MuestraPronostico(DatoDelTiempo datoTiempo){
        this.datoTiempo = datoTiempo;
        datoTiempo.registerObserver(this);
    }
    @Override
    public void update(float temp, float humidity, float pressure) {
        this.presionActual= pressure;
        mostrar();
    }


        @Override
    public void mostrar() {
            System.out.print("Pronostico del dia: ");
        if (ultimaPresion == 0) {
        System.out.println("Mejorando el tiempo al pasar el dia!");
    } else if (presionActual < ultimaPresion) {
        System.out.println("Tenga cuidado: dia frio y lluvioso.");
    } else {
        System.out.println("Todo el dia se mantendra equilibrado");
    }

        System.out.println();
        ultimaPresion = presionActual;
    }
}
    
