
package shapes;

//public class Square extends Rectangle {
//    public Square(double side) {
//        super(side, side);
//    }
//
//    @Override
//    public double getArea() {
//        return length * length;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return 4 * length;
//    }
//}

import static com.sun.tools.classfile.Module_attribute.RequiresEntry.length;

public class Square extends Rectangle {


    public Square(int i) {

    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}

