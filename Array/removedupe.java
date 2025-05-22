// remove duplicate element in an sorted array

public class removedupe{
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        int i=0;
        for(int j=1;j<=arr.length-1;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}