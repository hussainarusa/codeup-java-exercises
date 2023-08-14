package shapes;
//
//public class Rectangle {


//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea() {
//        return length * width;
//    }
//
//    public double getPerimeter() {
//        return 2 * (length + width);
//    }
//
//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(5.0, 3.0);
//        double area = rectangle.getArea();
//        double perimeter = rectangle.getPerimeter();
//
//        System.out.println("Rectangle Area: " + area);
//        System.out.println("Rectangle Perimeter: " + perimeter);
//    }
//}


import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class Rectangle implements Measurable {


    @Override
    public double getPerimeter() {
        int width = 0;
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        int width = 0;
        return length * width;
    }
}


