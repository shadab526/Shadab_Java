package Java_Practice.ex_12_Oct_2024;
import java.util.*;

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String name = sc.next();
       // String name = "mom";
        String rev = "";
        for (int i = name.length()-1; i>=0;i--){
            rev = rev + name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println("Palindrome String");
        }
        else {
            System.out.println("Not a Palindrome String");
        }
    }
}
