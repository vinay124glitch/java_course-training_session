// TRIANGULAR NUMBER and can can form traingle or not

import java.util.Scanner;

public class triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("The sides can form a triangle.");
        } else {
            System.out.println("The sides cannot form a triangle.");
        }
    }
}
