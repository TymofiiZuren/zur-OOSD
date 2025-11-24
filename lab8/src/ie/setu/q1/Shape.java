package ie.setu.q1;

// Abstract base class for all shapes
public abstract class Shape {

    // Name of the shape (e.g., Circle, Rectangle)
    private String name;

    // Colour of the shape
    private String colour;

    // Constructor: initializes the name and colour
    public Shape(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    // Returns a string representation of the shape
    @Override
    public String toString() {
        return ("---\nShape Name = " + this.name +
                "\nShape colour = " + this.colour);
    }

    // Abstract method: must be implemented by subclasses
    // Used to calculate the area of the shape
    public abstract double area();
}