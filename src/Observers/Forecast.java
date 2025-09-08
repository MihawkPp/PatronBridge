/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Estudiantes
 */
public class Forecast implements Observer, Display {

    private double temperature;
    private double humidity;
    private double pressure;
    
    @Override
    public void update(double temperature, double humidity, double pressure, double heat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
