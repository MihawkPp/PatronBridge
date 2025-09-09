package Observers;

/**
 *
 * @author Estudiantes
 */
public class Forecast implements Observer, Display {
    
    public Forecast() {    
    }
    
    private double currentPressure;
    private double pressure = 0.0;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        currentPressure = this.pressure;
        this.pressure = pressure; // we only need the pressure value to give out forecast
        display();
    }

    @Override
    public void display() { //I read that if the atmospheric pressure rose it was because the weather was going to be better.
        if (currentPressure < pressure) {
            System.out.println(".: Forecast :.\n"
                    + "it's going to be good weather because the presssure has risen.\n");
        } else {
            System.out.println(".: Forecast :.\n"
                    + "it's going to be bad weather because the pressure has fallen.\n");
        }

    }
}
