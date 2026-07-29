// reverse the 12345 without any predefined function looping and any extra variable
public class program3 {
    public static void main(String args[]) {
        int n = 12345;
        System.out.print(n % 10);
        n = n / 10;
        System.out.print(n % 10);
        n = n / 10;
        System.out.print(n % 10);
        n = n / 10;
        System.out.print(n % 10);
        n = n / 10;
        System.out.print(n % 10);
    }

}
