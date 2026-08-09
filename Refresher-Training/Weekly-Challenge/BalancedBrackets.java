import java.util.*;

public class BalancedBrackets {
    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '{' || i == '[' || i == '(') {
                st.push(i);
            }
            else if (i == '}') {
                if (st.isEmpty()) return "NO";
                if (st.peek() == '{') {
                    st.pop();
                } else {
                    return "NO";
                }
            }
            else if (i == ']') {
                if (st.isEmpty()) return "NO";
                if (st.peek() == '[') {
                    st.pop();
                } else {
                    return "NO";
                }
            }
            else if (i == ')') {
                if (st.isEmpty()) return "NO";
                if (st.peek() == '(') {
                    st.pop();
                } else {
                    return "NO";
                }
            }
        }
        return st.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            String result = isBalanced(s);
            System.out.println(result);
        }

        sc.close();
    }
}