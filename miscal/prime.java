import java.util.Scanner;

public class prime {
    public static boolean isprime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }

    public static void range(int a){
        for(int i=2;i<a;i++){
            if(isprime(i)==true){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]) {
        
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the last number:");
        int a=sc.nextInt();
        System.out.println(isprime(a));
        range(a);
        sc.close();

    }
}
