package shape;

public abstract class Shape {

    private double radius;

    public Shape() {
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public abstract double getArea();

    public abstract void getVolume();
}
