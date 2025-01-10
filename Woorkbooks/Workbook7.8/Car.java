
public class Car {

    private String make;

    public Car(String make) {
        this.make = make;
    }

    public Car(Car source) {
        this.make = source.make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}
