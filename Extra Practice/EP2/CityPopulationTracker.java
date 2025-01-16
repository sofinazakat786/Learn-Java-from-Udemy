
import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulation;


    public CityPopulationTracker() {
        this.cityPopulation = new HashMap<>();
    }

    public City getCity(String cityName){
        City city = cityPopulation.get(cityName);
        return city == null ? null : new City(city);
    }

    public void setCity(City city){
        if (city != null){
            cityPopulation.put(city.getName(), new City(city));
        }
    }
    public void addCity(City city){
        if (city != null){
            cityPopulation.put(city.getName(), new City(city));
        }
    }

    
}
