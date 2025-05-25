import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int product = a * b;
        System.out.printf("The product of %d and %d is %d", a, b, product);
    }
}