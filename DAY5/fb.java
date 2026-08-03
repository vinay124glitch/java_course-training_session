import java.util.Scanner;

public class fb {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int f1 = 0, f2 = 1, f3 = 0;
        for (int i = 0; i < no; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
        }
    }
}
