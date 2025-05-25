// Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers

import java.util.Scanner;

public class sumofoddandeven {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int sum=0;
        do{
            System.out.println("Enter the integer:");
            n=sc.nextInt();
            sum=sum+n;
        }while(n!=0);
        System.out.println("The sume is "+sum );
    }

}
