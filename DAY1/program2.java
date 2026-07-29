// preincrement and post increment
class program2 {
    public static void main(String args[]) {
        int a = 5;
        int b;
        System.out.println("a: " + a); // a=5
        b = a++;
        System.out.println("a: " + a); // a=6
        System.out.println("b : " + b);// b=5
        b = ++a;
        System.out.println("axx: " + a); // a=7
        System.out.println("b : " + b);// b=7
        b = a--;
        System.out.println("a: " + a); // a=6
        System.out.println("b : " + b);// b=7
        b = --a;
        System.out.println("a: " + a); // a=5
        System.out.println("b : " + b);// b=5
    }
}