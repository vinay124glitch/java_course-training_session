import java.util.Scanner;

class program5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char c = sc.next().charAt(0);
        int a = c;
        System.out.println(c + " ascii - " + a);
    }
}
