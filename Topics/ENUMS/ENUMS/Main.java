package ENUMS;

import ENUMS.Car.TrafficLight; // Importing the nested enum properly

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Tata", 1920);
        car.drive(TrafficLight.RED); // Using the imported TrafficLight
    }
}
