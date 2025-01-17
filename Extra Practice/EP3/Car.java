package EP3;

public class Car {

    private String make;
    private String model;
    private int productionYear;
    private double price;
    private BodyType bodyType;

    public static final int MIN_YEAR = 1900;
    public static final int MIN_PRICE = 0;
    public static final int MAX_PRICE = 200000;

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public Car(Car source) {
        setMake(source.make);
        setModel(source.model);
        setBodyType(source.bodyType);
        setProductionYear(source.productionYear);
        setPrice(source.price);
    }



    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        if( make == null || make.isBlank()){
            throw new IllegalArgumentException("make can't be null or blank");
        }
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if( model == null || model.isBlank()){
            throw new IllegalArgumentException("Model can't be null or blank");
        }
        this.model = model;
    }
    
    public BodyType getBodyType() {
        return this.bodyType;
    }


    public void setBodyType(BodyType bodyType) {
        if( bodyType == null){
            throw new IllegalArgumentException("BodyType can't be null");
        }
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if( productionYear < MIN_YEAR ){
            throw new IllegalArgumentException("Production year must be greater than or equal to "+MIN_YEAR+".");
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if( price < MIN_PRICE || price > MAX_PRICE ){
            throw new IllegalArgumentException("Price must be within range of 0 to "+ MAX_PRICE+".");
        }
        this.price = price;
    }
    
}
