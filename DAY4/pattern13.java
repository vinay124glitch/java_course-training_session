import java.util.Scanner;

public class pattern13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++) {
            for (int j = 1; j <= no; j++) {
                if (i == 1 || i == no || j == 1 || j == no) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
