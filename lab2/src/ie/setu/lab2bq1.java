package ie.setu;

class Rectangle {
    double width;
    double length;

    public Rectangle() {
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
}
