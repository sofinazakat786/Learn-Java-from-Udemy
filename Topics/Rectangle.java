import java.util.* ;
import java.io.*; 

public class Rectangle {
    // Data Members
    public int length;
    public int breadth;

    // Constructor to initialize the rectangle
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Member function to calculate the area of the rectangle
    public int getArea() {
        return length * breadth;
    }
}