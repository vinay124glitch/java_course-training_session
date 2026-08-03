import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int sum = 0, temp = no;
        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + (digit * digit * digit);
            temp = temp / 10;
        }
        if (sum == no) {
            System.out.println(no + " is an Armstrong number.");
        } else {
            System.out.println(no + " is not an Armstrong number.");
        }
    }
}
