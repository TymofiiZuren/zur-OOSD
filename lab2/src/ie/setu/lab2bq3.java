package ie.setu;

class RectangleQ3 {
    double width;
    double length;

    public RectangleQ3() {
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

    public void printRectangle() {
        for (int i = 0; i < this.length; i++) {
            for (int j = 0; j < this.width; j++) {
                if (i == 0 || i == this.length - 1) {
                    System.out.print("*");
                } else if (j == 0 || j == this.width - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
