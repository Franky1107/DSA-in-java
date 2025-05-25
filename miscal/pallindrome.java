import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number:");
        int a=sc.nextInt();
        int temp=a;
        int rev=0;
        while(temp!=0){
            rev=rev*10+temp%10;
            temp=temp/10;
        }
        if(a==rev){
            System.out.println("the number is pallindrome");

        }
        else{
            System.out.println("the number is not pallindrome");
        }
    }   
}
