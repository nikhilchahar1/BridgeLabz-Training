import java.util.Scanner;

public class CamelCase {

    public static int camelCase(String s) {
        String[] arr = s.split("[A-Z]");
        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = camelCase(s);
        System.out.println(result);
        sc.close();
    }
}