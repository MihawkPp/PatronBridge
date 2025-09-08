/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    private double heat;
    
    
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers) {
            o.update(temperature, humidity, pressure, heat);
        }
    }
    
}
