
public class Main {

    public static void main(String[] args) {
        City city1 = new City("Bengaluru", "India", 100000);
        System.out.println("City Name: " + city1.getName());
        System.out.println("Country Name: " + city1.getCountry());
        System.out.println("Pululation: " + city1.getPopulation());

        // Test Invalid inputs :
        // city1.setName("");
        // city1.setCountry("");
        // city1.setPopulation(-5);
        
        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.addCity(new City("Mysore", "India", 5688999));
        tracker.addCity(new City("Hassan", "India", 965555));

        //Test the getCity method
        City nyCity = tracker.getCity("Mysore");
        System.out.println("Pupulation of Mysore: " + nyCity.getPopulation());

        // Test the setCity method
        City updatedNyCity = new City("New York", "USA", 8600000);
        tracker.setCity(updatedNyCity);

        // Verify that the city data was updated
        nyCity = tracker.getCity("New York");
        System.out.println("Updated population of New York: " + nyCity.getPopulation());
    }
}
