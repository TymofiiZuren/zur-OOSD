package ie.setu.q1;

// Rectangle is a subclass of TwoDShape
public class Rectangle extends TwoDShape {

    // Length of the rectangle
    private double length;

    // Breadth (width) of the rectangle
    private double breadth;

    // Constructor: initializes name, colour, length and breadth
    public Rectangle(String name, String colour, double length, double breadth) {
        super(name, colour);       // Call the parent constructor
        setLength(length);         // Set length using setter
        setBreadth(breadth);       // Set breadth using setter
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for breadth
    public double getBreadth() {
        return breadth;
    }

    // Setter for breadth
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Calculates and returns the area of the rectangle
    @Override
    public double area() {
        return length * breadth;
    }

    // Returns string representation of the rectangle object
    @Override
    public String toString() {
        return super.toString() +
                "\nLength = " + length +
                "\nBreadth = " + breadth;
    }
}