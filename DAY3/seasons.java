import java.util.Scanner;

class seasons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number (1-12): ");
        int n = sc.nextInt();
        switch (n) {
            case 11:
            case 12:
            case 1:
                System.out.println("Winter");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Spring");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Summer");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Rainy");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
}
