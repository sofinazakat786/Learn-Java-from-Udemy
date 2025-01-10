package Quiz41;


public class City {
    private String name;
    private long population;


    public City(String name, long population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

}
