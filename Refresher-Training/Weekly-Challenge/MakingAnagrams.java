import java.util.*;

public class MakingAnagrams {
    public static int makeAnagram(String a, String b) {
        int[] arr = new int[26];
        for (char c : a.toCharArray()) {
            arr[c - 97] += 1;
        }
        for (char c : b.toCharArray()) {
            arr[c - 97] -= 1;
        }
        int count = 0;
        for (int i : arr) {
            if (i != 0) {
                count += Math.abs(i);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int res = makeAnagram(a, b);
        System.out.println(res);
        sc.close();
    }
}