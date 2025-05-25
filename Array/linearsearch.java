public class linearsearch {
    public static int search(int arr[],int num){
        int pos=1;
        for (int i:arr) {
            if(i==num) {
                return pos;
            }
            pos++;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,4,1};
        int num=8;
        int position=search(arr, num);
        System.out.println("the number is at " +position);
        
    }
}