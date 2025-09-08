/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Estudiantes
 */
public class CurrentConditions implements Observer, Display{

    private double temperature;
    private double humidity;
    private double pressure;
    
    
    @Override
    public void update(double temperature, double humidity, double pressure, double heat) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void display() {
        System.out.println(".: Current Conditions:." +
                        "Current temperature :" + temperature + "C°" +
                        "Current humidity: " + humidity + "g/m^3" +
                        "Current pressure: " + pressure + "Pa");
    }
    
}
