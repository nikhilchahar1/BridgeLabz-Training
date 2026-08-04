import java.io.*;
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().isEmpty()) System.out.println(0);
        else{
            String[] arr = s.trim().split("[!@,.'?_ ]+");
            System.out.println(arr.length);
            for(String i : arr){
                System.out.println(i);
            }
        }
        scan.close();
    }
}

