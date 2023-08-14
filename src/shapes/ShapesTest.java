package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        System.out.println("Box 1 Perimeter: " + box1.getPerimeter());
        System.out.println("Box 1 Area: " + box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.println("Box 2 Perimeter: " + box2.getPerimeter());
        System.out.println("Box 2 Area: " + box2.getArea());
    }
}
