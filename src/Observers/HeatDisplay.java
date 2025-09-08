/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Estudiantes
 */
public class HeatDisplay implements Observer, Display {

    private double temperatura;
    private double humidity;
    private double heat;
    
    @Override
    public void update(double temperatura, double humidity, double pressure, double heat) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
