package Observers;

/**
 *
 * @author Estudiantes
 */
public class CurrentConditions implements Observer, Display{

    public CurrentConditions() {
    }

    private double temperature;
    private double humidity;
    private double pressure;
    
    
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(".: Current Conditions:.\n" +
                        "Current temperature :" + temperature + "C°\n" +
                        "Current humidity: " + humidity + "%\n" +
                        "Current pressure: " + pressure + "Pa\n");
    }
    
}
