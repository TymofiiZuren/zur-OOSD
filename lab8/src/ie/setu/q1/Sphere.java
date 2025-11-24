package ie.setu.q1;

// Sphere is a subclass of ThreeDShape
public class Sphere extends ThreeDShape {

    // Radius of the sphere
    private double radius;

    // Constructor: initializes name, colour, and radius
    public Sphere(String name, String colour, double radius) {
        super(name, colour);   // Call parent constructor
        setRadius(radius);     // Set radius using setter
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculates and returns surface area of the sphere
    @Override
    public double area() {
        // Formula: 4πr²
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Calculates and returns volume of the sphere
    @Override
    public double volume() {
        // Formula: 4/3 πr³
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    // Returns string representation of the sphere
    @Override
    public String toString() {
        // Calls parent toString and adds radius info
        return super.toString() + "\nRadius = " + radius;
    }
}