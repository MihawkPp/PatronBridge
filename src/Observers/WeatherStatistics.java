package Observers;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Estudiantes
 */
public class WeatherStatistics implements Observer, Display {
    
    private ArrayList<Double> temperatures;
    private ArrayList<Double> humidities;
    private ArrayList<Double> pressures;

    public WeatherStatistics() {
        temperatures = new ArrayList<>();
        humidities = new ArrayList<>();
        pressures = new ArrayList<>();
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
        display();
    }

    @Override
    public void display() {
        System.out.println(".: Weather Statistics :.");
        displayStats("temperature", temperatures);
        displayStats("humidity", humidities);
        displayStats("pressure", pressures);
    }

    public void displayStats(String type, ArrayList<Double> values) {
        if (!values.isEmpty()) {
            double sum = 0;
            for (double value : values) {
                sum += value;
            }

            double averageMeasure = sum / values.size();
            double min = Collections.min(values);
            double max = Collections.max(values);
            
            System.out.println(type + " - Average Measure: " + averageMeasure + "\n"
                                    + " - Minimum Measure: " + min + "\n"
                                    + " - Maximum Measure: " + max + "\n");
        }
    }
}
