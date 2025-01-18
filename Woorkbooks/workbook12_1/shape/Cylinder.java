package shape;

public class Cylinder extends Shape {

    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
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
        // Surface Area of Cylinder: 2πr^2 + 2πrh
        double radius = getRadius(); // Accessing the radius from the superclass
        double area = 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
        return Math.round(area * 100.0) / 100.0; // Round to 2 decimal places
    }

    @Override
    public void getVolume() {
        double radius = getRadius();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume: " + volume);

    }

}
