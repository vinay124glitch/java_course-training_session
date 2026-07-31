import java.util.Scanner;

class program13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int a = 10, b = 5, c = 1, res;
        res = a - ++c - ++b;
        System.out.println("Result: " + res);
    }
}
