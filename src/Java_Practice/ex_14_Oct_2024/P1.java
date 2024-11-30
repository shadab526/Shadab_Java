package Java_Practice.ex_14_Oct_2024;
import java.util.*;
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int rev = 0;
        int org_num = num;
        while (num!=0)
        {
           rev = rev * 10 + num % 10;
           num = num / 10;
        }
        if (rev == org_num){
            System.out.println("Palindrome Number");
        }
        else {
            System.out.println("Entered number is not a palindrome number");
        }

    }
}
