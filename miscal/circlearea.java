package miscal;
import java.util.Scanner;

public class circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1=sc.nextInt();
        System.out.println("Enter the number2:");
        int num2=sc.nextInt();
        System.out.println("Enter the number3:");
        int num3=sc.nextInt();
        float avg= (num1+num2+num3)/3.0f;
        System.out.printf("The average is:%f",avg);
        sc.close();

    }
    
}
