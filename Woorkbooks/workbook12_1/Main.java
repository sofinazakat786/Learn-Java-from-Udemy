import shape.Circle;
import shape.Sphere;


public class Main {

    public static void main(String[] args) {
        
        Circle circle = new Circle();

        circle.setRadius(2.02);
        

        Sphere sphere = new Sphere();
        sphere.setRadius(20.1);
        sphere.setHeight(3.25);

        System.out.println(circle.getRadius());
        System.out.println(sphere.getHeight());
    }

}
