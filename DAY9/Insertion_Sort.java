import java.util.Scanner;
class Insertion_Sort{

    public static void main(String args[]) {
        int arr[] = {105,120,10,200,20};
        int n = arr.length;
        for(int j = 1;j<n; j++) {
            int key=arr[j];
            int i = j-1;
            while((i > -1) && (arr[i] > key )) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
        for(int e:arr)
        System.out.print(e + " ");
    }
}
           