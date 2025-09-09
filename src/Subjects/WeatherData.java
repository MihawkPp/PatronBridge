package Subjects;

import java.util.ArrayList;
import Observers.*;

/**
 *
 * @author Estudiantes
 */
public class WeatherData implements Subject{
    
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private double temperature;
    private double humidity;
    private double pressure;
    
    public WeatherData() {
        temperature = 0.0;
        humidity = 0.0;
        pressure = 0.0;
    }
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver(double temperature, double humidity, double pressure) {
        for(Observer o : observers) {
            o.update(temperature, humidity, pressure);
        }
    }
    
}
