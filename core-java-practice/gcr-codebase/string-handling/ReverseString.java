import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        String str = sc.next();

        // Reversing the string
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        // Output
        System.out.println("Reversed String: " + reversed);
    }
}
