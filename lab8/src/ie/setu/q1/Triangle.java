package ie.setu.q1;

// Triangle is a subclass of TwoDShape
public class Triangle extends TwoDShape {

    // Base length of the triangle
    private double base;

    // Height of the triangle
    private double height;

    // Constructor: initializes name, colour, base and height
    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);   // Call parent constructor
        setBase(base);         // Set base using setter
        setHeight(height);     // Set height using setter
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Getter for base
    public double getBase() {
        return base;
    }

    // Setter for base
    public void setBase(double base) {
        this.base = base;
    }

    // Calculates and returns the area of the triangle
    @Override
    public double area() {
        return 0.5 * base * height;   // Formula: ½ × base × height
    }

    // Returns string representation of the triangle object
    @Override
    public String toString() {
        return super.toString() +
                "\nBase = " + base +
                "\nHeight = " + height;
    }
}