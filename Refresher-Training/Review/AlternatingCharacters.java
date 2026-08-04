package Review;
import java.util.Scanner;

class Result {
    public static int alternatingCharacters(String s) {
        // Write your code here
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
        }
        return count;
    }
}

public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Number of test cases
        int q = sc.nextInt();
        sc.nextLine(); // Consume the newline
        for (int i = 0; i < q; i++) {
            String s = sc.nextLine();
            int result = Result.alternatingCharacters(s);
            System.out.println(result);
        }

        sc.close();
    }
}
