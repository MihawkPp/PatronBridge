package Subjects;
import Observers.Observer;

/**
 *
 * @author Estudiantes
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver(double temperature, double humidity, double pressure);
}
