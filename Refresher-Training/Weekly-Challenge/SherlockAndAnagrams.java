import java.util.*;

public class SherlockAndAnagrams {

    public static int sherlockAndAnagrams(String s) {
        Map<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                char[] arr = sub.toCharArray();
                Arrays.sort(arr);
                String sorted = new String(arr);
                count += map.getOrDefault(sorted, 0);
                map.put(sorted, map.getOrDefault(sorted, 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            String s = sc.next();
            System.out.println(sherlockAndAnagrams(s));
        }
        sc.close();
    }
}