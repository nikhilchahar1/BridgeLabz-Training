import java.util.*;

public class PermutationOfString {
    static List<String> per = new ArrayList<>();

    static void permute(String str, String result) {
        if (str.length() == 0) {
            per.add(result);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String remaining = str.substring(0, i) + str.substring(i + 1);
            permute(remaining, result + ch);
        }
    }

    static void printPermutation(String[] str) {
        Set<String> hs = new HashSet<>();
        for (String s : per) {
            char[] ch = s.toCharArray();
            String t = "";
            for(int i=0;i<ch.length;i++){
                t = t + str[ch[i]-'0'-1]+" ";
            }
            hs.add(t);
        }
        for(String i : hs){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.next();
        }
        String str = "";
        for(int i=0;i<n;i++){
            str = str + (String.valueOf(i+1));
        }
        permute(str, "");
        printPermutation(arr);
    }
}