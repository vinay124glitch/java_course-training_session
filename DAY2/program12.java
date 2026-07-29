import java.util.Scanner;

class program12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit : ");
        int no = sc.nextInt();
        if (no >= 0 && no <= 10)
            System.out.println("single digit");
        else if (no >= 10 && no <= 100)
            System.out.println("two-digit");
        else if (no >= 100 && no <= 1000)
            System.out.println("three-digit number");
        else if (no >= 1000 && no <= 10000)
            System.out.println("four-digit number");
        else
            System.out.println("out of  range");
    }
}
