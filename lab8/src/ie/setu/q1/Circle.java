package ie.setu.q1;

// Circle is a subclass of TwoDShape
public class Circle extends TwoDShape {

    // Radius of the circle
    private double radius;

    // Constructor: initializes name, colour, and radius
    public Circle(String name, String colour, double r){
        super(name, colour);   // Call parent constructor
        setRadius(r);          // Set the radius using setter
    }

    // Getter method for radius
    public double getRadius(){
        return radius;
    }

    // Setter method for radius
    public void setRadius(double r){
        radius = r;
    }

    // Calculates and returns the area of the circle
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    // Returns string representation of the circle object
    @Override
    public String toString() {
        // Calls the parent class's toString and adds radius info
        return super.toString() + "\nRadius = " + radius;
    }
}