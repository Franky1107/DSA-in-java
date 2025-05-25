package miscal;
import java.util.*;
public class decimaltobinary {
    public static int convert(int a){
        int temp=a;
        int n=0;
        int result=0;
        while(temp!=0){
            result=result+temp%2 *(int)Math.pow(10, n);
            temp=temp/2;
            n++;
        }   
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a binary number :");
        int a=sc.nextInt();
        System.out.println(convert(a));
    }
    
}
