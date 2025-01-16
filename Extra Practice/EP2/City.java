
public class City {

    private String name;
    private String country;
    private long population;

    //Constructor with setter methods
    public City(String name, String country, long population){
        setName(name);
        setCountry(country);
        setPopulation(population);
    }

    public City(City other){
        this.name = other.name;
        this.country = other.country;
        this.population = other.population;
    }


    //Getters and Setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name can't be null or blank");
        }
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("Country can't be null or blank");
        }
        this.country = country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        if (population <= 0) {
            throw new IllegalArgumentException("Pupulation must be greater than 0");
        }
        this.population = population;
    }
}
