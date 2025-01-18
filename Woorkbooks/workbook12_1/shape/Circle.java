package shape;

public class Circle extends Shape {

    public Circle() {
    }

    public Circle(double radius) {
        super(radius);
    }

    @Override
    public double getArea() {
        double radius = getRadius();
        return 2 * Math.PI * Math.pow(radius, 2) ;
    }

    @Override
    public void getVolume() {
        System.out.println("Circle is a 2d figure hence it have no volume property");

    }

}
