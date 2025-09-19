package ie.setu;

class RectangleQ2 {
    double width;
    double length;

    public RectangleQ2() {
        setWidth(1F);
        setLength(1F);
    }

    public void setWidth(double width) {
        if (width > 0F && width <= 40F) {
            this.width = width;
        } else {
            return;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (width > 0F && width <= 40F) {
            this.length = length;
        } else {
            return;
        }
    }

    public double getLength() {
        return length;
    }

    public String toString() {
        return "Length = " + this.length + ", Width = " + this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
}
