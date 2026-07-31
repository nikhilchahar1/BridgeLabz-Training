import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int[] decision = new int[26];
        for(int i=0;i<a.length();i++){
            decision[a.toLowerCase().charAt(i) - 97]+=1;
        }
        for(int i=0;i<b.length();i++){
            decision[b.toLowerCase().charAt(i) - 97]-=1;
        }
        for(int i : decision){
            if(i!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
