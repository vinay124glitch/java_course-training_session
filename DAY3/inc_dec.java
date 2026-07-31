import java.util.Scanner;

public class inc_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1, j = n; i <= n && j >= 1; i++, j--) {
            System.out.println(i + " - " + j);
        }
    }
}
