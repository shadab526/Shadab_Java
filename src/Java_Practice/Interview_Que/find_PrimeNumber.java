package Java_Practice.Interview_Que;
import java.util.*;
public class find_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int count =0;
        int n = sc.nextInt();
        for (int i =1; i<=n; i++){
            if (n % i ==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(n+ " Number is Prime number");
        }
        else {
            System.out.println(n+ " Number is not Prime number");
        }

    }
}
