package arrays;

public class subarrays {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int max = 0;
        int startingPoint = 0;
        int endingPoint = 0;
        for (int i = 0; i < arr.length; i++) {// from starting point
            for (int j = i; j < arr.length; j++) {// to ending point
                int sum = 0;
                for (int k = i; k <= j; k++) {// prints the sub arrays
                    sum += arr[k];
                }
                System.out.println("sum"+i+" is"+sum);
                if (sum > max) {
                    max = sum;
                    startingPoint = i;
                    endingPoint = j;

                }
            }
            System.out.println();
        }
        System.out.println("Maximum=" + max);
        System.out.println("Starting Point=" + startingPoint);
        System.out.println("Ending Point=" + endingPoint);
    }
}
