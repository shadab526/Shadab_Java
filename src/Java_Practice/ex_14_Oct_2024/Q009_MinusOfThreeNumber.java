package Java_Practice.ex_14_Oct_2024;
import java.util.*;
public class Q009_MinusOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        System.out.println("Enter b number:");
        int b = sc.nextInt();
        System.out.println("Enter c number:");
        int c = sc.nextInt();
        int k = (a-b);
        int result = (k-c);
        System.out.println(result);

    }
}
