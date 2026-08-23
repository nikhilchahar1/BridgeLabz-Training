abstract class Shape {
    abstract double area();
    void describe() {
        System.out.println("Area of shape : " + area());
    }
}

class Square extends Shape {
    int side;
    Square(int side) {
        this.side = side;
    }
    @Override
    double area() {
        return side * side;
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Shape namedSquare = new Square(5);
        Shape anonTriangle = new Shape() {
            @Override
            double area() {
                return 0.5 * 6 * 4;
            }
        };
        namedSquare.describe();
        anonTriangle.describe();
    }
}