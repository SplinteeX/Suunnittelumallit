public class Main {
    public static void main(String[] args) throws InterruptedException {
        WeatherStation station = new WeatherStation();

        Observer display1 = new DisplayDevice("Display 1");
        Observer display2 = new DisplayDevice("Display 2");

        station.addObserver(display1);
        station.addObserver(display2);

        Thread weatherThread = new Thread(station);
        weatherThread.start();

        Thread.sleep(15000);

        station.removeObserver(display1);

        Thread.sleep(10000);

        station.stop();
        weatherThread.join();
    }
}