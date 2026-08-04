import java.util.Scanner;
class Array_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int size = sc.nextInt();
        int arr[][][] = new int[size][size][size];
        int no = 1;
        for(int m=0;m<size; m++) {
            System.out.println("Matrix : " + m);
        for(int i = 0; i<size;i++){
            for(int j=0;j<size;j++) {
            arr[m][i][i]=no++;
            System.out.print(arr[m][i][i] + " ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
}