import java.util.Scanner;
class Array_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int size = sc.nextInt();
        int arr[][] = new int[size][size];
        int no = 1;
        for(int i = 0; i<size;i++){
            for(int j=0;j<size;j++) {
            arr[i][i]=no++;
            System.out.print(arr[i][i] + " ");
            }
            System.out.println();
        }
    }
}