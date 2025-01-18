
import shape.Circle;
import shape.Cylinder;
import shape.Sphere;

public class Main {

    public static void main(String[] args) {

        Circle circle1 = new Circle();

        circle1.setRadius(2.02);

        Sphere sphere1 = new Sphere();
        sphere1.setRadius(20.1);
        sphere1.setHeight(3.25);

        System.out.println(circle1.getRadius());
        System.out.println(sphere1.getHeight());

        System.out.println("*********************************************NEW*****************************");
        Cylinder cylinder1 = new Cylinder(1.0, 3.0);
        Sphere sphere2 = new Sphere(1.0);

        System.out.println("Sphere 2 - radius: " + sphere2.getRadius());
        System.out.println("Cylinder - raduis: " + cylinder1.getRadius() + " Height: " + cylinder1.getHeight());

        System.out.println("Area of circle: "+ circle1.getArea());
        System.out.println("Area of Cylinder: "+ cylinder1.getArea()+" cm sq.");


    }

}
