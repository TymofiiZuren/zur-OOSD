package ie.setu.q1;

// Abstract class representing all 3D shapes
public abstract class ThreeDShape extends Shape {

    // Constructor: passes name and colour to the Shape class
    public ThreeDShape(String name, String colour) {
        super(name, colour);
    }

    // Abstract method: must be implemented by all 3D shapes
    // Used to calculate the volume of the shape
    public abstract double volume();

    // Returns the basic string representation from the parent class
    @Override
    public String toString() {
        return super.toString();
    }
}