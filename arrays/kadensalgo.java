package arrays;

public class kadensalgo {
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int currsum=0;
        int ms = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum=currsum+arr[i];//currsum=Math.max(currsum+arr[i],0)
            if(currsum<0){
                currsum=0;
            }
            if(currsum>ms){
                ms=currsum;
            }

        }
        System.out.println("Maximum sum of a sub array is:"+ms);

    }

}
