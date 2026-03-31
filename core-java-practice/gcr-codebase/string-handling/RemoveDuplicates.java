import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        String str = sc.next();

        // Reversing the duplicates
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) result += ch;
        }
        
        // Output
        System.out.println("Modified String: " + result);

        sc.close();
    }
}
