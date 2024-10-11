package Java_Practice.ex_12_Oct_2024;
import java.util.*;
public class Q005_ConvertInegerToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to convert into the binary");
        int num = sc.nextInt();
        System.out.println("Binary number:"+Integer.toBinaryString(num));
    }
}
