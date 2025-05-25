public class searchsortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 4, 7, 11},
            {2, 5, 8, 12},
            {3, 6, 9, 16},
            {10, 13, 14, 17}
        };
        int i=0;
        int j=arr.length-1;
        int key=13;
        while(i<arr.length-1 && j>0){
            if(arr[i][j]==key){
                System.out.println("Key found");
                break;
            }
            if(key<arr[i][j]){
                j--;
            }
            if(key>arr[i][j]){
                i++;
            }
        }

        System.out.println("Key not found");
    }

}
