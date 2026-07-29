//swap the 2 number in java
class program {
    public static void main(String args[]) {
        int a = 10;
        int b = 5;
        // swap the 2 numbers
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}