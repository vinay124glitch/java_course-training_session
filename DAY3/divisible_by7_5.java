import java.util.Scanner;

public class divisible_by7_5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        if (no % 5 == 0 && no % 7 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
