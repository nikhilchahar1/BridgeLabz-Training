public class MethodOverloading {

    static class Calculator {
        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Adding two ints (7 + 52) : " + calc.add(7, 52));
        System.out.println("Adding two doubles (5.7 + 8.5) : " + calc.add(5.7, 8.5));
        System.out.println("Adding three ints (10 + 2 + 33) : " + calc.add(10, 2, 33));

    }
}