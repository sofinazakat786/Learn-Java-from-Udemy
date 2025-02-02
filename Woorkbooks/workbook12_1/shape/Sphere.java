package shape;

public class Sphere extends Shape {

    private double height;


    public Sphere() {
        super();
    }
    public Sphere(double height) {
        this.height = height;
    }

    public Sphere(double radius, double height) {
        super(radius);
        this.height = height;
    }


    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        double radius = getRadius();
        return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
    }

    @Override
    public void getVolume() {
        double radius = getRadius();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume: " + volume);

    }




}
