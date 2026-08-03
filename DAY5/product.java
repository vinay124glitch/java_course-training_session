import java.util.Scanner;

/**
 * product
 */
class product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int no = sc.nextInt();
        int product = 1;
        for (int i = 1; i <= no; i++) {
            product = product * i;
        }
        System.out.println("Product of natural numbers is: " + product);
    }
}
