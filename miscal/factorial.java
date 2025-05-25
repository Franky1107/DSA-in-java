import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        n = sc.nextInt();
        int x=n;
        int factorial=n;
        while (n > 1) {
            factorial=factorial*(n-1);
            n--;
        }
        System.out.println("The factorial of "+x + " is "+ factorial);
    }

}
