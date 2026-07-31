import java.util.Scanner;

public class pattern11 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        for (int i = 1; i <= no; i++) {
            for (int j = no; j >= no - i + 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
