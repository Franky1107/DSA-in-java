public class selectionsort {
    public static void swap(int arr[],int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            int min =i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr,i,min);

        }
        for (int i = 0; i < n ; i++) {
            System.out.println(arr[i]);
        }

    }

}