package ie.setu.q1;

// Abstract class representing all 2D shapes
public abstract class TwoDShape extends Shape {

    // Constructor: passes name and colour to the Shape class
    public TwoDShape(String name, String colour) {
        super(name, colour);
    }

    // Abstract method: must be implemented by all 2D shapes
    // Used to calculate the area of the shape
    @Override
    public abstract double area();

    // Returns the basic string representation from the parent class
    @Override
    public String toString() {
        return super.toString();
    }
}