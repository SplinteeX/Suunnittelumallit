public class DisplayDevice implements Observer {
    private String name;
    public DisplayDevice(String name) {
        this.name = name;
    }
    @Override
    public void update(float temperature) {
        System.out.println(name + " - Temperature: " + temperature);
    }

}