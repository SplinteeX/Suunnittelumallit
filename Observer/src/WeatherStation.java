import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class WeatherStation implements Runnable {
    private List<Observer> observers = new ArrayList<>();
    private float temperature;
    private boolean running = true;
    private final Random random = new Random();

    public WeatherStation() {
        this.temperature = random.nextInt(30) + 1;
    }
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
    private void updateTemperature() {
        int change = random.nextInt(6) - 3;
        temperature += change;
        if (temperature < -10) temperature = -10;
        if (temperature > 40) temperature = 40;
        notifyObservers();
    }
    @Override
    public void run() {
        while (running) {
            updateTemperature();
            try {
                Thread.sleep((random.nextInt(5) + 1) * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
    public void stop() {
        running = false;
    }


}