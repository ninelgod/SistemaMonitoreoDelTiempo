
package practica006;

import java.util.ArrayList;

/**
 *
 * @author emiia
 */
public class DatoDelTiempo implements Subject{
    private ArrayList observers;
    private float temperatura;
    private float humedad;
    private float presion;
    
    public DatoDelTiempo(){
         observers = new ArrayList();
    }
    
    @Override
    public void registerObserver(Observer o){
        observers.add(o);
    }
    
    @Override
    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i >=0){
            observers.remove(i);
        }
    }
    
    @Override
    public void notifyObservers(){
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(temperatura,humedad,presion);
        }
    }
    
    public void medidasCambiadas(){
        notifyObservers();
    }
    
    public void setMedidas(float temperature, float humidity, float pressure){
        this.temperatura = temperature;
        this.humedad = humidity;
        this.presion = pressure;
        medidasCambiadas();
    }
    
    public float getTemperatura(){
        return temperatura;
    }
    
    public float getHumedad(){
        return humedad;
    }
    
    public float getPresion(){
        return presion;
    }
}
