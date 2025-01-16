package ENUMS;
public class Car {

    private String make;
    private int year;

    public static enum TrafficLight {
        RED, GREEN, YELLOW
    };

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void drive(TrafficLight trafficLight) {
        if (trafficLight == null) {
            throw new IllegalArgumentException("TRAFFIC LIGHT can't be null");
        }

        switch (trafficLight) {
            case RED -> System.out.println("STOP");
            case GREEN -> System.out.println("GO");
            case YELLOW -> System.out.println("SLOW DOWN");
            default -> throw new AssertionError();
        }
    }

}
