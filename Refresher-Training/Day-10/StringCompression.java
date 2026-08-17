import java.util.*;

public class StringCompression{

    public static String compression(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        int count = 1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                 count++;
                 if(i==str.length()-1 && count>1) sb.append(String.valueOf(count));
            }
            else{
                if(count>1) sb.append(String.valueOf(count));
                sb.append(str.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(compression(s));
    }
}