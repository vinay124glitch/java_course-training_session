import java.util.Scanner;

public class pattern6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int N = 1;
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(N + " ");
                N++;
            }
            System.out.println();
        }
    }

}
