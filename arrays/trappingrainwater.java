package arrays;

public class trappingrainwater {
    public static void main(String[] args) {
        int bar[]={4,2,0,6,3,2,5};
        int left[]=new int[bar.length];
        int right[]=new int[bar.length];
        int trapped_water=0;
        left[0]=bar[0];
        for(int i=1;i<bar.length;i++){
            left[i]=Math.max(bar[i],left[i-1]);
        }
        right[bar.length-1]=bar[bar.length-1];
        for(int j=bar.length-2;j>=0;j--){
            right[j]=Math.max(right[j+1],bar[j]);
        }
        for(int i=0;i<bar.length;i++){
            trapped_water+=(Math.min(left[i],right[i]))-bar[i];

        }
        System.out.println("Trapped water is:"+trapped_water);
       
    }
}