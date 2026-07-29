import java.util.Scanner;

class program11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character : ");
        char c = sc.next().charAt(0);
        int a = c;
        if (a >= 65 && a <= 90)
            System.out.println(c + " capital letter");
        else if (a >= 97 && a <= 122)
            System.out.println(c + " small letter");
        else if (a >= 48 && a <= 57)
            System.out.println(c + " number");
        else
            System.out.println(c + " is a symbol");
    }
}
