import java.util.Scanner;

class table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Table of " + n + " is: ");
        int t = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " * " + t + " = " + (t * i));
        }
    }
}
