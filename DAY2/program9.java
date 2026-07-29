import java.util.Scanner;

class program9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.println(a > b ? "A is big" : "B is big");
    }
}
