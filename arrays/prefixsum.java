package arrays;

public class prefixsum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int currsum=0;
        int max = 0;
        int startingPoint = 0;
        int endingPoint = 0;
        int sumarr[]=new int[arr.length];
        sumarr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            sumarr[i]=sumarr[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum= i==0? sumarr[j]: sumarr[j]-sumarr[i-1];
                if(currsum>max){
                    max=currsum;
                    startingPoint=i;
                    endingPoint=j;
                }
            }
        }
        System.out.println("Maximum=" + max);
        System.out.println("Starting Point=" + startingPoint);
        System.out.println("Ending Point=" + endingPoint);
    }
}
