package Java_Practice.ex_12_Oct_2024;
import java.util.*;
public class Q002_SumOfThreeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num = sc.nextInt();
        System.out.println("Enter second number");
        int num1 = sc.nextInt();
        System.out.println("Enter third number");
        int num2 = sc.nextInt();
        int k=num+num1;
        int result = k+num2;
        System.out.println("The sum of three number is: "+result);
//        int a=2, b=4, c=3;
//        int k= a+b;
//        int result = k+c;
//        System.out.println(result);
    }
}
