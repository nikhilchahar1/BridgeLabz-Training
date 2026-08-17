import java.util.*;

public class TwoString{

    public static String twoStrings(String s1, String s2) {
        Set<Character> hs = new HashSet<>();
        for (char i : s1.toCharArray()) {
            hs.add(i);
        }
        for (char i : s2.toCharArray()) {
            if (hs.contains(i)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(twoStrings(s1, s2));
        }

        sc.close();
    }
}