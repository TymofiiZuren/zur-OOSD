package ie.setu;

public class TestClassLab2B {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        shape1.setLength(5);
        shape1.setWidth(10);

        System.out.println(shape1);

        RectangleQ2 shape2 = new RectangleQ2();
        shape2.setLength(5);
        shape2.setWidth(10);

        System.out.println("Area = " + shape2.getArea() + " Perimeter = " + shape2.getPerimeter());

        RectangleQ3 shape3 = new RectangleQ3();
        shape3.setLength(5);
        shape3.setWidth(7);

        shape3.printRectangle();
    }
}
