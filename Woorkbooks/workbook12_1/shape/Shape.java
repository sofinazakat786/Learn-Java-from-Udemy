package shape;

public class Shape {
    private double radius;

    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
}
