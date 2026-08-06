class Bubble_Sort{

    public static void main(String args[]) {
        int arr[] = {5,2,6,7,3};
        int n = arr.length;
        int temp = 0;
        for(int i = 0;i<n; i++) {
            for(int j=1; j <(n-i);j++) {
                if(arr[j-1] > arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int e: arr)
        System.out.print(e + " ");
    }
}
