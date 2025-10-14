// Author: Tymofii Mazurenko
// Student ID: C00325393
// Date: 14/10/2025
// Purpose: Point/Circle inheritance

package ie.setu;

public class Circle extends Point {
    private int radius;

    public Circle(int radius, int x, int y)  {
        super(x, y);
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + "( radius: " + radius + " )";
    }
}
