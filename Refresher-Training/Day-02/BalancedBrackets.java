import java.util.*;

class BResult {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '{' || i == '[' || i == '(')
                st.push(i);
            else if (i == '}') {
                if (st.isEmpty()) return "NO";
                if (st.peek() == '{') st.pop();
                else return "NO";
            }
            else if (i == ']') {
                if (st.isEmpty()) return "NO";
                if (st.peek() == '[') st.pop();
                else return "NO";
            }
            else if (i == ')') {
                if (st.isEmpty()) return "NO";
                if (st.peek() == '(') st.pop();
                else return "NO";
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }
}

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
        while (t-- > 0) {
            System.out.print("Enter brackets: ");
            String s = sc.nextLine();
            System.out.println(BResult.isBalanced(s));
        }

        sc.close();
    }
}