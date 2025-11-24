package ie.setu.q1;

// Cylinder is a subclass of ThreeDShape
public class Cylinder extends ThreeDShape {

    // Height of the cylinder
    private double height;

    // Radius of the cylinder's base
    private double radius;

    // Constructor: initializes name, colour, radius and height
    public Cylinder(String name, String colour, double r, double h){
        super(name, colour);   // Call parent constructor
        setHeight(h);          // Set height using setter
        setRadius(r);          // Set radius using setter
    }

    // Setter for height
    public void setHeight(double h){
        height = h;
    }

    // Getter for height
    public double getHeight(){
        return height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculates and returns the surface area of the cylinder
    @Override
    public double area(){
        // Formula: 2πr² + 2πrh
        return 2 * Math.PI * Math.pow(radius, 2) +
                2 * Math.PI * getRadius() * height;
    }

    // Calculates and returns the volume of the cylinder
    @Override
    public double volume() {
        // NOTE: This formula is currently for a sphere, not a cylinder.
        // Correct formula for cylinder volume: πr²h
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    // Returns string representation of the cylinder object
    @Override
    public String toString() {
        return super.toString() +
                "\nRadius = " + radius +
                "\nHeight = " + height;
    }
}