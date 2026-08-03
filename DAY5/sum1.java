
// sum of digits of a number
import java.util.Scanner;

public class sum1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int sum = 0;
        while (no > 0) {
            sum = sum + no % 10;
            no = no / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
