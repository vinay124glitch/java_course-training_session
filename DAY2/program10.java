import java.util.Scanner;

class program10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();
        System.out.print("C : ");
        int c = sc.nextInt();
        System.out.println(a > b ? (a > c ? "A is big" : "C is big") : (b > c ? "B is big" : "C is big"));
    }
}
