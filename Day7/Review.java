import java.util.*;
public class Review {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        char [] arr = str.toCharArray();
        int index = 0;
        for (int i = 0;i<arr.length;i++){
            int j;
            for(int j=0;j<i;j++){
                if (arr[i]==arr[j]){
                    break;
                }
            }
            if (j==i){
                arr[index ++] = +arr[i];
            }
        }
        System.out.println("After Review Duplicates: ");
        for (int i = 0; i<index;i++){
            System.out.println(arr[i]);
        }
    }
    
}
