public class bubblesort {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // Outer loop: number of passes
            for (int j = 0; j < n - i - 1; j++) { // Inner loop: compare and swap
                if (arr[j] < arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        sort(arr); // Sort the array

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}