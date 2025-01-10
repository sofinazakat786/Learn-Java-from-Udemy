package Quiz41;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        City paris = new City("paris", 2121000);

        List<City> cities = new ArrayList<>();
        cities.add(new City("london", 895000));
        cities.add(new City("paris", 2121000));
        cities.add(new City("florence", 5632555));

        System.out.println(cities.contains(paris));
    }
    
}
