package Controller;

import Observers.CurrentConditions;
import Observers.Forecast;
import Observers.HeatDisplay;
import Observers.WeatherStatistics;
import Subjects.WeatherData;

/**
 *
 * @author Estudiantes
 */
public class PatronObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WeatherData weatherStation = new WeatherData();
        
        CurrentConditions currentConditionsDisplay = new CurrentConditions();
        WeatherStatistics statsDisplay = new WeatherStatistics();
        Forecast forecastDisplay = new Forecast();
        HeatDisplay heatDisplay = new HeatDisplay();
        
        weatherStation.registerObserver(currentConditionsDisplay);        
        weatherStation.registerObserver(statsDisplay);        
        weatherStation.registerObserver(forecastDisplay);        
        weatherStation.registerObserver(heatDisplay);
        
        System.out.println(">> initially testing with all subscribed observers\n");
        weatherStation.notifyObserver(25.5, 65.0, 1013.2);
        
        System.out.println(">> We prove that the forecast is good when the pressure increases\n");
        weatherStation.notifyObserver(27.3, 60.0, 1020.0);
        
        System.out.println(">> We prove that the forecast is bad when the pressure decreases\n");
        weatherStation.notifyObserver(19.0, 49.3, 1000.7);
        
        System.out.println(">> We try removing some observers and applying new values\n"); 
        weatherStation.removeObserver(heatDisplay);
        weatherStation.removeObserver(forecastDisplay);
        weatherStation.notifyObserver(40.5, 75.0, 493.0);
        
        System.out.println(">> We try adding again an observer and applying new values\n");
        weatherStation.registerObserver(forecastDisplay);
        weatherStation.notifyObserver(20.2, 14.0, 800.2);
        
        System.out.println(">> This is the end");
        
    }
    
}
