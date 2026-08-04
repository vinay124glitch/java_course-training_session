import java.util.*;
class ReverseStr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the char: ");
        String s = sc.next();
        int  i = s.length();
        while(i>0){
            System.out.println(s.charAt(i-1));
            i--;
        }
       
    }

}


