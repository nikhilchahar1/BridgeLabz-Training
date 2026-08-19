import java.util.*;

class Line {
    double x1;
    double y1;
    double x2;
    double y2;

    Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    double getLineLength() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

public class LineComparison{

    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coordinates of line 1 : ");
        Line l1 = new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        System.out.println("Enter the coordinates of line 2 : ");
        Line l2 = new Line(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        double length1 = l1.getLineLength();
        double length2 = l2.getLineLength();
        System.out.println("Length of line 1 : "+length1);
        System.out.println("Length of line 2 : "+length2);
        if (length1 == length2) {
            System.out.println("Both lines are equal");
        } else if (length1 < length2) {
            System.out.println("line1 is smaller than line2");
        } else {
            System.out.println("line1 is bigger than line2");
        }
    }
}