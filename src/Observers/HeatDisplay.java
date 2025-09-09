package Observers;

/**
 *
 * @author Estudiantes
 */
public class HeatDisplay implements Observer, Display {

    public HeatDisplay() {
    }
    
    private double temp;
    private double hum;
    private double heat;
    
    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temp = temperature;
        this.hum = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(".: Heat Index :.\n"
                        + "Current temperature: " + temp + "C°\n"
                        + "Current humidity: " + hum + "%");
        double heatIndex = -8.784 + (1.611 * temp) + (2.338 * hum) + (-0.146 * temp * hum)
                        + (-0.012 * temp * temp) + (-0.016 * hum * hum) + (0.002211 * temp * temp * hum)
                        + (0.0007254 * temp * hum * hum) + (-0.000003582 * temp * temp * hum * hum);
        System.out.println("Heat Index : " + heatIndex + "\n");
    }
}
